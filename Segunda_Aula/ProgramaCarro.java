public class ProgramaCarro {
      public static void main(String[] args) {
            Carro uno = new Carro();
            uno.anoDeFabricacao = 2022;
            uno.cor = "Vermelho";
            uno.fabricante = "Fiat";
            uno.modelo = "Way";

            System.out.println("______________Carro_______________");
            System.out.println(uno.anoDeFabricacao);
            System.out.println(uno.cor);
            System.out.println(uno.fabricante);
            System.out.println(uno.modelo);

            uno.proprietario.nome = "Katiana";
            uno.proprietario.cpf = "000.000.000-00";
            uno.proprietario.idade = 19;
            uno.proprietario.logradouro = "centro";
            uno.proprietario.bairro = "Aquarela das Artes";
            uno.proprietario.cidade = "Sinop-MT";

            System.out.println("_____________Proprietario______________");
            System.out.println(uno.proprietario.nome);
            System.out.println(uno.proprietario.cpf);
            System.out.println(uno.proprietario.idade);
            System.out.println(uno.proprietario.logradouro);
            System.out.println(uno.proprietario.bairro);
            System.out.println(uno.proprietario.cidade);

            uno.comprador.nome = "Iago";
            uno.comprador.cpf = "111.111.111-11";
            uno.comprador.logradouro = "Centro";
            uno.comprador.idade = 33;
            uno.comprador.bairro = "Terra Rica";
            uno.comprador.cidade = "Sinop-MT";

            System.out.println("_____________Comprador______________");
            System.out.println(uno.comprador.nome);
            System.out.println(uno.comprador.cpf);
            System.out.println(uno.comprador.logradouro);
            System.out.println(uno.comprador.idade);
            System.out.println(uno.comprador.bairro);
            System.out.println(uno.comprador.cidade);

            System.out.println("___________________________");

            uno.ligar();
            uno.desligar();

            System.out.println(uno.ResumoCarro());

            System.out.println("Km rodado: " + uno.kmRodado);
            uno.Rodar(10);
            System.out.println("Km rodado :  " + uno.kmRodado);

      }

}
