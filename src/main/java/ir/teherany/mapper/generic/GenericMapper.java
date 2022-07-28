package ir.teherany.mapper.generic;

import java.util.List;

public interface GenericMapper<T , D > {
    T toEntity(D dto);
    D toDto(T entity);
    List<T> toEntityList(List<D> dtoList);
    List<D> toDtoList(List<T> entityList);
}
