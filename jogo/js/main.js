//na função setup, define as configuracoes de largura e altura
function setup() {

    createCanvas(700, 450);

}
//na função draw define o que sera exibido 
function draw() {
    background(imagemDaEstrada);

    //o image permite definir largura, altura eixo 'X' e eixo 'Y'

    mostrarMascote();
    mostrarCarros();
    movimentoCarro();
    movimentoMascote();
    incluirPontos();
    verificarColisao();
   
    

    
    
}
