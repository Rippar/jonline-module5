package by.jonline.module5.task1;

public class View {

	public void printFile(File file) {
		System.out.println("Имя файла: " + file.getName());
	}

	public void printTextFile(TextFile textFile) {
		System.out.println("Имя текстового файла: " + textFile.getName() + "\nСодержимое: " + textFile.getText());
	}

	public void printDirectory(Directory directory) {
		StringBuilder result = new StringBuilder(
				"Имя каталога: " + directory.getName() + "\nСписок внутренних каталогов: ");

		for (Directory d : directory.getDirectoryList()) {
			result.append(d.getName() + "; ");
		}

		result.append("\nСписок файлов текущего каталога: ");

		for (File f : directory.getFileList()) {
			result.append(f.getName() + "; ");
		}

		System.out.println(result.toString() + "\n");
	}

}
