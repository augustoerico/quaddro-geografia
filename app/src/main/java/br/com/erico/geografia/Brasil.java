package br.com.erico.geografia;

public enum Brasil
{
    //-----------------------------------------------------------
    //Valores para o ENUM Brasil
    //-----------------------------------------------------------
	DF("Distrito Federal"	,"Brasília"			,"26"	,"CENTRO-OESTE"),
	GO("Goiás"				,"Goiânia"			,"246"	,"CENTRO-OESTE"),
	MS("Mato Grosso do Sul"	,"Campo Grande"		,"78"	,"CENTRO-OESTE"),
	MT("Mato Grosso"		,"Cuiabá"			,"141"	,"CENTRO-OESTE"),
	AL("Alagoas"			,"Maceió"			,"102"	,"NORDESTE"),
	BA("Bahia"				,"Salvador"			,"417"	,"NORDESTE"),
	CE("Ceará"				,"Fortaleza"		,"184"	,"NORDESTE"),
	MA("Maranhão"			,"São Luís"			,"217"	,"NORDESTE"),
	PB("Paraíba"			,"João Pessoa"		,"223"	,"NORDESTE"),
	PE("Pernambuco"			,"Recife"			,"185"	,"NORDESTE"),
	PI("Piauí"				,"Teresina"			,"223"	,"NORDESTE"),
	RN("Rio Grande do Norte","Natal"			,"167"	,"NORDESTE"),
	SE("Sergipe"			,"Aracajú"			,"75"	,"NORDESTE"),
	AC("Acre"				,"Rio Branco"		,"22"	,"NORTE"),
	AM("Amazonas"			,"Manaus"			,"62"	,"NORTE"),
	AP("Amapá"				,"Macapá"			,"16"	,"NORTE"),
	PA("Pará"				,"Belém"			,"143"	,"NORTE"),
	RO("Rondônia"			,"Porto Velho"		,"52"	,"NORTE"),
	RR("Roraima"			,"Boa Vista"		,"15"	,"NORTE"),
	TO("Tocantins"			,"Palmas"			,"139"	,"NORTE"),
	ES("Espírito Santo"		,"Vitória"			,"78"	,"SUDESTE"),
	MG("Minas Gerais"		,"Belo Horizonte"	,"853"	,"SUDESTE"),
	RJ("Rio de Janeiro"		,"Rio de Janeiro"	,"92"	,"SUDESTE"),
	SP("São Paulo"			,"São Paulo"		,"645"	,"SUDESTE"),
	PR("Paraná"				,"Curitiba"			,"399"	,"SUL"),
	RS("Rio Grande do Sul"	,"Porto Alegre"		,"496"	,"SUL"),
	SC("Santa Catarina"		,"Florianopólis"	,"293"	,"SUL");
    //-----------------------------------------------------------
	private final String estado;
	private final String capital;
	private final String total_cidades;
	private final String regiao;
    //-----------------------------------------------------------
	Brasil(String estado,String capital,String total_cidades,String regiao)
	{
		this.estado  		= estado;
		this.capital 		= capital;
		this.total_cidades 	= total_cidades;
		this.regiao 		= regiao;
	}
    //-----------------------------------------------------------
    public String capturarDetalhe()
    {
    	String retorno = "";
    	
    	retorno+="UF: " + this;
    	retorno+="\n\nESTADO..: " + estado;
    	retorno+="\n\nCAPITAL.: " + capital;
    	retorno+="\n\nTOTAL...: " + total_cidades;
    	retorno+="\n\nREGIÃO..: " + regiao;
    	
    	return retorno;
    }
    //-----------------------------------------------------------
	public String getEstado() {
		return estado;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public String getTotal_cidades() {
		return total_cidades;
	}
	
	public String getRegiao() {
		return regiao;
	}
    //-----------------------------------------------------------
}