public class Edit {

    public static void main(String[] args) {
        infor aluno = new infor();

        aluno.ano = "05/02/2002";
        aluno.idade = 20;
        aluno.Nome = "Eliseu Pereira da Silva";
        aluno.cpf = "805 987 564 - 97";

        aluno.siwt();

        System.out.println("\n");

        infor faculdade = new infor();
        faculdade.Nome = "Unifasipe";
        faculdade.endreço = "Av. Magda de C. Pissinatti, 69 - Residencial Florença, Sinop - MT, 78898-000";
        faculdade.celular = "(66) 3517-1320";

        faculdade.uni();
        
        System.out.println("\n");
        
        contabilite conta = new contabilite();
        conta.computadores = 54 ;
        conta.mouses =  54 ;
        conta.pessoas =  60 ;
        conta.teclados =  54 ;
        conta.telas =  54 ;

        conta.result();

        conta.altes();
        conta.idade();
    }

}
