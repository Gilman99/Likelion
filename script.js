document.addEventListener("DOMContentLoaded", function () {

    const titleElement = document.getElementById("title");
    const hobbyElement = document.querySelector("#hobby");


    titleElement.addEventListener("mouseover", function () {
        titleElement.style.color = "blue";
    });

    titleElement.addEventListener("mouseout", function () {
        titleElement.style.color = "";
    });

    hobbyElement.addEventListener("click", function () {
        alert("취미에 대해 클릭하셨습니다.");
    });
});