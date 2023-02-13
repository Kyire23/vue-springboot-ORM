<template>
  <div style="height:50px; line-height: 50px; border-bottom: 1px solid #ccc; display: flex ">
    <div style="width:200px; padding-left:30px; font-weight: bold; color: cornflowerblue">后台管理</div>
    <div style="flex:1"></div>
    <div style="width:100px;padding-top:20px" >
      <el-dropdown>
          <span class="el-dropdown-link">
            更多
            <el-icon class="el-icon--right">
            <arrow-down />
            </el-icon>
          </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item @click="$router.push('/person')">员工信息</el-dropdown-item>
            <el-dropdown-item @click="$router.push('/login')">退出系统</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>

</style>