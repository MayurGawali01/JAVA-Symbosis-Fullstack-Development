package hasAInheritance;

public class Football {
	
	private String type,size,weigth;

	public Football(String type, String size, String weigth) {
		super();
		this.type = type;
		this.size = size;
		this.weigth = weigth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeigth() {
		return weigth;
	}

	public void setWeigth(String weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Football [type=" + type + ", size=" + size + ", weigth=" + weigth + "]";
	}
	
	
}
