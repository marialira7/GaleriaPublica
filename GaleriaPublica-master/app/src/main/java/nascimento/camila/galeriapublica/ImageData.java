package nascimento.camila.galeriapublica;

import android.graphics.Bitmap;
import android.net.Uri;

import java.util.Date;

public class ImageData {
    //guarda  endereco uri do arquivo de foto
    public Uri uri;
    //guarda imagem em minitura da foto
    public Bitmap thumb;
    //guarda nome do arquivo de foto
    public String fileName;
    //guarda data em que a foto foi criada
    public Date date;
    //guarda tamanho em bytes do arquivo de foto
    public int size;
    public ImageData(Uri uri, Bitmap thumb, String fileName, Date date, int size) {
        this.uri = uri;
        this.thumb = thumb;
        this.fileName = fileName;
        this.date = date;
        this.size = size;
    }
}

