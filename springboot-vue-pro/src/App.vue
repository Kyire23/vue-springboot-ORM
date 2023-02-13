<template>
  <div>
    <router-view />

  </div>

</template>

<style scoped>

</style>


<script>
import Header from "@/components/Header.vue";
import Sidebar from "@/components/Sidebar.vue";

export default {
  name: "Layout",
}
</script>