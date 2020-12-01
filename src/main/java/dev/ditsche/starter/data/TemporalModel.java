package dev.ditsche.starter.data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * May extend an entity if this entity should have creation and update timestamps
 * present in the database.
 *
 * @author Tobias Dittmann
 */
public abstract class TemporalModel {

    /**
     * The timestamp on which the model entity was created.
     * Can not be modified once set and always defaults to the current {@link LocalDateTime}.
     */
    @Column(name = "created_on", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdOn = LocalDateTime.now();

    /**
     * The timestamp on which the model entity was last updated.
     * Can be modified once set and always defaults to the current {@link LocalDateTime}.
     *
     * Updating this value is automatically handled by JPA.
     */
    @Column(name = "updated_on")
    @UpdateTimestamp
    private LocalDateTime updatedOn = LocalDateTime.now();

}
