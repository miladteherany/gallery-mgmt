package ir.teherany.mapper;


import ir.teherany.dto.ArtWorkDto;
import ir.teherany.entity.Artwork;
import ir.teherany.mapper.Generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ArtistMapper.class})
public interface ArtWorkMapper extends GenericMapper<Artwork, ArtWorkDto> {
}
