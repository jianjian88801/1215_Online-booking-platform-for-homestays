const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr0p7i/",
            name: "springbootr0p7i",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr0p7i/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "民宿在线预定平台"
        } 
    }
}
export default base
