package pixelmon.client.models.animations.bird;

import net.minecraft.client.model.ModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.SkeletonBase;

public class SkeletonBird extends SkeletonBase {
	private ModelRenderer LeftWing, RightWing, LeftLeg, RightLeg;

	public SkeletonBird(ModelRenderer body, ModuleHead head,
			ModuleWing leftWing, ModuleWing rightWing, ModelRenderer leftLeg,
			ModelRenderer rightLeg) {
		super(body);
		modules.add(head);
		modules.add(leftWing);
		modules.add(rightWing);
	}

}
