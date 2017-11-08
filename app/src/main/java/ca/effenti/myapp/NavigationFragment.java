package ca.effenti.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NavigationFragment extends Fragment {
    public static final String ARGUMENT_MESSAGE = "message";

    public NavigationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_navigation, container, false);

        TextView txtNavigation = view.findViewById(R.id.txtNavigation);

        Bundle args = getArguments();
        if(args != null){
            txtNavigation.setText(args.getString(ARGUMENT_MESSAGE, ""));
        }

        return view;
    }
}
