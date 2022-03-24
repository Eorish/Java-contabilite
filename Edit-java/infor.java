public class infor {

    public int idade;
    public String Nome;
    public String ano;
    public String cpf;
    public String endreço;
    public String celular;

    void siwt() {

        System.out.println(" Olá tenho " + idade + " me chamo " + Nome + " e nasci dia " + ano);
    }

    void uni() {
        System.out.println(" Somos " + Nome + " e estamos localizados na " + endreço + " Para cadastrar em nossos cursos ligue: " + celular + "");
    }

    public void Nome(String Nome)
			{
				this.Nome = Nome;
            }
            
            public void endereço(String endreço)
			{
				this.endreço = endreço;
			}
}

