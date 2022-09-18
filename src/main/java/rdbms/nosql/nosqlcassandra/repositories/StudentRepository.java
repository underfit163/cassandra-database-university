package rdbms.nosql.nosqlcassandra.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import rdbms.nosql.nosqlcassandra.entities.Student;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentRepository extends CassandraRepository<Student, UUID> {
    Optional<List<Student>> findStudentsByFioContaining(String fio);
}
