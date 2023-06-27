package modelos;
import java.util.List;

import enums.StatusComanda;

public class Comanda {
  private Mesa mesa;
  private Cliente cliente;
  private List<Produto> produtos;
  private StatusComanda statusComanda;
  private Integer codigo;
  private Float valorTotalComanda;
}
