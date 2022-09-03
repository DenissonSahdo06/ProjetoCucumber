# --------------- Criação ---------------
  # language: pt

# ---------------------------------------
Funcionalidade: fazer login no site

  Contexto:
    Dado que realizei login no "Google" com Ususrio "" e senha ""

  Esquema do Cenário: esquena
    Dado que entrei com "<login>" e senha "<senha>"
    Quando Quando selecionei o botão ""
    Então deve exibir a tela ""
    Exemplos:
      | login | senha |
      | acv   | 13    |
      | asd   | 321   |
