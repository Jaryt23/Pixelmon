package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ModelGolbat extends ModelBase {
	// fields
	ModelRenderer RIGHTWING;
	ModelRenderer LEFTWING;
	ModelRenderer BODYBASE;

	public ModelGolbat() {
		textureWidth = 64;
		textureHeight = 64;
		setTextureOffset("RIGHTWING.DeleteThis1", 0, 0);
		setTextureOffset("LEFTWING.DeleteThis2", 0, 0);
		setTextureOffset("BODYBASE.DeleteThis3", 0, 0);

		RIGHTWING = new ModelRenderer(this, "RIGHTWING");
		RIGHTWING.setRotationPoint(-2.5F, -4F, 0.5F);
		setRotation(RIGHTWING, 0F, 0F, 0F);
		RIGHTWING.mirror = true;
		ModelRenderer RightWingArm1 = new ModelRenderer(this, 28, 30);
		RightWingArm1.addBox(0F, -0.5F, -0.5F, 3, 1, 1);
		RightWingArm1.setRotationPoint(0F, 0F, 0F);
		RightWingArm1.setTextureSize(64, 64);
		RightWingArm1.mirror = true;
		setRotation(RightWingArm1, 0F, 0F, -2.96706F);
		ModelRenderer RightWingArm2 = new ModelRenderer(this, 28, 33);
		RightWingArm2.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		RightWingArm2.setRotationPoint(-2.5F, -0.5F, 0F);
		RightWingArm2.setTextureSize(64, 64);
		RightWingArm2.mirror = true;
		setRotation(RightWingArm2, 0F, 0F, -1.919862F);
		ModelRenderer RightWingArm3 = new ModelRenderer(this, 28, 36);
		RightWingArm3.addBox(0F, -0.5F, -0.5F, 12, 1, 1);
		RightWingArm3.setRotationPoint(-3.5F, -4F, 0F);
		RightWingArm3.setTextureSize(64, 64);
		RightWingArm3.mirror = true;
		setRotation(RightWingArm3, 0F, 0F, -2.687807F);
		ModelRenderer RightWing1 = new ModelRenderer(this, 39, 60);
		RightWing1.addBox(0F, -3F, 0F, 4, 3, 0);
		RightWing1.setRotationPoint(-2.5F, -0.5F, 0F);
		RightWing1.setTextureSize(64, 64);
		RightWing1.mirror = true;
		setRotation(RightWing1, 0F, 0F, 1.745329F);
		ModelRenderer RightWing2 = new ModelRenderer(this, 46, 39);
		RightWing2.addBox(0F, -6.1F, 0F, 3, 9, 0);
		RightWing2.setRotationPoint(-3.5F, -3.6F, 0F);
		RightWing2.setTextureSize(64, 64);
		RightWing2.mirror = true;
		setRotation(RightWing2, 0F, 0F, 2.949606F);
		ModelRenderer RightWing3 = new ModelRenderer(this, 16, 49);
		RightWing3.addBox(-11F, -6F, 0F, 11, 9, 0);
		RightWing3.setRotationPoint(-3.5F, -3.5F, 0F);
		RightWing3.setTextureSize(64, 64);
		RightWing3.mirror = true;
		setRotation(RightWing3, 0F, 0F, 0F);
		ModelRenderer RightWing4 = new ModelRenderer(this, 55, 27);
		RightWing4.addBox(-4F, -11.4F, 0F, 4, 12, 0);
		RightWing4.setRotationPoint(-2.5F, -0.5F, 0F);
		RightWing4.setTextureSize(64, 64);
		RightWing4.mirror = true;
		setRotation(RightWing4, 0F, 0F, -1.256637F);
		ModelRenderer RightWingSpoke = new ModelRenderer(this, 28, 33);
		RightWingSpoke.addBox(0F, 0F, -0.5F, 4, 0, 1);
		RightWingSpoke.setRotationPoint(-2.5F, -0.5F, 0F);
		RightWingSpoke.setTextureSize(64, 64);
		RightWingSpoke.mirror = true;
		setRotation(RightWingSpoke, 0F, 0F, 2.111848F);
		ModelRenderer RightWingSpoke1 = new ModelRenderer(this, 28, 36);
		RightWingSpoke1.addBox(0F, 0F, -0.5F, 12, 0, 1);
		RightWingSpoke1.setRotationPoint(-3.5F, -4F, 0F);
		RightWingSpoke1.setTextureSize(64, 64);
		RightWingSpoke1.mirror = true;
		setRotation(RightWingSpoke1, 0F, 0F, 2.844887F);

		RIGHTWING.addChild(RightWingArm1);
		RIGHTWING.addChild(RightWingArm2);
		RIGHTWING.addChild(RightWingArm3);
		RIGHTWING.addChild(RightWing1);
		RIGHTWING.addChild(RightWing2);
		RIGHTWING.addChild(RightWing3);
		RIGHTWING.addChild(RightWing4);
		RIGHTWING.addChild(RightWingSpoke);
		RIGHTWING.addChild(RightWingSpoke1);

		LEFTWING = new ModelRenderer(this, "LEFTWING");
		LEFTWING.setRotationPoint(2F, -4F, 0.5F);
		setRotation(LEFTWING, 0F, 0F, 0F);
		LEFTWING.mirror = true;
		ModelRenderer LeftWingArm1 = new ModelRenderer(this, 28, 30);
		LeftWingArm1.addBox(0F, -0.5F, -0.5F, 3, 1, 1);
		LeftWingArm1.setRotationPoint(0F, 0F, 0F);
		LeftWingArm1.setTextureSize(64, 64);
		LeftWingArm1.mirror = true;
		setRotation(LeftWingArm1, 0F, 0F, -0.1745329F);
		ModelRenderer LeftWingArm2 = new ModelRenderer(this, 28, 33);
		LeftWingArm2.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
		LeftWingArm2.setRotationPoint(3F, -0.5F, 0F);
		LeftWingArm2.setTextureSize(64, 64);
		LeftWingArm2.mirror = true;
		setRotation(LeftWingArm2, 0F, 0F, -1.22173F);
		ModelRenderer LeftWingArm3 = new ModelRenderer(this, 28, 36);
		LeftWingArm3.addBox(0F, -0.5F, -0.5F, 12, 1, 1);
		LeftWingArm3.setRotationPoint(4F, -4F, 0F);
		LeftWingArm3.setTextureSize(64, 64);
		LeftWingArm3.mirror = true;
		setRotation(LeftWingArm3, 0F, 0F, -0.4712389F);
		ModelRenderer LeftWing1 = new ModelRenderer(this, 39, 60);
		LeftWing1.addBox(0F, 0F, 0F, 4, 3, 0);
		LeftWing1.setRotationPoint(3F, -0.5F, 0F);
		LeftWing1.setTextureSize(64, 64);
		LeftWing1.mirror = true;
		setRotation(LeftWing1, 0F, 0F, 1.396263F);
		ModelRenderer LeftWing2 = new ModelRenderer(this, 39, 39);
		LeftWing2.addBox(0F, -2.933333F, 0F, 3, 9, 0);
		LeftWing2.setRotationPoint(4F, -3.5F, 0F);
		LeftWing2.setTextureSize(64, 64);
		LeftWing2.mirror = true;
		setRotation(LeftWing2, 0F, 0F, 0.3665191F);
		ModelRenderer LeftWing3 = new ModelRenderer(this, 16, 39);
		LeftWing3.addBox(0F, -6F, 0F, 11, 9, 0);
		LeftWing3.setRotationPoint(4F, -3.5F, 0F);
		LeftWing3.setTextureSize(64, 64);
		LeftWing3.mirror = true;
		setRotation(LeftWing3, 0F, 0F, 0F);
		ModelRenderer LeftWing4 = new ModelRenderer(this, 55, 27);
		LeftWing4.addBox(0F, -11.4F, 0F, 4, 12, 0);
		LeftWing4.setRotationPoint(3F, -0.5F, 0F);
		LeftWing4.setTextureSize(64, 64);
		LeftWing4.mirror = true;
		setRotation(LeftWing4, 0F, 0F, 1.256637F);
		ModelRenderer LeftWingSpoke = new ModelRenderer(this, 28, 33);
		LeftWingSpoke.addBox(0F, 0F, -0.5F, 4, 0, 1);
		LeftWingSpoke.setRotationPoint(3F, -0.5F, 0F);
		LeftWingSpoke.setTextureSize(64, 64);
		LeftWingSpoke.mirror = true;
		setRotation(LeftWingSpoke, 0F, 0F, 1.099557F);
		ModelRenderer LeftWingSpoke1 = new ModelRenderer(this, 28, 36);
		LeftWingSpoke1.addBox(0F, 0F, -0.5F, 12, 0, 1);
		LeftWingSpoke1.setRotationPoint(4F, -4F, 0F);
		LeftWingSpoke1.setTextureSize(64, 64);
		LeftWingSpoke1.mirror = true;
		setRotation(LeftWingSpoke1, 0F, 0F, 0.3141593F);

		LEFTWING.addChild(LeftWingArm1);
		LEFTWING.addChild(LeftWingArm2);
		LEFTWING.addChild(LeftWingArm3);
		LEFTWING.addChild(LeftWing1);
		LEFTWING.addChild(LeftWing2);
		LEFTWING.addChild(LeftWing3);
		LEFTWING.addChild(LeftWing4);
		LEFTWING.addChild(LeftWingSpoke);
		LEFTWING.addChild(LeftWingSpoke1);

		BODYBASE = new ModelRenderer(this, "BODYBASE");
		BODYBASE.setRotationPoint(0F, 10F, 1F);
		setRotation(BODYBASE, 0F, 0F, 0F);
		BODYBASE.mirror = true;
		ModelRenderer LeftEar2 = new ModelRenderer(this, 8, 29);
		LeftEar2.addBox(1F, -2F, 0F, 1, 1, 1);
		LeftEar2.setRotationPoint(1.7F, -5.6F, -0.1F);
		LeftEar2.setTextureSize(64, 64);
		LeftEar2.mirror = true;
		setRotation(LeftEar2, 0F, 0F, -0.7853982F);
		ModelRenderer LeftEar1 = new ModelRenderer(this, 8, 31);
		LeftEar1.addBox(1F, -2F, 0F, 1, 1, 1);
		LeftEar1.setRotationPoint(1.7F, -5.6F, 0F);
		LeftEar1.setTextureSize(64, 64);
		LeftEar1.mirror = true;
		setRotation(LeftEar1, 0F, 0F, -0.7853982F);
		ModelRenderer RightEar2 = new ModelRenderer(this, 8, 29);
		RightEar2.addBox(1F, -2F, 0F, 1, 1, 1);
		RightEar2.setRotationPoint(-1.7F, -5.6F, -0.1F);
		RightEar2.setTextureSize(64, 64);
		RightEar2.mirror = true;
		setRotation(RightEar2, 0F, 0F, -0.7853982F);
		ModelRenderer LowerLeftLeg = new ModelRenderer(this, 0, 0);
		LowerLeftLeg.addBox(-0.5F, 0F, -2.5F, 1, 1, 4);
		LowerLeftLeg.setRotationPoint(2.9F, 8.1F, -1.3F);
		LowerLeftLeg.setTextureSize(64, 64);
		LowerLeftLeg.mirror = true;
		setRotation(LowerLeftLeg, -0.4712389F, -0.6108652F, 0F);
		ModelRenderer BottomLeftTooth = new ModelRenderer(this, 2, 30);
		BottomLeftTooth.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		BottomLeftTooth.setRotationPoint(1.8F, 5F, -0.2F);
		BottomLeftTooth.setTextureSize(64, 64);
		BottomLeftTooth.mirror = true;
		setRotation(BottomLeftTooth, 0F, -0.1919862F, 0.7853982F);
		ModelRenderer UpperRightTooth = new ModelRenderer(this, 2, 30);
		UpperRightTooth.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		UpperRightTooth.setRotationPoint(-1.8F, -5F, -0.2F);
		UpperRightTooth.setTextureSize(64, 64);
		UpperRightTooth.mirror = true;
		setRotation(UpperRightTooth, 0F, 0.1919862F, 0.7853982F);
		ModelRenderer UpperLeftLeg = new ModelRenderer(this, 0, 0);
		UpperLeftLeg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		UpperLeftLeg.setRotationPoint(2F, 6F, 0F);
		UpperLeftLeg.setTextureSize(64, 64);
		UpperLeftLeg.mirror = true;
		setRotation(UpperLeftLeg, -0.6108652F, -0.6108652F, 0F);
		ModelRenderer LowerHalfBottomBack = new ModelRenderer(this, 0, 0);
		LowerHalfBottomBack.addBox(-3F, 5F, 0F, 6, 2, 1);
		LowerHalfBottomBack.setRotationPoint(0F, 0F, 0F);
		LowerHalfBottomBack.setTextureSize(64, 64);
		LowerHalfBottomBack.mirror = true;
		setRotation(LowerHalfBottomBack, 0F, 0F, 0F);
		ModelRenderer UpperRightLeg = new ModelRenderer(this, 0, 0);
		UpperRightLeg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		UpperRightLeg.setRotationPoint(-2F, 6F, 0F);
		UpperRightLeg.setTextureSize(64, 64);
		UpperRightLeg.mirror = true;
		setRotation(UpperRightLeg, -0.6108652F, 0.6108652F, 0F);
		ModelRenderer LowerRightLeg = new ModelRenderer(this, 0, 0);
		LowerRightLeg.addBox(-0.5F, 0F, -2.5F, 1, 1, 4);
		LowerRightLeg.setRotationPoint(-2.9F, 8.1F, -1.3F);
		LowerRightLeg.setTextureSize(64, 64);
		LowerRightLeg.mirror = true;
		setRotation(LowerRightLeg, -0.4712389F, 0.6108652F, 0F);
		ModelRenderer UpperHalfBack = new ModelRenderer(this, 0, 13);
		UpperHalfBack.addBox(-3F, -6F, 0F, 6, 6, 1);
		UpperHalfBack.setRotationPoint(0F, 0F, 0F);
		UpperHalfBack.setTextureSize(64, 64);
		UpperHalfBack.mirror = true;
		setRotation(UpperHalfBack, 0F, 0F, 0F);
		ModelRenderer RightEar1 = new ModelRenderer(this, 8, 31);
		RightEar1.addBox(1F, -2F, 0F, 1, 1, 1);
		RightEar1.setRotationPoint(-1.7F, -5.6F, 0F);
		RightEar1.setTextureSize(64, 64);
		RightEar1.mirror = true;
		setRotation(RightEar1, 0F, 0F, -0.7853982F);
		ModelRenderer UpperhalfTopRight = new ModelRenderer(this, 0, 0);
		UpperhalfTopRight.addBox(-3F, -7F, -1F, 1, 1, 1);
		UpperhalfTopRight.setRotationPoint(0F, 0F, 0.1F);
		UpperhalfTopRight.setTextureSize(64, 64);
		UpperhalfTopRight.mirror = true;
		setRotation(UpperhalfTopRight, 0F, 0F, 0F);
		ModelRenderer LeftEyebrow = new ModelRenderer(this, 0, 0);
		LeftEyebrow.addBox(0.5F, -1F, -1F, 2, 1, 1);
		LeftEyebrow.setRotationPoint(0F, -6.1F, 0.1F);
		LeftEyebrow.setTextureSize(64, 64);
		LeftEyebrow.mirror = true;
		setRotation(LeftEyebrow, 0F, 0F, -0.2268928F);
		ModelRenderer UpperHalfTip = new ModelRenderer(this, 0, 0);
		UpperHalfTip.addBox(-2.5F, -7.7F, -1F, 5, 1, 2);
		UpperHalfTip.setRotationPoint(0F, 0F, 0.1F);
		UpperHalfTip.setTextureSize(64, 64);
		UpperHalfTip.mirror = true;
		setRotation(UpperHalfTip, 0F, 0F, 0F);
		ModelRenderer LowerHalfTopBack = new ModelRenderer(this, 0, 0);
		LowerHalfTopBack.addBox(-3F, -7F, 0F, 6, 1, 1);
		LowerHalfTopBack.setRotationPoint(0F, 0F, 0.1F);
		LowerHalfTopBack.setTextureSize(64, 64);
		LowerHalfTopBack.mirror = true;
		setRotation(LowerHalfTopBack, 0F, 0F, 0F);
		ModelRenderer BottomRightTooth = new ModelRenderer(this, 2, 30);
		BottomRightTooth.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		BottomRightTooth.setRotationPoint(-1.8F, 5F, -0.2F);
		BottomRightTooth.setTextureSize(64, 64);
		BottomRightTooth.mirror = true;
		setRotation(BottomRightTooth, 0F, 0.1919862F, 0.7853982F);
		ModelRenderer UpperHalfTopBottom = new ModelRenderer(this, 0, 52);
		UpperHalfTopBottom.addBox(-3F, -6F, -1F, 6, 1, 2);
		UpperHalfTopBottom.setRotationPoint(0F, 0F, -0.3F);
		UpperHalfTopBottom.setTextureSize(64, 64);
		UpperHalfTopBottom.mirror = true;
		setRotation(UpperHalfTopBottom, 0F, 0F, 0F);
		ModelRenderer UpperhalfTopMiddle = new ModelRenderer(this, 0, 0);
		UpperhalfTopMiddle.addBox(-0.5F, -6.5F, -2F, 1, 1, 1);
		UpperhalfTopMiddle.setRotationPoint(0F, 0F, 0F);
		UpperhalfTopMiddle.setTextureSize(64, 64);
		UpperhalfTopMiddle.mirror = true;
		setRotation(UpperhalfTopMiddle, -0.1745329F, 0F, 0F);
		ModelRenderer LeftEyeBlack = new ModelRenderer(this, 2, 17);
		LeftEyeBlack.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		LeftEyeBlack.setRotationPoint(1F, -6.2F, -0.2F);
		LeftEyeBlack.setTextureSize(64, 64);
		LeftEyeBlack.mirror = true;
		setRotation(LeftEyeBlack, 0F, 0.3490659F, 0.7853982F);
		ModelRenderer LeftEyeWhite = new ModelRenderer(this, 0, 32);
		LeftEyeWhite.addBox(0F, 0F, 0.2F, 2, 1, 1);
		LeftEyeWhite.setRotationPoint(0F, -7F, -1F);
		LeftEyeWhite.setTextureSize(64, 64);
		LeftEyeWhite.mirror = true;
		setRotation(LeftEyeWhite, 0F, 0F, 0F);
		ModelRenderer UpperHalfFront = new ModelRenderer(this, 0, 0);
		UpperHalfFront.addBox(-2F, -6F, -1.5F, 4, 1, 1);
		UpperHalfFront.setRotationPoint(0F, 0F, 0F);
		UpperHalfFront.setTextureSize(64, 64);
		UpperHalfFront.mirror = true;
		setRotation(UpperHalfFront, 0F, 0F, 0F);
		ModelRenderer RightEyeBlack = new ModelRenderer(this, 2, 17);
		RightEyeBlack.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		RightEyeBlack.setRotationPoint(-1F, -6.2F, -0.2F);
		RightEyeBlack.setTextureSize(64, 64);
		RightEyeBlack.mirror = true;
		setRotation(RightEyeBlack, 0F, -0.3490659F, 0.7853982F);
		ModelRenderer LowerHalfLeft = new ModelRenderer(this, 6, 44);
		LowerHalfLeft.addBox(2.5F, 0F, -0.3F, 1, 6, 1);
		LowerHalfLeft.setRotationPoint(0F, 0F, 0F);
		LowerHalfLeft.setTextureSize(64, 64);
		LowerHalfLeft.mirror = true;
		setRotation(LowerHalfLeft, 0F, 0F, 0F);
		ModelRenderer RightEyeWhite = new ModelRenderer(this, 0, 29);
		RightEyeWhite.addBox(-2F, 0F, 0.2F, 2, 1, 1);
		RightEyeWhite.setRotationPoint(0F, -7F, -1F);
		RightEyeWhite.setTextureSize(64, 64);
		RightEyeWhite.mirror = true;
		setRotation(RightEyeWhite, 0F, 0F, 0F);
		ModelRenderer Back = new ModelRenderer(this, 16, 13);
		Back.addBox(-2.5F, -6F, 0.5F, 5, 12, 1);
		Back.setRotationPoint(0F, 0F, 0F);
		Back.setTextureSize(64, 64);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		ModelRenderer LowerHalfRight = new ModelRenderer(this, 0, 44);
		LowerHalfRight.addBox(-3.5F, 0F, -0.3F, 1, 6, 1);
		LowerHalfRight.setRotationPoint(0F, 0F, 0F);
		LowerHalfRight.setTextureSize(64, 64);
		LowerHalfRight.mirror = true;
		setRotation(LowerHalfRight, 0F, 0F, 0F);
		ModelRenderer UpperHalfRight = new ModelRenderer(this, 0, 36);
		UpperHalfRight.addBox(-3.5F, -6F, -0.3F, 1, 6, 1);
		UpperHalfRight.setRotationPoint(0F, 0F, 0F);
		UpperHalfRight.setTextureSize(64, 64);
		UpperHalfRight.mirror = true;
		setRotation(UpperHalfRight, 0F, 0F, 0F);
		ModelRenderer UpperHalfLeft = new ModelRenderer(this, 6, 36);
		UpperHalfLeft.addBox(2.5F, -6F, -0.3F, 1, 6, 1);
		UpperHalfLeft.setRotationPoint(0F, 0F, 0F);
		UpperHalfLeft.setTextureSize(64, 64);
		UpperHalfLeft.mirror = true;
		setRotation(UpperHalfLeft, 0F, 0F, 0F);
		ModelRenderer LowerHalfFront = new ModelRenderer(this, 0, 0);
		LowerHalfFront.addBox(-2.5F, 5F, -1.5F, 5, 1, 1);
		LowerHalfFront.setRotationPoint(0F, 0F, 0F);
		LowerHalfFront.setTextureSize(64, 64);
		LowerHalfFront.mirror = true;
		setRotation(LowerHalfFront, 0F, 0F, 0F);
		ModelRenderer UpperLeftTooth = new ModelRenderer(this, 2, 30);
		UpperLeftTooth.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 0);
		UpperLeftTooth.setRotationPoint(1.8F, -5F, -0.2F);
		UpperLeftTooth.setTextureSize(64, 64);
		UpperLeftTooth.mirror = true;
		setRotation(UpperLeftTooth, 0F, -0.1919862F, 0.7853982F);
		ModelRenderer UpperHalfTopLeft = new ModelRenderer(this, 0, 0);
		UpperHalfTopLeft.addBox(2F, -7F, -1F, 1, 1, 1);
		UpperHalfTopLeft.setRotationPoint(0F, 0F, 0.1F);
		UpperHalfTopLeft.setTextureSize(64, 64);
		UpperHalfTopLeft.mirror = true;
		setRotation(UpperHalfTopLeft, 0F, 0F, 0F);
		ModelRenderer LowerHalfBack = new ModelRenderer(this, 0, 21);
		LowerHalfBack.addBox(-3F, 0F, 0F, 6, 6, 1);
		LowerHalfBack.setRotationPoint(0F, 0F, 0F);
		LowerHalfBack.setTextureSize(64, 64);
		LowerHalfBack.mirror = true;
		setRotation(LowerHalfBack, 0F, 0F, 0F);
		ModelRenderer RightEyebrow = new ModelRenderer(this, 0, 0);
		RightEyebrow.addBox(-2.5F, -1F, -1F, 2, 1, 1);
		RightEyebrow.setRotationPoint(0F, -6.1F, 0.1F);
		RightEyebrow.setTextureSize(64, 64);
		RightEyebrow.mirror = true;
		setRotation(RightEyebrow, 0F, 0F, 0.2268928F);
		ModelRenderer LowerHalfBottom = new ModelRenderer(this, 0, 56);
		LowerHalfBottom.addBox(-3F, 5F, -1F, 6, 2, 2);
		LowerHalfBottom.setRotationPoint(0F, 0F, -0.3F);
		LowerHalfBottom.setTextureSize(64, 64);
		LowerHalfBottom.mirror = true;
		setRotation(LowerHalfBottom, 0F, 0F, 0F);

		BODYBASE.addChild(LeftEar1);
		BODYBASE.addChild(LeftEar2);
		BODYBASE.addChild(RightEar1);
		BODYBASE.addChild(RightEar2);
		BODYBASE.addChild(UpperLeftLeg);
		BODYBASE.addChild(LowerLeftLeg);
		BODYBASE.addChild(UpperRightLeg);
		BODYBASE.addChild(LowerRightLeg);
		BODYBASE.addChild(UpperRightTooth);
		BODYBASE.addChild(UpperLeftTooth);
		BODYBASE.addChild(BottomRightTooth);
		BODYBASE.addChild(BottomLeftTooth);
		BODYBASE.addChild(RightEyebrow);
		BODYBASE.addChild(LeftEyebrow);
		BODYBASE.addChild(LeftEyeWhite);
		BODYBASE.addChild(LeftEyeBlack);
		BODYBASE.addChild(RightEyeWhite);
		BODYBASE.addChild(RightEyeBlack);
		BODYBASE.addChild(Back);
		BODYBASE.addChild(LowerHalfBack);
		BODYBASE.addChild(UpperHalfBack);
		BODYBASE.addChild(LowerHalfTopBack);
		BODYBASE.addChild(UpperhalfTopRight);
		BODYBASE.addChild(UpperHalfTopLeft);
		BODYBASE.addChild(UpperhalfTopMiddle);
		BODYBASE.addChild(UpperHalfTip);
		BODYBASE.addChild(UpperHalfTopBottom);
		BODYBASE.addChild(LowerHalfBottomBack);
		BODYBASE.addChild(LowerHalfBottom);
		BODYBASE.addChild(LowerHalfRight);
		BODYBASE.addChild(LowerHalfLeft);
		BODYBASE.addChild(UpperHalfRight);
		BODYBASE.addChild(UpperHalfLeft);
		BODYBASE.addChild(UpperHalfFront);
		BODYBASE.addChild(LowerHalfFront);
		BODYBASE.addChild(LEFTWING);
		BODYBASE.addChild(RIGHTWING);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BODYBASE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		if (((EntityPixelmon)entity).animationCounter * 3 - 180 < 0) { 
			LEFTWING.rotateAngleZ = -1.5F + (((EntityPixelmon)entity).animationCounter + 90) * 0.0174532925F;
			}
			
		else if (((EntityPixelmon)entity).animationCounter * 3 >= 0) {
			LEFTWING.rotateAngleZ = 0.5F + -((((EntityPixelmon)entity).animationCounter - 90) * 0.0174532925F);
			}
		
		
		if (((EntityPixelmon)entity).animationCounter * 3 - 180 < 0) { 
			RIGHTWING.rotateAngleZ = 1.5F + -(((EntityPixelmon)entity).animationCounter + 90) * 0.0174532925F;
			}
			
		else if (((EntityPixelmon)entity).animationCounter * 3 >= 0) {
			RIGHTWING.rotateAngleZ = -0.5F + ((((EntityPixelmon)entity).animationCounter - 90) * 0.0174532925F);
			}
		
		if (((EntityPixelmon)entity).animationCounter * 3 -180 < 0) { 
			BODYBASE.rotationPointY = 45 -(((EntityPixelmon)entity).animationCounter + 180) * 0.174532925F;
		}
		
		else if (((EntityPixelmon)entity).animationCounter * 3 >= 0) {
			BODYBASE.rotationPointY = 25 + (((EntityPixelmon)entity).animationCounter - 180) * 0.174532925F;
		}
		
		
		if (((EntityPixelmon)entity).animationCounter >= 120){
			((EntityPixelmon)entity).animationCounter = 0;}
		
	}

}