## Blog
https://velog.io/@fprh13/Spring-boot-MyBatis-사용하기-2-익숙하지-않은-기술에-경험을-쌓자

## 목표 🏆

- jpa가 아닌 다른 DB 접근 기술을 활용하자 (MyBatis)
- gradle이 아닌 maven을 이용하자
- mysql이 아닌 h2 내장 DB를 적극 활용하자
- yml 형식이 아닌 properties를 사용해보자

<br>

제가 항상 늘 사용하던 ..jpa...gradle..mysql...yml...없이...

<br>

## 기능
- Read -> 글 페이징 
- Create -> 글 작성
- Update -> 글 수정
- Delete -> 글 삭제

## demo
- 페이징 기능 -> ajax 로 더 보기 기능

<img src="img/postList.png">


<br><br>

- 글 등록 -> ajax post 요청

<img src="img/postform.png">


<img src="img/posttest.png">

<br><br>

- 글 수정 -> ajax put 요청

<img src="img/edittest.png">

<img src="img/editform.png">

<img src="img/edit.png">

<br><br>

- 글 삭제 -> ajax delete 요청

<img src="img/deletetest.png">

<img src="img/delete.png">



