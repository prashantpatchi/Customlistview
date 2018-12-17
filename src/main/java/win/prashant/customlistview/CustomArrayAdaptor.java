package win.prashant.customlistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomArrayAdaptor extends ArrayAdapter {

    // passing data type used in custom list view
    private Activity context;
    private String[] productname;
    private int[] image;
    private String [] des;

    // this is constructor according to our requirement
    public CustomArrayAdaptor(Activity context,String[] productname,int [] image, String[] des) {
        super(context, R.layout.custom_listview, productname);

        this.context= context;
        this.image = image;
        this.productname = productname;
        this.des= des;
    }

    // get the data
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custom_listview,null);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);
        TextView textView1 = view.findViewById(R.id.textView2);
        imageView.setImageResource(image[position]);
        textView.setText(productname[position]);
        textView1.setText(des[position]);
        return view;
    }
}
