package com.solid.common.lib.cqs.service.command.definition;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractCommand implements Serializable {
}
