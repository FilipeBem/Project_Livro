public class ProjetoLivro {

  public static void main(String[] args) {
    pessoa[] p = new pessoa[2];
    livro[] l = new livro[3];

    p[0] = new pessoa("Pedro", 22, "M");
    p[1] = new pessoa("Maria", 25, "F");

    l[0] = new livro("Treinando java", "Fellipe", 200, 0, false, p[0]);
    l[1] = new livro("Aprendendo mongoDB", "Mariane", 250, 0, false, p[1]);
    l[2] = new livro("C# é pior", "fulano de tal", 300, 0, false, p[0]);

    l[0].abrir();
    l[0].folear(30);
    System.out.println(l[0].detalhes());
    System.out.println(l[1].detalhes());

    
}

}
