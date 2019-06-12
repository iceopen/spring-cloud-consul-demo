package org.iceinto.cloud.serviceclient.sdk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-wx", configuration = FeignConfig.class, fallback = AddClientFallback.class)
public interface AddClient {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add(@RequestParam Integer a, @RequestParam Integer b);
}

