package vn.edu.ntu.quocvuong.ngoquocvuong_59133174_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtHoTen, edtNgaySinh, edtSoThichKhac;
    Button btnXacNhan;
    RadioGroup rdgGioiTinh;
    CheckBox cbXemPhim, cbNgheNhac, cbONha, cbCafe, cbNauAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews(){
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        cbXemPhim = findViewById(R.id.cbXemPhim);
        cbNgheNhac = findViewById(R.id.cbNgheNhac);
        cbONha = findViewById(R.id.cbONha);
        cbCafe = findViewById(R.id.cbCafe);
        cbNauAn = findViewById(R.id.cbNauAn);
    }
    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getThongTin(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  String  getThongTin(){
        String thongTin = "";
        thongTin += edtHoTen.getText().toString() + "\n" +
                "Ngày sinh:" + edtNgaySinh.getText().toString() + "\n";
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rdbNam:
                thongTin += "Giới tính: Nam\n";
                break;
            case R.id.rdbNu:
                thongTin += "Giới tính: Nữ\n";
        }
        thongTin += "Sở thích: " + getSoThich() + edtSoThichKhac.getText().toString();
        return thongTin;
    }

    private String getSoThich(){
        String soThich = "";
        if (cbXemPhim.isChecked()){
            soThich += cbXemPhim.getText() + "; ";
        }
        if (cbNgheNhac.isChecked()){
            soThich += cbNgheNhac.getText() + "; ";
        }
        if (cbONha.isChecked()){
            soThich += cbONha.getText() + "; ";
        }
        if (cbCafe.isChecked()){
            soThich += cbCafe.getText() + "; ";
        }
        if (cbNauAn.isChecked()){
            soThich += cbNauAn.getText() + "; ";
        }
        return soThich;
    }
}
