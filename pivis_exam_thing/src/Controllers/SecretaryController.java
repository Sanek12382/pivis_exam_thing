package Controllers;


import Models.DocumentModel;
import interfaces.CatalogModelInterface;
import interfaces.DocumentModelInterface;
import interfaces.SecretaryControllerInterface;

public class SecretaryController implements SecretaryControllerInterface {




    public void addDocToCatalog(DocumentModelInterface documentModel, CatalogModelInterface catalogModel, CatalogModelInterface rootCat) {
       rootCat.getCatalogModelArrayList().forEach(e->{
           if (e.equals(catalogModel)){
               rootCat.getDocumentModelArrayList().add(documentModel);
           }
           else {addDocToCatalog(documentModel,catalogModel,e);}
       });
    }


    public DocumentModelInterface findDocByAuthor(String author, CatalogModelInterface rootCat){
       for (var doc: rootCat.getDocumentModelArrayList()){
           if (doc.getAuthor().equals(author)){
               return doc;
           }
       }
           for (var cat:rootCat.getCatalogModelArrayList()){
               findDocByAuthor(author,cat);
           }
        return null;
    }


    public DocumentModelInterface findDocByHeader(String docHeader, CatalogModelInterface rootCat) {
        for (var doc: rootCat.getDocumentModelArrayList()){
            if (doc.getHeader().equals(docHeader)){
                return doc;
            }
        }
        for (var cat:rootCat.getCatalogModelArrayList()){
            findDocByHeader(docHeader,cat);
        }

        return null;
    }
}
