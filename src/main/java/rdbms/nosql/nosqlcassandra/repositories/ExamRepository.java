package rdbms.nosql.nosqlcassandra.repositories;


import org.springframework.data.cassandra.repository.CassandraRepository;
import rdbms.nosql.nosqlcassandra.entities.Exam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ExamRepository extends CassandraRepository<Exam, UUID> {
    Optional<List<Exam>> searchExamsBySubject(UUID subject);
}
