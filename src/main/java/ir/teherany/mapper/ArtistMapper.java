package ir.teherany.mapper;


import ir.teherany.dto.ArtistDTO;
import ir.teherany.entity.Artist;
import ir.teherany.mapper.generic.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArtistMapper extends GenericMapper<Artist, ArtistDTO> {
}
