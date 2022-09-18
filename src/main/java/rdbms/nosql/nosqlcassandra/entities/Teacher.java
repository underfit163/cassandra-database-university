package rdbms.nosql.nosqlcassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@Table
public class Teacher implements Serializable {
    @Id
    private UUID id;
    @Indexed
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String title;
    private String teacherdegree;
    private String phone;
}
