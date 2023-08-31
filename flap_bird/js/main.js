//na função setup, define as configuracoes de largura e altura
function setup() {

    createCanvas(400,700);

}
//na função draw define o que sera exibido 
function draw() {
    background(Fundo);

mostrarMascote();
movimentoBird();
jogarBaixo();
limite();
mostrarCano();
movimentoCano();
Pontuacao();

    
    
}