package services.acidity.aprotect.check.objects;

import lombok.RequiredArgsConstructor;

/**
 * An enum holding different punishment types used by checks on aProtect. Some of these are based on ideas from
 * AntiGamingChair (made by the one and only, dewgs), so credits go to them. This does not contain MITIGATION
 * types!
 *
 * @since 7/8/2025
 * @author Te1a
 */
public enum PunishmentType {
    // This will only be used on checks marked as Development or (sometimes) Experimental.
    KICK("kick"),

    // This will be used on more "tested" checks. This should only be used assuming
    // we have gathered enough data to make a good decision. I have a hatred for
    // false punishments!
    BAN("ban");

    private String lowercaseName; // TODO: Remove? Not sure if this is needed or not.

    PunishmentType(String lowercaseName) {
        this.lowercaseName = lowercaseName;
    }
}
