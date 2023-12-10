//In PacketFix.java
//fixMotionJump(EntityLivingBase)
    public static double fixMotionJump() {
        if (ViaMCP.getInstance().getVersion() == ViaMCP.PROTOCOL_VERSION) {
            return 0.005D;
        } else {
            return 0.003D;
        }
    }

//In EntityLivingBase.java
//change
        if (Math.abs(this.motionX) < 0.005) {
            this.motionX = 0.0;
        }

        if (Math.abs(this.motionY) < 0.005) {
            this.motionY = 0.0;
        }

        if (Math.abs(this.motionZ) < 0.005) {
            this.motionZ = 0.0;
        }
//to
        if (Math.abs(this.motionX) < Packetfix.fixMotionJump()) {
            this.motionX = 0.0D;
        }

        if (Math.abs(this.motionY) < Packetfix.fixMotionJump()) {
            this.motionY = 0.0D;
        }

        if (Math.abs(this.motionZ) < Packetfix.fixMotionJump()) {
            this.motionZ = 0.0D;
        }
