package org.plexus.starship.domain.ports.in;

import org.plexus.starship.domain.Starship;

public interface CreateStarshipPort {
    Starship execute(final Starship starship);
}
