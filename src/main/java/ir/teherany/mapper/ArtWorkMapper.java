package ir.teherany.mapper;


import ir.teherany.dto.ArtWorkDTO;
import ir.teherany.entity.Artwork;
import ir.teherany.mapper.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArtistMapper.class})
public interface ArtWorkMapper extends GenericMapper<Artwork, ArtWorkDTO> {
}
