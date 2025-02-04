package doggytalents.common.entity.anim;

import net.minecraft.util.Mth;

public enum DogAnimation {
    
    NONE(0, 0), 
    STRETCH(1, 70),
    FAINT(2, 80),
    SIT_DOWN(3, 25, 1.75f),
    STAND_UP(4, 40, 1.25f),
    FAINT_2(5, 80),
    LYING_DOWN(6, 80),
    STAND_QUICK(7, 15, 1.25f),
    DROWN(8, 145),
    HURT_1(9, 15, 1.25f),
    HURT_2(10, 10, 1.25f),
    FAINT_STAND_1(11, 80),
    FAINT_STAND_2(12, 80),
    BACKFLIP(13, 20),
    PROTEST(14, 120),
    STAND_IDLE_2(15, 80),
    DIG(16, 120),
    SIT_IDLE(17, 90),
    SCRATCHIE(18, 70),
    CHOPIN_TAIL(19, 200),
    BELLY_RUB(20, 11*20, 1f, false),
    SIT_IDLE_2(21, 100),
    HOWL(22, 165),
    LIE_DOWN_IDLE(23, 20, 0.5f, true, true),
    SIT_TO_REST(24, 40, 0.5f),
    REST_IDLE(25, 20, 0.75f, true, true),
    REST_TO_SIT(26, 65);

    private final int id;
    private final int lengthTicks;
    private final float speedModifier;
    private final boolean freeTail;
    private boolean looping = false;
    
    private DogAnimation(int id, int lengthTicks) {
        this.id = id;
        this.lengthTicks = lengthTicks;
        this.speedModifier = 1;
        freeTail = true;
    }

    private DogAnimation(int id, int lengthTicks, float speed) {
        this.id = id;
        this.lengthTicks = Mth.ceil(((float)lengthTicks)/speed);
        this.speedModifier = speed;
        freeTail = true;
    }

    private DogAnimation(int id, int lengthTicks, float speed, boolean freeTail) {
        this.id = id;
        this.lengthTicks = Mth.ceil(((float)lengthTicks)/speed);
        this.speedModifier = speed;
        this.freeTail = freeTail;
    }

    private DogAnimation(int id, int lengthTicks, float speed, boolean freeTail, boolean looping) {
        this.id = id;
        this.lengthTicks = Mth.ceil(((float)lengthTicks)/speed);
        this.speedModifier = speed;
        this.freeTail = freeTail;
        this.looping = looping;
    }

    public static DogAnimation byId(int i) {
        var values = DogAnimation.values();
        if (i < 0) return NONE;
        if (i >= values.length) return NONE;
        return values[i];
    };

    public int getId() { return this.id; }
    public int getLengthTicks() { return this.lengthTicks; }
    public float getSpeedModifier() { return this.speedModifier; }
    public boolean freeTail() { return this.freeTail; }
    public boolean looping() { return this.looping; }

}
