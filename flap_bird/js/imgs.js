
let Fundo;
let bird;  
let imagensCanos

let cano1
let cano2
let cano3
let cano4



function preload() {    
    Fundo = loadImage("img/fundo.png");//img bg/fundo/mapa
    bird = loadImage("img/passaro1.png")
    cano1 = loadImage("img/cano_baixo.png")
    cano2 = loadImage("img/cano_baixo_maior.png")
    cano3 = loadImage("img/cano_topo_maior.png")
    cano4 = loadImage("img/cano_topo_maior.png")



    imagensCanos = [cano1, cano2, cano3, cano4,cano1, cano3,cano2,cano4];
}

