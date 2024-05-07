<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
// Define an array of objects with attributes for each book
String[][] books = {
    {
      "A Little Princess",
      "./Img/aLittlePrincess.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "A Passaage To India",
      "./Img/aPassageToIndia.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Fourney To The Centre Of The Earth",
      "./Img/fourneyToTheCentreOfTheEarth.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Ghosts Of The Silent Hills",
      "./Img/ghostsofthesilenthills.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "James Allen As A Man Thinketh",
      "./Img/jamesAllenAsAManThinketh.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Nationalism",
      "./Img/nationalism.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Othelle",
      "./Img/othello.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Relativity",
      "./Img/relativity.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "The Art Of War Sun Tzu",
      "./Img/theArtOfWarSunTzu.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "The Complete Novels Of Sherlock Homes",
      "./Img/theCompleteNovelsOfSherlockHomes.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "The Jungle Book",
      "./Img/thejunglebook.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "The Origin Of Species",
      "./Img/theOriginOfSpecies.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "The Story Of My Life",
      "./Img/thestoryofmylife.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Three Men In A Boat",
      "./Img/threemeninaboat.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    },
    {
      "Treasure Island",
      "./Img/treasureisland.jpg",
      "Một trong những quyển sách có lượt xem và đánh giá cao nhất mọi thời đại, Tác giả là người Việt Nam, đặt quyển sách này nhanh tay lên kẻo hết nhé các bạn"
    }
};
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Store</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-..." crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./css//index.css">

  </head>



<body>
    <div>

      <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
              
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>

        </div>
      </nav>
      
    </div>
    <div style="">

      <button type="button" class="btn btn-secondary" data-toggle="tooltip" data-placement="top" title="Tooltip on top">
        Sách Tôn Giáo
      </button>
      <button type="button" class="btn btn-secondary" data-toggle="tooltip" data-placement="right" title="Tooltip on right">
        Sách Lịch Sử
      </button>
      <button type="button" class="btn btn-secondary" data-toggle="tooltip" data-placement="bottom" title="Tooltip on bottom">
        Sách Khoa Học
      </button>
      <button type="button" class="btn btn-secondary" data-toggle="tooltip" data-placement="left" title="Tooltip on left">
        Sách Văn Học
      </button>

      <!-- <ul class="ul-listNone">
        <% for (String[] book : books) { %>
        <li style="width: 280px; height: 350px; margin-top: 25px; background-color: antiquewhite;">
            <div>
                <p><%= book[0] %></p>
                <div style="display: flex;">
                    <img class="img-item" src="<%= book[1] %>">
                    <p><%= book[2] %></p>
                </div>
            </div>
        </li>
        <% } %>
      </ul> -->

      <ul class="ul-listNone">
        <% for (String[] book : books) { %>
        <li style="margin-top: 25px;">
            <div class="card" style="width: 280px;">
                <img src="<%= book[1] %>" class="card-img-top" alt="<%= book[0] %>">
                <div class="card-body">
                    <h5 class="card-title"><%= book[0] %></h5>
                    <p class="card-text"><%= book[2] %></p>
                    <!-- Add any additional content or buttons here -->
                </div>
            </div>
        </li>
        <% } %>
    </ul>
    
      
    </div>

     
</body>
</html>