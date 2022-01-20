package Controllers;

import Models.CatalogModel;
import Models.DocumentModel;
import interfaces.CatalogModelInterface;
import interfaces.DocumentModelInterface;
import interfaces.WriterControlerInterface;

import java.net.InetAddress;

public class WriterControler implements WriterControlerInterface {



    private String getNameOfAuthorDevice(){
        try{
            String computername= InetAddress.getLocalHost().getHostName();

            return computername;
        }catch (Exception exception){
            String computername="error";
            return computername;
        }

    }


    public DocumentModelInterface createDocument(String header, String text) {
            java.util.Date date=new java.util.Date();
            DocumentModel add=new DocumentModel(header,text, getNameOfAuthorDevice(), date);
            return add;

    }


    public void updateDocument(String docName, String header, String text, CatalogModelInterface rootCat) {
        for (var doc: rootCat.getDocumentModelArrayList()){
            if (doc.getHeader().equals(docName)){
                doc.setHeader(header);
                doc.setText(text);
            }
        }
        for (var cat:rootCat.getCatalogModelArrayList()){
           updateDocument(docName,header,text,cat);
        }
    }
}
