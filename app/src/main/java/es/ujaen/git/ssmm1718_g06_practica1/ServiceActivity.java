package es.ujaen.git.ssmm1718_g06_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {
//Esta clase además es una actividad, la cuál pasaremos los datos introducidos por el usuario en el MainActivity.
//En este caso, como comprobación, imprimimos un get del dato user.En la siguiente práctica daremos uso a los parametros.
    public static final String PARAM_USER="param_user";
    public static final String PARAM_PASS="param_pass";
    public static final String PARAM_IP="param_ip";
    public static final String PARAM_PORT="param_port";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        String user=getIntent().getStringExtra(PARAM_USER);
        String pass=getIntent().getStringExtra(PARAM_PASS);
        String ip=getIntent().getStringExtra(PARAM_IP);
        short port=getIntent().getShortExtra(PARAM_PORT,(short)6000);

        Toast.makeText(this,"Bienvenido "+user,Toast.LENGTH_SHORT).show();

        TextView title= (TextView) findViewById(R.id.textView4);
        title.setText("Hola "+user+"");

    }
}
