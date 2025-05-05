package service;

import java.util.Collection;

import entity.Resource;
import repository.ResourceRepository;

public class ResourceService {
    private ResourceRepository resourceRepo = new ResourceRepository();

    public void addResource(Resource resource) {
        resourceRepo.addResource(resource);
    }

    public Collection<Resource> listResources() {
        return resourceRepo.getAllResources();
    }
}
