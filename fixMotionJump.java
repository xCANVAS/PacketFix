//fixMotionJump(EntityLivingBase)
    public static double fixMotionJump() {
        if (ViaMCP.getInstance().getVersion() == ViaMCP.PROTOCOL_VERSION) {
            return 0.005D;
        } else {
            return 0.003D;
        }
    }
