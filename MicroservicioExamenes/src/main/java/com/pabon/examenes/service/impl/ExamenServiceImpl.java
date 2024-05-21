package com.pabon.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.pabon.common.usuario.models.entity.Examen;
import com.pabon.commons.service.CommonService;
import com.pabon.commons.service.CommonServiceImpl;
import com.pabon.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {

}
