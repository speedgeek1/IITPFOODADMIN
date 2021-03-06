package com.example.iitpfoodadmin;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class deliveryAdapter extends ArrayAdapter<userDelivery> {
    public deliveryAdapter(Context context, int resource, List<userDelivery> objects) {
        super(context, resource, objects);
    }

//    public interface BtnClickListener {
//        public abstract void onBtnClick(int position);
//    }
//
//    private BtnClickListener mClickListener = null;
//    public MessageAdapter(Context context, List<foodList> lista, BtnClickListener listener) {
//        mContext = context;
//        mLayoutInflater = (LayoutInflater) mContext
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        listaPerfiles=lista;
//        mClickListener = listener;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view = convertView;
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.user_list, parent, false);
        }

        //ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView addressTextView = (TextView) convertView.findViewById(R.id.addressTextView);
        TextView phoneTextView = (TextView) convertView.findViewById(R.id.phoneTextView);
        //TextView statusTextView=(TextView) convertView.findViewById(R.id.statusTextView);
        //TextView keyTextView=(TextView) convertView.findViewById(R.id.key);
        //TextView indexTextView=(TextView) convertView.findViewById(R.id.index);

        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        //Button b=(Button)convertView.findViewById(R.id.correct);
        userDelivery message = getItem(position);
//         b.setTag(position);
//         b.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 view.setBackgroundResource(R.drawable.greencolor);
//
//             }
//         });

        //messageTextView.setVisibility(View.VISIBLE);
        //photoImageView.setVisibility(View.GONE);
        nameTextView.setText(message.getuName());
        addressTextView.setText(message.getuAddress());
        phoneTextView.setText(message.getuMobile());
        //statusTextView.setText(message.getStatus());
        //keyTextView.setText(message.getKey());
        //indexTextView.setText(""+position);
        //authorTextView.setText(message.getName());


        return convertView;
    }
}

