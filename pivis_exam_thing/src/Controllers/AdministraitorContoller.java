package Controllers;

import Models.CatalogModel;
import Models.DocumentModel;
import interfaces.AdministratorControllerInterface;
import interfaces.CatalogModelInterface;
import interfaces.DocumentModelInterface;

import java.util.ArrayList;
import java.util.Date;

public class AdministraitorContoller implements AdministratorControllerInterface {






    public void deleteDoc(String docName, CatalogModelInterface rootCat) {

        for (var e:rootCat.getDocumentModelArrayList()) {
            if (e.getHeader().equals(docName)) {
                rootCat.getDocumentModelArrayList().remove(e);
            }
        }
        for (var e:rootCat.getCatalogModelArrayList()) {
            deleteDoc(docName, e);
        }
    }


    public void moveDocTo(String docName, CatalogModelInterface catalogDestination,  CatalogModelInterface rootCat) {
        DocumentModelInterface temp=new DocumentModel();
        for (var e:rootCat.getDocumentModelArrayList()) {
            if (e.getHeader().equals(docName)) {
                temp = e;
                rootCat.getDocumentModelArrayList().remove(e);
            }
        }
        for (var e:rootCat.getCatalogModelArrayList()) {
            moveDocTo(docName, catalogDestination, e);
            if (e.equals(catalogDestination)) {
                e.getDocumentModelArrayList().add(temp);
            }
        }
    }


    public CatalogModelInterface createCatalog(ArrayList<CatalogModelInterface> catalogModelArrayList, ArrayList<DocumentModelInterface> documentModelArrayList, String catalogName) {
        CatalogModel catalog=new CatalogModel(catalogModelArrayList,documentModelArrayList,catalogName);
        return catalog;
    }





}
