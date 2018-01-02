package com.example.android.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
  * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int q=0;
    public void submitOrderP(View view) {
        q = q+1;
        display(q);
    }

    public void submitOrderM(View view) {
        q=q-1;
        display(q);
    }

    /**     * This method is called when the order button is clicked.     */
    public void submitOrder(View view) {
        int p = CP(q,5);
        String s = "Total Item Count= "+ q + "Coffee" +"\n Total Amount= " + 5*q +"Rs"+ "\n **THANK_YOU**" ;
        displayMessage(s);


    }

    private int CP(int q,int pp){
        return q*pp;
    }
    /**     * This method displays the given quantity value on the screen.     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.order_summary_text_view);
        quantityTextView.setText(" " + number);
    }


    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
}
