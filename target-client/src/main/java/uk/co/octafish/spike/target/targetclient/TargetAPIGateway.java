package uk.co.octafish.spike.target.targetclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/targets")
public class TargetAPIGateway {

    private final TargetReader targetReader;

    @Autowired
    public TargetAPIGateway(final TargetReader targetReader) {
        this.targetReader = targetReader;
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(method = RequestMethod.GET, value = "/names")
    public Collection<String> names() {
        return targetReader.read()
                .getContent()
                .stream()
                .map(Target::getName)
                .collect(toList());
    }

    public Collection<String> fallback() {
        return new ArrayList<>();
    }
}
