package org.ddd.shared.domain.publisher;

import org.ddd.shared.domain.events.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T event);
}
