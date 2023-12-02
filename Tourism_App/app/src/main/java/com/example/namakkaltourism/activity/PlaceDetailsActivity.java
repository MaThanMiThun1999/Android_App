package com.example.namakkaltourism.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.namakkaltourism.R;
import com.google.android.material.imageview.ShapeableImageView;

public class PlaceDetailsActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_place_details);

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
            case "Anjaneyar Temple":
                city.setText("Anjaneyar Temple, Namakkal");
                attr1name.setText("Narasimha");
                attr2name.setText("Stalls");
                attr1des.setText("Vishnu took the avatar of Narasimha");
                attr2des.setText("Stalls located outside of the temple");
                attr1img.setImageResource(R.drawable.anj_narasima);
                attr2img.setImageResource(R.drawable.anj_stall);
                food1name.setText("Sri Ram Vilas");
                food2name.setText("Adyar Ananda Bhavan");
                food1des.setText("If you pure veg then this place was yours");
                food2des.setText("Authentic home style food");
                food1img.setImageResource(R.drawable.anj_ramvilas);
                food2img.setImageResource(R.drawable.anj_a2b);
                description.setText("Namakkal Anjaneyar temple is located in Namakkal, a town in Namakkal district in Tamil Nadu, India and is dedicated to the Hindu god Hanuman. It is constructed in the Tamil style of architecture. The legend of the temple is associated with Narasimha, an avatar of Hindu god Vishnu appearing for Hanuman and Lakshmi. The image of Anjaneyar is 18 ft (5.5 m) tall, making it one of the tallest images of Hanuman in India. The Agamam is followed by \"Sri Vaikhanasam\". ");
                location = "https://goo.gl/maps/bp8toVbhTAjoPrmF6";
                timetovisit.setText("6:30AM – 1:30PM\n" + "4:30PM – 8:30PM");
                duration.setText("2 to 3 Days");
                mainimage.setImageResource(R.drawable.anjaneyar);
                break;
            case "Arthanareeswarar Temple":
                city.setText("Arthanareeswarar Temple, Tiruchengode");
                attr1name.setText("Ucchi Pilliyar");
                attr2name.setText("Architecture");
                attr1des.setText("Lord Ganesha located a top of Rockfort");
                attr2des.setText("The right half of the image as male and left half of the image as female");
                attr1img.setImageResource(R.drawable.art_ucchi);
                attr2img.setImageResource(R.drawable.art_ach);
                food1name.setText("Hotel Radha Prasad");
                food2name.setText("Dolphin Restaurant");
                food1des.setText("The number of dishes with taste and quality");
                food2des.setText("Liked the food very much specially");
                food1img.setImageResource(R.drawable.art_radha);
                food2img.setImageResource(R.drawable.art_dol);
                description.setText("It is believed that Adi Kesava Perumāl, a form of Vishnu enshrined here, instructed Parvati on the Kedara Gowri Vratam, which she performed to unite with Shiva as Ardhanareeswarar.");
                location = "https://goo.gl/maps/N17Mh7ennVb5w1rA6";
                timetovisit.setText("6AM – 2PM\n" + "3:15PM – 6PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.ardhanare);
                break;
            case "Kolli Hills":
                city.setText("Kolli Hills, Namakkal");
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
                description.setText("The Kolli Hills are featured in several works of classical Tamil literature such as Silappathigaram, Manimekalai, Purananuru and Akananuru. The hills are said to be guarded by Kollipavai also called as \"Ettukkai Amman\", the local deity.");
                location = "https://goo.gl/maps/zeteZ6RhaY2A5aWD7";
                timetovisit.setText("6AM – 9PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.kolli);
                break;
            case "Jedarpalayam Dam":
                city.setText("Jedarpalayam Dam, Kabilarmalai Panchayat");
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
                description.setText("The dam is constructed across the River Cauvery where tourists flock in large numbers during festival season and on weekends. This Dam is having a water storage area for boating. Six fibre boats are available for boating.");
                location = "https://goo.gl/maps/rWTkPUGwPyj6Wzwm8";
                timetovisit.setText("7AM – 10PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.jedarpalayam);
                break;
            case "Seeku Parai View Point":
                city.setText("Seeku Parai View Point, Kolli Malai");
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
                description.setText("Seekkuparai is one of the best view point in Kolli Hills. The FOREST DEPARTMENT has developed this View Point. One need to take couple of minutes walk to reach the view point. This place would provide an awesome and scenic view of the valley.");
                location = "https://goo.gl/maps/7HqF24XxEqGyn6Dg9";
                timetovisit.setText("7AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.selur);
                break;
            case "Agaya Gangai Waterfalls":
                city.setText("Agaya Gangai Waterfalls, Kolli Hills");
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
                description.setText("Agaya Gangai is also known as Peraruvi or Pei aruvi by the people of Kolli Hills because of its scary resemblance and heavy water flow. To reach the Agaya Gangai, one has to climb down 1196 steps. The stairs are steep.");
                location = "https://goo.gl/maps/xoMSsUkNfNfSzL2g8";
                timetovisit.setText("7AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.waterfalls);
                break;
            case "Botanical Garden":
                city.setText("Botanical Garden, Vasalur Patti");
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
                description.setText("Botanical Garden is situated in Kolli Hills, maintained by Tamil Nadu Government. The garden has a number of plant species like herbal, floral and several varieties of hybrid plants. For growing hybrid plants, there is also a research centre. A small park is situated near Botanical Garden for children.");
                location = "https://goo.gl/maps/kABKusSHKuzrbhTd8";
                timetovisit.setText("8AM – 5PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.garden);
                break;
            case "Sankagiri Fort":
                city.setText("Sankagiri Fort, Tiruchengode");
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
                description.setText("Sangagiri Fort was built in various times. Before 15th century total 10 of 4 Entrances were built by Vettuva Gounder King \"Kunni Vettuva Raja\" and after 15th century by the Vijayanagar empire.");
                location = "https://goo.gl/maps/JXaGdESXkaXiYo457";
                timetovisit.setText("9:30AM – 5:30PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.sankagiri);
                break;
            case "Arappaleeswarar Temple":
                city.setText("Arappaleeswarar Temple, Kolli Malai");
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
                description.setText("The presiding deity is known as Arapaleeswarar. His consort is known as Aram Valartha Nayaki.[2] Once devotees started cooking with the fishes found in the pond of the temple. They got life and jumped into the water. As the presiding deity saved the fishes which were cut he is known as Arapaleeswarar.");
                location = "https://goo.gl/maps/VfTHg5Yk3ySXGTe47";
                timetovisit.setText("7AM – 1PM\n" + "2:30PM – 7PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.arappaleeswarar);
                break;
            case "Puliancholai":
                city.setText("Puliancholai, Puliansolai R F");
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
                description.setText("Its actually rain water flows from kolli hills to low hills of Puliansholai.Got park and fishing spot and space for cooking if one needs or can order food on kilo basis of meat for required people.");
                location = "https://goo.gl/maps/tuAnnUDxXzGqyqZG6";
                timetovisit.setText("7AM – 6PM");
                duration.setText("2 Days");
                mainimage.setImageResource(R.drawable.puliancholai);
                break;
        }

        locationbtn.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location))));

    }
}