var vue = new Vue({
    el: "#app",
    data: {
        userList: [],
        user: {}
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get("user/findAll").then(function (value) {
                _this.userList = value.data;
            }).catch(function (reason) {
                console.log(reason);
            })

        },
        findById: function (id) {
            var _this = this;
            axios.get("user/findById/" + id).then(function (value) {
                _this.user = value.data;
            }).catch(function (reason) {
                console.log(reason)
            })
        },
        update: function () {
            axios.post("user/update", this.user).then(function (value) {
                vue.findAll();
            }).catch(function (reason) {
                alert(reason);
            })
        }
    },
    created:function () {
        this.findAll()
    }
})