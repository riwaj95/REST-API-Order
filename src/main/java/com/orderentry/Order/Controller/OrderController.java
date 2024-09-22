package com.orderentry.Order.Controller;

import com.orderentry.Order.Model.Order;
import com.orderentry.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String viewHome(Model model){
        model.addAttribute("listallorders",orderService.getallorders());
        return "index";
    }

    @GetMapping("/deleteOrder/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        this.orderService.deleteorderid(id);
        return "redirect:/";
    }

}
