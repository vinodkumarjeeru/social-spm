
var SocialApp = {
    ajaxCall: function(url, type, form) {

        var result = "";

        $.ajax({
            url: ctx + url,
            async: false,
            type: type,
            data: form.serialize(),
            success: function(response) {
                result = response;
            }
        });
        return result;
    },
    resetSignUpForm: function() {
        $('#email').val('');
        $('#password').val('');       
    },
    signup: function() {
        var email = $('#email').val();
        var password = $('#password').val();

        if (email.length == 0 || email == null) {
            $('#lblUserName').addClass('form-group has-error');
            return;
        }
        if (password.length == 0 || password == null) {
            $('#lblPassword').addClass('form-group has-error');
            return;
        }
        $('#btnSignIn').attr('disabled', 'disabled');
        $('#ajaxLoad').show();
        setTimeout(function() {
            $('#ajaxLoad').hide();
            var ajaxResponse = SocialApp.ajaxCall('/login', 'POST', $('#signInForm'));
            if(ajaxResponse == 1) {
                window.location = ctx+'/userHome.jsp';
            }else {
                $('#info').show();
            }
            
        }, 1000);
    },
    initHome: function() {

        // App ContextPath
        ctx = $('#ctx').val();

        //Hide Ajax Load
        $('#ajaxLoad').hide();

        // Reset for Form Errors        
        SocialApp.resetSignUpForm;

        // Hide info Element on SignIn
        $('#info').hide();

        // Sign In Action
        $('#btnSignIn').click(SocialApp.signup);

        // Clear Button Action
        $('#btnClear').click(SocialApp.resetSignUpForm);
    }

};






