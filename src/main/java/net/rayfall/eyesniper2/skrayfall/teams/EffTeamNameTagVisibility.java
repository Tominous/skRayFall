package net.rayfall.eyesniper2.skrayfall.teams;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;

import org.bukkit.event.Event;
import org.eclipse.jdt.annotation.Nullable;

public class EffTeamNameTagVisibility extends Effect {

    @Override
    public boolean init(Expression<?>[] exp, int arg1, Kleenean arg2, ParseResult arg3) {
        return false;
    }

    @Override
    public String toString(@Nullable Event arg0, boolean arg1) {

        return null;
    }

    @Override
    protected void execute(Event evt) {

    }
}
