package services.acidity.aprotect.check;

import services.acidity.aprotect.check.objects.PunishmentType;

/**
 * An interface representing an anti-cheat check. This class is implemented by different check classes (PacketCheck,
 * PositionCheck, RotationCheck, AttackTimingCheck, ...), and is quite literally the base of this anti-cheat's
 * detection functionality.
 *
 * @since 7/8/2025
 * @author Te1a
 */
public interface ICheck {
    // I'm bad at Java and don't know interface stuff well, don't harass me over this monstrosity...

    String getName();
    String getIdentifier();
    String getDescription();

    PunishmentType getPunishmentType();
    double getPunishmentVL(); // Use "-1" to disable.
}
