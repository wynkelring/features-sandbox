package com.solid.feign.client.usage.external;

import com.solid.feign.client.usage.api.service.query.result.GetWelcomeMessageQueryResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/http-api")
@RequiredArgsConstructor
public class GetWelcomeMessageQueryServiceController {

    private final ClientGetWelcomeMessageQueryService handler;

    @GetMapping("/welcome/test")
    @ResponseBody
    public GetWelcomeMessageQueryResult handle() {
        return handler.handle("something", "qp");
    }
}
