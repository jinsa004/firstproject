<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<html lang="en">
<head>
  <title>기업 정보 관리</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
  <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  <link href="css/reset.css" rel="stylesheet">
  <link href="css/main.css" rel="stylesheet">
</head>

<body>
<input id="companyId" type="hidden" value="${companyPS.companyId}" />
<div class="p-5 border text-center">
  <h1>기업 정보 관리</h1>
</div>

    <div class="company_info">

      <div id="basic_info" class="form">
        <div class="form_title">
          <h2 class="title">기본정보</h2>
        </div>
        <div class="basic_form">
          <dl class="info_basic">
            <dt class="info_list_item">회사명</dt>
            <input type="text" id="company_name" name="company_name" class="box_input" value="${company.companyName}" placeholder="회사명을 입력하세요"/>
            <dt class="info_list_item">사업자번호</dt>
            <input type="text" id="company_number" name="company_number" class="box_input" value="${company.companyNumber}" placeholder="사업자번호를 입력하세요"/>
          </dl>
        </div>
      </div>
      <!-- info -->

      <div id="contact_info" class="form">
        <div class="form_title">
          <h2 class="title">담당자 연락처</h2>
        </div>
        <div class="contact_form">
          <div class="contact_row">
            <div class="contact_list">
              <p class="contact_list_item">휴대폰</p>
            </div>
            <div class="contact_input">
              <input type="text" id="company_tel" name="company_tel" class="box_input" value="${company.companyTel}" placeholder="휴대폰 번호을 입력하세요"/>
            </div>
          </div>
          <div class="contact_row">
            <div class="contact_list">
              <p class="contact_list_item">이메일</p>
            </div>
            <div class="contact_input">
              <input type="text" id="company_email" name="company_email" class="box_input" value="${company.companyEmail}" placeholder="이메일을 입력하세요"/>
            </div>
          </div>
          <div class="contact_row">
            <div class="contact_list">
              <p class="contact_list_item">기업 주소</p>
            </div>
            <div class="contact_input">
              <input type="text" id="company_location" name="company_location" class="box_input" value="${company.companyLocation}" placeholder="상세주소를 입력하세요"/>
            </div>
          </div>
        </div>
      </div>
      <!-- contact -->

      <div id="login_info" class="form">
        <div class="form_title">
          <h2 class="title">로그인 정보</h2>
        </div>
        <div class="login_form">
          <div class="login_row">
            <div class="login_list">
              <p class="login_list_item">ID</p>
            </div>
            <div class="login_input">
              <input type="text" id="company_id" name="company_id" class="box_input" value="${company.companyUsername}" placeholder="아이디를 입력하세요"/>
            </div>
          </div>
          <div class="login_row">
            <div class="login_list">
              <p class="login_list_item">Password</p>
            </div>
            <div class="login_input">
              <input type="text" id="company_password" name="company_password" class="box_input" value="${company.companyPassword}" placeholder="비밀번호를 입력하세요"/>
            </div>
          </div>
        </div>
      </div>
      <!-- login -->

      <div id="field_info" class="form">
        <div class="form_title">
          <h2 class="title">관심분야</h2>
        </div>
        <div class="field_select">
            <form method="post" action="/#">
              <div class="form-check">
                <input type="checkbox" class="form-check-input" id="프론트엔드" name="프론트엔드" value="프론트엔드">
                <label class="form-check-label" for="프론트엔드">프론트엔드</label>
              </div>
              <div class="form-check">
                <input type="checkbox" class="form-check-input" id="백엔드" name="백엔드" value="백엔드">
                <label class="form-check-label" for="백엔드">백엔드</label>
              </div>
              <div class="form-check">
                <input type="checkbox" class="form-check-input" id="풀스택" name="풀스택" value="풀스택">
                <label class="form-check-label" for="풀스택">풀스택</label>
              </div>
              <div class="form-check">
                <input type="checkbox" class="form-check-input" id="안드로이드" name="안드로이드" value="안드로이드">
                <label class="form-check-label" for="chec안드로이드k1">안드로이드</label>
              </div>
              <div class="form-check">
                <input type="checkbox" class="form-check-input" id="IOS" name="IOS" value="IOS">
                <label class="form-check-label" for="IOS">IOS</label>
              </div>
            </form>
        </div>
      </div>
      <!-- field -->

      <div class="btn_group">
        <div class="update_btn">
          <button id="btn_update" type="button" onclick="location.href='#'">등록완료</button>
        </div>
        <div class="delete_btn">
          <button type="button" onclick="location.href='#'">회원탈퇴</button>
        </div>
      </div>
      <!-- btn -->

    </div>
    <!-- company_info -->
  </div>
</div>
<!-- body -->

<div class="mt-5 p-4 bg-dark text-white text-center">
  <p>Footer</p>
</div>
<!-- footer -->

</body>

<script>
$("btn_update").click(()=>{
  update()
});

function update(){

  let companyId = $("companyId").val();

  let data ={
    companyNumber:$("companyNumber").val(),
    companyName:$("companyName").val(),
    companyEmail:$("companyEmail").val(),
    companyTel:$("companyTel").val(),
    companyLocation:$("companyLocation").val(),
    companyUsername:$("companyUsername").val(),
    companyPassword:$("companyPassword").val()
    
  }

  $.ajax("/co/companyUpdate" + companyId, {
      type: "PUT",
      dataType: "json",
      data: JSON.stringify(data),
      headers: {
          "Content-Type": "application/json; charset=utf-8",
      },
  }).done((res) => {
      if (res.code == 1) {
          alert("이력서 수정 완료");
          location.href = "/";
      } else {
          alert("업데이트에 실패하였습니다");
      }
  });          
}
</script>
</html>