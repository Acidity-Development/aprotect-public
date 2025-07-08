package services.acidity.aprotect.util.log;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

/**
 * A class representing an anti-cheat log. Helpful for lookups and storing player violations.
 *
 * @since 7/8/2025
 * @author Te1a
 */

@Getter
@AllArgsConstructor
public class Log {
    private final UUID playerIdentifier;
    private final String checkName, checkIdentifier, violationVerbose;
    private final double violationLevel;
}
