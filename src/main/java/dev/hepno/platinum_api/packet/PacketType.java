package dev.hepno.platinum_api.packet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PacketType {

    PLAYER_FREE_COIN(1, PlayerFreeCoinPacket.class);

    private final int id;
    private final Class<? extends Packet> packetClass;

    public static PacketType getPacketType(Packet packet) {
        for (PacketType packetType : PacketType.values()) {
            if (packetType.getPacketClass().equals(packet.getClass())) {
                return packetType;
            }
        }
        throw new IllegalArgumentException("Unkown packet class: " + packet.getClass());
    }
}
