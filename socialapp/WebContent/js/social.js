
var SocialApp = {
    resetSignUpForm: function() {
        $('#email').val('');
        $('#password').val('');
        $('#info').hide();
    },
    signin: function(e) {
        e.preventDefault();
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
        $('#btnClear').attr('disabled', 'disabled');

        $('#ajaxLoad').show();
        $.post(ctx + '/login',
                $('#signInForm').serialize(),
                function(response) {
                    $('#ajaxLoad').hide();
                    if (response == 1) {
                        window.location = ctx + '/userHome.jsp';
                    } else {
                        $('#info').show();
                        $('#btnSignIn').removeAttr('disabled');
                        $('#btnClear').removeAttr('disabled');
                    }
                }
        );


    },
    initHome: function() {

        // App ContextPath
        ctx = $('#ctx').val();

        // Reset for Form Errors        
        SocialApp.resetSignUpForm;

        // Hide info Element on SignIn
        $('#info').hide();

        // AJAX Loader Hide on Startup.
        $('#ajaxLoad').hide();

        // Sign In Action
        $('#btnSignIn').click(SocialApp.signin);

        // Clear Button Action
        $('#btnClear').click(SocialApp.resetSignUpForm);

        // Wait Message for register on Click
        $('#btnRegisterInfoHub').click(function() {
            var btn = $(this)
            btn.button('loading');
            window.location = ctx + 'register.jsp';
        });
    }

};