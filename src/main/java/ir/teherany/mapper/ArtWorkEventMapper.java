package ir.teherany.mapper;


import ir.teherany.dto.ArtWorkEventDto;
import ir.teherany.entity.Event;
import ir.teherany.mapper.Generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArtWorkMapper.class, EventMapper.class})
public interface ArtWorkEventMapper extends GenericMapper<Event, ArtWorkEventDto> {
}
