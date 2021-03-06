package com.travel_agency.mapper;

import com.travel_agency.dto.ParticipantDTO;
import com.travel_agency.model.participant.Participant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

@Mapper
public interface ParticipantMapper {

    static ParticipantMapper INSTANCE = Mappers.getMapper(ParticipantMapper.class);

    ParticipantDTO participantDto(Participant participant);
    Participant dtoToParticipant(ParticipantDTO participantDto);

}
