//页面加载完毕事件
$(function () {

    //异步登录
    $("#loginBtn").click(function () {

        //表单序列化
        var data = $("#loginForm").serialize();

        $.post("user", data, function (data) {
            if (data == "0") {
                //说明登陆失败
                $("#loginHint").html("用户名或者密码有误!");
            } else {
                //说明登录成功
                window.location = "customers";
            }
        })
    });

    //异步加载页面数据
    $("#data").load("getCustomers");
});



//删除顾客的方法
function deleteCustomer(id) {
    var r = confirm("确定要删除吗?");
    if (r) {
        $.ajax(
            {
                type: 'DELETE',
                url: 'customer/' + id,
                success: function (data) {
                    if (data == "0") {
                        $("#data").load("getCustomers");
                    }
                }
            }
        );
    }
}

// 分页跳转方法
function go(currentPage, pageSize, name) {
    var url = "/crm/permission/customer/list?currentPage=" + currentPage + "&pageSize="
        + pageSize;
    if (name) {
        url += "&name=" + name;
    }
    window.location = url;
}

// 登出方法
function logout() {
    var r = confirm("确定要退出吗?");
    if (r) {
        window.location = "/crm/user/logout";
    }
}
