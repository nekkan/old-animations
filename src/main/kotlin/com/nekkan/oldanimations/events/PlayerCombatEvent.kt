package com.nekkan.oldanimations.events

import com.nekkan.oldanimations.event.Event
import com.nekkan.oldanimations.event.EventPublisher
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity

abstract class PlayerCombatEvent {

    open class Pre(
        val attacker: PlayerEntity,
        val attacked: LivingEntity,
        override val publisher: EventPublisher
    ): Event.Pre()

    open class Post(
        val attacker: PlayerEntity,
        val attacked: LivingEntity,
        override val publisher: EventPublisher
    ): Event.Post()

}
