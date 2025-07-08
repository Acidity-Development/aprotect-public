package services.acidity.aprotect.check;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import services.acidity.aprotect.check.objects.PunishmentType;

/**
 * A class implementing ICheck (how do I use JavaDoc to make it like a link I'm noob). This is the second main
 * check-class in aProtect.
 *
 * @since 7/8/2025
 * @author Te1a
 */

@Getter @Setter // haha
public class Check implements ICheck {
    private final String checkName, checkIdentifier, checkDescription;

    private PunishmentType punishmentType;
    private double punishmentVL;

    // TODO: Is there a way to do this in lombok too? If so, implement.
    public Check(String checkName, String checkIdentifier, String checkDescription, PunishmentType punishmentType, double punishmentVL) {
        this.checkName = checkName;
        this.checkIdentifier = checkIdentifier;
        this.checkDescription = checkDescription;

        this.punishmentType = punishmentType;
        this.punishmentVL = punishmentVL;
    }

    public Check(String checkName, String checkIdentifier, PunishmentType punishmentType, double punishmentVL) {
        this(checkName, checkIdentifier, "not specified", punishmentType, punishmentVL);
    }

    @Override
    public String getName() {
        return checkName;
    }

    @Override
    public String getIdentifier() {
        return checkIdentifier;
    }

    @Override
    public String getDescription() {
        return checkDescription;
    }

    @Override
    public PunishmentType getPunishmentType() {
        return punishmentType;
    }

    @Override
    public double getPunishmentVL() {
        return punishmentVL;
    }

    // Information and stuff specific to THIS check class
    private double violationLevel;
}
