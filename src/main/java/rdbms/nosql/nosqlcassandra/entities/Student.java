package rdbms.nosql.nosqlcassandra.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Indexed;
import org.springframework.data.cassandra.core.mapping.SASI;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Table
public class Student {
    @Id
    private UUID id;
    @Indexed
    @SASI(indexMode = SASI.IndexMode.CONTAINS)
    @SASI.StandardAnalyzed
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String phone;

    public Student(UUID id, String fio, LocalDate birthday, String gender, String phone) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }
}
