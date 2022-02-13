package baker.com.utils;

import android.view.GestureDetector;
import android.view.View;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerItemClickListener extends RecyclerView.SimpleOnItemTouchListener {
    private RecyclerView recyclerView;
    private OnItemClickListener listenerOnItemClick;
    private GestureDetector gestureDetector;

    public interface onItemClickListener{
        public void onItemClick(View view, int position);

        public void onLongItemListener(View view, int position);
    }

    public RecyclerItemClickListener(context context,
                                     RecyclerView recycler,
                                     OnItemClickListener listener){

    }

}
