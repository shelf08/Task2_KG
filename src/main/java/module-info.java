module com.example.task2_kg {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vsu.cs.lobtsov_d_a.task2_kg to javafx.fxml;
    exports ru.vsu.cs.lobtsov_d_a.task2_kg;
    exports ru.vsu.cs.lobtsov_d_a.task2_kg.WuLine;
    opens ru.vsu.cs.lobtsov_d_a.task2_kg.WuLine to javafx.fxml;
}