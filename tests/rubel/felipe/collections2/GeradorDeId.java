package rubel.felipe.collections2;

/**
 *
 */
public interface GeradorDeId {

	static long gerar(){
		return (long)Math.floor( Math.random() * System.currentTimeMillis() );
	}

}
