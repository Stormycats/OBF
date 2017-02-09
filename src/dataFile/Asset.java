package dataFile;

abstract public class Asset {

	private String code;
	private String type;
	private String label;

	public Asset(String code, String type, String label) {
		this.code = code;
		this.type = type;
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
