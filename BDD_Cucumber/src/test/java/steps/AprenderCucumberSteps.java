package steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {

	@Dado("que criei o arquivo correntamente")
	public void que_criei_o_arquivo_correntamente() {

	}

	@Quando("exectuá-lo")
	public void exectuá_lo() {

	}

	@Então("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {

	}

	private int contador = 0;

	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(int int1) {
		contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(int int1) {
		contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(int int1) {
		Assert.assertEquals((int) int1, contador);
	}

	Date entrega = new Date();

	@Dado("^que o prazo é dia (\\d{2})/(\\d{2})/(\\d{4})$")
	public void que_o_prazo_é_dia(int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("^a entrega atrasar em (\\d+) (meses|mes|dias|dia)$")
	public void a_entrega_atrasar_em_dias(int int1, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, int1);
		}
		entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_será_efetuada_em(String entrega_final) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String data_formatada = format.format(entrega);
		Assert.assertEquals(entrega_final, data_formatada);
	}

	@Dado("^que o ticket( especial)? é (A[A-Z]\\d{3})$") // AF345
	public void que_o_ticket_é(String aux, String ticket) {
		System.out.println(ticket);
	}

	@Dado("^que o valor da passagem é R\\$\\s(\\d+,\\d{2})$") // 230,45
	public void que_o_valor_da_passagem_é_r$(Double passagem) {
		System.out.println(passagem);
	}

	@Dado("^que o nome do passageiro é (\\S+\\s\\S{2}\\s\\S+)$") // Fulano da Silva
	public void que_o_nome_do_passageiro_é(String nome) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(nome);
	}

	@Dado("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void que_o_telefone_do_passageiro_é(String telefone) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(telefone);
	}

	@Quando("criar os steps")
	public void criar_os_steps() {		
	}

	@Então("o teste vai funcionar")
	public void o_teste_vai_funcionar() {
	}

}
