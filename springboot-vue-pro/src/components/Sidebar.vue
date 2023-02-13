<template>
<div>
  <el-menu
      active-text-color="#ffd04b"
      background-color="#545c64"
      class="el-menu-vertical-demo"
      default-active="2"
      text-color="#fff"
      router
  >
    <el-sub-menu index="1">
      <template #title>
        <el-icon><location /></el-icon>
        <span>系统管理</span>
      </template>
      <el-menu-item-group title="主页">
        <el-menu-item index="appointment">任务分配</el-menu-item>
      </el-menu-item-group>
      <el-menu-item-group title="次页">
        <el-menu-item index="interview">预约面试</el-menu-item>
      </el-menu-item-group>
      <el-sub-menu index="1-4">
        <el-menu-item index="performance">绩效管理</el-menu-item>
      </el-sub-menu>
    </el-sub-menu>
    <el-menu-item index="root">
      <el-icon><icon-menu /></el-icon>
      <span>ROOT</span>
    </el-menu-item>

  </el-menu>
</div>
</template>

<script>
export default {
name: "Sidebar"
}
</script>

<style scoped>

</style>