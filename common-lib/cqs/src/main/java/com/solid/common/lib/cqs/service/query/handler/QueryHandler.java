package com.solid.common.lib.cqs.service.query.handler;

import com.solid.common.lib.cqs.service.query.definition.AbstractQuery;
import com.solid.common.lib.cqs.service.query.result.AbstractQueryResult;
import org.springframework.transaction.annotation.Transactional;

public interface QueryHandler<Q extends AbstractQuery, R extends AbstractQueryResult> {
    R preHandle(Q query);

    void validate(Q query);

    @Transactional(readOnly = true)
    default R handle(Q query) {
        validate(query);
        return preHandle(query);
    }
}
