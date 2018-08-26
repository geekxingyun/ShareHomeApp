package com.xingyun.sharehomeapp.view.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xingyun.sharehomeapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChatLifeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatLifeFragment extends Fragment {
    @BindView(R.id.common_come_back_ImageView)
    ImageView commonComeBackImageView;
    @BindView(R.id.common_title_bar_title)
    TextView commonTitleBarTitle;
    Unbinder unbinder;
    // TODO: Rename parameter arguments, choose names that match

    public ChatLifeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChatLifeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChatLifeFragment newInstance(String param1, String param2) {
        ChatLifeFragment fragment = new ChatLifeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat_life, container, false);
        unbinder = ButterKnife.bind(this, view);
        commonTitleBarTitle.setText(R.string.bottom_chat_life_title);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.common_come_back_ImageView)
    public void onViewClicked() {
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
