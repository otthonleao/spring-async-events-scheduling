package dev.otthon.asynceventsscheduling.core.listeners;

import dev.otthon.asynceventsscheduling.core.events.NewUserEvent;
import dev.otthon.asynceventsscheduling.core.services.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GlobalListener {

    private final MailService mailService;

    @EventListener
    public void handleNewUser(NewUserEvent event) {
        var email = event.getEmail();
        mailService.send(email, "E-mail pelo evento", "Corpo do e-mail");
    }

}
