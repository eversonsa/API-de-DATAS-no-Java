package br.datas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author everson
 * @version 1.0.0
 *  Atraves do último período menstrual o software deve calcular e exibir a data estimada do parto
 *  e a data estimada da concepção
 *  Apenas para estudo de manipulação de datas em java
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
		// cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual 
		Calendar dataConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		
		return dataConcepcao.getTime();
		
	}

	public Date calcularDataEstimadaParto() {
		// cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
		
		Calendar dataEstimadoDoParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataEstimadoDoParto.add(Calendar.WEEK_OF_YEAR, 40);
		return dataEstimadoDoParto.getTime();
	}

}
