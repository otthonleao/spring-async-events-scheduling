package dev.otthon.asynceventsscheduling.core.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingTasks {

    private final Logger log = LoggerFactory.getLogger(SchedulingTasks.class);

    private static final int FIXED_DELAY = 1000; // O tempo é baseado na ultima execução
    private static final int FIXED_RATE = 1000; // Sempre vai executar no tempo determina, não importa se há outro processo
    private static final int INITIAL_DELAY = 2000; // O padrão é iniciar quando startar, mas aqui podemos definir quando iniciar a execução após startar
    private static final String CRON = "0/5 * * * * *"; // com o cron pode ser configurado hora, ddia da semana etc: wwww.contrab.guru

    @Scheduled(fixedDelay = FIXED_DELAY)
    public void taskExample() {
        log.info("Scheduling task executada");
    }

}
