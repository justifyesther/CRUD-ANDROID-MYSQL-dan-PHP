package com.justifyester.aplikasicrudmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Edit_Activity extends AppCompatActivity {

    EditText edId,edNama,edNim,edIpk;
    private int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_);

        edId = findViewById(R.id.ed_id);
        edNama = findViewById(R.id.ed_nama);
        edNim = findViewById(R.id.ed_nim);
        edIpk = findViewById(R.id.ed_ipk);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("position");


        edId.setText(MainActivity.employeeArrayList.get(position).getId());
        edNama.setText(MainActivity.employeeArrayList.get(position).getNama());
        edNim.setText(MainActivity.employeeArrayList.get(position).getNim());
        edIpk.setText(MainActivity.employeeArrayList.get(position).getIpk());
    }

    public void btn_updateData(View view) {

        final String nama = edNama.getText().toString();
        final String nim = edNim.getText().toString();
        final String ipk = edIpk.getText().toString();
        final String id = edId.getText().toString();

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Updating....");
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST, "https://justifyapps.000webhostapp.com/update.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Toast.makeText(Edit_Activity.this, response, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        finish();
                        progressDialog.dismiss();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(Edit_Activity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();

            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params = new HashMap<String,String>();

                params.put("id",id);
                params.put("nama",nama);
                params.put("nim",nim);
                params.put("ipk",ipk);

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(Edit_Activity.this);
        requestQueue.add(request);





    }
}
