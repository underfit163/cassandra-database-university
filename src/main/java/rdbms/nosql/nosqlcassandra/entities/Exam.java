package rdbms.nosql.nosqlcassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@Table
public class Exam {
    @PrimaryKey
    private UUID id;
    private String passtype;
    private Integer totalhours;
    private Integer semester;
    @Indexed
    private UUID subject;
    @Indexed
    private UUID teacher;

}
