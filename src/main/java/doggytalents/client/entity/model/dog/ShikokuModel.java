package doggytalents.client.entity.model.dog;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ShikokuModel extends DogModel{

    public ShikokuModel(ModelPart box) {
        super(box);
    }
    public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.75F, 7.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail2 = real_tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.15F, -1.0F));

		PartDefinition real_tail2 = tail2.addOrReplaceChild("real_tail2", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.35F, -3.0F));

		PartDefinition tail3 = real_tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(9, 18).addBox(0.0F, 1.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition tail_r1 = tail3.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 21).addBox(0.25F, 0.25F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.9933F, 4.1971F, 2.05F, -0.7418F, 0.0F, 2.5307F));

		PartDefinition tail_r2 = tail3.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(9, 21).addBox(-0.5F, -1.5F, -1.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(4.9933F, 4.1971F, 2.05F, 0.0F, 0.0F, 2.5307F));

		PartDefinition tail_r3 = tail3.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(9, 21).addBox(-1.25F, 1.4F, -0.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.0F, 6.5F, 0.15F, 0.0F, 0.0F, -1.7453F));

		PartDefinition tail_r4 = tail3.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(9, 20).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.5F, 1.4F, 0.0F, 0.0F, -0.48F));

		PartDefinition tail_r5 = tail3.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(9, 21).addBox(-1.0F, -0.8F, -1.95F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(1.0F, 6.5F, 1.4F, 0.0F, 0.0F, -1.4835F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(-2.0F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(2.0F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -1.701F, -2.2936F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 15.5F, 1.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-3.0F, -3.25F, -2.9F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 15.25F, -2.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(23, 2).addBox(-3.0F, -6.25F, -0.9F, 8.0F, 5.0F, 5.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -0.25F, -0.8727F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -5.75F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(43, 19).addBox(-1.5F, -0.58F, -3.55F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 1.98F, -3.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(37, 14).addBox(-1.5F, -0.15F, -1.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.0F, 1.98F, -3.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.75F, -2.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 1.98F, -3.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 3.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -1.5F, 5.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition head_r5 = real_head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-0.2F, -1.25F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(2.75F, -1.3F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r6 = real_head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(53, 24).mirror().addBox(-0.15F, -1.35F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(2.75F, 0.2F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition head_r7 = real_head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(53, 24).addBox(-0.85F, -1.35F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.75F, 0.2F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition head_r8 = real_head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(53, 22).addBox(-0.8F, -1.25F, -1.9F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-2.75F, -1.3F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition headfur = real_head.addOrReplaceChild("headfur", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 7.3F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition head_r9 = right_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(23, 14).mirror().addBox(0.0747F, -4.4144F, -0.35F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.75F, -0.25F, 0.0F, 0.0F, -0.3927F));

		PartDefinition head_r10 = right_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.2542F, -4.9646F, 0.2582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.25F, 0.0F, 0.1745F, 0.0F, -0.3054F));

		PartDefinition head_r11 = right_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.0042F, -4.2372F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 14).mirror().addBox(0.1958F, -3.4872F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.25F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -0.5F, 0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition head_r12 = left_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(23, 14).addBox(-2.0747F, -4.4144F, -0.35F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.25F, 0.75F, -0.25F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r13 = left_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(16, 14).addBox(-1.7458F, -4.9646F, 0.2582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.25F, 1.25F, 0.0F, 0.1745F, 0.0F, 0.3054F));

		PartDefinition head_r14 = left_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(16, 14).addBox(-1.9958F, -4.2372F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(-2.1958F, -3.4872F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 1.25F, 0.0F, 0.0F, 0.0F, 0.3054F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
