package interfaces;

import Models.CatalogModel;
import Models.DocumentModel;

import java.net.InetAddress;

public interface WriterControlerInterface {


    public DocumentModelInterface createDocument(String header, String text);
    public void updateDocument(String docName, String header, String text, CatalogModelInterface rootCat);
}
