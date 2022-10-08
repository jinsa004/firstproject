function goPopup() {
    var pop = window.open("/address/jusoPopup", "pop",
    "width=570,height=420, scrollbars=yes, resizable=yes");
}

function jusoCallBack(roadFullAddr) {
    $('#address').val(roadFullAddr);
}
