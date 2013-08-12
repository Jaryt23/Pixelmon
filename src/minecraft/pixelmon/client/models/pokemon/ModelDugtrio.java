package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDugtrio extends ModelBase {
	// fields
	ModelRenderer body;
	ModelRenderer top;
	ModelRenderer mouth;
	ModelRenderer base;
	ModelRenderer body1;
	ModelRenderer top1;
	ModelRenderer mouth1;
	ModelRenderer base1;
	ModelRenderer body2;
	ModelRenderer top2;
	ModelRenderer mouth2;
	ModelRenderer base2;
	ModelRenderer rock1;
	ModelRenderer rock2;
	ModelRenderer rock3;
	ModelRenderer rock4;
	ModelRenderer rock5;
	ModelRenderer rock6;

	public ModelDugtrio() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-2F, -5.5F, -7F, 6, 6, 6);
		body.setRotationPoint(0F, 23F, 0F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0.0872665F, -0.0523599F);
		top = new ModelRenderer(this, 24, 0);
		top.addBox(-1.5F, -6.5F, -6.5F, 5, 1, 5);
		top.setRotationPoint(0F, 23F, 0F);
		top.setTextureSize(64, 64);
		top.mirror = true;
		setRotation(top, 0F, 0.0872665F, -0.0523599F);
		mouth = new ModelRenderer(this, 24, 6);
		mouth.addBox(0F, -2F, -7.5F, 2, 1, 1);
		mouth.setRotationPoint(0F, 23F, 0F);
		mouth.setTextureSize(64, 64);
		mouth.mirror = true;
		setRotation(mouth, 0F, 0.0872665F, -0.0523599F);
		base = new ModelRenderer(this, 0, 55);
		base.addBox(-4F, 0F, -8F, 8, 1, 8);
		base.setRotationPoint(0F, 23F, 0F);
		base.setTextureSize(64, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		body1 = new ModelRenderer(this, 0, 12);
		body1.addBox(-7.5F, -10.5F, 1F, 6, 11, 6);
		body1.setRotationPoint(0F, 23F, 0F);
		body1.setTextureSize(64, 64);
		body1.mirror = true;
		setRotation(body1, 0.0523599F, -0.0872665F, 0F);
		top1 = new ModelRenderer(this, 24, 0);
		top1.addBox(-7F, -11.5F, 1.5F, 5, 1, 5);
		top1.setRotationPoint(0F, 23F, 0F);
		top1.setTextureSize(64, 64);
		top1.mirror = true;
		setRotation(top1, 0.0523599F, -0.0872665F, 0F);
		mouth1 = new ModelRenderer(this, 24, 6);
		mouth1.addBox(-5.5F, -7F, 0.5F, 2, 1, 1);
		mouth1.setRotationPoint(0F, 23F, 0F);
		mouth1.setTextureSize(64, 64);
		mouth1.mirror = true;
		setRotation(mouth1, 0.0698132F, -0.0872665F, -0.0349066F);
		base1 = new ModelRenderer(this, 0, 55);
		base1.addBox(-9F, 0F, -1F, 8, 1, 8);
		base1.setRotationPoint(0F, 23F, 0F);
		base1.setTextureSize(64, 64);
		base1.mirror = true;
		setRotation(base1, 0F, 0F, 0F);
		body2 = new ModelRenderer(this, 0, 29);
		body2.addBox(1F, -13.5F, 1F, 6, 14, 6);
		body2.setRotationPoint(0F, 23F, 0F);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0F, 0F, 0.0872665F);
		top2 = new ModelRenderer(this, 24, 0);
		top2.addBox(1.5F, -14.5F, 1.5F, 5, 1, 5);
		top2.setRotationPoint(0F, 23F, 0F);
		top2.setTextureSize(64, 64);
		top2.mirror = true;
		setRotation(top2, 0F, 0F, 0.0872665F);
		mouth2 = new ModelRenderer(this, 24, 6);
		mouth2.addBox(3F, -10F, 0.5F, 2, 1, 1);
		mouth2.setRotationPoint(0F, 23F, 0F);
		mouth2.setTextureSize(64, 64);
		mouth2.mirror = true;
		setRotation(mouth2, 0F, 0F, 0.0698132F);
		base2 = new ModelRenderer(this, 0, 55);
		base2.addBox(0F, 0F, 0F, 8, 1, 8);
		base2.setRotationPoint(0F, 23F, 0F);
		base2.setTextureSize(64, 64);
		base2.mirror = true;
		setRotation(base2, 0F, 0F, 0F);
		rock1 = new ModelRenderer(this, 36, 12);
		rock1.addBox(-1.5F, -1F, 5.1F, 2, 2, 2);
		rock1.setRotationPoint(0F, 23F, 0F);
		rock1.setTextureSize(64, 64);
		rock1.mirror = true;
		setRotation(rock1, 0F, 0F, 0F);
		rock2 = new ModelRenderer(this, 40, 19);
		rock2.addBox(-10F, 0F, 2F, 1, 1, 1);
		rock2.setRotationPoint(0F, 23F, 0F);
		rock2.setTextureSize(64, 64);
		rock2.mirror = true;
		setRotation(rock2, 0F, 0F, 0F);
		rock3 = new ModelRenderer(this, 40, 17);
		rock3.addBox(4F, 0F, -7F, 1, 1, 1);
		rock3.setRotationPoint(0F, 23F, 0F);
		rock3.setTextureSize(64, 64);
		rock3.mirror = true;
		setRotation(rock3, 0F, 0F, 0F);
		rock4 = new ModelRenderer(this, 36, 12);
		rock4.addBox(-5F, -1F, -2F, 2, 2, 2);
		rock4.setRotationPoint(0F, 23F, 0F);
		rock4.setTextureSize(64, 64);
		rock4.mirror = true;
		setRotation(rock4, 0F, 0F, 0F);
		rock5 = new ModelRenderer(this, 36, 12);
		rock5.addBox(7.5F, -1F, 5F, 2, 2, 2);
		rock5.setRotationPoint(0F, 23F, 0F);
		rock5.setTextureSize(64, 64);
		rock5.mirror = true;
		setRotation(rock5, 0F, 0F, 0F);
		rock6 = new ModelRenderer(this, 40, 19);
		rock6.addBox(-5F, 0F, -6F, 1, 1, 1);
		rock6.setRotationPoint(0F, 23F, 0F);
		rock6.setTextureSize(64, 64);
		rock6.mirror = true;
		setRotation(rock6, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		top.render(f5);
		mouth.render(f5);
		base.render(f5);
		body1.render(f5);
		top1.render(f5);
		mouth1.render(f5);
		base1.render(f5);
		body2.render(f5);
		top2.render(f5);
		mouth2.render(f5);
		base2.render(f5);
		rock1.render(f5);
		rock2.render(f5);
		rock3.render(f5);
		rock4.render(f5);
		rock5.render(f5);
		rock6.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		body.rotationPointY = MathHelper.cos(1.5F * f) * 1.5F * f1 + 23.5F;
		mouth.rotationPointY = MathHelper.cos(1.5F * f) * 1.5F * f1 + 23.5F;
		top.rotationPointY = MathHelper.cos(1.5F * f) * 1.5F * f1 + 23.5F;
		body.rotationPointZ = MathHelper.cos(1.5F * f) * f1;
		mouth.rotationPointZ = MathHelper.cos(1.5F * f) * f1;
		top.rotationPointZ = MathHelper.cos(1.5F * f) * f1;
		body1.rotationPointY = MathHelper.cos(1F * f + 5F) * f1 + 23.5F;
		mouth1.rotationPointY = MathHelper.cos(1F * f + 5F) * f1 + 23.5F;
		top1.rotationPointY = MathHelper.cos(1F * f + 5F) * f1 + 23.5F;
		body1.rotationPointZ = MathHelper.cos(1F * f + 5F) * f1;
		mouth1.rotationPointZ = MathHelper.cos(1F * f + 5F) * f1;
		top1.rotationPointZ = MathHelper.cos(1F * f + 5F) * f1;
		body2.rotationPointY = MathHelper.cos(.5F * f + 3) * 2 * f1 + 23.5F;
		mouth2.rotationPointY = MathHelper.cos(.5F * f + 3) * 2 * f1 + 23.5F;
		top2.rotationPointY = MathHelper.cos(.5F * f + 3) * 2 * f1 + 23.5F;
		body2.rotationPointZ = MathHelper.cos(.5F * f + 3) * f1;
		mouth2.rotationPointZ = MathHelper.cos(.5F * f + 3) * f1;
		top2.rotationPointZ = MathHelper.cos(.5F * f + 3) * f1;
	}

}
