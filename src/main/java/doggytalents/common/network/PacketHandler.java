package doggytalents.common.network;

import doggytalents.DoggyTalentsNext;
import doggytalents.common.network.packet.*;
import doggytalents.common.network.packet.data.*;
import net.minecraftforge.network.PacketDistributor;
import doggytalents.common.network.packet.data.ParticleData.*;
import doggytalents.common.network.packet.ParticlePackets.*;

public final class PacketHandler {

    private static int disc = 0;

    public static void init() {
        registerPacket(new DogModePacket(), DogModeData.class);
        registerPacket(new DogNamePacket(), DogNameData.class);
        registerPacket(new DogObeyPacket(), DogObeyData.class);
        registerPacket(new DogTalentPacket(), DogTalentData.class);
        //registerPacket(new DogTexturePacket(), DogTextureData.class);
        registerPacket(new FriendlyFirePacket(), FriendlyFireData.class);
        registerPacket(new OpenDogScreenPacket(), OpenDogScreenData.class);
        registerPacket(new DogInventoryPagePacket(), DogInventoryPageData.class);
        registerPacket(new DogTexturePacket(), DogTextureData.class);
        registerPacket(new HeelByNamePacket(), HeelByNameData.class);
        registerPacket(new WhistleRequestModePacket(), WhistleRequestModeData.class);
        registerPacket(new CritEmitterPacket(), CritEmitterData.class); 
        registerPacket(new DogEatingParticlePacket(), DogEatingParticleData.class);
        registerPacket(new DogStartShakingLavaPacket(), DogStartShakingLavaData.class);
        registerPacket(new ConductingBonePackets.RequestDogsPacket(), ConductingBoneData.RequestDogsData.class);
        registerPacket(new ConductingBonePackets.ResponseDogsPackets(), ConductingBoneData.ResponseDogsData.class);
        registerPacket(new ConductingBonePackets.RequestDistantTeleportDogPacket(), ConductingBoneData.RequestDistantTeleportDogData.class);
        registerPacket(new ChangeAccessoryPacket(), ChangeAccessoriesData.class);
        registerPacket(new StatsSyncPackets.Request(), StatsSyncData.Request.class);
        registerPacket(new StatsSyncPackets.Response(), StatsSyncData.Response.class);
        registerPacket(new DogMountPacket(), DogMountData.class);
        registerPacket(new DogRegardTeamPlayersPacket(), DogRegardTeamPlayersData.class);
        registerPacket(new DogForceSitPacket(), DogForceSitData.class);
        registerPacket(new CanineTrackerPackets.RequestDogsPacket(), CanineTrackerData.RequestDogsData.class);
        registerPacket(new CanineTrackerPackets.ResponseDogsPackets(), CanineTrackerData.ResponseDogsData.class);
        registerPacket(new CanineTrackerPackets.StartLocatingPacket(), CanineTrackerData.StartLocatingData.class);
        registerPacket(new CanineTrackerPackets.RequestPosUpdatePacket(), CanineTrackerData.RequestPosUpdateData.class);
        registerPacket(new CanineTrackerPackets.ResponsePosUpdatePacket(), CanineTrackerData.ResponsePosUpdateData.class);
        registerPacket(new DogDeTrainPacket(), DogDeTrainData.class);
        registerPacket(new DogUntamePacket(), DogUntameData.class);
        registerPacket(new DogMigrateOwnerPacket(), DogMigrateOwnerData.class);
        registerPacket(new WhistleEditHotKeyPacket(), WhisltleEditHotKeyData.class);
        registerPacket(new WhistleUsePacket(), WhistleUseData.class);
        registerPacket(new DogGroupPackets.EDIT(), DogGroupsData.EDIT.class);
        registerPacket(new DogGroupPackets.FETCH_REQUEST(), DogGroupsData.FETCH_REQUEST.class);
        registerPacket(new DogGroupPackets.UPDATE(), DogGroupsData.UPDATE.class);
        registerPacket(new HeelByGroupPackets.REQUEST_GROUP_LIST(), HeelByGroupData.REQUEST_GROUP_LIST.class);
        registerPacket(new HeelByGroupPackets.RESPONSE_GROUP_LIST(), HeelByGroupData.RESPONSE_GROUP_LIST.class);
        registerPacket(new HeelByGroupPackets.REQUEST_HEEL(), HeelByGroupData.REQUEST_HEEL.class);
        registerPacket(new DogLowHealthStrategyPacket(), DogLowHealthStrategyData.class);
        registerPacket(new CrossOriginTpPacket(), CrossOriginTpData.class);
        registerPacket(new ChangeArtifactPacket(), ChangeArtifactData.class);
        registerPacket(new DogIncapMsgPackets.Request(), DogIncapMsgData.Request.class);
        registerPacket(new DogIncapMsgPackets.Response(), DogIncapMsgData.Response.class);
        registerPacket(new PatrolTargetLockPacket(), PatrolTargetLockData.class);
    }

    public static <MSG> void send(PacketDistributor.PacketTarget target, MSG message) {
        DoggyTalentsNext.HANDLER.send(target, message);
    }

    public static <D> void registerPacket(IPacket<D> packet, Class<D> dataClass) {
        DoggyTalentsNext.HANDLER.registerMessage(PacketHandler.disc++, dataClass, packet::encode, packet::decode, packet::handle);
    }
}
