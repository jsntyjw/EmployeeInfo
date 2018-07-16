package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        alEmployeeList = new ArrayList<>();

        EmployeeItem employee1 = new EmployeeItem("John","Software Technical Leader",3400.0);
        EmployeeItem employee2 = new EmployeeItem("May","Programmer",2200.0);
//        EmployeeItem employee3 = new EmployeeItem("aaa","Programmer",2200.0);
//        EmployeeItem employee4 = new EmployeeItem("bbb","Programmer",2200.0);
//        EmployeeItem employee5 = new EmployeeItem("ccc","Programmer",2200.0);
//        EmployeeItem employee6 = new EmployeeItem("ddd","Programmer",2200.0);
//        EmployeeItem employee7 = new EmployeeItem("eee","Programmer",2200.0);

        alEmployeeList.add(employee1);
        alEmployeeList.add(employee2);
//        alEmployeeList.add(employee3);
//        alEmployeeList.add(employee4);
//        alEmployeeList.add(employee5);
//        alEmployeeList.add(employee6);
//        alEmployeeList.add(employee7);


        caEmployee = new CustomAdapter(this,R.layout.employee_item,alEmployeeList);

        lvEmployee.setAdapter(caEmployee);
    }
}
