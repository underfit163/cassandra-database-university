package rdbms.nosql.nosqlcassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@Table
public class Mark {
    @PrimaryKey
    private UUID id;
    private String evaluation;
    private LocalDate passdate;
    @Indexed
    private UUID student;
    @Indexed
    private UUID exam;

}
