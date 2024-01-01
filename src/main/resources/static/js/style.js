$(document).ready(function () {
    $(".jumbotron").mouseenter(function () {
        $(".rainbow-effect").css("opacity", 1);
    });

    $(".jumbotron").mouseleave(function () {
        $(".rainbow-effect").css("opacity", 0);
    });
});