import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String nomePlanta = "";
        int	idadePlanta = 0;    
	    double alturaPlanta = 0.0;
	    double gastosAgua = 0.0;
	    int regasSemana = 0;
	    int idadeAntiga = 0;
	    double alturaAntiga = 0;
	    double gastosAntigos = 0;
	    String resposta = "";
	    int op = 0;
	    while(op != 6){
	        System.out.println("===========MENU===========");
	        System.out.println("1 - Novo cadastro");
	        System.out.println("2 - Consultar cadastro");
	        System.out.println("3 - Atualizar cadastro");
	        System.out.println("4 - Acompanhar crescimento");
	        System.out.println("5 - Deletar cadastro");
	        System.out.println("6 - Sair");
	        System.out.println("==========================");
	        System.out.print("Escolha uma opção: ");
	        op = s.nextInt();
	        s.nextLine();
	        switch(op){
	            case 1:
	                System.out.println();
	                System.out.println("=========Cadastro=========");
	                System.out.println("Digite o nome da planta e seu lote :");
	                nomePlanta = s.nextLine();
	                while(nomePlanta == ""){
	                    System.out.println("Campo vazio, digite o nome da planta e seu lote.");
	                    nomePlanta = s.nextLine();
	                }
	                System.out.println("Digite o tempo de vida(em dias) da planta : ");
	                idadePlanta = s.nextInt();
	                while(idadePlanta < 0){
	                    System.out.println("Dado incorreto, idade não pode ser menor que 0.");
	                    idadePlanta = s.nextInt();
	                }
	               System.out.println("Digite a altura atual(em centimetros) da planta : ");
	               alturaPlanta = s.nextDouble();
	               while(alturaPlanta <= 0){
	                   System.out.println("Dado incorreto, altura não pode ser menor ou igual a zero.");
	                   alturaPlanta = s.nextDouble();
	               }
	               System.out.println("Quantas irrigações foram feitas nesta semana?");
	               regasSemana = s.nextInt();
	               for(int i = 0; i < regasSemana; i ++){
	                   System.out.print("Digite a quantidade de agua(em mililitros) gastas na " + (i+1) + ". rega : ");
	                    int mlGastos = s.nextInt();
	                    while(mlGastos <= 0){
	                        System.out.println("Dado incorreto, digite um valor maior que 0.");
	                        mlGastos = s.nextInt();
	                    }
	                    gastosAgua += mlGastos;
	               }
	               gastosAgua = gastosAgua / regasSemana;
	               System.out.println("O cadastro de " + nomePlanta + " foi realizado com sucesso!");
	               System.out.println("==========================");
	               System.out.println();
	            break;
	            case 2:
	                if(nomePlanta == "" || idadePlanta <= 0 || alturaPlanta <= 0){
	                   System.out.println();
	                   System.out.println("=====Consultar Planta=====");
	                   System.out.println("Planta ainda não cadastrada.");
	                   System.out.println("==========================");
	                   System.out.println();
	                   break;
	                }
	                System.out.println();
	                System.out.println("=====Consultar Planta=====");
	                System.out.println("Nome e Lote : " + nomePlanta);
	                System.out.println("Dias desde o Plantio : " + idadePlanta);
	                System.out.printf("Altura : %.2f\n centimetros", alturaPlanta);;
	                System.out.printf("Media de Água consumida: %.2f mililitros\n", gastosAgua);
	                System.out.println("Quantidade de regas na semana : " + regasSemana);
	                System.out.println("==========================");
	                System.out.println();
	            break;
	            case 3:
	                if(nomePlanta == "" || idadePlanta < 0 || alturaPlanta <= 0){
	                    System.out.println();
	                    System.out.println("Preencha o Cadastro antes de altera-lo.");
	                    System.out.println();
	                    break;
	                }
	                System.out.println();
	                System.out.println("=====Atualizar Dados=====");
	                System.out.println("Deseja alterar o nome/lote? (s/n)");
	                resposta = s.nextLine();
	                while(!resposta.equals("s") && !resposta.equals("n")){
	                    System.out.println("Resposta incorreta, responda com 's' para sim e 'n' para não.");
	                    resposta = s.nextLine();
	                }
	                if(resposta.equals("s")){
	                System.out.println("Digite o novo nome e lote : ");
	                nomePlanta = s.nextLine();
	                while(nomePlanta == ""){
	                System.out.println("Campo vazio, digite o nome da planta e seu lote.");
	                nomePlanta = s.nextLine();
	                    }
	                }
	                System.out.println("Digite o novo tempo de vida(em dias) da planta : ");
	                idadeAntiga = idadePlanta;
	                idadePlanta = s.nextInt();
	                while(idadePlanta < 0 || idadePlanta <= idadeAntiga){
	                    System.out.println("Dado incorreto, nova idade não pode ser menor que 0 e deve maior que a idade antiga");
	                    idadePlanta = s.nextInt();
	                }
	                System.out.println("Digite a nova altura(em centimetros) da planta : ");
	                alturaAntiga = alturaPlanta;
	                alturaPlanta = s.nextDouble();
	                while(alturaPlanta <= 0 || alturaPlanta <= alturaAntiga){
	                    System.out.println("Dado incorreto, nova altura deve ser maior que 0 e que a altura antiga");
	                    alturaPlanta = s.nextDouble();
	                }
	                System.out.println("Quantas irrigações foram feitas nesta semana?");
	                gastosAntigos = gastosAgua;
	                gastosAgua = 0;
	                regasSemana = s.nextInt();
	                for(int i = 0; i < regasSemana; i++){
	                    System.out.println("Digite a quantidade(em mililitros) gastos na " + (i+1) + ".rega : ");
	                    int mlGastos = s.nextInt();
	                    while(mlGastos <= 0){
	                        System.out.println("Dado incorreto, digite um valor maior que 0.");
	                        mlGastos = s.nextInt();
	                    }
	                    gastosAgua += mlGastos;
	                }
	                gastosAgua = gastosAgua / regasSemana;
	                System.out.println("Os dados de " + nomePlanta + " forma atualizados com sucesso!");
	                System.out.println("=========================");
	                System.out.println();
	            break;
	            case 4:
	                if(idadeAntiga <= 0 || alturaAntiga == 0 || gastosAntigos == 0){
	                    System.out.println("Atualize os Dados da planta antes de conferir seu crescimento.");
	                    System.out.println();
	                    break;
	                }
	                System.out.println();
	                System.out.println("==Conferir Crescimento===");
	                int intervalo = idadePlanta - idadeAntiga;
	                double crescimento = (alturaPlanta - alturaAntiga) / intervalo;
	                System.out.printf("%s tem a estimativa de crescimento de %.2f cm por dia\n", nomePlanta, crescimento);
	                System.out.printf("%.2f --> %.2f em %d dias!\n", alturaAntiga, alturaPlanta, intervalo);
	                    if(gastosAgua < gastosAntigos){
	                        System.out.println("Alem disso, o consumo de água de " + nomePlanta + " diminuiu");
	                        System.out.printf("De em media %.2f mililitros de água por rega, para %.2f por rega\n", gastosAntigos, gastosAgua);
	                    } else if(gastosAgua > gastosAntigos){
	                        System.out.println("Alem disso, o consumo de água de " + nomePlanta + " aumentou\n");
	                        System.out.printf("de em media %.2f mililitros de água por rega, para %.2f por rega\n", gastosAntigos, gastosAgua);
	                    }
	                System.out.println("=========================");
	                System.out.println();
	            break;         
	            case 5:
	                nomePlanta = "";
	                idadePlanta = 0;
	                alturaPlanta = 0.0;
	                gastosAgua = 0.0;
	                regasSemana = 0;
	                idadeAntiga = 0;
	                alturaAntiga = 0;
	                gastosAntigos = 0;
	                System.out.println();
	                System.out.println("=========================");
	                System.out.println("     Dados Excluidos.    ");
	                System.out.println("=========================");
	                System.out.println();
	            break;
	            case 6:
	            System.out.println("Encerrando aplicação...");     
	            break;
	            default:
	            System.out.println("Operação invalida! digite um numero de 1 a 6.");
	            System.out.println();
	            
	        }
	    }
	}
}