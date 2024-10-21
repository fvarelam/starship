package org.plexus.starship.domain.ports.out;

import org.plexus.starship.domain.Starship;

import java.util.List;

public interface StarshipsByNameRepositoryPort {
    List<Starship> execute(final String name);
}
