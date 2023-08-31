let xMascote = 320;
let yMascote = 407;
let meusPontos = 0;

let colisao = false

function verificarColisao() {
    for (let i = 0; i < imagensCarros.length; i++) {
        colisao = collideRectCircle(xCarros[i],yCarros[i],comprimentoCarros, alturaCarros, xMascote, yMascote, 60);
        
        if (colisao) {
            xMascote = 320
            yMascote = 407
            if (meusPontos > 0) {
                meusPontos -= 1;
            }
        }
    }

    for (let i = 0; i < imagensCarros2.length; i++) {
        colisao = collideRectCircle(xCarros2[i],yCarros2[i],comprimentoCarros, alturaCarros, xMascote, yMascote, 60);
        
        if (colisao) {
            xMascote = 320
            yMascote = 407
            if (meusPontos > 0) {
                meusPontos -= 1;
            }
        }
    }
    stroke(colisao ? color ('red'):0);
    print('Colisão acontecendo', colisao);

}

function mostrarMascote(params) {
    image(ImagemDoMascote, xMascote, yMascote, 40, 40);

}
function incluirPontos() {
    text(meusPontos, 20, 25);
    fill(color(255, 0, 0));
    textSize(21);
    if (yMascote < 0) {
        yMascote = 407;
        meusPontos++; // Adiciona 1 ponto
    }
}

function movimentoMascote() {
    if (xMascote < -35) {
        xMascote = 700

    } if (xMascote > 700) {
        xMascote = -35
    }

    if (keyIsDown(UP_ARROW)) {
        yMascote -= 2;

    }
    if (keyIsDown(DOWN_ARROW)) {
        yMascote += 2;

    }
    if (keyIsDown(RIGHT_ARROW)) {
        xMascote += 2;
        ImagemDoMascote = loadImage("img/mario.png");
    }
    if (keyIsDown(LEFT_ARROW)) {
        xMascote -= 2;
        ImagemDoMascote = loadImage("img/marioL.png");
    }

    if (keyIsDown(32)) {
        yMascote -= 2;
        setTimeout(() => {
            ImagemDoMascote = loadImage("img/mario.png")

        }, 100);
        setTimeout(() => {
            ImagemDoMascote = loadImage("img/pikachu.gif")

        }, 200);
        setTimeout(() => {
            ImagemDoMascote = loadImage("img/carro5.png")

        }, 400);

    }
}




