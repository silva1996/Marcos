public class Main
{
	public static void main(String[] args) {
    String meuNome ="Marcos Junior";
    int minhaIdade = 40;
    double meuPeso = 90.5;
    double altura = 2.10;
    String profissao= "programador";
    boolean isLegal = true;
    char gênero = 'm';
    
    System.out.println("O nome é : "+meuNome);
    System.out.println("A idade é: "+minhaIdade);
    System.out.println("O meu peso é:"+meuPeso);
    System.out.println("A altura:"+altura);
    System.out.println("A prof+isão: "+profissao);
    System.out.println("é legal: "+isLegal);
    System.out.println("O gênero:"+gênero);
    
    
    int idadeDias = minhaIdade*365;
    int idadeHoras = idadeDias*24;
    int idadeMinutos = idadeHoras*60;
    int idadeSegundo = idadeMinutos*60;
    
    System.out.println("A sua idade em dias: "+idadeDias+", em horas "+idadeHoras+", em minutos "+idadeMinutos+", em segundos "+idadeSegundo);
    
	}
	
}
