package interfaces;

import Models.CatalogModel;
import Models.DocumentModel;

import java.util.ArrayList;

public interface CatalogModelInterface {
    public String getCatalogName();

    public void setCatalogName(String catalogName);

    public ArrayList<DocumentModelInterface> getDocumentModelArrayList();

    public ArrayList<CatalogModelInterface> getCatalogModelArrayList();
}
