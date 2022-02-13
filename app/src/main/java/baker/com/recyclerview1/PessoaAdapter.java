package baker.com.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import baker.com.recyclerview1.R;

public class PessoaAdapter extends AppCompatActivity {

    private List<Pessoa> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pessoa_adapter);
    }
}