package com.solid.common.lib.cqs.service.query.result;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractQueryResult implements Serializable {
}
