package modelos;
import java.util.List;

public class Comanda {
  private Mesa mesa;
  private Cliente cliente;
  private List<Produto> produtos;
  private StatusComanda statusComanda;
  private Integer codigo;
  private Float valorTotalComanda;
}
