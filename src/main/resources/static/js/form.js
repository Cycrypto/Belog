
function validateForm() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if (!username || !password) {
        alert('Please fill in all required fields.');
        return false;
    }

return true;
}
