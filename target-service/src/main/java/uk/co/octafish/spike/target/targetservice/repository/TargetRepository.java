package uk.co.octafish.spike.target.targetservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.co.octafish.spike.target.targetservice.domain.Target;

@RepositoryRestResource
public interface TargetRepository extends MongoRepository<Target, String> {


}
