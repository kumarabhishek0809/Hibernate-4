package com.concretepage.persistence.generation.startegy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "tableIdentifier")
public class TableSequenceIdentifier {
 
    @Id
    @GenericGenerator(
        name = "table", 
        strategy = "enhanced-table", 
        parameters = {
            @org.hibernate.annotations.Parameter(
                name = "table_name", 
                value = "sequence_table"
            )
    })
    @GeneratedValue(generator = "table", strategy=GenerationType.TABLE)
    private Long id;
}   
