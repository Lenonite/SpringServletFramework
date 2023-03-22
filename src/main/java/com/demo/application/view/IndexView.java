package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class IndexView implements View {
    @Override
    public String render(Model model) {
        return """
                <h1>Hello from Index View</h1>
                <ul>
                <li><a href='/add-number?num1=5&num2=7'>add-number?num1=5&num2=7</a></li>
                <li><a href='/square-number?num1=5'>/square-number?num1=5</a></li>
                </ul>
                """;
    }
}
