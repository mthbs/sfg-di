package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;


public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository greetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
