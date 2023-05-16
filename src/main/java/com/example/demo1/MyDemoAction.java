package com.example.demo1;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class MyDemoAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showMessageDialog(
                e.getProject(),
                "Great manzz! You just created your first action!",
                "Manzz First Action",
                Messages.getInformationIcon());
    }
}
