package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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

import android.os.Bundle;

public class activityBangladesh extends AppCompatActivity {
    private TextView bdTotalConfirm, bdTodayNewCase, bdTotalDeath, bdTodayNewDeath, bdTotalRecover, bdActive, bdCritical;
    private RequestQueue mQueue;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangladesh);

        bdTotalConfirm = findViewById(R.id.bdTotalConfirm);
        bdTodayNewCase = findViewById(R.id.bdTodayNewCase);
        bdTotalDeath = findViewById(R.id.bdTotalDeath);
        bdTodayNewDeath = findViewById(R.id.bdTodayNewDeath);
        bdTotalRecover = findViewById(R.id.bdTotalRecover);
        bdActive = findViewById(R.id.bdActive);
        bdCritical = findViewById(R.id.bdCritical);
        progressBar = findViewById(R.id.bdProgress);
        mQueue = Volley.newRequestQueue(this);

        jsonParse();
    }

    private void jsonParse() {
        String url = "https://corona.lmao.ninja/v2/countries/Bangladesh";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progressBar.setVisibility(View.GONE);
                try {
                    JSONObject jsonObject = new JSONObject(response.toString());
                    bdTotalConfirm.setText(jsonObject.getString("cases"));
                    bdTotalDeath.setText(jsonObject.getString("deaths"));
                    bdTotalRecover.setText(jsonObject.getString("recovered"));
                    bdTodayNewCase.setText(jsonObject.getString("todayCases"));
                    bdTodayNewDeath.setText(jsonObject.getString("todayDeaths"));
                    bdActive.setText(jsonObject.getString("active"));
                    bdCritical.setText(jsonObject.getString("critical"));


                } catch (JSONException e) {
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
