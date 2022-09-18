package rdbms.nosql.nosqlcassandra.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import rdbms.nosql.nosqlcassandra.entities.Mark;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MarkRepository extends CassandraRepository<Mark, UUID> {
    Optional<List<Mark>> searchMarksByExam(UUID uuid);
    Optional<List<Mark>> findAllMarkByStudent(UUID uuid);
}
