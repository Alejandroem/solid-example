package User;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserHandlerTest {

    @Test
    public void createUser_UserHandler_created(){
        UserHandler handler = new UserHandler();
        User currentValue = handler.currentUser;
        Assert.assertNotEquals(currentValue,null);
    }


}
