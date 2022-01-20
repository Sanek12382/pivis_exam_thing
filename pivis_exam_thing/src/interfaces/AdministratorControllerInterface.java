package interfaces;

import Models.CatalogModel;
import Models.DocumentModel;

import java.util.ArrayList;

public interface AdministratorControllerInterface {





    public void deleteDoc(String docName, CatalogModelInterface rootCat);
    public void moveDocTo( String docName, CatalogModelInterface catalogDestination, CatalogModelInterface rootCat);
    public CatalogModelInterface createCatalog(ArrayList<CatalogModelInterface> catalogModelArrayList, ArrayList<DocumentModelInterface> documentModelArrayList, String catalogName);

}
