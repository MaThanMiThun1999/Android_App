package com.example.namakkaltourism.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namakkaltourism.R;
import com.google.android.material.imageview.ShapeableImageView;

public class DangerPlaceDetailsActivity extends AppCompatActivity {

    private ShapeableImageView mainimage;
    private ShapeableImageView attr1img;
    private ShapeableImageView attr2img;
    private ShapeableImageView food1img;
    private ShapeableImageView food2img;
    private TextView city;
    private TextView description;
    private TextView duration;
    private TextView timetovisit;
    private TextView attr1name;
    private TextView attr1des;
    private TextView attr2name;
    private TextView attr2des;
    private TextView food1name;
    private TextView food1des;
    private TextView food2name;
    private TextView food2des;
    private Button locationbtn;
    private String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danger_place_details);

        mainimage = findViewById(R.id.citydetails_image);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citydetails_name);
        description = findViewById(R.id.citydetails_description);
        duration = findViewById(R.id.citydetails_tripduration);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_place1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);

        String city_str = getIntent().getStringExtra("putextra_city");

        switch (city_str) {
            case "Kolli Malai":
                city.setText("Kolli Malai, Namakkal");
                attr1name.setText("Karavalli");
                attr2name.setText("Namma Aruvi falls");
                attr1des.setText("A stone marking the 34th of the 70 hairpin bends");
                attr2des.setText("Namma Aruvi, a small waterfall at Semmedu");
                attr1img.setImageResource(R.drawable.hills_pin);
                attr2img.setImageResource(R.drawable.hills_aruvi);
                food1name.setText("Aloo Paratha");
                food2name.setText("Sarson ka Saag");
                food1des.setText("Tasty dish with lot of butter.");
                food2des.setText("A very popular dish mainly eaten with makke ki roti");
                food1img.setImageResource(R.drawable.amritsar_food_paratha);
                food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
                description.setText("Kolli Hills is one of the most dangerous ghat roads in south India, comprising around 70 hairpin bends and are entirely continuous. To be more specific, Kolli hills is situated in Namakkal");
                location = "https://goo.gl/maps/zeteZ6RhaY2A5aWD7";
                timetovisit.setText("6AM – 9PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.hills);
                break;
            case "Siddhar Caves":
                city.setText("Siddhar Caves, Kolli Malai");
                attr1name.setText("Golden Temple");
                attr2name.setText("Jallianwala Bagh");
                attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
                attr2des.setText("Jallianwala Bagh is a historic garden.");
                attr1img.setImageResource(R.drawable.amritsar_golden_temple);
                attr2img.setImageResource(R.drawable.amritsar_jallianwala_bagh);
                food1name.setText("Aloo Paratha");
                food2name.setText("Sarson ka Saag");
                food1des.setText("Tasty dish with lot of butter.");
                food2des.setText("A very popular dish mainly eaten with makke ki roti");
                food1img.setImageResource(R.drawable.amritsar_food_paratha);
                food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
                description.setText("These herbs can still be found around the caves. On the way to the caves, you will also spot the vivacious Agaya Gangai waterfall which is famous in this region. An age-old home for ascetics, the Siddhar Caves of Kolli Hills.");
                location = "https://goo.gl/maps/QtPHLkSQab5AiGor6";
                timetovisit.setText("7AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.caves);
                break;
            case "Varadikallu":
                city.setText("Varadikallu, Tiruchengode");
                attr1name.setText("Golden Temple");
                attr2name.setText("Jallianwala Bagh");
                attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
                attr2des.setText("Jallianwala Bagh is a historic garden.");
                attr1img.setImageResource(R.drawable.amritsar_golden_temple);
                attr2img.setImageResource(R.drawable.amritsar_jallianwala_bagh);
                food1name.setText("Aloo Paratha");
                food2name.setText("Sarson ka Saag");
                food1des.setText("Tasty dish with lot of butter.");
                food2des.setText("A very popular dish mainly eaten with makke ki roti");
                food1img.setImageResource(R.drawable.amritsar_food_paratha);
                food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
                description.setText("The Ucchi Pillaiyar shrine is found about 425 feet further up and is dedicated to Ganesha and to the lingam form of Shiva. On the west of it lies a stone called Varadikal, Maladi kal, or Vandhya Paatana Sikara.");
                location = "https://goo.gl/maps/8ZzS2e2kCijytvnCA";
                timetovisit.setText("7AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.varadikallu);
                break;
            case "Vasalurpatty Boat House":
                city.setText("Vasalurpatty Boat House, Vasalur Patti");
                attr1name.setText("Golden Temple");
                attr2name.setText("Jallianwala Bagh");
                attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
                attr2des.setText("Jallianwala Bagh is a historic garden.");
                attr1img.setImageResource(R.drawable.amritsar_golden_temple);
                attr2img.setImageResource(R.drawable.amritsar_jallianwala_bagh);
                food1name.setText("Aloo Paratha");
                food2name.setText("Sarson ka Saag");
                food1des.setText("Tasty dish with lot of butter.");
                food2des.setText("A very popular dish mainly eaten with makke ki roti");
                food1img.setImageResource(R.drawable.amritsar_food_paratha);
                food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
                description.setText("The Boat House located on artificial lake at Vasalurpatty is located at 5 Km from the town centre. Boat House in Kolli Hills is considered as one of the popular places. This is located at Vasalurpatty that is close to Solakkadu - Thinnanurpatty road.");
                location = "https://goo.gl/maps/3y7W6obj85ki6ARDA";
                timetovisit.setText("8AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.boat);
                break;
            case "Seeku Parai View Point":
                city.setText("Varadikallu, Tiruchengode");
                attr1name.setText("Golden Temple");
                attr2name.setText("Jallianwala Bagh");
                attr1des.setText("Shri Harmandir Sahib, a very popular temple.");
                attr2des.setText("Jallianwala Bagh is a historic garden.");
                attr1img.setImageResource(R.drawable.amritsar_golden_temple);
                attr2img.setImageResource(R.drawable.amritsar_jallianwala_bagh);
                food1name.setText("Aloo Paratha");
                food2name.setText("Sarson ka Saag");
                food1des.setText("Tasty dish with lot of butter.");
                food2des.setText("A very popular dish mainly eaten with makke ki roti");
                food1img.setImageResource(R.drawable.amritsar_food_paratha);
                food2img.setImageResource(R.drawable.amritsar_food_sarsonkasag);
                description.setText("The Ucchi Pillaiyar shrine is found about 425 feet further up and is dedicated to Ganesha and to the lingam form of Shiva. On the west of it lies a stone called Varadikal, Maladi kal, or Vandhya Paatana Sikara.");
                location = "https://goo.gl/maps/8ZzS2e2kCijytvnCA";
                timetovisit.setText("7AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.varadikallu);
                break;
        }

        locationbtn.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location))));
    }
}