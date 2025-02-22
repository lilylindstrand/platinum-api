package dev.hepno.platinum_api.packet;

import io.netty.buffer.ByteBuf;

public interface Packet {
    void encode(ByteBuf out);
    void decode(ByteBuf in);
}
