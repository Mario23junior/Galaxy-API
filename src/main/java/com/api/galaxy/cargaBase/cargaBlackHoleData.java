package com.api.galaxy.cargaBase;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.BlackHoleDTO;
import com.api.galaxy.model.BlackHole;
import com.api.galaxy.repository.BlackHoleRepositpry;

@Service
public class cargaBlackHoleData {

	private ModelMapper mapper;
	private BlackHoleRepositpry blackHoleRepository;

	public cargaBlackHoleData(ModelMapper mapper, BlackHoleRepositpry blackHoleRepository) {
		super();
		this.mapper = mapper;
		this.blackHoleRepository = blackHoleRepository;
	}

	public void powerDataBlackHoleCarga() {

		BlackHole b1 = new BlackHole();
		b1.setNome("NGC 4424");
		b1.setOptico("https://chandra.harvard.edu/photo/2022/ngc4424/ngc4424_optical.jpg");
		b1.setRaioX("https://chandra.harvard.edu/photo/2022/ngc4424/ngc4424_xray.jpg");
		b1.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2022/ngc4424/ngc4424_inset.jpg");
		b1.setOpticoInfravermelho("https://www.researchgate.net/profile/Eduardo-Hardy/publication/40883461/figure/fig2/AS:340353707200513@1458158055117/Composite-BVR-WIYN-image-of-NGC-4424-The-galaxy-present-a-disturbed-stellar-disk-with.png");
		
		b1.setDescricao("A imagem principal tem cerca de 2,9 min de arco (45.100 anos-luz) de diâmetro. A imagem inserida tem cerca de 4,5 segundos de arco (1.160 anos-luz) de diâmetro.");
		b1.setRedshift(0.001461);
		b1.setConstelacao("Virgo");
		b1.setDeclinacao(" +09° 25´ 14.32");
		b1.setCoordenadas("RA 12h 27m 11.6s");
		b1.setEstimativaDistancia("53.6 Milhões");
		b1.setDimensoes("3,5' × 1,7'+");
		
		BlackHole b2 = new BlackHole();
		b2.setNome("H1821+243");
		b2.setOptico("https://chandra.harvard.edu/photo/2022/h1821/h1821_optical.jpg");
		b2.setRaioX("https://chandra.harvard.edu/photo/2022/h1821/h1821.jpg");
		b2.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2022/h1821/h1821_xray.jpg");
		b2.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2022/h1821/h1821_radio.jpg");
		
		b2.setDescricao("A imagem tem cerca de 6,4 min de arco (5,6 milhões de anos-luz) de diâmetro.");
		b2.setRedshift(0.2970);
		b2.setConstelacao("Draco");
		b2.setDeclinacao("+64° 20′ 36.226″");
		b2.setCoordenadas("18h 21m 57.40s");
		b2.setEstimativaDistancia("3.4 Bilhões");
		b2.setDimensoes("9 × 1014");
		
		
		BlackHole b3 = new BlackHole();
		b3.setNome("Sagittarius A");
		b3.setOptico("https://chandra.harvard.edu/photo/2022/sgra/sgra_xray_ir.jpg");
		b3.setRaioX("https://chandra.harvard.edu/photo/2022/sgra/sgra_ir.jpg");
		b3.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2022/sgra/sgra_xray.jpg");
		b3.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2022/sgra/sgra_radio.jpg");
		b3.setDescricao("A imagem principal tem cerca de 55 segundos de arco (7,0 anos-luz) de diâmetro; A imagem inserida tem cerca de 1,4 x 10 -4 segundos de arco (10 minutos-luz) de diâmetro.");
		b3.setRedshift(0.001461);
		b3.setConstelacao("Sagittarius");
		b3.setDeclinacao("	−29° 0′ 28.118″ ");
		b3.setCoordenadas("RA 17h 45m 40s");
		b3.setEstimativaDistancia("26 Milhões");
		b3.setDimensoes("23,5");
		
		BlackHole b4 = new BlackHole();
		b4.setNome("NGC 1385");
		b4.setOptico("https://chandra.harvard.edu/photo/2022/imbhs/imbhs_ngc1385.jpg");
		b4.setRaioX("https://chandra.harvard.edu/photo/2022/imbhs/imbhs_ngc3344.jpg");
		b4.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2022/imbhs/imbhs_ngc1566.jpg");
		b4.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2022/imbhs/imbhs_ngc6503_xray.jpg");
		
		b4.setDescricao("De acordo com um estudo publicado em 2009 e baseado na velocidade interna da galáxia medida pelo Telescópio Espacial Hubble , a massa do buraco negro supermassivo no centro de NGC 1358 seria entre 120 e 530 milhões . M _ {\\ odot}");
		b4.setRedshift(0.013436);
		b4.setConstelacao("Eridan");
		b4.setDeclinacao("-24° 30' 3.22");
		b4.setCoordenadas("RA 3h 37m 28.33s");
		b4.setEstimativaDistancia("43 Milhões");
		b4.setDimensoes("2,1 ′ × 1,4 ′ ");
		
		
		BlackHole b5 = new BlackHole();
		b5.setNome("J1140-2629");
		b5.setOptico("https://chandra.harvard.edu/photo/2022/spiderweb/spiderweb_optical.jpg");
		b5.setRaioX("https://chandra.harvard.edu/photo/2022/spiderweb/spiderweb_comp.jpg");
		b5.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2022/spiderweb/spiderweb_inset_comp.jpg");
		b5.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2022/spiderweb/spiderweb_inset_xray.jpg");
		b5.setDescricao("Os dados do Chandra revelam buracos negros em festa e crescentes em toda a teia cósmica que circunda uma galáxia central. Apelidado de \"Spiderweb\" por causa de sua aparência em imagens de luz óptica, J1140-2629 faz parte de um sistema maior que está evoluindo para um aglomerado de galáxias, uma das maiores estruturas do Universo.");
		b5.setRedshift(0.001461);
		b5.setConstelacao("Hydra");
		b5.setDeclinacao("-26° 29´ 09");
		b5.setCoordenadas("11h 40m 48.3s");
		b5.setEstimativaDistancia("10.6 Milhões");
		b5.setDimensoes("__");
		
		BlackHole b6 = new BlackHole();
		b6.setNome("RBS 797");
		b6.setRaioX("https://chandra.harvard.edu/photo/2021/rbs797/rbs797_optical.jpg");
		b6.setOptico("https://chandra.harvard.edu/photo/2021/rbs797/rbs797_radio.jpg");
		b6.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2021/rbs797/rbs797_radio_labeled.jpg");
		b6.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2021/rbs797/rbs797_xray.jpg");
		b6.setDescricao("RBS 797 is a galaxy cluster located about 3.9 billion light years from Earth. Four enormous cavities, or bubbles, have been found at the center of the RBS 797 galaxy cluster using Chandra. Hot gas that envelopes the individual galaxies is invisible in optical light, but it is detected in X-rays by Chandra. ");
		b6.setRedshift(0.00354);
		b6.setConstelacao("Draco");
		b6.setDeclinacao("3.9 Milhões");
		b6.setCoordenadas("47 12.9 +76 23 13");
		b6.setEstimativaDistancia("3.9 Bilhões");
		b6.setDimensoes("__");
		
		BlackHole b7 = new BlackHole();
		b7.setNome("PJ352-15");
		b7.setRaioX("https://chandra.harvard.edu/photo/2021/jet/jet_xray.jpg");
		b7.setOptico("https://chandra.harvard.edu/photo/2021/jet/jet_illus.jpg");
		b7.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2021/jet/jet_xray_crop.jpg");
		b7.setOpticoInfravermelho("https://www.researchgate.net/profile/Roberto-Decarli/publication/351353244/figure/fig1/AS:1020267979624449@1620262250732/Multiwavelength-observations-of-the-area-around-PJ352-15-showing-the-broad-X-rays.png");
		
		b7.setDescricao("Os dados do Chandra podem ter revelado o buraco negro supermassivo mais distante conhecido com um jato de raios-X. A fonte deste jato é um quasar (um buraco negro que cresce rapidamente) no centro de uma jovem galáxia a cerca de 12,7 bilhões de anos-luz da Terra. ");
		b7.setRedshift(0.05831);
		b7.setConstelacao("Aquarius");
		b7.setDeclinacao("-15° 20´ 14.28");
		b7.setCoordenadas("-15° 20´ 14,28");
		b7.setEstimativaDistancia("12.7 Bilhões");
		b7.setDimensoes("__");
		
		BlackHole b8 = new BlackHole();
		b8.setNome("Sgr A,L");
		b8.setRaioX("https://chandra.harvard.edu/photo/2021/sgrae/sgrae.jpg");
		b8.setOptico("https://chandra.harvard.edu/photo/2021/sgrae/sgrae_xray.jpg");
		b8.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2021/sgrae/sgrae_radio.jpg");
		b8.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2021/sgrae/sgrae_full_xray.jpg");
		
		b8.setDescricao("Essas imagens mostrando dados de raios-X do Chandra e emissão de rádio do Very Large Array contém a primeira evidência de um tipo raro de supernova na Via Láctea. Ao analisar mais de 35 dias de observações do Chandra, os pesquisadores encontraram um padrão incomum de elementos como ferro e níquel nos detritos estelares.");
		b8.setRedshift(0.00031);
		b8.setConstelacao("Sagitário");
		b8.setDeclinacao("−29 ° 04 ′ 36,43 ″");
		b8.setCoordenadas("17h  45m  41,131s");
		b8.setEstimativaDistancia("25.600 Milhões");
		b8.setDimensoes("");
		
		BlackHole b9 = new BlackHole();
		b9.setNome("J1027.0+1749");
		b9.setRaioX("https://chandra.harvard.edu/photo/2021/dualagn/dualagn_j1027_comp.jpg");
		b9.setOptico("https://chandra.harvard.edu/photo/2021/dualagn/dualagn_j1027_xray.jpg");
		b9.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2021/dualagn/dualagn_j1027_optical.jpg");
		b9.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2021/dualagn/dualagn_j1027_optical.jpg");
		
		b9.setDescricao("Esses quatro objetos vêm de um estudo de sete fusões de galáxias triplas. Usando o Chandra e outros telescópios, os astrônomos determinaram o que aconteceu com os buracos negros supermassivos nos centros das galáxias após a colisão de três galáxias.");
		b9.setRedshift(0.0);
		b9.setConstelacao("Leo");
		b9.setDeclinacao("21° 53' 08.08");
		b9.setCoordenadas("10h 27m 00.5s");
		b9.setEstimativaDistancia("890 Milhões ");
		b9.setDimensoes("__");
		
		BlackHole b10 = new BlackHole();
		b10.setNome("Abell 2261");
		b10.setRaioX("https://chandra.harvard.edu/photo/2020/a2261/a2261.jpg");
		b10.setOptico("https://chandra.harvard.edu/photo/2020/a2261/a2261_xray.jpg");
		b10.setRaioXInfravermelho("https://chandra.harvard.edu/photo/2020/a2261/a2261_optical_ir.jpg");
		b10.setOpticoInfravermelho("https://chandra.harvard.edu/photo/2020/a2261/a2261_opt_radio_closeup.jpg");
		
		b10.setDescricao("Essas imagens de Abell 2261 contêm dados de raios-X do Chandra mostrando gás quente que permeia o aglomerado, bem como dados ópticos do Hubble e do Telescópio Subaru que mostram galáxias no aglomerado e no fundo. Os astrônomos usaram esses telescópios para procurar na galáxia no centro da imagem evidências de um buraco negro, pesando entre 3 e 100 bilhões de vezes o Sol, que se espera que esteja lá. ");
		b10.setRedshift(0.2233);
		b10.setConstelacao("Hercules");
		b10.setDeclinacao("17h 22m 28.3s");
		b10.setCoordenadas("+32° 09´ 13");
		b10.setEstimativaDistancia("2.7 bilhões");
		b10.setDimensoes(""); 
//		
//		BlackHole b11 = new BlackHole();
//		b11.setNome("");
//		b11.setRaioX("");
//		b11.setOptico("");
//		b11.setRaioXInfravermelho("");
//		b11.setOpticoInfravermelho("");
//		b11.setDescricao("");
//		b11.setRedshift(0.001461);
//		b11.setConstelacao("");
//		b11.setDeclinacao("");
//		b11.setCoordenadas("");
//		b11.setEstimativaDistancia(0.0);
//		b11.setDimensoes("");
//		
//		BlackHole b12 = new BlackHole();
//		b12.setNome("");
//		b12.setRaioX("");
//		b12.setOptico("");
//		b12.setRaioXInfravermelho("");
//		b12.setOpticoInfravermelho("");
//		b12.setDescricao("");
//		b12.setRedshift(0.001461);
//		b12.setConstelacao("");
//		b12.setDeclinacao("");
//		b12.setCoordenadas("");
//		b12.setEstimativaDistancia(0.0);
//		b12.setDimensoes("");
//		
//		 BlackHole b13 = new BlackHole();
//		 b13.setNome("");
//		 b13.setRaioX("");
//		 b13.setOptico("");
//		 b13.setRaioXInfravermelho("");
//		 b13.setOpticoInfravermelho("");
//		 b13.setDescricao("");
//		 b13.setRedshift(0.001461);
//		 b13.setConstelacao("");
//		 b13.setDeclinacao("");
//		 b13.setCoordenadas("");
//		 b13.setEstimativaDistancia(0.0);
//		 b13.setDimensoes("");
//		 
//		 BlackHole b14 = new BlackHole();
//		 b14.setNome("");
//		 b14.setRaioX("");
//		 b14.setOptico("");
//		 b14.setRaioXInfravermelho("");
//		 b14.setOpticoInfravermelho("");
//		 b14.setDescricao("");
//		 b14.setRedshift(0.001461);
//		 b14.setConstelacao("");
//		 b14.setDeclinacao("");
//		 b14.setCoordenadas("");
//		 b14.setEstimativaDistancia(0.0);
//		 b14.setDimensoes("");
//		 
//		 BlackHole b15 = new BlackHole();
//		 b15.setNome("");
//		 b15.setRaioX("");
//		 b15.setOptico("");
//		 b15.setRaioXInfravermelho("");
//		 b15.setOpticoInfravermelho("");
//		 b15.setDescricao("");
//		 b15.setRedshift(0.001461);
//		 b15.setConstelacao("");
//		 b15.setDeclinacao("");
//		 b15.setCoordenadas("");
//		 b15.setEstimativaDistancia(0.0);
//		 b15.setDimensoes("");
//		 
//		 BlackHole b16 = new BlackHole();
//		 b16.setNome("");
//		 b16.setRaioX("");
//		 b16.setOptico("");
//		 b16.setRaioXInfravermelho("");
//		 b16.setOpticoInfravermelho("");
//		 b16.setDescricao("");
//		 b16.setRedshift(0.001461);
//		 b16.setConstelacao("");
//		 b16.setDeclinacao("");
//		 b16.setCoordenadas("");
//		 b16.setEstimativaDistancia(0.0);
//		 b16.setDimensoes("");
//		 
//		 BlackHole b17 = new BlackHole();
//		 b17.setNome("");
//		 b17.setRaioX("");
//		 b17.setOptico("");
//		 b17.setRaioXInfravermelho("");
//		 b17.setOpticoInfravermelho("");
//		 b17.setDescricao("");
//		 b17.setRedshift(0.001461);
//		 b17.setConstelacao("");
//		 b17.setDeclinacao("");
//		 b17.setCoordenadas("");
//		 b17.setEstimativaDistancia(0.0);
//		 b17.setDimensoes("");
//		 
//		 BlackHole b18 = new BlackHole();
//		 b18.setNome("");
//		 b18.setRaioX("");
//		 b18.setOptico("");
//		 b18.setRaioXInfravermelho("");
//		 b18.setOpticoInfravermelho("");
//		 b18.setDescricao("");
//		 b18.setRedshift(0.001461);
//		 b18.setConstelacao("");
//		 b18.setDeclinacao("");
//		 b18.setCoordenadas("");
//		 b18.setEstimativaDistancia(0.0);
//		 b18.setDimensoes(""); 
//		 
//		 BlackHole b19 = new BlackHole();
//		 b19.setNome("");
//		 b19.setRaioX("");
//		 b19.setOptico("");
//		 b19.setRaioXInfravermelho("");
//		 b19.setOpticoInfravermelho("");
//		 b19.setDescricao("");
//		 b19.setRedshift(0.001461);
//		 b19.setConstelacao("");
//		 b19.setDeclinacao("");
//		 b19.setCoordenadas("");
//		 b19.setEstimativaDistancia(0.0);
//		 b19.setDimensoes(""); 
//		 
//		 BlackHole b20 = new BlackHole();
//		 b20.setNome("");
//		 b20.setRaioX("");
//		 b20.setOptico("");
//		 b20.setRaioXInfravermelho("");
//		 b20.setOpticoInfravermelho("");
//		 b20.setDescricao("");
//		 b20.setRedshift(0.001461);
//		 b20.setConstelacao("");
//		 b20.setDeclinacao("");
//		 b20.setCoordenadas("");
//		 b20.setEstimativaDistancia(0.0);
//		 b20.setDimensoes("");
		
		BlackHoleDTO b1Dto = mapper.map(b1, BlackHoleDTO.class);
		BlackHoleDTO b2Dto = mapper.map(b2, BlackHoleDTO.class);
		BlackHoleDTO b3Dto = mapper.map(b3, BlackHoleDTO.class);
		BlackHoleDTO b4Dto = mapper.map(b4, BlackHoleDTO.class);
		BlackHoleDTO b5Dto = mapper.map(b5, BlackHoleDTO.class);
		BlackHoleDTO b6Dto = mapper.map(b6, BlackHoleDTO.class);
		BlackHoleDTO b7Dto = mapper.map(b7, BlackHoleDTO.class);
		BlackHoleDTO b8Dto = mapper.map(b8, BlackHoleDTO.class);
		BlackHoleDTO b9Dto = mapper.map(b9, BlackHoleDTO.class);
		BlackHoleDTO b10Dto = mapper.map(b10, BlackHoleDTO.class);


		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b1Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b2Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b3Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b4Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b5Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b6Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b7Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b8Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b9Dto, BlackHole.class)));
		blackHoleRepository.saveAll(Arrays.asList(mapper.map(b10Dto, BlackHole.class)));

	}

}
