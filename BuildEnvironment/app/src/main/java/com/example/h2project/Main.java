package com.example.h2project;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import com.example.h2project.Generator;
import android.widget.TextView;
import java.util.Set;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.widget.TextView;


public class Main extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.scavenger_hunt_fragment_2);

    changeText();


  }

  private void changeText() {}


}

  /*
  public static int points = 0;
  private String choice = "school"; //temporary code


  final TextView resultTextView = (TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);

  Generator g1 = new Generator();
  TextView text;




    Button checkBtn = (Button) findViewById(R.id.scavenger_hunt_fragment_2_button_1);
    checkBtn.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        final TextView resultTextView = (TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);
        //String result = g1.generate(choice);
        resultTextView.setText("Test");
      }
    });




}

//^Everything in this block is old stuff that should be deleted later
   */





/*
    text = (TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);

    text.setText("literally anything");
*/

  //}


/*
  public Main(String input) {
    choice = input;
    //game();
  }

  public void game() {


*/




    // Need to instantiate something for findViewById but don't know what
    // java.lang.NullPointerException: Attempt to invoke virtual method 'android.content.pm.ApplicationInfo android.content.Context.getApplicationInfo()' on a null object reference
    // at com.example.h2project.Main.game(Main.java:50)

    /*setContentView(R.layout.activity_scavenger_hunt);

    TextView word =(TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);
    try {
      word.setText(g1.generate(choice));
    } catch (NullPointerException e) {
      // Do something
    }

*/



    //word.setText(g1.generate(choice));
    //boolean loopOrQuit = false;


    /*
    while (loopOrQuit == false) {
      String pointNoPoint = "";
  


      if (pointNoPoint.equalsIgnoreCase("check")) {
        word =(TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);
        word.setText(g1.generate(pointNoPoint));
        points += 1;
      } else if (pointNoPoint.equalsIgnoreCase("new")) {
        word =(TextView) findViewById(R.id.scavenger_hunt_fragment_2_text_2);
        word.setText(g1.generate(pointNoPoint));

      } else {
        loopOrQuit = true;
      }

    }
*/
  //}
//}