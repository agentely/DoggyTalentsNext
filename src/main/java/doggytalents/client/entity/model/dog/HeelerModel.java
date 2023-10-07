package doggytalents.client.entity.model.dog;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HeelerModel extends DogModel{

    public HeelerModel(ModelPart box) {
        super(box);
    }
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, -9.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 1).addBox(-3.0044F, -2.2324F, -2.1391F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 20).addBox(-1.0044F, 0.433F, -5.6391F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0044F, -0.733F, 0.0F));

		PartDefinition cube_r1 = real_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-2.5F, -0.2055F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0044F, -0.8616F, 2.152F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = real_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(21, 20).addBox(-2.5F, -0.551F, -3.2099F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 1.184F, 2.7099F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r3 = real_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 25).addBox(-3.2F, -3.2422F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 4.0097F, 0.0609F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = real_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 11).addBox(-2.0F, -0.5F, -0.4276F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2511F, -0.2358F, -2.1724F, -0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = real_head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 25).mirror().addBox(1.2F, -3.2422F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0044F, 4.0097F, 0.0609F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r6 = real_head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 11).mirror().addBox(0.0F, -0.5F, -0.3276F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2423F, -0.2358F, -2.1724F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = real_head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -0.8422F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 1.5097F, -4.9391F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = real_head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 28).addBox(-1.0F, -0.8317F, -1.159F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.1993F, -2.2801F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0044F, 1.2676F, -2.9391F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(71, 53).addBox(-0.9879F, -1.1967F, -0.5F, 2.0F, 1.5F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 52).addBox(-0.3879F, -3.1811F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4835F, -1.5357F, 0.0609F));

		PartDefinition cube_r9 = right_ear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(66, 56).addBox(-0.3624F, -0.5292F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 0.4324F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r10 = right_ear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(61, 52).addBox(-1.3F, -1.5256F, -0.5F, 1.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2121F, -1.2711F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r11 = right_ear.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 52).addBox(-1.47F, -1.118F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3121F, -2.1387F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(71, 53).mirror().addBox(-1.0121F, -1.1967F, -0.5F, 2.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 52).mirror().addBox(-0.6121F, -3.1811F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.4923F, -1.5357F, 0.0609F));

		PartDefinition cube_r12 = left_ear.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(66, 56).mirror().addBox(-0.6376F, -0.5292F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 0.4324F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r13 = left_ear.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 52).mirror().addBox(0.3F, -1.5256F, -0.5F, 1.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2121F, -1.2711F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r14 = left_ear.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 52).mirror().addBox(0.47F, -1.118F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3121F, -2.1387F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(63, 12).addBox(-2.95F, -3.9674F, -1.8103F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0019F, -4.6288F));

		PartDefinition cube_r15 = upper_body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(63, 1).addBox(-3.0F, 0.0F, -0.5774F, 6.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1263F, -2.7329F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = upper_body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 17).addBox(-2.55F, -1.2422F, -3.3F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7252F, -1.8103F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r17 = upper_body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 2).addBox(-3.0F, -3.4109F, -4.0388F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, -0.4565F, -2.3324F, -0.7418F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(88, 11).addBox(-3.0F, -5.4219F, 0.1377F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.4565F, 0.3623F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(110, 29).addBox(-3.0F, -1.5539F, -1.8444F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0525F, 4.7821F, -0.6109F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(106, 3).addBox(-3.0F, -1.2F, -2.8132F, 6.0F, 5.0F, 4.5F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.1219F, -0.9882F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(89, 24).addBox(-2.95F, -0.77F, 0.0F, 5.9F, 1.8F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5781F, -2.2014F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(109, 19).addBox(-3.0F, -1.2006F, -0.9444F, 6.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -3.0525F, 4.7821F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(2, 53).mirror().addBox(-0.6375F, -0.9654F, -0.7059F, 1.95F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.4875F, 17.0F, -5.7333F));

		PartDefinition cube_r19 = left_front_leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(3, 47).mirror().addBox(2.3F, 0.0F, -1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.9875F, 0.0346F, 0.2941F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(2, 53).addBox(-1.2625F, -0.9654F, -0.7059F, 1.95F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4875F, 17.0F, -5.7333F));

		PartDefinition cube_r20 = right_front_leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(3, 47).addBox(-4.3F, 0.0F, -1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.9875F, 0.0346F, 0.2941F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(19, 56).addBox(-1.1F, 2.4346F, 0.8475F, 2.0F, 4.6F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 17.0F, 4.8133F));

		PartDefinition cube_r21 = left_hind_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 47).addBox(-0.6F, -2.7663F, -1.3353F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.0009F, 0.6828F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r22 = left_hind_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 46).addBox(-0.6F, -2.9663F, -0.5353F, 2.0F, 5.0F, 2.2F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.0009F, 0.6828F, 0.281F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(19, 56).mirror().addBox(-0.9F, 2.4346F, 0.8475F, 2.0F, 4.6F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 17.0F, 4.8133F));

		PartDefinition cube_r23 = right_hind_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 47).mirror().addBox(-1.4F, -2.7663F, -1.3353F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0009F, 0.6828F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r24 = right_hind_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(18, 46).mirror().addBox(-1.4F, -2.9663F, -0.5353F, 2.0F, 5.0F, 2.2F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0009F, 0.6828F, 0.281F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(42, 51).addBox(-1.0F, 0.0207F, -1.6623F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.7793F, 5.2623F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7793F, 1.7377F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}
}