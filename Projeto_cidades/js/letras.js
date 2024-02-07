function changeAlphabet() {
    var letters = document.getElementById('letters');
    var alphabetList = document.getElementById('alphabet');
    var alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

    letters.style.display = 'none';
    alphabetList.innerHTML = '';

    for (var i = 0; i < alphabet.length; i++) {
        var listItem = document.createElement('li');
        listItem.textContent = alphabet[i];
        alphabetList.appendChild(listItem);
    }

    alphabetList.style.display = 'flex';
}

function changeBack() {
    var letters = document.getElementById('letters');
    var alphabetList = document.getElementById('alphabet');

    letters.style.display = 'block';
    alphabetList.style.display = 'none';
}

let currentIndex = 0;
const slides = document.querySelectorAll('.carousel .country-slide');
const totalSlides = slides.length;
const slideWidth = slides[0].offsetWidth;

function nextSlide() {
    if (currentIndex < totalSlides - 1) {
        currentIndex++;
        updateCarousel();
    }
}

function prevSlide() {
    if (currentIndex > 0) {
        currentIndex--;
        updateCarousel();
    }
}

function updateCarousel() {
    const offset = -currentIndex * slideWidth;
    document.querySelector('.carousel').style.transform = `translateX(${offset}px)`;
}
