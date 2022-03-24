public class contabilite {
    
     int computadores;
     int pessoas;
     int teclados;
     int mouses;
     int telas;
     infor idade;
    

    void result() {
        System.out.println("Hoje na Fasipe temos " + computadores + " computador suportando " + pessoas + " com " + teclados + " teclados com um total de " + mouses + " mouses com um resultado de " + telas + " telas! \n");
    }

    void altes() {
        infor contas = new infor();
        contas.Nome("Eliseu " + "Willian " + "Adilson " + "Marcelo ");
        System.out.println("Alunos Registrados:" + contas.Nome );

    }

    void idade() {
        infor conter = new infor();
       conter.idade = 18 + 19 + 20 + 30; 
       conter.Nome("\n Idade que o aluno mais velho possue");
        System.out.println(conter.idade + conter.Nome);

        
    }

    void delta(int idade){
        this.idade();
    }

}
