package com.br.vfbellaver.models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contrato.class)
public abstract class Contrato_ {

	public static volatile SingularAttribute<Contrato, Imovel> imovel;
	public static volatile SingularAttribute<Contrato, Date> dataEntrada;
	public static volatile SingularAttribute<Contrato, Date> dataContrato;
	public static volatile SingularAttribute<Contrato, ModeloContrato> contrato;
	public static volatile SingularAttribute<Contrato, Inquilino> inquilino;
	public static volatile SingularAttribute<Contrato, Integer> id;

}

