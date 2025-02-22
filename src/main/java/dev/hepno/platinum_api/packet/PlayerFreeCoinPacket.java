package dev.hepno.platinum_api.packet;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerFreeCoinPacket implements Packet {
    /*
    An example packet for a player pressing a "gain free coin" button, aka me being too lazy to implement a coordinate system
    yet so im making an example packet using data I already have. coins should almost never be modified on the client side
    so this is really dumb but it's for the example
     */

    private int discordId; //TODO: Make this use session IDs with authentication
    private float x, y;

    @Override
    public void encode(ByteBuf out) {
        out.writeInt(discordId);
        out.writeFloat(x);
        out.writeFloat(y);
    }

    @Override
    public void decode(ByteBuf in) {
        discordId = in.readInt();
        x = in.readFloat();
        y = in.readFloat();
    }
}
