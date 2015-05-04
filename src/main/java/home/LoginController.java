package home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Виктор on 14.04.15.
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
    @RequestMapping(value = "/authenticated", method = RequestMethod.POST)
    public  @ResponseBody String authenticated_JSON( @RequestBody Authenticated user)   {
        /*"JSON: The company getUserName: " + user.getLogin() + ", getUserEmail: " + user.getPassword();*/

        return "{ok:ook}";
    }
    @RequestMapping(value = "/loadOrganization", method = RequestMethod.GET)
    public  @ResponseBody List<User2> access()   {
        /*"JSON: The company getUserName: " + user.getLogin() + ", getUserEmail: " + user.getPassword();*/
        User2 user1 = new User2() ;
        user1.setName("qwe");
        user1.setPhone("123");
        User2 user2 = new User2() ;
        user2.setName("asd");
        user2.setPhone("456");
        User2 user3 = new User2() ;
        user3.setName("asd");
        user3.setPhone("789");
        User2 user4 = new User2() ;
        user4.setName("asd");
        user4.setPhone("951");
        List<User2> user2s = new ArrayList<User2>();
        user2s.add(user1);
        user2s.add(user2);
        user2s.add(user3);
        user2s.add(user4);


        return user2s;
    }
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public  @ResponseBody String deleteUser( @RequestBody User2 user)   {
        /*"JSON: The company getUserName: " + user.getLogin() + ", getUserEmail: " + user.getPassword();*/

        return "{ok:ook}";
    }
    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public  @ResponseBody String editUser( @RequestBody User2 user)   {
        /*"JSON: The company getUserName: " + user.getLogin() + ", getUserEmail: " + user.getPassword();*/

        return "{ok:ook}";
    }
    /*@RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public String addUserForm( Model model) {

        return "html/tmpl/editUser";
    }*/
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public  @ResponseBody String addUser( @RequestBody User2 user)   {
        /*"JSON: The company getUserName: " + user.getLogin() + ", getUserEmail: " + user.getPassword();*/

        return "{ok:ook}";
    }



}
