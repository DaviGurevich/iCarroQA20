package tests;

import dto.UserDTO;
import dto.UserDTOWith;
import dto.UserDtoLombok;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

  //  @Test
   // public void positiveLoginUserDTO() {
    //   UserDTO userDTO = new UserDTO("qwerty@mail.com", "12345Qwerty#$%");
    //    app.getUserHelper().login(userDTO);
     //   Assert.assertTrue(app.getUserHelper().validatePopUpMessageSuccessAfterLogin());
   // }

   // @Test
   // public void positiveLoginUserDTOWith() {
    //    UserDTOWith userDTOWith = new UserDTOWith().withEmail("qwerty@mail.com").withPassword("12345Qwerty#$%");
    //    app.getUserHelper().login(userDTOWith);
     //   Assert.assertTrue(app.getUserHelper().validatePopUpMessageSuccessAfterLogin());
   // }


    @Test
    public void positiveLogin() {
        UserDtoLombok UserDTOLombok = UserDtoLombok.builder().build();
        app.getUserHelper().login(userDTOLombok);
    }
}

