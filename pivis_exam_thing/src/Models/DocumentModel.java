package Models;

import interfaces.DocumentModelInterface;

import java.util.Date;

public class DocumentModel implements DocumentModelInterface {
    String header;
    String text;
    String author;
    Date date;


public DocumentModel(){}
public DocumentModel(String header, String text, String author, Date date){
    this.author=author;
    this.date=date;
    this.header=header;
    this.text=text;
}
    public void copyAllVals(DocumentModel documentModel){
        this.author=documentModel.getAuthor();
        this.date=documentModel.date;
        this.header=documentModel.header;
        this.text=documentModel.getText();
    }
    public synchronized String getHeader() {
        return header;
    }

    public synchronized void setHeader(String header) {
        this.header = header;
    }

    public synchronized String getText() {
        return text;
    }

    public synchronized void setText(String text) {
        this.text = text;
    }

    public synchronized String getAuthor() {
        return author;
    }








}
