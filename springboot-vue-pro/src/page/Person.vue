<template>
<div>
  <el-upload
      ref="uploadRef"
      class="upload-demo"
      action="http://localhost:6060/files/upload"
      :on-success="filesUploadSuccess"
      :auto-upload="false"
  >
    <!--存在跨域问题 这里先取消限制 在后端common进行配置-->
    <template #trigger>
      <el-button type="primary">上传面试文件</el-button>
    </template>
    <el-button class="ml-3" type="success" @click="submitUpload">
      上传至服务器      </el-button>

    <template #tip>
      <div class="el-upload__tip">
        jpg/png files with a size less than 500kb
      </div>
    </template>
  </el-upload>
</div>
</template>

<script>

export default {
  name: "Person",
  methods:{
    filesUploadSuccess(res){
      console.log(res)
    }
  }
}


</script>
<style>

</style>