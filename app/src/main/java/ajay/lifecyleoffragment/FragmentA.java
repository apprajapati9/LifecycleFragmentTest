package ajay.lifecyleoffragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ajay on 2015-10-23.
 */
public class FragmentA extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //This method is called after the Fragment has been attached to the Activity.
        Log.d("Fragment","onAttach Method is called.");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //bundle - It is simple data structure that stores simple data items key value pairs.
        //if the fragment was created previously then you can store data in bundle. That bundle is passed to you back here
        //If you are creating this fragment first time, bundle will be null.
        Log.d("Fragment","onCreate Method is called.");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_1,container, false);

        // Perform linking of Layout file to the Fragment.
        // Provide xml file here to define how your Fragment will look like.
        Log.d("Fragment","onCreateView() Method is called. The xml layout file has been inflated.");
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // This indicates that onCreate() method of Activity is finished its execution
        // and you can access the UI elements of Activity and Fragment as well.
        Log.d("Fragment","onActivityCreated Method is called.");
    }

    @Override
    public void onStart() {
        super.onStart();
        //Fragment is about to become visible.
        Log.d("Fragment","onStart Method is called.");
    }

    @Override
    public void onResume() {
        super.onResume();
        //on resume state - its visible and running.
        //This means Activity/Fragment has become visible.
        Log.d("Fragment","onResume Method is called.");
    }

    @Override
    public void onPause() {
        super.onPause();
        //method is called when Fragment is blocked by something.
        // It means the focus of user it's not on this fragment
        Log.d("Fragment","onPause Method is called.");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //This method will allow you to save data before it gets stop.
        // for example, if you have listView and you can to save currently selected item so that you can use it
        // if you store it, when you create a second time fragment, you can restore currently selcted item again.
        //this is simple example how you can use this method.
        //Also whenever you rotate the screen this method will be called just in case you want to restore its state
        //because whenever you rotate your screen fragment will be completed deleted and attached again to activity.
        Log.d("Fragment","onSavedInstanceState Method is called.");

    }

    @Override
    public void onStop() {
        super.onStop();
        //Fragment is no longer visible.
        Log.d("Fragment","onStop() Method is called.Fragment is stopped and no longer visible.");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //This method will destroy the View (XML layout file).
        // It means the UI view will not be accessible after this method.
        // The Fragment will stay as java object but it’s view will be destroyed.
        Log.d("Fragment","onDestroyView() Method is called. The UI of fragment has been destroyed");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Fragment is no longer used.
        Log.d("Fragment","onDestroy Method is called. Fragment is no longer used. ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // This method will untie the Fragment from an Activity it was associated with.
        Log.d("Fragment","onDetach method is called and fragment is untied from Activity");
    }
}
