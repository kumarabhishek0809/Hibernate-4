package com.hibernate.persistence.generation.startegy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "sequenceIdentifier")
public class SequenceIdentifier {
	@Id
	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
			@org.hibernate.annotations.Parameter(name = "sequence", value = "sequence")

	})
	@GeneratedValue(generator = "sequence")
	private Long id;
}
