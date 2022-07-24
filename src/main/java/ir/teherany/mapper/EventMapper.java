package ir.teherany.mapper;


import ir.teherany.dto.EventDto;
import ir.teherany.entity.Event;
import ir.teherany.mapper.Generic.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper extends GenericMapper<Event, EventDto> {
    @Override
    @Mapping(source = "eventDate", target = "eventDate", qualifiedByName = "eventDateTimestampToDates")
    Event toEntity(EventDto eventDto);

    @Override
    @Mapping(source = "eventDate", target = "eventDate", qualifiedByName = "eventDateToTimestamps")
    EventDto toDto(Event event);

    @Override
    List<Event> toEntityList(List<EventDto> eventDtoList);

    @Override
    List<EventDto> toDtoList(List<Event> eventList);

    @Named("eventDateTimestampToDates")
    default Date toDate(Long timestamp) {
        if (timestamp != null)
            return new Date(timestamp);
        else
            return null;
    }

    @Named("eventDateToTimestamps")
    default Long toTimestamps(Date date) {
        if (date != null)
            return date.getTime();
        else
            return null;
    }
}
