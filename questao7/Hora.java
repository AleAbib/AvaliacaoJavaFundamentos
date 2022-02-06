package questao7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Hora {
	
	//Criando vari�veis e o formato para receber o hor�rio do computador
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); 
	Date date = new Date(); 
	Calendar teste = Calendar.getInstance();
	
	//Criando vari�veis que recebem a hora da classe date
	private int hora = date.getHours();
	private int minuto = date.getMinutes();
	
	public String getTime() {
		//Compara��es para saber em qual momento do dia est�, de forma a saber como ser� feito o print ao usu�rio logado
		if(hora >= 6 && hora <= 11 && minuto <= 59){
			return "Bom dia, voc� se logou ao nosso sistema.";
		}else if (hora >= 12 && hora <= 17 && minuto <= 59) {
			return "Boa tarde, voc� se logou ao nosso sistema.";
		}else if (hora >= 18 && hora <= 23 && minuto <= 59) {
			return "Boa noite, voc� se logou ao nosso sistema.";
		}else {
			return "Boa madrugada, voc� se logou ao nosso sistema.";
		}
	}
}
