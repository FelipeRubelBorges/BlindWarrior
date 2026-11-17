package rubel.felipe.collections2;

import java.util.*;
import java.util.function.Function;

/**
 *
 */
public class Funcoes {

	static

	// classes genericas
	<TIPO, CHAVE>

	// retorno
	ArrayList<ArrayList<TIPO>> groupBy(

		// lista de TIPO generico definido anteriormente
		List<TIPO> listaOrigem,

		// funcao que retonar um parametro qualquer para eu agrupar
		Function<TIPO, CHAVE> leitorDeChaveDeAgrupamento )

	{

		Map<CHAVE, ArrayList<TIPO>> grupos = new LinkedHashMap<>();
		for (TIPO item : listaOrigem) {
			CHAVE chave = leitorDeChaveDeAgrupamento.apply(item);
			grupos.computeIfAbsent(chave, key -> new ArrayList<>()).add(item);
		}
		return new ArrayList<>(grupos.values());
	}
}
