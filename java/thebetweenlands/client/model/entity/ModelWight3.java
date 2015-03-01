// Date: 08.11.2012 19:08:30
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package thebetweenlands.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWight3 extends ModelBase
{
  //fields
    ModelRenderer TopBody;
    ModelRenderer LowBody;
    ModelRenderer Head;
    ModelRenderer Hood;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer LLeg;
    ModelRenderer RLeg;

  public ModelWight3()
  {
    textureWidth = 64;
    textureHeight = 32;

      TopBody = new ModelRenderer(this, 14, 23);
      TopBody.addBox(-4F, -2.5F, -2F, 9, 5, 4);
      TopBody.setRotationPoint(-0.5F, 0.5F, -0.5F);
      TopBody.setTextureSize(64, 32);
      TopBody.mirror = true;
      setRotation(TopBody, 0.4363323F, 0F, 0F);
      LowBody = new ModelRenderer(this, 0, 24);
      LowBody.addBox(-2.5F, -3F, -1F, 5, 6, 2);
      LowBody.setRotationPoint(0F, 5.5F, 0F);
      LowBody.setTextureSize(64, 32);
      LowBody.mirror = true;
      setRotation(LowBody, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 10);
      Head.addBox(-2F, -2F, -2F, 4, 4, 4);
      Head.setRotationPoint(0F, -2.5F, -3.5F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Hood = new ModelRenderer(this, 0, 0);
      Hood.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5);
      Hood.setRotationPoint(0F, -2.5F, -3.5F);
      Hood.setTextureSize(64, 32);
      Hood.mirror = true;
      setRotation(Hood, 0F, 0F, 0F);
      RArm = new ModelRenderer(this, 24, 0);
      RArm.addBox(-0.5F, -0.5F, -0.5F, 1, 18, 1);
      RArm.setRotationPoint(-3.5F, 0F, 0F);
      RArm.setTextureSize(64, 32);
      RArm.mirror = true;
      setRotation(RArm, 0F, 0F, 0F);
      LArm = new ModelRenderer(this, 24, 0);
      LArm.addBox(-0.5F, -0.5F, -0.5F, 1, 18, 1);
      LArm.setRotationPoint(3.5F, 0F, 0F);
      LArm.setTextureSize(64, 32);
      LArm.mirror = true;
      setRotation(LArm, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 20, 0);
      LLeg.addBox(-0.5F, -0.5F, -0.5F, 1, 12, 1);
      LLeg.setRotationPoint(1F, 8F, 0F);
      LLeg.setTextureSize(64, 32);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 20, 0);
      RLeg.addBox(-0.5F, -0.5F, -0.5F, 1, 12, 1);
      RLeg.setRotationPoint(-1F, 8F, 0F);
      RLeg.setTextureSize(64, 32);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    TopBody.render(f5);
    LowBody.render(f5);
    Head.render(f5);
    Hood.render(f5);
    RArm.render(f5);
    LArm.render(f5);
    LLeg.render(f5);
    RLeg.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
