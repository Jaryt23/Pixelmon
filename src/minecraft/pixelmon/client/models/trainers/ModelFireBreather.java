// Date: 2/17/2013 5:20:08 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.trainers;

import pixelmon.entities.pixelmon.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelFireBreather extends ModelBase
{

  //fields
    ModelRenderer bodymain;
    ModelRenderer lowerbody;
    ModelRenderer upperbody;
    ModelRenderer breasts;
    ModelRenderer leftArmTop;
    ModelRenderer leftLowerArm;
    ModelRenderer leftHand;
    ModelRenderer rightArmTop;
    ModelRenderer rightArmLower;
    ModelRenderer rightHand;
    ModelRenderer torchHandle;
    ModelRenderer torchTop;
    ModelRenderer flames;
    ModelRenderer head;
    ModelRenderer leftHair;
    ModelRenderer rightHair;
    ModelRenderer rightHairTop;
    ModelRenderer leftHairTop;
    ModelRenderer leftleg;
    ModelRenderer leftLeg2;
    ModelRenderer rightLeg;
    ModelRenderer rightLeg2;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
  
  public ModelFireBreather()
  {
	  textureWidth = 128;
	  textureHeight = 64;
    

      Body = new ModelRenderer(this, "Body");
      Body.setRotationPoint(0, 0, 0);
      Head = new ModelRenderer(this, "Head");
      Head.setRotationPoint(0F, 3.5F, 0F);
      LeftArm = new ModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(5F, 6F, 1F);
      RightArm = new ModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-5F, 6F, 1F);
      LeftLeg = new ModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(3F, 17F, 0F);
      RightLeg = new ModelRenderer(this, "RightLeg");
      RightLeg.setRotationPoint(-3F, 17F, 0F);
      bodymain = new ModelRenderer(this, 0, 12);
      bodymain.addBox(-5.5F, 0.5F, -4F, 11, 9, 8);
      bodymain.setRotationPoint(0F, 3.5F, 0F);
      bodymain.setTextureSize(128, 64);
      bodymain.mirror = true;
      setRotation(bodymain, 0F, 0F, 0F);
      lowerbody = new ModelRenderer(this, 23, 29);
      lowerbody.addBox(0F, 0F, 0F, 10, 10, 10);
      lowerbody.setRotationPoint(-5F, 8F, -5F);
      lowerbody.setTextureSize(128, 64);
      lowerbody.mirror = true;
      setRotation(lowerbody, -0.0698132F, 0F, 0F);
      upperbody = new ModelRenderer(this, 92, 32);
      upperbody.addBox(0F, 0F, 0F, 9, 10, 9);
      upperbody.setRotationPoint(-4.5F, 3.5F, -4.5F);
      upperbody.setTextureSize(128, 64);
      upperbody.mirror = true;
      setRotation(upperbody, 0F, 0F, 0F);
      breasts = new ModelRenderer(this, 50, 20);
      breasts.addBox(0F, 0F, 0F, 9, 4, 3);
      breasts.setRotationPoint(-4.5F, 3.5F, -4.5F);
      breasts.setTextureSize(128, 64);
      breasts.mirror = true;
      setRotation(breasts, -0.1047198F, 0F, 0F);
      leftArmTop = new ModelRenderer(this, 112, 0);
      leftArmTop.addBox(0F, -2F, -2F, 4, 3, 4);
      leftArmTop.setTextureSize(128, 64);
      leftArmTop.mirror = true;
      setRotation(leftArmTop, 0F, 0F, 0F);
      leftLowerArm = new ModelRenderer(this, 112, 0);
      leftLowerArm.addBox(0F, 0F, 0F, 4, 6, 4);
      leftLowerArm.setRotationPoint(0.5F, 1F, -2F);
      leftLowerArm.setTextureSize(128, 64);
      leftLowerArm.mirror = true;
      setRotation(leftLowerArm, 0F, 0F, 0F);
      leftHand = new ModelRenderer(this, 0, 0);
      leftHand.addBox(0F, 0F, 0F, 3, 8, 3);
      leftHand.setRotationPoint(1F, 1.5F, -1.5F);
      leftHand.setTextureSize(128, 64);
      leftHand.mirror = true;
      setRotation(leftHand, 0F, 0F, 0F);
      rightArmTop = new ModelRenderer(this, 112, 0);
      rightArmTop.addBox(-4F, -2F, -2F, 4, 3, 4);
      rightArmTop.setTextureSize(128, 64);
      rightArmTop.mirror = true;
      setRotation(rightArmTop, 0F, 0F, 0F);
      rightArmLower = new ModelRenderer(this, 112, 0);
      rightArmLower.addBox(0F, 0F, 0F, 4, 6, 4);
      rightArmLower.setRotationPoint(-4.5F, 1F, -2F);
      rightArmLower.setTextureSize(128, 64);
      rightArmLower.mirror = true;
      setRotation(rightArmLower, 0F, 0F, 0F);
      rightHand = new ModelRenderer(this, 0, 0);
      rightHand.addBox(0F, 0F, 0F, 3, 8, 3);
      rightHand.setRotationPoint(-4F, 1.5F, -1.5F);
      rightHand.setTextureSize(128, 64);
      rightHand.mirror = true;
      setRotation(rightHand, 0F, 0F, 0F);
      torchHandle = new ModelRenderer(this, 61, 0);
      torchHandle.addBox(0F, 0F, 0F, 1, 1, 7);
      torchHandle.setRotationPoint(-3F, 10.5F, -7F);
      torchHandle.setTextureSize(128, 64);
      torchHandle.mirror = true;
      setRotation(torchHandle, 0.418879F, 0F, 0F);
      torchTop = new ModelRenderer(this, 0, 31);
      torchTop.addBox(0F, 0F, 0F, 2, 2, 2);
      torchTop.setRotationPoint(-3.5F, 10.4F, -8F);
      torchTop.setTextureSize(128, 64);
      torchTop.mirror = true;
      setRotation(torchTop, 0.418879F, 0F, 0F);
      flames = new ModelRenderer(this, 39, 1);
      flames.addBox(0F, 0F, 0F, 3, 4, 3);
      flames.setRotationPoint(-4F, 7.8F, -8F);
      flames.setTextureSize(128, 64);
      flames.mirror = true;
      setRotation(flames, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 54);
      head.addBox(-2.5F, -5F, -2.5F, 5, 5, 5);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F); 
      leftHair = new ModelRenderer(this, 0, 37);
      leftHair.addBox(0F, 0F, 0F, 2, 2, 2);
      leftHair.setRotationPoint(1F, -6.7F, -1F);
      leftHair.setTextureSize(128, 64);
      leftHair.mirror = true;
      setRotation(leftHair, 0F, 0F, 0.2443461F);
      rightHair = new ModelRenderer(this, 0, 37);
      rightHair.addBox(0F, 0F, 0F, 2, 2, 2);
      rightHair.setRotationPoint(-2.9F, -6.2F, -1F);
      rightHair.setTextureSize(128, 64);
      rightHair.mirror = true;
      setRotation(rightHair, 0F, 0F, -0.2443461F);
      rightHairTop = new ModelRenderer(this, 0, 39);
      rightHairTop.addBox(0F, 0F, 0F, 1, 1, 1);
      rightHairTop.setRotationPoint(-2.5F, -7.2F, -0.5F);
      rightHairTop.setTextureSize(128, 64);
      rightHairTop.mirror = true;
      setRotation(rightHairTop, 0F, 0.0174533F, 0F);
      leftHairTop = new ModelRenderer(this, 0, 39);
      leftHairTop.addBox(0F, 0F, 0F, 1, 1, 1);
      leftHairTop.setRotationPoint(1.5F, -7.2F, -0.5F);
      leftHairTop.setTextureSize(128, 64);
      leftHairTop.mirror = true;
      setRotation(leftHairTop, 0F, 0.0174533F, 0F);
      leftleg = new ModelRenderer(this, 85, 0);
      leftleg.addBox(-2F, 0F, -2F, 4, 7, 4);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftLeg2 = new ModelRenderer(this, 85, 0);
      leftLeg2.addBox(0F, 0F, 0F, 4, 7, 4);
      leftLeg2.setRotationPoint(-3F, 0F, -2.1F);
      leftLeg2.setTextureSize(128, 64);
      leftLeg2.mirror = true;
      setRotation(leftLeg2, 0F, 0F, -0.1047198F);
      rightLeg = new ModelRenderer(this, 85, 0);
      rightLeg.addBox(-2F, 0F, -2F, 4, 7, 4);
      rightLeg.setTextureSize(128, 64);
      rightLeg.mirror = true;
      setRotation(rightLeg, 0F, 0F, 0F);
      rightLeg2 = new ModelRenderer(this, 85, 0);
      rightLeg2.addBox(0F, 0F, 0F, 4, 7, 4);
      rightLeg2.setRotationPoint(-1F, -0.2F, -2.1F);
      rightLeg2.setTextureSize(128, 64);
      rightLeg2.mirror = true;
      setRotation(rightLeg2, 0F, 0F, 0.1047198F);
      
      Body.addChild(bodymain);
      Body.addChild(lowerbody);
      Body.addChild(upperbody);
      Body.addChild(breasts);
      LeftArm.addChild(leftArmTop);
      LeftArm.addChild(leftLowerArm);
      LeftArm.addChild(leftHand);
      RightArm.addChild(rightArmTop);
      RightArm.addChild(rightArmLower);
      RightArm.addChild(rightHand);
      RightArm.addChild(torchHandle);
      RightArm.addChild(torchTop);
      RightArm.addChild(flames);
      Head.addChild(head);
      Head.addChild(leftHair);
      Head.addChild(rightHair);
      Head.addChild(rightHairTop);
      Head.addChild(leftHairTop);
      LeftLeg.addChild(leftleg);
      LeftLeg.addChild(leftLeg2);
      RightLeg.addChild(rightLeg);
      RightLeg.addChild(rightLeg2);
      Body.addChild(Head);
      Body.addChild(LeftArm);
      Body.addChild(RightArm);
      Body.addChild(LeftLeg);
      Body.addChild(RightLeg);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  
	  	Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		RightLeg.rotateAngleY = 0.0F;
		LeftLeg.rotateAngleY = 0.0F;
		RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * .5F * f1;
		LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * .5F * f1;
  }

}