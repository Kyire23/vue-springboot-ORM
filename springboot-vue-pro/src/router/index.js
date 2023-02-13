import { createRouter, createWebHistory } from 'vue-router'
import Layout from "../layout/Layout.vue"

const routes = [
    {
        path: '/',
        name: 'Layout',
        component: Layout,
        redirect: "/login",



        children: [
            {
                path: 'person',
                name: 'Person',
                component: () => import("@/page/Person.vue")
            },

            {
                path: 'interview',
                name: 'Interview',
                component: () => import("@/page/Interview.vue")
            },
            {
                path: 'appointment',
                name: 'Appointment',
                component: () => import("@/page/Appointment.vue")
            },
            {
                path: 'performance',
                name: 'Performance',
                component: () => import("@/page/Performance.vue")
            },

            {
                path: 'root',
                name: 'Root',
                component:() => import("@/page/Root.vue"),
                // children: [
                //     {
                //         path: 'list',
                //         name: 'List',
                //         component: () => import("@/views/List.vue")
                //     },
                // ]
            },
        ]
    },


    {
        path: '/list',
        name: 'List',
        component: () => import("@/views/List.vue")
    },

    {
        path: '/login',
        name: 'Login',
        component: () => import("@/page/Login.vue")
    },
    {
        path:'/register',
        name:'Register',
        component: () => import("@/views/Register.vue")
    }


]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
