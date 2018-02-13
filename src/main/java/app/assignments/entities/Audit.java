package app.assignments.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class Audit {

	@Getter
	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", insertable = true, updatable = false)
	private Date creationDate;

	@Getter
	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", insertable = false, updatable = true)
	private Date lastUpdate;

}
