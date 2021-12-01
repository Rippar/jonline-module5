package by.jonline.module5.task1;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. 
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/

public class Runner {

	public static void main(String[] args) {

		View view = new View();

		Directory disk = new Directory("С:");

		Directory userFolder = new Directory("Users");
		disk.addDirectory(userFolder);

		Directory desktopFolder = new Directory("Desktop");
		userFolder.addDirectory(desktopFolder);

		TextFile essay = new TextFile("Java essay", "Data types and operators");
		desktopFolder.addFile(essay);

		view.printDirectory(disk);
		view.printDirectory(userFolder);
		view.printDirectory(desktopFolder);

	}

}
