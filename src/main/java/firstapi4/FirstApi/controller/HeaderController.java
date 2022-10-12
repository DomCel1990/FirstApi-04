package firstapi4.FirstApi.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/headers")
public class HeaderController {


    private String greeting;

    @GetMapping
    public String getHeaders(@RequestHeader HttpHeaders headers) {
        String nameHost = headers.getHost().getHostName();
        int port = headers.getHost().getPort();
        return "The name host is: " + nameHost + "\n" +
                "The port is: " + port;
    }
}
