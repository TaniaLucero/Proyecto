package mx.edu.tesoem.isc.tlgr.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnEliminar(View v){
        Intent intent = new Intent(this,Eliminar.class);
        startActivity(intent);
        this.finish();
    }
    public void btncAgregar(View v){
        Intent intent = new Intent(this,Agregar.class);
        startActivity(intent);
        this.finish();
    }
    public void btnLista(View v) {
        Intent intent = new Intent(this,Lista.class);
        startActivity(intent);
        this.finish();
    }
}
