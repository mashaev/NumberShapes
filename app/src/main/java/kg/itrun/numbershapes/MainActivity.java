package kg.itrun.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isSqure() {
            double squreRoot = Math.sqrt(number);
            if (squreRoot == Math.floor(squreRoot)) {
                return true;
            } else {
                return false;
            }

        }

        public boolean isTriangular(){
            int x = 1;
            int traingularNumber = 1;
            while (traingularNumber < number){
                x++;
                traingularNumber = traingularNumber + x;
            }
            if (traingularNumber ==number){
                return true;
            }else {
                return false;
            }
        }

    }



    public void testNumber(View view){

        String massage = "";

        EditText usersNumber = findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty()){
            massage = "Please enter a number";

        }else {


            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(usersNumber.getText().toString());


            if (myNumber.isSqure()) {

                if (myNumber.isTriangular()) {
                    massage = myNumber.number + "is both triangular and square!";
                } else {
                    massage = myNumber.number + "is square, but not triangular!";
                }

            } else {

                if (myNumber.isTriangular()) {
                    massage = myNumber.number + "is  triangular not square!";
                } else {
                    massage = myNumber.number + "is neither square nor  triangular!";
                }


            }
        }


            Toast.makeText(getApplicationContext(), massage, Toast.LENGTH_LONG).show();
            

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
