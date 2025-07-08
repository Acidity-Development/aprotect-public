package services.acidity.aprotect.check.checks;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import net.minecraft.server.v1_8_R3.Packet;
import services.acidity.aprotect.check.Check;
import services.acidity.aprotect.check.objects.PunishmentType;
import services.acidity.aprotect.profile.Profile;

/**
 * A check class that allows for packet-level cheat detection. aProtect uses ProtocolLib 4.7.x for this functionality.
 *
 * @since 7/8/2025
 * @author Te1a
 */
public class PacketCheck extends Check {
    public PacketCheck(String checkName, String checkIdentifier, String checkDescription, PunishmentType punishmentType, double punishmentVL) {
        super(checkName, checkIdentifier, checkDescription, punishmentType, punishmentVL);
    }

    public PacketCheck(String checkName, String checkIdentifier, PunishmentType punishmentType, double punishmentVL) {
        super(checkName, checkIdentifier, punishmentType, punishmentVL);
    }

    // Handling
    public void run(Profile profile, Packet<?> nmsPacket) {}
    public void run(Profile profile, PacketEvent packetEvent) {}
    public void run(Profile profile, PacketEvent packetEvent, Packet<?> nmsPacket) {}
}
