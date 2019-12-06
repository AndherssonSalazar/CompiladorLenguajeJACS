package compiladorlenguajejacs.clases;

public class Objeto implements Comparable<Objeto>{
	String id;
	String tipo;
	String familia;
	String valor;
	public Objeto(String id, String tipo, String familia, String valor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.familia = familia;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Objeto [id=" + id + ", tipo=" + tipo + ", familia=" + familia + ", valor=" + valor + "]";
	}

	@Override
	public int compareTo(Objeto o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	
}
