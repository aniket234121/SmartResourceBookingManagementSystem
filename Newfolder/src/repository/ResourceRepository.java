package repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Resource;

public class ResourceRepository {
    private Map<String, Resource> resources = new HashMap<>();

    public void addResource(Resource resource) {
        resources.put(resource.getId(), resource);
    }

    public Resource getResource(String id) {
        return resources.get(id);
    }

    public Collection<Resource> getAllResources() {
        return resources.values();
    }
}