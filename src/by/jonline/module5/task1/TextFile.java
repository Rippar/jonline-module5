package by.jonline.module5.task1;

public class TextFile extends File {

	private String text;

	public TextFile() {
		text = "";
	}

	public TextFile(String text) {
		this.text = text;
	}

	public TextFile(String name, String text) {
		super(name);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " name : " + super.getName() + "\ntext: " + text;
	}

}
