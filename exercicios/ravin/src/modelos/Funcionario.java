package modelos;

import java.util.Date;

import enums.Disponibilidade;
import enums.Escolaridade;
import enums.EstadoCivil;

public class Funcionario extends Pessoa {
  private String rg;
  private EstadoCivil estadoCivil;
  private Escolaridade escolaridade;
  private String cargo;
  private String numeroCarteiraTrabalho;
  private Date dataAdmissão;
  private Date dataDemissão;
  private Disponibilidade disponibilidade;
}
