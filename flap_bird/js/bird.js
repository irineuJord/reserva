let xBird = 30;
let yBird = 330;
let meusPontos = 0;
let marcouPonto = false 


function mostrarMascote(params) {
    image(bird, xBird, yBird, 35, 35);

}
function jogarBaixo(params) {
    if (yBird) {
        yBird += 3
    }

}

function limite(params) {
    if (yBird < 0) {
        yBird = 10

    }
}
function Pontuacao() {
    text(meusPontos, 20, 40);
    fill(color(10, 30, 30));
    textSize(30);

    for (let i = 0; i < xCanos.length; i++) {
        if (xCanos[i] + larguraCanos < xBird && !marcouPonto) {
            meusPontos++;
            marcouPonto = true;
        }
    }
    
    if (marcouPonto) {
        marcouPonto = false; // Reseta a variável para permitir pontuação nos próximos canos
    }
    
    print('Pontou', meusPontos);
}


function movimentoBird() {
    if (keyIsDown(UP_ARROW)) {
        yBird -= 15;
        setTimeout(() => {
            bird = loadImage("img/passaro2.png")

        }, 200);
        setTimeout(() => {
            bird = loadImage("img/passaro3.png")

        }, 300);
        setTimeout(() => {
            bird = loadImage("img/passaro1.png")

        }, 440);

    }

    if (keyIsDown(32)) {
        yBird -= 15;
        setTimeout(() => {
            bird = loadImage("img/passaro2.png")

        }, 100);
        setTimeout(() => {
            bird = loadImage("img/passaro3.png")

        }, 200);
        setTimeout(() => {
            bird = loadImage("img/passaro1.png")

        }, 400);

    }
}


