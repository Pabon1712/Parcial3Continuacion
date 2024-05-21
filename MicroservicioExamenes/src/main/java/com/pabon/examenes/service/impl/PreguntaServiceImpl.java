package com.pabon.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.pabon.common.usuario.models.entity.Pregunta;
import com.pabon.commons.service.CommonService;
import com.pabon.commons.service.CommonServiceImpl;
import com.pabon.examenes.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {

}
