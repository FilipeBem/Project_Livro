public class livro implements publicCao {
  private String titulo;
  private String autor;
  private int totapaginas;
  private int pagAtual;
  private boolean aberto;
  private pessoa leitor;

  public String detalhes(){
    return "Livro{" + "titulo= " + titulo + ", autor= " +  autor + "\n totpaginas= " + totapaginas + ", pagAtual= " + pagAtual + "\n aberto= " + aberto + ", leitor= " + leitor.getNome() +
    "\n idade= " + leitor.getIdade()+ "\n sexo= " + leitor.getSexo() + " }";
  }

  public livro(String titulo, String autor, int totapaginas, int pagAtual, boolean aberto, pessoa leitor){
    this.titulo = titulo;
    this.autor = autor;
    this.aberto = false;
    this.pagAtual = 0;
    this.totapaginas = totapaginas;
    this.leitor = leitor;

  }

  public String getTitulo(){
    return titulo;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public String getAutor(){
    return autor;
  }

  public void setAutor(String autor){
    this.autor = autor;
  }
  
  public int getTotapaginas(){
    return totapaginas;
  }

  public void setTotapaginas(int totapaginas){
    this.totapaginas = totapaginas;
  }

  public int getPagAtual(){
    return pagAtual;
  }

  public void setPagAtual(int pagAtual){
    this.pagAtual = pagAtual;
  }

  public boolean getAberto(){
   return aberto; 
  }

  public void setAberto(boolean aberto){
    this.aberto = aberto;
  }

  public pessoa getLeitor(){
    return leitor;
  }

  public void setLeitor(pessoa leitor){
    this.leitor = leitor;
  }

@Override
public void abrir() {
    this.aberto = true;
}

@Override
public void fechar() {
    this.aberto = false;
}

@Override
public void folear(int p) {
    if (p > this.totapaginas){
        this.pagAtual = 0;
    } else{
        this.pagAtual = p;
    }
}

@Override
public void avancarPag() {
    this.pagAtual++;
}

@Override
public void voltarPag() {
    this.pagAtual--;
}

}