package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class world extends AppCompatActivity {
    TextView worldTotalRecover , worldTotalDeath , worldTotalConfirm;
    private RequestQueue mQueue;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        worldTotalRecover = findViewById(R.id.worldTotalRecover);
        worldTotalDeath = findViewById(R.id.worldTotalDeath);
        worldTotalConfirm = findViewById(R.id.worldTotalConfirm);
        progressBar = findViewById(R.id.worldProgress);

        mQueue = Volley.newRequestQueue(this);


        jsonParse();
    }

    private void jsonParse() {
        String url = "https://corona.lmao.ninja/v2/all";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progressBar.setVisibility(View.GONE);
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    worldTotalConfirm.setText(jsonObject.getString("cases"));
                    worldTotalDeath.setText(jsonObject.getString("deaths"));
                    worldTotalRecover.setText(jsonObject.getString("recovered"));

                }catch (JSONException e) {
                    Context context = getApplicationContext();
                    CharSequence text = "Failed to Update";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }
}
