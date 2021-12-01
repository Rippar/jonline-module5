package by.jonline.module5.task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String name;
	private List<Directory> directoryList;
	private List<File> fileList;

	public Directory() {
		name = "";
		directoryList = new ArrayList<Directory>();
		fileList = new ArrayList<File>();

	}

	public Directory(String name) {
		this.name = name;
		directoryList = new ArrayList<Directory>();
		fileList = new ArrayList<File>();
	}

	public Directory(String name, List<Directory> directoryList) {
		this.name = name;
		this.directoryList = directoryList;
		fileList = new ArrayList<File>();
	}

	public Directory(String name, List<Directory> directoryList, List<File> fileList) {
		this.name = name;
		this.directoryList = directoryList;
		this.fileList = fileList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDirectoryList() {
		return directoryList;
	}

	public void setDirectoryList(List<Directory> directoryList) {
		this.directoryList = directoryList;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	public boolean addDirectory(Directory directory) {
		return directoryList.add(directory);
	}

	public boolean removeDirectory(Directory directory) {
		return directoryList.remove(directory);
	}

	public void addFile(File file) {
		fileList.add(file);
	}

	public void removeFile(File file) {
		fileList.remove(file);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directoryList == null) ? 0 : directoryList.hashCode());
		result = prime * result + ((fileList == null) ? 0 : fileList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (directoryList == null) {
			if (other.directoryList != null)
				return false;
		} else if (!directoryList.equals(other.directoryList))
			return false;
		if (fileList == null) {
			if (other.fileList != null)
				return false;
		} else if (!fileList.equals(other.fileList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " name=" + name + ", directoryList=" + directoryList + ", fileList="
				+ fileList;
	}

}
