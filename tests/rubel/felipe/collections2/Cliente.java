package rubel.felipe.collections2;

import lombok.*;

/**
 *
 */
@Getter
@Setter
public class Cliente {

	long id = GeradorDeId.gerar();
	String nome;
}
