package questao7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Hora {
	
	//Criando variáveis e o formato para receber o horário do computador
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); 
	Date date = new Date(); 
	Calendar teste = Calendar.getInstance();
	
	//Criando variáveis que recebem a hora da classe date
	private int hora = date.getHours();
	private int minuto = date.getMinutes();
	
	public String getTime() {
		//Comparações para saber em qual momento do dia está, de forma a saber como será feito o print ao usuário logado
		if(hora >= 6 && hora <= 11 && minuto <= 59){
			return "Bom dia, você se logou ao nosso sistema.";
		}else if (hora >= 12 && hora <= 17 && minuto <= 59) {
			return "Boa tarde, você se logou ao nosso sistema.";
		}else if (hora >= 18 && hora <= 23 && minuto <= 59) {
			return "Boa noite, você se logou ao nosso sistema.";
		}else {
			return "Boa madrugada, você se logou ao nosso sistema.";
		}
	}
}
