package org.plexus.starship.domain.ports.in;

import org.plexus.starship.domain.Starship;

public interface UpdateStarshipByIdPort {
    Starship execute(final long id, final Starship starship);
}
