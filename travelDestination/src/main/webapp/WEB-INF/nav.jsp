<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<header>	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.do">Travel Tracker</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse flex-row-reverse" id="navbarSupportedContent">
      <form action="citySearch.do" class="d-flex" method="post">
        <input class="form-control me-2" type="search" placeholder="City search" aria-label="Search" name="city" required>
        <input class="btn btn-outline-success" type="submit" value="Search">
      </form>
      <form action="idSearch.do" class="d-flex" method="post" >
        <input class="form-control me-2" type="number" placeholder="ID search" aria-label="Search" name="id" required>
        <input class="btn btn-outline-success" type="submit" value="Search">
      </form>
 		 <a class="nav-link" href="add.do">
		<button class="btn btn-outline-success" type="submit">Create</button>
		</a>
    </div>
  </div>
</nav>
</header>