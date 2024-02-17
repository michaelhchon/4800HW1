import java.util.ArrayList;
import java.util.List;

public class FolderDriver {

	public static void main(String[] args) {
		Folder root = new Folder("php_demo1");
		Folder sourceFiles = new Folder("Source Files");
		Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File indexhtml = new File("index.html");

        // demo1
        root.addSubFolder(sourceFiles);
        root.addSubFolder(includePath);
        root.addSubFolder(remoteFiles);
        
        // Source Files
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(indexhtml);
        
        // app
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        
        // 1. Print full structure
        root.print(0);

        // 2. Delete app folder
        System.out.println();
        sourceFiles.delete(app);
        root.print(0);

        // 3. Delete public folder
        System.out.println();
        sourceFiles.delete(publicFolder);
        root.print(0);
	}

}
