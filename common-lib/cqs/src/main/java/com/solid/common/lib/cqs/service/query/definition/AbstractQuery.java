package com.solid.common.lib.cqs.service.query.definition;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractQuery implements Serializable {
}
