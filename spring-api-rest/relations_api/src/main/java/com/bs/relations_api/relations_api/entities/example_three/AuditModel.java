package com.bs.relations_api.relations_api.entities.example_three;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass()
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_at", "updated_at"}, allowGetters = true)
public abstract class AuditModel implements Serializable {
  
  private static final long serialVersionId = 1L;
  
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="created_at", nullable = false, updatable = false)
  @CreatedDate()
  private Date created_at;
  
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="updated_at", nullable = false)
  @LastModifiedDate()
  private Date updated_at;

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public AuditModel(Date created_at, Date updated_at) {
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  public AuditModel() {
  }
  
}
