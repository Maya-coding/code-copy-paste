public class Registration {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.Mod_ID);
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.Mod_ID);
  
   public static void init() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        FLUIDS.register(eventBus);
        TILE_ENTITY_TYPES.register(eventBus);
        CONTAINERS.register(eventBus);
        ENTITY_TYPES.register(eventBus);
        ENCHANTMENTS.register(eventBus);

    }
}
