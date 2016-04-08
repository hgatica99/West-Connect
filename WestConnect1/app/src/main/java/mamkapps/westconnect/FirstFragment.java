package mamkapps.westconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        CardView card1 = (CardView)root.findViewById(R.id.frag1_cardView1);
        CardView card2 = (CardView)root.findViewById(R.id.frag1_cardView2);
        CardView card3 = (CardView)root.findViewById(R.id.frag1_cardView3);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Club1Activity.class);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Club2Activity.class);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(), Club3Activity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}