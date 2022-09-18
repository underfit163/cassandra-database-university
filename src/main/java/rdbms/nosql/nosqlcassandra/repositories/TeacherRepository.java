package rdbms.nosql.nosqlcassandra.repositories;



import org.springframework.data.cassandra.repository.CassandraRepository;
import rdbms.nosql.nosqlcassandra.entities.Teacher;

import java.util.UUID;

public interface TeacherRepository extends CassandraRepository<Teacher, UUID> {
}
