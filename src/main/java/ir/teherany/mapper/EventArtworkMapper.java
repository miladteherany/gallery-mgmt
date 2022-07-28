package ir.teherany.mapper;


import ir.teherany.dto.EventArtworkDTO;
import ir.teherany.entity.EventArtwork;
import ir.teherany.mapper.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EventArtwork.class, EventMapper.class})
public interface EventArtworkMapper extends GenericMapper<EventArtwork, EventArtworkDTO> {
}
