package win.prashant.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String []name= {"Paris","Rome","Florence","London","Barcelona","Venice"};
    int []image= {R.drawable.p,R.drawable.f,R.drawable.l,R.drawable.b,R.drawable.v};
    String[] dest = {"Capital of france","Capital of italy","historic city in italy","Capital of england","Capital of Sapin","City of river"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        CustomArrayAdaptor cc = new CustomArrayAdaptor(MainActivity.this,name,image,dest);

        listView.setAdapter(cc);
    }
}
