package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class login {
    @Dado("que realizei login no {string} com Ususrio {string} e senha {string}")
    public void queRealizeiLoginNoComUsusrioESenha(String arg0, String arg1, String arg2) {
        System.out.println("Passo: contexto ");
    }

    @Dado("que entrei com {string} e senha {string}")
    public void queEntreiComESenha(String arg0, String arg1) {
        System.out.println("Passo: Dado");
    }

    @Quando("Quando selecionei o botão {string}")
    public void quandoSelecioneiOBotão(String arg0) {
        System.out.println("Passo: Quando");
    }

    @Então("deve exibir a tela {string}")
    public void deveExibirATela(String arg0) {
        System.out.println("Passo: Entao");
    }
}
