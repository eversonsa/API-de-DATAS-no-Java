package br.datas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author everson
 * @version 1.0.0
 *  Atraves do �ltimo per�odo menstrual o software deve calcular e exibir a data estimada do parto
 *  e a data estimada da concep��o
 *  Apenas para estudo de manipula��o de datas em java
 */

public class CalculadoraGravidez {
	
	
	private Date dataUltimoPeriodoMenstrual;
		
	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}

	public Date calcularDataEstimadaConcepcao() {
		// c�lculo de data estimada da concep��o
		// 2 semanas ap�s a data do �ltimo per�odo menstrual 
		Calendar dataConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		
		return dataConcepcao.getTime();
		
	}

	public Date calcularDataEstimadaParto() {
		// c�lculo de data estimada para parto
		// 40 semanas ap�s a data do �ltimo per�odo menstrual
		
		Calendar dataEstimadoDoParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataEstimadoDoParto.add(Calendar.WEEK_OF_YEAR, 40);
		return dataEstimadoDoParto.getTime();
	}

}
