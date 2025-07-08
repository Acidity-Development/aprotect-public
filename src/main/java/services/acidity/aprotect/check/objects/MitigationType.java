package services.acidity.aprotect.check.objects;

/**
 * An enum holding different mitigation types used by checks on aProtect. We use them to waste every cheater's time
 * by nerfing their cheats significantly.
 *
 * @since 7/8/2025
 * @author Te1a
 */

// Lucky (Polar dev) is big brain for using this method years before me. You're the goat dude :D.
public enum MitigationType {
    // Makes a player's hit registration quality significantly worse by adding delay and/or cancelling hits.
    HIT_REGISTRATION("hit-reg"),

    // Reduces a player's outgoing damage randomly. This could probably be detected by cheaters if they aren't
    // complete script kiddies.
    DAMAGE_REDUCTION("dmg-reduce");

    private String lowercaseName; // TODO: Remove? Not sure if this is needed or not.

    MitigationType(String lowercaseName) {
        this.lowercaseName = lowercaseName;
    }
}
