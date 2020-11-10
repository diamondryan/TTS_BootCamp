let map;
let marker;
// let coords = {lat: 39.9612, lng: -82.9988};
let contentString = '<h2>' + city + ', ' + state + '</h2>';

function initMap() {
    console.log(google);

    let infowindow = new google.maps.InfoWindow({
        content: contentString,
    });

    let image = {
        url: "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTAXoGJ2bJvhXMoA2kR00ni-Y0Meq2AMKMkHw&usqp=CAU"
    };

    map = new google.maps.Map(document.getElementById('map'), {
    center: coords,
    zoom: 10,
    scrollwheel: false
    });

    marker = new google.maps.Marker({
      position: coords,
      map: map,
      icon: image,
      animation: google.maps.Animation.DROP
    });

    google.maps.event.addListener(marker, "click", function () {
        infowindow.open(map, marker);
    });
}