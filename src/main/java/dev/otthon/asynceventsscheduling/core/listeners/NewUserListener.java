package dev.otthon.asynceventsscheduling.core.listeners;

import dev.otthon.asynceventsscheduling.core.events.NewUserEvent;
import dev.otthon.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;

@RequiredArgsConstructor
public class NewUserListener implements ApplicationListener<NewUserEvent> {

    private final MailService mailService;

    @Override
    public void onApplicationEvent(NewUserEvent event) {
        var email = event.getEmail();
        mailService.send(email, "E-mail pelo evento", "Corpo do e-mail");
    }
}
