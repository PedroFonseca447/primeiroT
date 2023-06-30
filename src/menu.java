 import java.util.Scanner;
  import java.util.Calendar;
import java.util.GregorianCalendar;
public class menu
{
public static void menu(){
        System.out.println("\t digite sua escolha para a execução");
        System.out.println("0. Fim");
        System.out.println("1.Seu signo");
        System.out.println("2. Dia do nascimento ");
        System.out.println("3. Dia do aniversário ");
         System.out.println("Opção:");
            }
        public static void signo(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Você entrou no método Signo.");
            
            
            System.out.println("digite seu dia de nascimento");
            int dia=teclado.nextInt();
            System.out.println("digite seu mês de nascimento");
            int mês=teclado.nextInt();    
        do
        {
            System.out.println("digite seu dia de nascimento válido");
            dia=teclado.nextInt();
            System.out.println("digite seu mês de nascimento válido");
            mês=teclado.nextInt();
            }while(dia>31&&mês>12);
                System.out.println("\f");
        if(mês==01&&dia<21){System.out.println("seu signo é capricórnio");}
             else if(mês==01&&dia>20){System.out.println("seu signo é aquário");}
                  else if(mês==02&&dia<20){System.out.println("seu signo é aquário");}
                         else if(mês==02&&dia>19){System.out.println("seu signo é peixes");}
                             else if(mês==03&&dia<21){System.out.println("seu signo é peixes");}
                                      else if(mês==03&&dia>20){System.out.println("seu signo é áries");}
                                  else if(mês==04&&dia<21){System.out.println("seu signo é àries");}
            else if(mês==04&&dia>20){System.out.println("seu signo é touro");}
            else if(mês==05&&dia<21){System.out.println("seu signo é touro");}
            else if(mês==05&&dia>20){System.out.println("seu signo é gemeos");}
            else if(mês==06&&dia<21){System.out.println("seu signo é gemeos");}
            else if(mês==06&&dia>20){System.out.println("seu signo é câncer");}
            else if(mês==07&&dia<22){System.out.println("seu signo é câncer");}
            else if(mês==0&&dia>22){System.out.println("seu signo é leão");}
            else if(mês==8&&dia<23){System.out.println("seu signo é leão");}
        else if(mês==8&&dia>22){System.out.println("seu signo é virgem");}
        else if(mês==9&&dia<23){System.out.println("seu signo é virgem");}
        else if(mês==9&&dia>22){System.out.println("seu signo é libra");}
        else if(mês==10&&dia<23){System.out.println("seu signo é libra");}
        else if(mês==10&&dia>22){System.out.println("seu signo é escorpião");}
        else if(mês==11&&dia<22){System.out.println("seu signo escorpião");}
        else if(mês==11&&dia>21){System.out.println("seu signo sagitário");}
        else if(mês==12&&dia<22){System.out.println("seu signo sagitário");}
        else if(mês==12&&dia>21){System.out.println("seu signo é capricórnio");}
        
            }

            public static void dias(){
                
                System.out.println("\f");       
                System.out.println("Você entrou no método dia do seu nascimento.");
                String dias []= {" Domingo ", " Segunda "," Terça "," Quarta "," Quinta "," Sexta "," Sábado "};
                Scanner teclado = new Scanner (System.in);

                System.out.print("insira o dia: ");
                int dia = teclado.nextInt();
                System.out.print("insira o mes: ");
                int mês = teclado.nextInt();
                System.out.print("insira o ano: ");
                int ano = teclado.nextInt();
                //congruencia de Zeller
                if((dia < 32)&&(mês < 13)&&(ano < 10000)){
                    int a = (14 - mês) / 12;
                    int y = ano - a;
                    int m = mês + 12 * a - 2;

                    int d = (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
                    System.out.print("O dia é : " + dias[d]);
                    
                    }
                    
                
            }

            public static void aniversário(){
                System.out.println("Você entrou no método Aniversário.");
                
                Calendar cal = GregorianCalendar.getInstance();
                
                int anoAtual = cal.get(Calendar.YEAR);
                int mêsAtual= cal.get(Calendar.MONTH);
                int diaAtual= cal.get(Calendar.DAY_OF_MONTH);
                Scanner teclado = new Scanner(System.in);
                
                System.out.println("Dia em que você nasceu");
                int dia = teclado.nextInt();
                System.out.println("Mês em que você nasceu: ");
                int mês = teclado.nextInt();
                System.out.println("Ano em que você nasceu: ");
                int anoNasc = teclado.nextInt();
                int mêsG=mês-1;
            
                    if(mêsG<mêsAtual)
                    {if(dia<diaAtual)System.out.println("você tem:" + (anoAtual - anoNasc) + "\n anos."+"dias:"+(diaAtual-dia)+"\n meses:"+(mêsAtual-mêsG));
                    else if(dia>=diaAtual)System.out.println("você tem:" +(anoAtual - anoNasc) + "\n anos."+"dias:" +(dia-diaAtual)+"\n meses:"+(mêsAtual-mêsG));
                                
                } 
                
                if(mêsG==mêsAtual){if(dia<diaAtual)System.out.println("Você tem: "+(anoAtual-anoNasc)+ "\n anos.");
                else if(dia==diaAtual)System.out.println("Você tem: " +(anoAtual-anoNasc)+"\n anos." + "\n FELIZ ANIVERSÁRIO");
                else if(dia>diaAtual)System.out.println("Você tem: "+((anoAtual-anoNasc)-1)+"\n anos. "+"\n faltam:"+(dia-diaAtual));        }
                
                
                if(mêsG>mêsAtual){System.out.println("voce tem: "+(anoAtual-anoNasc)+"\n faltam: "+(mêsG-mêsAtual)+"\n para seu aniversário");}
                
                
            
                
            }
        public static void main(String[] args) {
                int opção;
                Scanner entrada = new Scanner(System.in);
                System.out.println("\f");
                do{
                    menu();
                    opção = entrada.nextInt();

                    switch(opção){
                    case 1:
                        
                    signo();
                        break;

                    case 2:
                        dias();
                        break;

                    case 3:
                        aniversário();
                        break;

                    default:
                        System.out.println("encerrado.");
                    }
                } while(opção != 0);
            
                
            }

            
            
            
            

        }
            
