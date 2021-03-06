package org.iceinto.cloud.servicewx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模拟测试
 * @author iceinto
 *
 */
@RestController
public class ComputeController {

	/**
	 * @author iceinto
	 * @param a
	 * @param b
	 * @return 两个数想加之和
	 */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {

        Integer r = a + b;
        return "From Service-wx, Port:"  + " Result is " + r;
    }

}