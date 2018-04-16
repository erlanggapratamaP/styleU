package software.addigma.styleu.slide;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import software.addigma.styleu.R;

import static android.os.Build.VERSION_CODES.O;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;


    public SlideAdapter(Context context){
        this.context = context;
    }
    public int[]lst_images = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };
    public String[]lst_title = {
            "Apa itu styleU ?",
            "Bagaimana cara kerjanya ?",
            "Temukan Pakaian yang tepat!"

    };
    public String[]lst_description = {
      "styleU membantu anda memutuskan pakaian yang anda kenakan saat ini",
      "Simple! jawab pertanyaan yang kami berikan",
      "Lanjut menggunakan!"
    };
    public int[] lst_backgroundcolor = {
            Color.rgb(231, 76, 60),
            Color.rgb(52, 152, 219),
            Color.rgb(44, 62, 80)
    };

    @Override
    public int getCount(){
        return lst_title.length;
    };

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view  ==  (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider, container, false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slideimg);
        TextView slideTitleView = (TextView) view.findViewById(R.id.txttitle);
        TextView slideDescView = (TextView) view.findViewById(R.id.txtdescription);

        slideImageView.setImageResource(lst_images[position]);
        slideTitleView.setText(lst_title[position]);
        slideDescView.setText(lst_description[position]);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);

        container.addView(view);
        return view;
    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
