# PacketFix
Auto fix viaversion (client1.8.9 to server1.12.2) || Bypassing GrimAC(1.12.2)'s Viaversion detection(Simulation&amp;Post)

Fix list:
MotionJump(in EntityLivingBase.java)
RightClick(in C08PacketPlayerBlockPlacement.java)
Ladder(in BlockLadder.java)
LilyPad(in BlockLilyPad.java)

Determine whether the viaversion is enabled
if (ViaMCP.getInstance().getVersion() == ViaMCP.PROTOCOL_VERSION) {
    //If viaversion is disabled
} else {
    //If viaversion is enabled
}
