let xCanos = [350, 500, 500, 350, 650, 650, 800, 800]
let yCanos = [450, 500, -10, -5, 550, -40, 500, -80]
let velocidadeCanos = [1, 1, 1, 1, 1, 1, 1, 1]
let alturaCanos = 350
let larguraCanos = 50




function mostrarCano() {

    for (let i = 0; i < imagensCanos.length; i++) {

        image(imagensCanos[i], xCanos[i], yCanos[i], 50, 350);


    }
}
function movimentoCano() {

    for (let i = 0; i < imagensCanos.length; i++) {
        xCanos[i] -= velocidadeCanos[i];

        if (xCanos[i] < -50) {
            xCanos[i] = 550
        }
    }

}