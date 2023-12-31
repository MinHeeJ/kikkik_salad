<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/memberLogin.css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
 
 
 <br>
 <h1><i class="bi bi-stars"></i> 킥킥샐러드 <i class="bi bi-stars"></i></h1>
 <h2>로그인</h2>
<section id="login-container">

  <form name="loginFrm" action="${pageContext.request.contextPath}/member/memberLogin" method="POST">
  	
    <div class="input-box">
      <label for="memberId"><i class="bi bi-person-fill"></i> 아이디</label>
      <input type="text" id="memberId" name="memberId" required>

      <label for="password"><i class="bi bi-lock-fill"></i> 비밀번호</label>
      <input type="password" id="password" name="password" required>
    </div>
    
    <div>
      <label for="saveId">아이디 저장 </label>
      <input type="checkbox" id="saveId" name="saveId">
    </div>
    
    <div>
      <input type="submit" value="로그인" class="login-button">
      <button onclick="location.href='${pageContext.request.contextPath}/member/memberEnroll'" class="signup-button">회원가입</button>
    </div>
  </form>

</section>

  <br>
  <br>
  <br>
  <br>

<%--   
<% if(loginMember != null) { %>
  <script src="<%= request.getContextPath() %>/js/ws.js"></script>
<% } %>
 --%>
<script>
<%--   window.onload = () => {
    <% if(msg != null) { %>
      alert('<%= msg %>');
    <% } %>
      
    <% if(loginMember == null) { %>
      document.loginFrm.onsubmit = (e) => {
        // 아이디
        const memberId = e.target.memberId;
        if(!/^\w{4,}$/.test(memberId.value)) {
          alert("아이디는 4글자 이상 입력하세요.");
          e.preventDefault();
          return;
        }
              
        // 비밀번호
        const password = e.target.password;
        if(!/^.{4,}$/.test(password.value)) {
          alert("비밀번호는 4글자 이상 입력하세요.");
          e.preventDefault();
          return;
        }
      };
    <% } %>
  }; --%>
</script>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>
