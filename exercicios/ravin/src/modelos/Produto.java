package modelos;

import enums.Status;
import enums.StatusPreparo;

public class Produto {
  private String nome;
  private String descricao;
  private Integer codigo;
  private Float precoCusto;
  private Float precoVenda;
  private StatusPreparo statusPreparo;
  private String tempoPreparo;
  private String observacoes;
  private Status status; 
}
