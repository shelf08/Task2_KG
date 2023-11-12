module com.example.task2_kg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ru.vsu.cs.lobtsov_d_a.task2_kg to javafx.fxml;
    exports ru.vsu.cs.lobtsov_d_a.task2_kg;
}