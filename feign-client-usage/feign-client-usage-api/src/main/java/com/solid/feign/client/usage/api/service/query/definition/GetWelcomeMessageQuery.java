package com.solid.feign.client.usage.api.service.query.definition;

import com.solid.common.lib.cqs.service.query.definition.AbstractQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class GetWelcomeMessageQuery extends AbstractQuery {
}
