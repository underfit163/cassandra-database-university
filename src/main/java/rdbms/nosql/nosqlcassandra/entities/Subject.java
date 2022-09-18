package rdbms.nosql.nosqlcassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@Table
public class Subject implements Serializable {
    @Id
    private UUID id;
    @Indexed
    private String subjectname;

}
