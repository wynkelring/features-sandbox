package com.solid.feign.client.usage.impl.service.query.handler;

import com.solid.feign.client.usage.api.service.query.definition.GetWelcomeMessageQuery;
import com.solid.feign.client.usage.api.service.query.handler.GetWelcomeMessageQueryHandler;
import com.solid.feign.client.usage.api.service.query.result.GetWelcomeMessageQueryResult;
import org.springframework.stereotype.Service;

@Service
public class GetWelcomeMessageQueryHandlerImpl implements GetWelcomeMessageQueryHandler {
    @Override
    public GetWelcomeMessageQueryResult preHandle(GetWelcomeMessageQuery query) {
        return GetWelcomeMessageQueryResult.builder().message("Welcome").build();
    }

    @Override
    public void validate(GetWelcomeMessageQuery query) {
    }
}