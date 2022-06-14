package extended_weapon.scripts;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "extended_weapon";
    public Main(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        registerCommonEvents(modEventBus);
    }
    public void registerCommonEvents(IEventBus eventBus) {
        eventBus.register(StartupCommon.class);
    }
}
