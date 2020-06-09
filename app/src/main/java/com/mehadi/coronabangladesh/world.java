package com.mehadi.coronabangladesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
    private TextView worldNewcases, worldRecovered, worldDeath, worldConfirm, asiaConfirm,asiaRecovered,asiaDeath,asiaNewcases, africaConfirm,africaRecovered,africaDeath,africaNewcases, americaConfirm,americaRecovered,americaDeath,americaNewcases;
    private TextView europeConfirm,europeRecovered,europeDeath,europeNewcases, australiaConfirm,australiaRecovered,australiaDeath,australiaNewcases,antarcticaConfirm , antarcticaRecovered, antarcticaDeath, antarcticaNewcases;
    private RequestQueue mQueue;
    private ImageView backbutton;
    private SwipeRefreshLayout swipeworld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(world.this, MyDash.class);
                startActivity(i);
            }
        });





        worldConfirm = findViewById(R.id.worldConfirm);
        worldRecovered = findViewById(R.id.worldRecovered);
        worldDeath = findViewById(R.id.worldDeath);
        worldNewcases = findViewById(R.id.worldNewcases);


        asiaConfirm = findViewById(R.id.asiaConfirm);
        asiaRecovered = findViewById(R.id.asiaRecovered);
        asiaDeath = findViewById(R.id.asiaDeath);
        asiaNewcases = findViewById(R.id.asiaNewcases);

        africaConfirm = findViewById(R.id.africaConfirm);
        africaRecovered = findViewById(R.id.africaRecovered);
        africaDeath = findViewById(R.id.africaDeath);
        africaNewcases = findViewById(R.id.africaNewcases);

        americaConfirm = findViewById(R.id.americaConfirm);
        americaRecovered = findViewById(R.id.americaRecovered);
        americaDeath = findViewById(R.id.americaDeath);
        americaNewcases = findViewById(R.id.americaNewcases);

        europeConfirm = findViewById(R.id.europeConfirm);
        europeRecovered = findViewById(R.id.europeRecovered);
        europeDeath = findViewById(R.id.europeDeath);
        europeNewcases = findViewById(R.id.europeNewcases);

        australiaConfirm = findViewById(R.id.australiaConfirm);
        australiaRecovered = findViewById(R.id.australiaRecovered);
        australiaDeath = findViewById(R.id.australiaDeath);
        australiaNewcases = findViewById(R.id.australiaNewcases);


        antarcticaConfirm = findViewById(R.id.antarcticaConfirm);
        antarcticaDeath = findViewById(R.id.antarcticaDeath);
        antarcticaRecovered = findViewById(R.id.antarcticaRecovered);
        antarcticaNewcases = findViewById(R.id.antarcticaNewcases);

        mQueue = Volley.newRequestQueue(this);

        worldwide();
        asia();
        africa();
        america();
        europe();
        australia();
        antertica();




        swipeworld = findViewById(R.id.swipeworld);
        swipeworld.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                worldwide();
                asia();
                africa();
                america();
                europe();
                australia();
                antertica();
                swipeworld.setRefreshing(false);
            }
        });




    }

    private void antertica() {
        String url = "https://corona.lmao.ninja/v2/continents/South%20America";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    antarcticaConfirm.setText(jsonObject.getString("cases"));
                    antarcticaRecovered.setText(jsonObject.getString("recovered"));
                    antarcticaDeath.setText(jsonObject.getString("deaths"));
                    antarcticaNewcases.setText(jsonObject.getString("todayCases"));

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


    private void worldwide() {
        String url = "https://corona.lmao.ninja/v2/all";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    worldConfirm.setText(jsonObject.getString("cases"));
                    worldRecovered.setText(jsonObject.getString("recovered"));
                    worldDeath.setText(jsonObject.getString("deaths"));
                    worldNewcases.setText(jsonObject.getString("todayCases"));

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

    private void asia() {
        String url = "https://corona.lmao.ninja/v2/continents/asia";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    asiaConfirm.setText(jsonObject.getString("cases"));
                    asiaRecovered.setText(jsonObject.getString("recovered"));
                    asiaDeath.setText(jsonObject.getString("deaths"));
                    asiaNewcases.setText(jsonObject.getString("todayCases"));


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

    private void africa() {
        String url = "https://corona.lmao.ninja/v2/continents/africa";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    africaConfirm.setText(jsonObject.getString("cases"));
                    africaRecovered.setText(jsonObject.getString("recovered"));
                    africaDeath.setText(jsonObject.getString("deaths"));
                    africaNewcases.setText(jsonObject.getString("todayCases"));

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

    private void america() {
        String url = "https://corona.lmao.ninja/v2/continents/North%20America";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    americaConfirm.setText(jsonObject.getString("cases"));
                    americaRecovered.setText(jsonObject.getString("recovered"));
                    americaDeath.setText(jsonObject.getString("deaths"));
                    americaNewcases.setText(jsonObject.getString("todayCases"));

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

    private void europe() {
        String url = "https://corona.lmao.ninja/v2/continents/europe";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    europeConfirm.setText(jsonObject.getString("cases"));
                    europeRecovered.setText(jsonObject.getString("recovered"));
                    europeDeath.setText(jsonObject.getString("deaths"));
                    europeNewcases.setText(jsonObject.getString("todayCases"));

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

    private void australia() {
        String url = "https://corona.lmao.ninja/v2/countries/Australia";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject jsonObject = new JSONObject(response.toString());
                    australiaConfirm.setText(jsonObject.getString("cases"));
                    australiaRecovered.setText(jsonObject.getString("recovered"));
                    australiaDeath.setText(jsonObject.getString("deaths"));
                    australiaNewcases.setText(jsonObject.getString("todayCases"));

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