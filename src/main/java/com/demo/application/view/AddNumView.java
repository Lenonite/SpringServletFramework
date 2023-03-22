package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class AddNumView implements View {
    @Override
    public String render(Model model) {
        int num1=Integer.parseInt(model.get("num1"));
        int num2=Integer.parseInt(model.get("num2"));

        return String.format("%d add %d is :: %d",num1,num2,(num1+num2));

    }
}
