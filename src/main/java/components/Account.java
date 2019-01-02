package components;

import ecs_core.AccessMode;
import ecs_core.annotation.AccessModeType;
import ecs_core.IComponentData;
import ecs_core.annotation.Shared;
import lombok.Data;

@Shared
@AccessModeType(AccessMode.ReadOnly)
@Data
public class Account implements IComponentData {
}
