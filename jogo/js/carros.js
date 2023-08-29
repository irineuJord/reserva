    //posicoes dos carros  
    let xCarros = [0, 0, 0,]
    let xCarros2 = [702, 702, 702]
    let yCarros = [160, 35, 285]
    let yCarros2 = [228, 100, 350]

    let comprimentoCarros = 10;
    let alturaCarros = 10;
    let velocidadeCarros = [7, 3.5,3]  //define a velocidade dos carros xcarros1
    let velocidadeCarros2 = [4, 4.7,3] //define a velocidade dos carros xcarros2

    //exibir os carros
    function mostrarCarros() {
        for (let i = 0; i < imagensCarros.length; i++) {
            image(imagensCarros[i], xCarros[i], yCarros[i], 60, 60);
        }

        for (let i = 0; i < imagensCarros2.length; i++) {
            image(imagensCarros2[i], xCarros2[i], yCarros2[i], 60, 60);
        }


    }

    function movimentoCarro() {

        for (let i = 0; i < imagensCarros.length; i++) {
            xCarros[i] += velocidadeCarros[i];
            
            for (let i = 0; i < imagensCarros2.length; i++) {
                xCarros2[i] -= velocidadeCarros2[i];

            if (xCarros[i] > 700) {
                xCarros[i] = -25; // Define a posição inicial do carro 1
            }
            if (xCarros2[i] < -50) {
                xCarros2[i] = 702; // Define a posição inicial do carro 1
            }
        }

    }
    }