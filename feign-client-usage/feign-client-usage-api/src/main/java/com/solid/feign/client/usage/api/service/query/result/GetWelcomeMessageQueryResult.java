package com.solid.feign.client.usage.api.service.query.result;

import com.solid.common.lib.cqs.service.query.result.AbstractQueryResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GetWelcomeMessageQueryResult extends AbstractQueryResult {
    private String message;
}
