package com.wf2311.wakatime.sync.repository;

import com.wf2311.wakatime.sync.entity.ProjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author <a href="mailto:wf2311@163.com">wf2311</a>
 * @since 2019-01-10 14:22.
 */
public interface ProjectRepository extends MongoRepository<ProjectEntity, String> {
}