package com.oumuanode.backend.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.oumuanode.backend.common.Result;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;



@RestController
@RequestMapping("/files")
public class FileController {
    @Value("@{server.port}")
    private String port;
    private static final String ip = "http://localhost";

    @PostMapping("/upload")
    public Result<?> upload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String  filePath =  System.getProperty("user.dir")+"/backend/src/main/resources/files/" + originalFilename;
        //加时间戳 定义文件唯一标识
        String flag = IdUtil.fastSimpleUUID();
        FileUtil.writeBytes(file.getBytes(),filePath);
        return Result.success(ip + ":" + port + "/files/" + flag);
    }

    @GetMapping("/{flag}")
    public void getFiles(@PathVariable String flag, HttpServletResponse response){
        OutputStream os;
        String basePath = System.getProperty("user.dir")+"/backend/src/main/resources/files/";
        List<String> fileNames =  FileUtil.listFileNames(basePath);
        //找到跟参数一样的文件名
        String fileName = fileNames.stream().filter(name -> name.contains(flag)).findAny().orElse("");
        try {
            if (StrUtil.isNotEmpty(fileName)){
                response.addHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
                response.setContentType("application/octet-stream");
                //通过文件路径读取文件字节流
                byte[] bytes = FileUtil.readBytes(basePath+fileName);
                os = response.getOutputStream();
                os.write(bytes);
                os.flush();
                os.close();
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("文件下载失败");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
