package com.example.h2project;
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
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.widget.TextView;

// same here; I think before Friday is good since this is tough


public class Main {
  public static int points = 0;
  private static String choice;

  public Main(String input) {
    choice = input;
  }

  public static void main(String[] args) {



    Generator g1 = new Generator();
    g1.generate(choice);
    boolean loopOrQuit = false;

    while (loopOrQuit == false) {
      String pointNoPoint = "";
  


      if (pointNoPoint.equalsIgnoreCase("check")) {
        points += 1;
        g1.generate(pointNoPoint);
      } else if (pointNoPoint.equalsIgnoreCase("new")) {
        g1.generate(pointNoPoint);
        TextView word =(TextView) findViewById(R.id.@string/scavenger_hunt_fragment_1_text_2);
                // what library has findViewById?
      } else {
        loopOrQuit = true;
      }
      
    }

  }
}
