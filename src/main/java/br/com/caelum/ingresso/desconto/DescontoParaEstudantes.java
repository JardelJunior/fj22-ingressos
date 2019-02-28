package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto{
		@Override
		public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDescricao() {
			
			return "Normal";
		}
}
