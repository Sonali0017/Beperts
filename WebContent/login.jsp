<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js cookie_used_true">


<head>

  <meta charset="UTF-8">

  

  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

  <meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="+D9cj5s6TSwr2a/dx6Sc2XTBMwtnC2Ibh+61FxKZShL3VtM4YSY4U9vgKCY8pOwkwweJCc+jILqwKi9mZKvdew==" />

  

  <link href='https://fonts.googleapis.com/css?family=Lato:300,400,400italic,700,700italic' rel='stylesheet'>

  <link rel="stylesheet" media="all" href="https://static.codepen.io/assets/global/global-c2e00a735f397d70195487d504d0dbdb9ebcb33f04a88a07546d3ee44589ad51.css" />
    <link rel="stylesheet" media="screen" href="https://static.codepen.io/assets/packs/css/everypage-56b8bda7.css" />

  <link rel="stylesheet" media="all" href="https://static.codepen.io/assets/page/page-a8580840b5c044b0ca9cc269e9cee08795de1680868a8bc25b2e78258e5e7015.css" />

  

  <link rel="stylesheet" media="screen" href="https://static.codepen.io/assets/accounts/signup-fd296655d63c6871ebbc69f57cf23487ee1e58e781e1f55636deef5dd129cde4.css" />

  <link rel="stylesheet" media="screen" href="https://static.codepen.io/assets/accounts/form-2b1c0e868b037ec1a2e9bb00509b89914979b03576fbfa3b9f173cce4b605a16.css" />




  <link rel="shortcut icon" type="image/x-icon" href="https://static.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" />
  <link rel="mask-icon" type="" href="https://static.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg" color="#111" />
</head>

<body class="body-login
    logged-out


    not-team
">

  
  <header id="main-sidebar" class="main-sidebar">
  </header>

    <div class="unsupported-browser-message">
  CodePen probably won't work great in this browser. We generally only support the major desktop browsers like Chrome, Firefox, Safari, and Edge. Use this one at your own risk! If you're looking to test things, try looking at Pens/Projects in <a href="https://blog.codepen.io/documentation/views/debug-view/">Debug View</a>.
</div>


    <div id="react-search-and-user-menu"></div>

    

<div class="login-wrap">

  
    <h2 class="little-big-header">Log in!</h2>
  </header>

  <div class="flex-grid">

    <div class="login-half left">
         <div class="login-area">


        <form class="login-form top-label-form" id="login-login-form" action="LoginServlet" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="PduhrBoJQOqlDZKf1N8oO20juZJzKfab87uYMCDiPvEysi4b4BU1lVU0FWQv31jG2uUDkNuBtDrEfwJBVtCpmA==" />

  <div id="login-email" class="field">
    <label for="login-email-field">username</label>
    <input type="text" name="username" id="login-email-field" value="" required="required" />
  </div>

  <div id="login-password" class="field">
    <label for="login-password-field">Password</label>
    <input name="password" required="required" type="password" id="login-password-field_" />
  </div>
  
  <div>
    <input type="hidden" id="login-type" name="login-type" value="fullpage">
  </div>

  <div id="login-error"></div>

  <div>
    <label class="spacing-label">&nbsp;</label>

    <button id="log-in-button" class="recaptcha-trigger-button button green action-button expand-right">
      <span class="label">User</span>
      <span class="spinner"></span>
    </button>
    
     <button id="log-in-button" class="recaptcha-trigger-button button green action-button expand-right">
      <span class="label">Admin</span>
      <span class="spinner"></span>
    </button>

    &nbsp;&nbsp;
   
  </div>

</form>

        

      </div>

    </div>

    <div class="login-divider">
      <div class="bar bar-top"></div>
      <span class="login-or">OR</span>
      <div class="bar bar-bottom"></div>
    </div>

    <div class="login-half right">

      <div class="module social-auth-errors" id="login-social-auth-errors"></div>

      <div class="login-social-buttons">

        

        <a id="login-with-twiter" href="/auth/twitter" data-network="Twitter" class="button social-account-button twitter-button button-fullwidth">
          <svg class="icon-twitter" width="26" height="26">
            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#twitter"></use>
          </svg>
          <span>Log In with Twitter</span>
        </a>

        <a id="login-with-github" href="/auth/github" data-network="Github" class="button github-button social-account-button button-fullwidth">
          <svg class="icon-github" width="26" height="26">
            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#octocat"></use>
          </svg>
          <span>Log In with GitHub</span>
        </a>

        <a id="login-with-facebook" href="/auth/facebook" data-network="Facebook" class="button social-account-button facebook-button button-fullwidth">
          <svg class="icon-facebook" width="26" height="26">
            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#facebook"></use>
          </svg>
          <span>Log In with Facebook</span>
        </a>
        
         <a id="login-with-twiter" href="/auth/twitter" data-network="Twitter" class="button social-account-button twitter-button button-fullwidth">
          <svg class="icon-twitter" width="26" height="26">
            <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#twitter"></use>
            
          </svg>
          <span>Log In with Google</span>
        </a>
        

      </div>

    </div>

  </div>

  <div class="signup-callout">
    Need an account? <a href="Sign.jsp">Sign up now!</a>
  </div>

</div>





  <div id="popup-overlay" class="overlay popup-overlay"></div>
  <div id="modal-overlay" class="overlay modal-overlay"></div>
  <div id="react-popups" class="react-popups"></div>

  <noscript>

  <input type="checkbox" class="modal-closing-trick" id="modal-closing-trick">

  <div class="overlay noscript-overlay" style="display: block;"></div>

  <div class="modal modal-message group modal-warning">

    



</body>

</html>
