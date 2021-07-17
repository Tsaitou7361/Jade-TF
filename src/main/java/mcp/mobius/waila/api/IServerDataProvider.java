package mcp.mobius.waila.api;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public interface IServerDataProvider<T> {

	/**
     * Callback used server side to return a custom synchronization NBTTagCompound.</br>
     * Will only be called if the implementing class is registered via {@link IRegistrar#registerBlockDataProvider} or {@link IRegistrar#registerEntityDataProvider}.</br>
     *
     * @param data   Current synchronization tag (might have been processed by other providers and might be processed by other providers).
     * @param player The player requesting data synchronization (The owner of the current connection).
     * @param world  The world.
     * @param t      The type targeted for synchronization.
     * @param showDetails   Should show details (for example: show more inventory items in tooltip while player is pressing SHIFT by default).
     */
	void appendServerData(CompoundNBT data, ServerPlayerEntity player, World world, T t, boolean showDetails);
}
