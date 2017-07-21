package rubel.felipe.collections2;

import lombok.*;

/**
 *
 */
@Getter
@Setter
public class Produto {

	long id = GeradorDeId.gerar();

	String nome;

	long idUsuario;

	long idCategoria;
}
