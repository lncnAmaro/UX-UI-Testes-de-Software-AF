package avaliacaoFinal_UXUI;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 * <p>Esta classe executa o teste das operações matemáticas básicas como soma, subtração,
 * multiplicação, divisão a partir do método que seleciona a operação
 * desejada com base em um operador informado pelo usuário, todas provenientes da classe Calculadora.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 * <li>Técnicas de revisão estática (caixa branca)</li>
 * <li>Técnicas de revisão (caixa branca)</li>
 * <li>Aplicação de refatoração em código Java</li>
 * <li>Documentação com Javadoc</li>
 * </ul>
 * 
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>, sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 * @author Lincon Amaro - RA: 210026
 * @version 1.0
 */

public class TesteCalculadora {

	/**
	 * Este método principal testa o uso da classe Calculadora através de uma série de comandos que realizam tais
	 * operações, assim como os cenários que devem lançar as exceções.
	 * 
	 * **Resultados esperados:**
	 * <ul>
	 *   <li>Soma: 2 + 3 = 5</li>
	 *   <li>Subtração: 10 - 4 = 6</li>
	 *   <li>Multiplicação: 3 * 5 = 15</li>
	 *   <li>Divisão: 8 / 2 = 4</li>
	 * </ul>
	 * 
	 * **Testes de Exceção:**
	 * <ul>
	 *   <li>Divisão por zero: Testa se a exceção é lançada corretamente ao tentar uma divisão por 0.</li>
	 *   <li>Operador inválido: Testa se a exceção é lançada ao usar a letra 'x'.</li>
	 * </ul>
	 * 
	 * Os resultados das operações válidas e as mensagens das exceções capturadas são impressos no console.
	 * 
	 * @param args Argumentos de linha de comando (não utilizados neste exemplo).
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.calcular(2,  3, "+")); // Testa o método de soma
		System.out.println(calc.calcular(10,  4, "-")); // Testa o método de subtração
		System.out.println(calc.calcular(3,  5, "*")); // Testa o método de multiplicação
		System.out.println(calc.calcular(8,  2, "/")); // Testa o método de divisão

		try {
			System.out.println(calc.calcular(8,  0, "/")); // Lança a exceção ao dividir 8 por 0
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calc.calcular(5,  5, "x")); // Lança a exceção se for utilizada a letra 'x' ao invés do símbolo '*'
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
