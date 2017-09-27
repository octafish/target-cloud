package uk.co.octafish.spike.target.targetclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("target-service")
public interface TargetReader {

    @RequestMapping(method = RequestMethod.GET, value = "/targets")
    Resources<Target> read();

}
