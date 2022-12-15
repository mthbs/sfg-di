package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.SpanishGreetingRepository;


public class I18nSpanishGreetingService implements GreetingService{

    private final SpanishGreetingRepository spanishGreetingRepository;

    public I18nSpanishGreetingService(SpanishGreetingRepository spanishGreetingRepository) {
        this.spanishGreetingRepository = spanishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
