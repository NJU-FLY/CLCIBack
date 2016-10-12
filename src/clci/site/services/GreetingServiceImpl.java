package clci.site.services;

import clci.site.repositories.interfaces.LysyRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class GreetingServiceImpl implements GreetingService
{
//    @Inject
    LysyRepository lysyRepository;
    @Override
    public String getGreeting(String name)
    {
        return "Hello, " + name + "!";
    }
}
