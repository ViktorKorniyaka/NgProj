package home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class MainController {

    @Autowired
    private User user;

    @RequestMapping
    public @ResponseBody Map<String, Object> home() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("name", "Victor");
        result.put("age", 28);
        result.put("gender", "male");
        result.put("date", user.getDate());
        return result;
    }

    @RequestMapping(value = "/second", method = RequestMethod.GET)
    public  String access()   {
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


        return "/html/tmpl/addUser.html";
    }



}
