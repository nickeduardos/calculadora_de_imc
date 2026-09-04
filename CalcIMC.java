void main () {

    IO.println("\033[H\033[2J");

    IO.println("==========CALCULO DE IMC==========");
    IO.println();
    String nome = IO.readln("Digite o seu Nome: ");
    char genero = IO.readln("Digite o seu Genero [M] para Masculino, [F] para Feminino e [N] para não desejo informar: ").charAt(0);
    String peso = IO.readln("Digite o seu peso: ");
    String altura = IO.readln("Digite a sua altura: ");
    double pesoDouble = Double.valueOf(peso);
    double alturaDouble = Double.valueOf(altura);
    
    IO.println();

    double imc = pesoDouble/(alturaDouble * alturaDouble) ;


    switch (genero) {
        case 'M' , 'm' :
            if (imc >= 40) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Mórbida");
                IO.println ();
                IO.readln ("Aperte ENTER para finalizar o programa");
            }

            else if (imc >= 30 && imc < 40 ) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Moderada");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }
            
            else if (imc >= 25 && imc < 29.99) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Leve");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }

            else if (imc >= 20 && imc < 25 ) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Normal");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }

            else if (imc < 20) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Abaixo do normal");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }
            break;


        case 'F' , 'f' , 'N' , 'n' :
            if (imc >= 39) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Mórbida");
                IO.println ();
                IO.readln ("Aperte ENTER para finalizar o programa");
            }

            else if (imc >= 29 && imc < 39 ) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Moderada");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }
            
            else if (imc >= 24 && imc < 29) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Obesidade Leve");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }

            else if (imc >= 19 && imc < 24 ) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Normal");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }

            else if (imc < 19) {
                System.out.printf ("Nome: %s \nGênero: %s\nimc: %.2f\n", nome, genero, imc);
                IO.println ("Abaixo do normal");
                IO.println ();
                IO.readln ("Pressione ENTER para finalizar o programa");
            }
            break;

        default:
            IO.println("Erro! Digite um dos gêneros listados. ");
            IO.readln("Pressione ENTER para finalizar o programa");
            break;
    }
}