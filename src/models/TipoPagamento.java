package models;


public class TipoPagamento {
  private int id;
  private String tipo;
  private String data_cad;
  private String data_atlz;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getData_cad() {
    return data_cad;
  }

  public void setData_cad(String data_cad) {
    this.data_cad = data_cad;
  }

  public String getData_atlz() {
    return data_atlz;
  }

  public void setData_atlz(String data_atlz) {
    this.data_atlz = data_atlz;
  }
  
  @Override
  public String toString(){
    return getTipo();
}
          
}//EndClass
