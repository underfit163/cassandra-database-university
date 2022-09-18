package rdbms.nosql.nosqlcassandra.repositories;

import org.springframework.data.cassandra.repository.CassandraRepository;
import rdbms.nosql.nosqlcassandra.entities.Subject;

import java.util.UUID;

public interface SubjectRepository extends CassandraRepository<Subject, UUID> {
}
