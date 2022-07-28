package ir.teherany.model.service.impl;

import ir.teherany.mapper.generic.GenericMapper;
import ir.teherany.model.repository.GenericRepo;
import ir.teherany.model.service.GenericService;

import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImpl<T, D, PK> implements GenericService<T, D, PK> {
    public abstract GenericRepo<T, PK> getRepository();

    public abstract GenericMapper<T, D> getMapper();

    @Override
    public void save(D dto) {
        getRepository().save(getMapper().toEntity(dto));
    }

    @Override
    public D findById(PK id) {
        Optional<T> byId = getRepository().findById(id);
        if (byId.isEmpty()) {
            throw new RuntimeException();
        }
        return getMapper().toDto(byId.get());
    }

    @Override
    public List<D> findAll() {
        return getMapper().toDtoList(getRepository().findAll());
    }
}
