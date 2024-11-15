package net.nax.aviator_dream.client;

import immersive_aircraft.client.render.entity.renderer.AircraftEntityRenderer;
import immersive_aircraft.client.render.entity.renderer.utils.ModelPartRenderHandler;
import immersive_aircraft.entity.AircraftEntity;
import net.nax.aviator_dream.AviatorDreams;
import net.nax.aviator_dream.entity.DouglasDC1Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class DouglasDC1EntityRenderer extends AircraftEntityRenderer<DouglasDC1Entity> {
    private static final ResourceLocation ID = AviatorDreams.locate("douglas_dc1");

    private final ModelPartRenderHandler<DouglasDC1Entity> model = new ModelPartRenderHandler<DouglasDC1Entity>()
            .add("dyed_body", (model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer) ->
                    renderDyed(model, object, vertexConsumerProvider, entity, matrixStack, light, time, false, false))
            .add("dyed_body_highlights", (model, object, vertexConsumerProvider, entity, matrixStack, light, time, modelPartRenderer) ->
                    renderDyed(model, object, vertexConsumerProvider, entity, matrixStack, light, time, true, false));

    @Override
    protected ResourceLocation getModelId() {
        return ID;
    }

    public DouglasDC1EntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected ModelPartRenderHandler<DouglasDC1Entity> getModel(AircraftEntity entity) {
        return model;
    }
}
