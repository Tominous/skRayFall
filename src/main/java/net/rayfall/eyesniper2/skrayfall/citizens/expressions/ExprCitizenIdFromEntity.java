package net.rayfall.eyesniper2.skrayfall.citizens.expressions;

import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Name;
import ch.njol.skript.doc.RequiredPlugins;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPCRegistry;

import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.eclipse.jdt.annotation.Nullable;

@Name("Citizen ID")
@Description("Get the id number of a citizen from an entity.")
@RequiredPlugins("Citizens")
public class ExprCitizenIdFromEntity extends SimpleExpression<Number> {

    // citizen id of %entity%
    private Expression<Entity> entity;

    @Override
    public Class<? extends Number> getReturnType() {
        return Number.class;
    }

    @Override
    public boolean isSingle() {
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean init(Expression<?>[] exp, int arg1, Kleenean arg2, ParseResult arg3) {
        entity = (Expression<Entity>) exp[0];
        return true;
    }

    @Override
    public String toString(@Nullable Event arg0, boolean arg1) {
        return null;
    }

    @Override
    @Nullable
    protected Number[] get(Event evt) {
        if (entity.getSingle(evt) != null && entity.getSingle(evt).hasMetadata("NPC")) {
            NPCRegistry registry = CitizensAPI.getNPCRegistry();
            return new Number[]{registry.getNPC(entity.getSingle(evt)).getId()};
        }
        return null;
    }

}
