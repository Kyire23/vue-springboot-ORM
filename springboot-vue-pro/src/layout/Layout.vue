<template>
  <div>
  <Header/>
  <div style="display: flex">
    <Sidebar/>
    <router-view style="flex: 1"/>
  </div>
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import Sidebar from "@/components/Sidebar.vue";

export default {
  name: "Layout",
  components: {Sidebar, Header}
}
</script>

<style scoped>

</style>