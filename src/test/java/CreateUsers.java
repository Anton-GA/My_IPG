import org.example.DataGeneration;
import org.example.Users;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateUsers {
    DataGeneration dataGeneration = new DataGeneration();
    Users users = new Users("sfsff", "1", dataGeneration.nameGeneration(), "1", "1", dataGeneration.lastnameGeneration(),
            dataGeneration.patronymicGeneration());

    @Test
    public void generationUsers() {
        for(int i = 0; i < 10; i++) {
            given()
                    .contentType("application/json")
                    .body(users)
                    .post("http://10.10.10.25:8010/v1/users")
                    .then()
                    .statusCode(200);
        }
    }
}
