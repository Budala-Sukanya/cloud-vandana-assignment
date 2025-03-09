const images = [
    'https://cdn.pixabay.com/photo/2023/06/26/21/22/shack-8090832_1280.jpg',
    'https://cdn.pixabay.com/photo/2022/05/14/15/49/mountain-7195958_1280.jpg',
    'https://cdn.pixabay.com/photo/2023/11/17/16/54/boat-8394639_1280.jpg',
    'https://cdn.pixabay.com/photo/2022/07/24/13/14/lavender-7341619_1280.jpg'
    ];
    
    let currentIndex = 0;
    const imgElement = document.getElementById("slider-image");
    
    function updateImage() {
        imgElement.src = images[currentIndex];
    }
    
    function nextImage() {
        currentIndex = (currentIndex + 1) % images.length;
        updateImage();
    }
    
    function prevImage() {
        currentIndex = (currentIndex - 1 + images.length) % images.length;
        updateImage();
    }
    
    // Initialize first image
    updateImage();