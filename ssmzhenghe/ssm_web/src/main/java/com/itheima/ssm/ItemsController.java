package com.itheima.ssm;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 项目名:ssmzhenghe
 * 包名: com.itheima.ssm
 * 作者: Yanglinlong
 * 日期: 2019/6/17 20:31
 */
@Controller
@RequestMapping(value = "/items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;

    @RequestMapping(value = "/findAll")
    public String list(Model model) {
        System.out.println("ItemsController中的findAll方法！");
        List<Items> list = itemsService.findAllAccount();
        model.addAttribute("items",list);
        return "success";
    }
    @RequestMapping(value = "/save")
    public String save(Items items){
        System.out.println("ItemsController中的save方法！");
        itemsService.saveAccount(items);
        return "redirect:/items/findAll";
    }
}
