// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package doggytalents.client.entity.model.dog;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;


public class HEELER_BLANK_-_Converted (1)<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "heeler_blank_-_converted_(1)"), "main");
	private final ModelPart head;
	private final ModelPart upper_body;
	private final ModelPart body;
	private final ModelPart left_front_leg;
	private final ModelPart right_front_leg;
	private final ModelPart left_hind_leg;
	private final ModelPart right_hind_leg;
	private final ModelPart tail;

	public HEELER_BLANK_-_Converted (1)(ModelPart root) {
		this.head = root.getChild("head");
		this.upper_body = root.getChild("upper_body");
		this.body = root.getChild("body");
		this.left_front_leg = root.getChild("left_front_leg");
		this.right_front_leg = root.getChild("right_front_leg");
		this.left_hind_leg = root.getChild("left_hind_leg");
		this.right_hind_leg = root.getChild("right_hind_leg");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, -9.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0044F, -2.2324F, -2.1391F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 17).addBox(-1.0044F, 0.433F, -5.6391F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0044F, -0.733F, 0.0F));

		PartDefinition cube_r1 = real_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-2.5F, -0.2055F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0044F, -0.8616F, 2.152F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = real_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 20).addBox(-2.5F, -0.551F, -3.2099F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 1.184F, 2.7099F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r3 = real_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 27).addBox(-3.2F, -3.2422F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 4.0097F, 0.0609F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = real_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 11).addBox(-2.0F, -0.5F, -0.4276F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2511F, -0.2358F, -2.1724F, -0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = real_head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(1.2F, -3.2422F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0044F, 4.0097F, 0.0609F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r6 = real_head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 11).mirror().addBox(0.0F, -0.5F, -0.3276F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2423F, -0.2358F, -2.1724F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = real_head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -0.8422F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 1.5097F, -4.9391F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = real_head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(27, 28).addBox(-1.0F, -0.8317F, -1.159F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0044F, 0.1993F, -2.2801F, 0.8727F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.0044F, 1.2676F, -2.9391F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(37, 20).addBox(-0.9879F, -1.1967F, -0.5F, 2.0F, 1.5F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 4).addBox(-0.3879F, -3.1811F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4835F, -1.5357F, 0.0609F));

		PartDefinition cube_r9 = right_ear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 17).addBox(-0.3624F, -0.5292F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 0.4324F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r10 = right_ear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 9).addBox(-1.3F, -1.5256F, -0.5F, 1.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2121F, -1.2711F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r11 = right_ear.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 14).addBox(-1.47F, -1.118F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3121F, -2.1387F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(37, 20).mirror().addBox(-1.0121F, -1.1967F, -0.5F, 2.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(39, 4).mirror().addBox(-0.6121F, -3.1811F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.4923F, -1.5357F, 0.0609F));

		PartDefinition cube_r12 = left_ear.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 17).mirror().addBox(-0.6376F, -0.5292F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1745F, 0.4324F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r13 = left_ear.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 9).mirror().addBox(0.3F, -1.5256F, -0.5F, 1.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2121F, -1.2711F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r14 = left_ear.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(39, 14).mirror().addBox(0.47F, -1.118F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3121F, -2.1387F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(0, 56).addBox(-2.95F, -3.9674F, -1.8103F, 6.0F, 7.0F, 5.0F, new CubeDeformation(-0.09F)), PartPose.offset(0.0F, 15.0019F, -4.6288F));

		PartDefinition cube_r15 = upper_body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 54).addBox(-3.0F, 0.0F, -0.5774F, 6.0F, 3.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.1263F, -2.7329F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = upper_body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(19, 62).addBox(-2.55F, -1.2422F, -3.3F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.7252F, -1.8103F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r17 = upper_body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 74).addBox(-3.0F, -3.4109F, -4.0388F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-0.09F)), PartPose.offsetAndRotation(0.0F, -0.4565F, -2.3324F, -0.7418F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(2, 110).addBox(-3.0F, -3.4219F, -0.8623F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.4565F, 1.3623F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(4, 122).addBox(-3.0F, -1.5539F, -1.8444F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0525F, 3.7821F, -0.6109F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(24, 101).addBox(-3.0F, -1.2F, -2.8132F, 6.0F, 5.0F, 4.5F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.1219F, -1.9882F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 102).addBox(-2.95F, -0.77F, 0.0F, 5.9F, 1.8F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5781F, -3.2014F, 0.2618F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(29, 117).addBox(-3.0F, -1.2006F, -0.9444F, 6.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.0525F, 3.7821F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(-0.6375F, -0.9654F, -0.7059F, 1.95F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.4875F, 17.0F, -5.7333F));

		PartDefinition cube_r19 = left_front_leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(71, 23).mirror().addBox(2.3F, 0.0F, -1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.9875F, 0.0346F, 0.2941F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(57, 4).addBox(-1.2625F, -0.9654F, -0.7059F, 1.95F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4875F, 17.0F, -5.7333F));

		PartDefinition cube_r20 = right_front_leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(71, 23).addBox(-4.3F, 0.0F, -1.7F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.9875F, 0.0346F, 0.2941F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(59, 19).addBox(-1.1F, 2.4346F, 0.8475F, 2.0F, 4.6F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 17.0F, 4.8133F));

		PartDefinition cube_r21 = left_hind_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(80, 20).addBox(-0.6F, -2.7663F, -1.3353F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.0009F, 0.6828F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r22 = left_hind_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 5).addBox(-0.6F, -2.9663F, -0.5353F, 2.0F, 5.0F, 2.2F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, 1.0009F, 0.6828F, 0.281F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(59, 19).mirror().addBox(-0.9F, 2.4346F, 0.8475F, 2.0F, 4.6F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 17.0F, 4.8133F));

		PartDefinition cube_r23 = right_hind_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(-1.4F, -2.7663F, -1.3353F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0009F, 0.6828F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r24 = right_hind_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 5).mirror().addBox(-1.4F, -2.9663F, -0.5353F, 2.0F, 5.0F, 2.2F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5F, 1.0009F, 0.6828F, 0.281F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.7793F, 5.2623F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(58, 49).addBox(-1.0F, 0.0207F, -1.6623F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.789F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7793F, 1.7377F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		upper_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
