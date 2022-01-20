package Models;

import interfaces.CatalogModelInterface;
import interfaces.DocumentModelInterface;

import java.util.ArrayList;

public class CatalogModel implements CatalogModelInterface {

  private String catalogName;
    private    ArrayList<DocumentModelInterface> documentModelArrayList;

    private ArrayList<CatalogModelInterface> catalogModelArrayList;

    public CatalogModel(ArrayList<CatalogModelInterface> catalogModelArrayList, ArrayList<DocumentModelInterface> documentModelArrayList, String catalogName){
        this.catalogName=catalogName;
        this.catalogModelArrayList=catalogModelArrayList;
        this.documentModelArrayList=documentModelArrayList;
    }
    public synchronized String getCatalogName() {
        return catalogName;
    }

    public synchronized void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }


    public synchronized ArrayList<DocumentModelInterface> getDocumentModelArrayList() {
        return documentModelArrayList;
    }


    
    public synchronized ArrayList<CatalogModelInterface> getCatalogModelArrayList() {
        return catalogModelArrayList;
    }


}
