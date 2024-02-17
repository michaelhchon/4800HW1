import java.util.ArrayList;
import java.util.List;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("File: " + name);
    }
}

class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void print(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("\t");
        }
        System.out.println("-Folder: " + name);

        for (Folder subFolder : subFolders) {
            subFolder.print(depth + 1);
        }

        for (File file : files) {
            for (int i = 0; i < depth + 1; i++) {
                System.out.print("\t");
            }
            System.out.println("-File: " + file.getName());
        }
    }

    public void delete(Folder target) {
    	for (int i = 0; i < subFolders.size(); i++) {
            Folder folder = subFolders.get(i);
            if (folder.equals(target)) {
                subFolders.remove(i);
                return; 
            }
        }
    }
}