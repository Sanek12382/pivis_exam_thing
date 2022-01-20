package interfaces;

import Models.CatalogModel;
import Models.DocumentModel;

public interface SecretaryControllerInterface {
     public    void addDocToCatalog(DocumentModelInterface documentModel, CatalogModelInterface catalogModel, CatalogModelInterface rootCat);
     public  DocumentModelInterface findDocByAuthor(String author, CatalogModelInterface rootCat);
     public  DocumentModelInterface findDocByHeader(String docHeader, CatalogModelInterface rootCat);
}

