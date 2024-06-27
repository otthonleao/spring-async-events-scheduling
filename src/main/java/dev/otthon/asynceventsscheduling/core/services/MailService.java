package dev.otthon.asynceventsscheduling.core.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final Logger log = LoggerFactory.getLogger(MailService.class);

    @Async // Para executar de maneira assincrona em uma thread separada
    public void send(String to, String subject, String body) {
        // Simulando o DELAY do processo de esperar o envio de email ser realizado para depois enviar a response
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            log.error(e.getLocalizedMessage());
        }
        log.info("E-mail enviado para {}", to);
    }

}
