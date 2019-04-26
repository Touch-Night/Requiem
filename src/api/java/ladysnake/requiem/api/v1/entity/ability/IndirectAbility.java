/*
 * Requiem
 * Copyright (C) 2019 Ladysnake
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses>.
 */
package ladysnake.requiem.api.v1.entity.ability;

import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * An {@link IndirectAbility} can be used without any specific target.
 * They tend to use some kind of projectile, or act on the entity itself.
 * Examples include priming an explosion, throwing a fireball, teleporting...
 *
 * @param <E> The type of mobs that can wield this ability
 */
@FunctionalInterface
public interface IndirectAbility<E extends MobEntity> extends MobAbility<E> {
    /**
     * Triggers an indirect ability.
     *
     * @param player the player commanding the ability
     * @return <code>true</code> if the ability has been successfully used
     */
    boolean trigger(PlayerEntity player);
}