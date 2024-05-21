package org.lenguyendangdinh.qlcanho.controllers;

import org.lenguyendangdinh.qlcanho.NotFoundException;
import org.lenguyendangdinh.qlcanho.models.Customer;
import org.lenguyendangdinh.qlcanho.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }
    @GetMapping("/khach-hang")
    public String showUserPage(Model model) {
        List<Customer> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "customer/list";
    }
    @GetMapping("/khach-hang/them-moi")
    public String showAddUserPage(Model model) {
        model.addAttribute("user", new Customer());
        model.addAttribute("pageTitle", "Tạo mới khách hàng");
        return "customer/form";
    }
    @GetMapping("/khach-hang/chinh-sua/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model, RedirectAttributes attributes){
        try {
            Customer user = service.get(id);
            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User (" + id + ")");

            return "customer/form";
        } catch (NotFoundException e) {
            attributes.addFlashAttribute("message", "The cusyomer has been created successfully.");
            return "redirect:/khach-hang";
        }
    }
    @PostMapping("/khach-hang/save")
    public String saveUser(@ModelAttribute Customer user, RedirectAttributes attributes){
        service.save(user);

        System.out.println(user.toString());

        attributes.addFlashAttribute("message", "Tạo mới người dùng thành công.");
        return "redirect:/khach-hang";
    }
}
