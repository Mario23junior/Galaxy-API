package com.api.galaxy.cargaBase;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.api.galaxy.dto.GalaxyDTO;
import com.api.galaxy.model.Galaxy;
import com.api.galaxy.repository.GalaxyRepository;

@Service
public class cargaService {

	private GalaxyRepository repository;
	private ModelMapper mapper;

	public cargaService(GalaxyRepository repository, ModelMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}

	public void powerDataBase() {

		  Galaxy g1 = new Galaxy();
			g1.setId(1l);
			g1.setNome("Andromeda");
			g1.setUrlImg("https://i.pinimg.com/originals/65/10/90/651090e75255e0b95904305b77b3b73c.gif");
			g1.setConstelacao("Andrômeda");
			g1.setMassa(1.1012);
			g1.setRaio(110.0);
			g1.setRotacao(240.000);
			g1.setCoordenadas("RA 00h 42m 44s | Dez +41° 16' 09");
			g1.setDeclinacao("+41° 16′ 9″");
			g1.setDescricao(
					"A galáxia de Andrômeda (Messier 31, NGC 224) é uma galáxia espiral localizada a cerca de 2,54 milhões de anos-luz de distância da Terra, na direção da constelação de Andrômeda.");
			g1.setDesvioVermelho("−0,001");
			g1.setEstrelas(1);
			g1.setIdadeEstimada(10011010);
			g1.setMagnitude(3.81);
			g1.setDistancia("2.537.000");
			g1.setDimensoes(220.000);

			Galaxy g2 = new Galaxy();
			g2.setId(2l);
			g2.setNome("Canis Major Dwarf");
			g2.setUrlImg("https://s4.gifyu.com/images/videoplayback93018faf493ab518.gif");
			g2.setConstelacao("Canis Major");
			g2.setMassa(17.8);
			g2.setRaio(987.890000);
			g2.setRotacao(3.0);
			g2.setCoordenadas("7h 12m 35s");
			g2.setDeclinacao("-27° 40′ 00″");
			g2.setDescricao(
					"Canis Major é uma constelação no hemisfério celeste sul . No século II, foi incluído nas 48 constelações de Ptolomeu e é contado entre as 88 constelações modernas.");
			g2.setDesvioVermelho("4.892");
			g2.setEstrelas(1);
			g2.setIdadeEstimada(25000);
			g2.setMagnitude(-9.4);
			g2.setDistancia("∼25.100");
			g2.setDimensoes(720.000);

			Galaxy g3 = new Galaxy();
			g3.setId(3l);
			g3.setNome("Sagittarius Elliptical Dwarf");
			g3.setUrlImg("https://www.science.org/do/10.1126/science.abf1744/full/galaxy_1280p.jpg");
			g3.setConstelacao("Sagittarius");
			g3.setMassa(1.5108);
			g3.setRaio(5.000);
			g3.setRotacao(0.0);
			g3.setCoordenadas("= 05,61 b = −14,09");
			g3.setDeclinacao("-30° 32′ 43″");
			g3.setDescricao(
					"A Galáxia Anã Elíptica de Sagitário situa-se a cerca de 50.000 anos-luz de nós, e a cerca de 70.000 anos-luz do centro da Via Láctea, deslocando-se ao redor da nossa galáxia num órbita polar.");
			g3.setDesvioVermelho("140");
			g3.setEstrelas(1);
			g3.setIdadeEstimada(70000);
			g3.setMagnitude(4.5);
			g3.setDistancia("80000");
			g3.setDimensoes(93.10000);

			Galaxy g4 = new Galaxy();
			g4.setId(4l);
			g4.setNome("Ursa Major II Dwarf");
			g4.setUrlImg("https://apod.nasa.gov/apod/image/0704/m81deep_hallas.jpg");
			g4.setConstelacao("Ursa Maior");
			g4.setMassa(0.0);
			g4.setRaio(0.0);
			g4.setRotacao(0.0);
			g4.setCoordenadas("15h 09m 08, 5s");
			g4.setDeclinacao("+63° 07′ 48″");
			g4.setDescricao(
					"Trata-se de uma pequena galáxia anã com tamanho projetado de 250x125 pc. A magnitude absoluta do objeto é apenas -3,8, o que significa que é menos luminosa do que algumas estrelas, como Canopus na Via Láctea.");
			g4.setDesvioVermelho("-247");
			g4.setEstrelas(2);
			g4.setIdadeEstimada(0000);
			g4.setMagnitude(14.3);
			g4.setDistancia("0,098");
			g4.setDimensoes(1.800);

			Galaxy g5 = new Galaxy();
			g5.setId(5l);
			g5.setNome("black eye");
			g5.setUrlImg(
					"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/black-eye-galaxy-print.jpg?itok=SCrP4eMa");
			g5.setConstelacao("Coma Berenices");
			g5.setMassa(0.0);
			g5.setRaio(26.481);
			g5.setRotacao(0.0);
			g5.setCoordenadas("12h 56m 44s | Declinação +21° 40′ 58″");
			g5.setDeclinacao("+ 21 ° 40 ′ 57,57 ″");
			g5.setDescricao(
					"A Black Eye Galaxy (também chamada de Evil Eye Galaxy e designada Messier 64 , M64 ou NGC 4826 ) é uma galáxia espiral relativamente isolada a 17 milhões de anos-luz de distância, na constelação moderadamente setentrional de Coma Berenices.");
			g5.setDesvioVermelho("013");
			g5.setEstrelas(2);
			g5.setIdadeEstimada(13281010);
			g5.setMagnitude(8.52);
			g5.setDistancia("24.010.000");
			g5.setDimensoes(10.715128);

			Galaxy g6 = new Galaxy();
			g6.setId(6l);
			g6.setNome("M81");
			g6.setUrlImg("https://www.nasa.gov/sites/default/files/m81.jpg");
			g6.setConstelacao("Ursa Maior");
			g6.setMassa(0.0);
			g6.setRaio(84.46);
			g6.setRotacao(0.0);
			g6.setCoordenadas("9h 55m 33s | Declinação +69° 3′ 55″");
			g6.setDeclinacao("+69° 3' 55,1");
			g6.setDescricao(
					"Galáxia de Bode (também conhecida como NGC 3031, M81 ou Messier 81) é uma galáxia espiral localizada a cerca de doze milhões de anos-luz (aproximadamente 3,679 megaparsecs) de distância na direção da constelação de Ursa Maior.");
			g6.setDesvioVermelho("-0.0113 ± 0,013");
			g6.setEstrelas(250);
			g6.setIdadeEstimada(13311010);
			g6.setMagnitude(6.9);
			g6.setDistancia("12");
			g6.setDimensoes(2413.2);

			Galaxy g7 = new Galaxy();
			g7.setId(7l);
			g7.setNome("Large Magellanic Cloud");
			g7.setUrlImg("https://cdn.spacetelescope.org/archives/images/wallpaper5/heic0411d.jpg");
			g7.setConstelacao("Mensa");
			g7.setMassa(10.0);
			g7.setRaio(0.0);
			g7.setRotacao(0.0);
			g7.setCoordenadas("5 25 10.58, -70° 4' 22.75\"");
			g7.setDeclinacao("-69° 45′ 22″");
			g7.setDescricao(
					"Grande Nuvem de Magalhães é uma galáxia anã satélite que orbita a Via Láctea. O seu diâmetro é vinte vezes menor do que o da Via Láctea e o seu número de estrelas dez vezes menor.");
			g7.setDesvioVermelho("000");
			g7.setEstrelas(30);
			g7.setIdadeEstimada(1101109);
			g7.setMagnitude(1.0);
			g7.setDistancia("75");
			g7.setDimensoes(0.0);

			Galaxy g8 = new Galaxy();
			g8.setId(8l);
			g8.setNome("Galáxia Cartwheel");
			g8.setUrlImg(
					"https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Cartwheel_Galaxy.jpg/800px-Cartwheel_Galaxy.jpg");
			g8.setConstelacao("Sculptor");
			g8.setMassa(3.85);
			g8.setRaio(65.000);
			g8.setRotacao(217.0);
			g8.setCoordenadas("0h 37m 41s | Declinação -33° 42′ 59″");
			g8.setDeclinacao("-33° 42′ 59");
			g8.setDescricao(
					"A galáxia Cartwheel é uma galáxia anular situada a cerca de 500 milhões de anos-luz da constelação do Escultor, no Hemisfério sul.");
			g8.setDesvioVermelho("9050 ± 3");
			g8.setEstrelas(2);
			g8.setIdadeEstimada(200);
			g8.setMagnitude(1.0);
			g8.setDistancia("500");
			g8.setDimensoes(1.109);

			Galaxy g9 = new Galaxy();
			g9.setId(9l);
			g9.setNome("Messier 82");
			g9.setUrlImg(
					"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m82.jpg?itok=vhoNInCP");
			g9.setConstelacao("Ursa Maior");
			g9.setMassa(50.0);
			g9.setRaio(18.500);
			g9.setRotacao(0.0);
			g9.setCoordenadas("9h 55m 52s");
			g9.setDeclinacao("+69° 40′ 47″");
			g9.setDescricao(
					"Messier 82 é uma galáxia irregular localizada a cerca de doze milhões de anos-luz de distância na direção da constelação de Ursa Maior.");
			g9.setDesvioVermelho("203±4");
			g9.setEstrelas(30);
			g9.setIdadeEstimada(0000);
			g9.setMagnitude(8.41);
			g9.setDistancia("11.420.000");
			g9.setDimensoes(11.243);

			Galaxy g10 = new Galaxy();
			g10.setId(10l);
			g10.setNome("Comet Galaxy");
			g10.setUrlImg(
					"https://www.esa.int/var/esa/storage/images/esa_multimedia/images/2007/03/zooming_and_panning_on_galaxy_cluster_abell_2667/10031194-3-eng-GB/Zooming_and_panning_on_galaxy_cluster_Abell_2667_pillars.jpg");
			g10.setConstelacao("Canes Venatici");
			g10.setMassa(3.8108);
			g10.setRaio(0.0);
			g10.setRotacao(0.0);
			g10.setCoordenadas("J235144.03-260359.6");
			g10.setDeclinacao("−26° 03′ 59.6″");
			g10.setDescricao(
					"A galáxia de Сomet está sendo rasgada em pedaços, movendo-se através de um aglomerado a velocidades superiores a 2 milhões de mph. ");
			g10.setDesvioVermelho("0.2265");
			g10.setEstrelas(2);
			g10.setIdadeEstimada(300);
			g10.setMagnitude(1.0);
			g10.setDistancia("3.2");
			g10.setDimensoes(600.000);

			Galaxy g11 = new Galaxy();
			g11.setId(11l);
			g11.setNome("Messier 82");
			g11.setUrlImg(
					"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/m82.jpg?itok=vhoNInCP");
			g11.setConstelacao("Ursa Maior");
			g11.setMassa(50.0);
			g11.setRaio(18.500);
			g11.setRotacao(0.0);
			g11.setCoordenadas("9h 55m 52s");
			g11.setDeclinacao("+69° 40′ 47″");
			g11.setDescricao(
					"Messier 82 é uma galáxia irregular localizada a cerca de doze milhões de anos-luz de distância na direção da constelação de Ursa Maior.");
			g11.setDesvioVermelho("203±4");
			g11.setEstrelas(30);
			g11.setIdadeEstimada(1323);
			g11.setMagnitude(8.41);
			g11.setDistancia("11.420");
			g11.setDimensoes(11.243);

			Galaxy g12 = new Galaxy();
			g12.setId(12l);
			g12.setNome("Objeto de Hoag");
			g12.setUrlImg("https://t.ctcdn.com.br/AxeeygVNj1_bXbFq3QQUx0AsDhI=/1024x0/smart/i367012.jpeg");
			g12.setConstelacao("Serpens");
			g12.setMassa(0.0);
			g12.setRaio(60.500);
			g12.setRotacao(0.0);
			g12.setCoordenadas("15h 17m 14s");
			g12.setDeclinacao(" +21° 35′ 8″");
			g12.setDescricao(
					"Art Hoag julgou que a estrutura anelar deste objeto se assemelhava a uma nebulosa planetária, os restos brilhantes de uma estrela como o nosso Sol. ");
			g12.setDesvioVermelho("000");
			g12.setEstrelas(8);
			g12.setIdadeEstimada(12751010);
			g12.setMagnitude(1.0);
			g12.setDistancia("000");
			g12.setDimensoes(100.0);

			Galaxy g13 = new Galaxy();
			g13.setId(13l);
			g13.setNome("M33");
			g13.setUrlImg(
					"https://www.nasa.gov/sites/default/files/styles/full_width/public/thumbnails/image/heic1901a.jpg?itok=YLJUZyay");
			g13.setConstelacao("Triangulum");
			g13.setMassa(5.1010);
			g13.setRaio(30.000);
			g13.setRotacao(-179.3);
			g13.setCoordenadas("01h 33m 50,02s");
			g13.setDeclinacao("+30° 39′ 37″");
			g13.setDescricao(
					"A pequena constelação do norte de Triangulum abriga esta magnífica galáxia espiral frontal, M33. Seus nomes populares incluem a Galáxia Pinwheel ou apenas a Galáxia Triangulum . ");
			g13.setDesvioVermelho("	-0,0607 ± 0,010");
			g13.setEstrelas(40);
			g13.setIdadeEstimada(1123);
			g13.setMagnitude(5.72);
			g13.setDistancia("000");
			g13.setDimensoes(70.80410700);

			Galaxy g14 = new Galaxy();
			g14.setId(14l);
			g14.setNome("Centaurus A");
			g14.setUrlImg(
					"https://wikiimg.tojsiabtv.com/wikipedia/commons/thumb/d/d2/ESO_Centaurus_A_LABOCA.jpg/1200px-ESO_Centaurus_A_LABOCA.jpg");
			g14.setConstelacao("Centaurus");
			g14.setMassa(1.000);
			g14.setRaio(48.500);
			g14.setRotacao(2.5);
			g14.setCoordenadas("13h 25m 28s");
			g14.setDeclinacao("-43° 1′ 9″");
			g14.setDescricao(
					"A Galáxia Centaurus A (NGC 5128) é uma galáxia lenticular situada na direção da constelação de Centaurus, a cerca de 14 milhões de anos-luz de distância");
			g14.setDesvioVermelho("13,58");
			g14.setEstrelas(1);
			g14.setIdadeEstimada(13271010);
			g14.setMagnitude(6.84);
			g14.setDistancia("13.050.000");
			g14.setDimensoes(25.7200);

			Galaxy g15 = new Galaxy();
			g15.setId(15l);
			g15.setNome("M83");
			g15.setUrlImg("https://spacetoday.com.br/wp-content/uploads/2015/10/gendlerM83-New-HST-ESO-LL-1024x833.jpg");
			g15.setConstelacao("Hydra");
			g15.setMassa(0.0);
			g15.setRaio(27.750);
			g15.setRotacao(0.0);
			g15.setCoordenadas("13h 37m, Dec= -29° 52´");
			g15.setDeclinacao("-44° 58′");
			g15.setDescricao(
					"O Grupo Centaurus A/M83 é um complexo grupo de galáxias nas constelações de Hydra, Centaurus e Virgo. O grupo é divido internamente em dois subgrupos.");
			g15.setDesvioVermelho("");
			g15.setEstrelas(40);
			g15.setIdadeEstimada(13271010);
			g15.setMagnitude(-21.47);
			g15.setDistancia("15.040.000");
			g15.setDimensoes(13.340148);

			Galaxy g16 = new Galaxy();
			g16.setId(16l);
			g16.setNome("Sombrero galaxy");
			g16.setUrlImg("https://cdn.spacetelescope.org/archives/images/wallpaper1/opo0328a.jpg");
			g16.setConstelacao("Virgo");
			g16.setMassa(0.0000008);
			g16.setRaio(25.000);
			g16.setRotacao(0.0);
			g16.setCoordenadas("2h 39m 59s");
			g16.setDeclinacao("-11° 37′ 23″");
			g16.setDescricao(
					"A galáxia espiral foi a primeira entrada constada apenas nas versões modernas do catálogo de objetos do céu profundo do astrônomo francês Charles Messier ");
			g16.setDesvioVermelho("0,03416 ± 0,07");
			g16.setEstrelas(100);
			g16.setIdadeEstimada(13251010);
			g16.setMagnitude(8.0);
			g16.setDistancia("29.350.000");
			g16.setDimensoes(8.735);

			Galaxy g17 = new Galaxy();
			g17.setId(17l);
			g17.setNome("M63");
			g17.setUrlImg("https://i.pinimg.com/originals/47/4e/be/474ebe1180ab32348ee242526e150351.jpg");
			g17.setConstelacao("Canes Venatici");
			g17.setMassa(12.5);
			g17.setRaio(67.500);
			g17.setRotacao(0.0);
			g17.setCoordenadas("51° 28’ 47”, 0° 00’ 00”");
			g17.setDeclinacao("+42° 01' 45\"");
			g17.setDescricao(
					"A Galáxia do Girassol é uma galáxia espiral na direção da constelação de Canes Venatici. Possui uma ascensão reta de 13 horas, 15 minutos e 49.3 segundos e uma declinação de +42° 01' 45\".");
			g17.setDesvioVermelho("504");
			g17.setEstrelas(400);
			g17.setIdadeEstimada(13281010);
			g17.setMagnitude(9.3);
			g17.setDistancia("37");
			g17.setDimensoes(12.672);

			Galaxy g18 = new Galaxy();
			g18.setId(18l);
			g18.setNome("M1");
			g18.setUrlImg("https://p4.wallpaperbetter.com/wallpaper/899/578/449/crab-nebula-wallpaper-preview.jpg");
			g18.setConstelacao("Taurus");
			g18.setMassa(4.618);
			g18.setRaio(5.5);
			g18.setRotacao(0.0);
			g18.setCoordenadas("5h 34min 32.2s");
			g18.setDeclinacao("+22˚ 0' 57''");
			g18.setDescricao(
					"A nebulosa é a mais intensa fonte de raios X e gama para energias acima de 30 KeV, com fluxo de energia luminosa acima de 1012 eV.");
			g18.setDesvioVermelho("");
			g18.setEstrelas(0);
			g18.setIdadeEstimada(1001);
			g18.setMagnitude(8.4);
			g18.setDistancia("000");
			g18.setDimensoes(5.3);

			Galaxy g19 = new Galaxy();
			g19.setId(19l);
			g19.setNome("M6");
			g19.setUrlImg("https://upload.wikimedia.org/wikipedia/commons/7/7f/M6a.jpg");
			g19.setConstelacao("Scorpius");
			g19.setMassa(0.0);
			g19.setRaio(6.0);
			g19.setRotacao(0.0);
			g19.setCoordenadas("17h 40 min 8 s");
			g19.setDeclinacao("-32˚ 12' 58''");
			g19.setDescricao("O Aglomerado da Borboleta é um aglomerado aberto de estrelas na constelação de Escorpião.");
			g19.setDesvioVermelho("");
			g19.setEstrelas(1);
			g19.setIdadeEstimada(942);
			g19.setMagnitude(6.4);
			g19.setDistancia("1.600");
			g19.setDimensoes(25.0);

			Galaxy g20 = new Galaxy();
			g20.setId(20l);
			g20.setNome("M13");
			g20.setUrlImg("https://apod.nasa.gov/apod/image/1705/m13Block.jpg");
			g20.setConstelacao("Hercules");
			g20.setMassa(6.105);
			g20.setRaio(72.502);
			g20.setRotacao(0.0);
			g20.setCoordenadas("16h 41m 41s");
			g20.setDeclinacao("+36° 27′ 35″");
			g20.setDescricao(
					"O Grande Aglomerado Globular de Hércules é um aglomerado globular de estrelas na constelação de Hércules.");
			g20.setDesvioVermelho("");
			g20.setEstrelas(10);
			g20.setIdadeEstimada(13);
			g20.setMagnitude(5.8);
			g20.setDistancia("22.180");
			g20.setDimensoes(20.0);

			Galaxy g21 = new Galaxy();
			g21.setId(21l);
			g21.setNome("M51");
			g21.setUrlImg(
					"https://i.pinimg.com/736x/89/03/ea/8903ea63cb285686b3135fb528788d1c--whirlpool-galaxy-beautiful-space.jpg");
			g21.setConstelacao("Canes Venatici");
			g21.setMassa(76.000);
			g21.setRaio(9.46101);
			g21.setRotacao(0.0);
			g21.setCoordenadas("");
			g21.setDeclinacao("+ 47 ° 11 ′ 43 ″");
			g21.setDescricao(
					"O que mais tarde ficou conhecido como Whirlpool Galaxy foi descoberto em 13 de outubro de 1773 por Charles Messier enquanto caçava objetos que pudessem confundir os caçadores de cometas, e foi designado no catálogo de Messier como M51.");
			g21.setDesvioVermelho("0.001544");
			g21.setEstrelas(1);
			g21.setIdadeEstimada(122);
			g21.setMagnitude(8.4);
			g21.setDistancia("31");
			g21.setDimensoes(0.0);

			Galaxy g22 = new Galaxy();
			g22.setId(23l);
			g22.setNome("Andrômeda I");
			g22.setUrlImg("https://martingermano.com/Images/AndIlredsg.jpg");
			g22.setConstelacao("Andrômeda");
			g22.setMassa(0.0);
			g22.setRaio(0.0);
			g22.setRotacao(0.0);
			g22.setCoordenadas("0h 42m 44s");
			g22.setDeclinacao("+38° 02′ 28″");
			g22.setDescricao(
					"Andrômeda I é uma galáxia anã esferoidal (dSph) a aproximadamente 2,40 milhões de anos-luz de distância na constelação de Andromeda. Andrômeda I faz parte do Grupo Local e é uma galáxia satélite da Galáxia de Andrômeda (M31).");
			g22.setDesvioVermelho("-368 ± 11");
			g22.setEstrelas(3);
			g22.setIdadeEstimada(10011010);
			g22.setMagnitude(1.0);
			g22.setDistancia("2′.5 × 2′.5");
			g22.setDimensoes(0.0);

			Galaxy g23 = new Galaxy();
			g23.setId(23l);
			g23.setNome("M83");
			g23.setUrlImg("https://cdn.astrobin.com/thumbs/jxiXNq4z7hwY_1824x0_sWXLOnwG.jpg");
			g23.setConstelacao("Hydra");
			g23.setMassa(1.000);
			g23.setRaio(4.5);
			g23.setRotacao(0.0);
			g23.setCoordenadas("14h 03m 12.6s");
			g23.setDeclinacao("-29° 51′ 57″");
			g23.setDescricao(
					"A galáxia Cata-vento do Sul (Messier 83, NGC 5236) é uma galáxia espiral barrada localizada a aproximadamente quinze milhões de anos-luz (cerca de 4,59 megaparsecs) de distância na direção da constelação de Hydra.");
			g23.setDesvioVermelho("	513 ± 2");
			g23.setEstrelas(200);
			g23.setIdadeEstimada(233);
			g23.setMagnitude(7.6);
			g23.setDistancia("14,7");
			g23.setDimensoes(129.115);

			Galaxy g24 = new Galaxy();
			g24.setId(25l);
			g24.setNome("Plêiades");
			g24.setUrlImg("https://pm1.narvii.com/7364/be94b854983179e4e0d7cd08717a5bf8ee1572b7r1-2048-1476v2_hq.jpg");
			g24.setConstelacao("Taurus");
			g24.setMassa(100.0);
			g24.setRaio(17.50);
			g24.setRotacao(0.0);
			g24.setCoordenadas("3h 47m 24s");
			g24.setDeclinacao("+24° 7′ 00,0″");
			g24.setDescricao(
					"As Plêiades (Messier 45), conhecidas popularmente como sete-estrelo e sete-cabrinhas, são um grupo de estrelas na constelação do Touro. As Plêiades, também chamadas de aglomerado estelar.");
			g24.setDesvioVermelho("");
			g24.setEstrelas(2);
			g24.setIdadeEstimada(100);
			g24.setMagnitude(1.6);
			g24.setDistancia("391-456");
			g24.setDimensoes(11.0);

			Galaxy g25 = new Galaxy();
			g25.setId(25l);
			g25.setNome("M88");
			g25.setUrlImg("https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/M88_Block.jpg/800px-M88_Block.jpg");
			g25.setConstelacao("Coma Berenices");
			g25.setMassa(2.400);
			g25.setRaio(60.000);
			g25.setRotacao(0.0);
			g25.setCoordenadas("");
			g25.setDeclinacao("	+14° 25′ 14″");
			g25.setDescricao(
					"Messier 88 é uma galáxia espiral a 47 milhões de anos-luz de distancia na constelação de Coma Berenices. A galáxia é um membro do Aglomerado de Virgem.");
			g25.setDesvioVermelho("0,07609±0,010");
			g25.setEstrelas(400);
			g25.setIdadeEstimada(13691010);
			g25.setMagnitude(9.6);
			g25.setDistancia("47 ± 8");
			g25.setDimensoes(69.37);

			Galaxy g26 = new Galaxy();
			g26.setId(26l);
			g26.setNome("M90");
			g26.setUrlImg("https://cdn.astrobin.com/thumbs/UHzljDXe06jN_1824x0_n1wMX-gx.jpg");
			g26.setConstelacao("Virgo");
			g26.setMassa(0.0);
			g26.setRaio(0.0);
			g26.setRotacao(23.0);
			g26.setCoordenadas("12h 36.8m , +13° 10'");
			g26.setDeclinacao("13 ° 09 ′ 47 ″");
			g26.setDescricao(
					"M90 ( NGC 4569 ) é uma galáxia espiral intermediária localizada na constelação da Virgem a uma distância de cerca de 40 milhões de anos-luz da Via Láctea.");
			g26.setDesvioVermelho("-0,000784 ± 0,000013");
			g26.setEstrelas(1);
			g26.setIdadeEstimada(1331010);
			g26.setMagnitude(10.3);
			g26.setDistancia("58,7 ± 2,8");
			g26.setDimensoes(110.000);

			Galaxy g27 = new Galaxy();
			g27.setId(27l);
			g27.setNome("M95");
			g27.setUrlImg("https://upload.wikimedia.org/wikipedia/commons/f/fd/The_VLT_goes_lion_hunting.jpg");
			g27.setConstelacao("Leo");
			g27.setMassa(35.108);
			g27.setRaio(0.0);
			g27.setRotacao(0.0);
			g27.setCoordenadas("");
			g27.setDeclinacao("+11° 42′ 13″");
			g27.setDescricao(
					"Messier 95 (NGC 3351) é uma galáxia espiral localizada a cerca de trinta e oito milhões de anos-luz (aproximadamente 11,65 megaparsecs) de distância na direção da constelação de Leão.");
			g27.setDesvioVermelho("	778 ± 4");
			g27.setEstrelas(40);
			g27.setIdadeEstimada(13261010);
			g27.setMagnitude(9.7);
			g27.setDistancia("32,6 ± 1,4");
			g27.setDimensoes(312.9);

			Galaxy g28 = new Galaxy();
			g28.setId(28l);
			g28.setNome("M110");
			g28.setUrlImg("https://www.nasa.gov/sites/default/files/thumbnails/image/m110.png");
			g28.setConstelacao("Andrômeda");
			g28.setMassa(3.6);
			g28.setRaio(0.0);
			g28.setRotacao(0.0);
			g28.setCoordenadas("");
			g28.setDeclinacao("+41º 41' 26");
			g28.setDescricao("\n"
					+ "NGC 205 ou M110 é uma galáxia elíptica localizada a cerca de 2,9 milhões de anos-luz de distância na direção da constelação de Andrômeda.");
			g28.setDesvioVermelho("	−0.00804±0.010");
			g28.setEstrelas(20);
			g28.setIdadeEstimada(290);
			g28.setMagnitude(8.5);
			g28.setDistancia("2.674");
			g28.setDimensoes(17.10);

			Galaxy g29 = new Galaxy();
			g29.setId(30l);
			g29.setNome("NGC 1512");
			g29.setUrlImg("https://esahubble.org/media/archives/fitsimages/screen/karol_masztalerz_02.jpg");
			g29.setConstelacao("Horologium");
			g29.setMassa(0.0);
			g29.setRaio(35.000);
			g29.setRotacao(0.0);
			g29.setCoordenadas("");
			g29.setDeclinacao("-43º 20' 57");
			g29.setDescricao(
					"NGC 1512 é uma galáxia espiral localizada a cerca de trinta milhões de anos-luz de distância na direção da constelação do relógio.");
			g29.setDesvioVermelho("");
			g29.setEstrelas(300);
			g29.setIdadeEstimada(400);
			g29.setMagnitude(11.0);
			g29.setDistancia("9,197");
			g29.setDimensoes(0.0);

			Galaxy g30 = new Galaxy();
			g30.setId(30l);
			g30.setNome("Via Láctea");
			g30.setUrlImg("https://media-manager.noticiasaominuto.com.br/gallery/960/naom_56435e09c86e3.jpg");
			g30.setConstelacao("Sagittarius, Orion, Scorpius, Carina, Auriga, Ara");
			g30.setMassa(890.0);
			g30.setRaio(52.850);
			g30.setRotacao(240.0);
			g30.setCoordenadas(" α = 17h 42', δ = -28º 55'");
			g30.setDeclinacao("-28:56' +27:07 ");
			g30.setDescricao(
					"A Via Láctea é uma galáxia espiral, da qual o Sistema Solar faz parte. Vista da Terra, aparece como uma faixa brilhante e difusa que circunda toda a esfera celeste, recortada por nuvens moleculares.");
			g30.setDesvioVermelho("");
			g30.setEstrelas(400);
			g30.setIdadeEstimada(5411);
			g30.setMagnitude(1.0);
			g30.setDistancia("000");
			g30.setDimensoes(800.0);

			Galaxy g31 = new Galaxy();
			g31.setId(31l);
			g31.setNome("M74");
			g31.setUrlImg("https://apod.nasa.gov/apod/image/2207/JWST_NGC628_Robert_Eder_V2.jpg");
			g31.setConstelacao("Peixes");
			g31.setMassa(300.0);
			g31.setRaio(47.500);
			g31.setRotacao(0.0);
			g31.setCoordenadas("01h 36m 41,8s");
			g31.setDeclinacao("15° 47′ 01″");
			g31.setDescricao("Messier 74 é uma galáxia espiral na constelação de Pisces. Foi descoberta em setembro de 1780 por Pierre Méchain. Ele reportou sua descoberta a Charles Messier, que listou a galáxia em seu catálogo.");
			g31.setDesvioVermelho("657");
			g31.setEstrelas(100);
			g31.setIdadeEstimada(13121010);
			g31.setMagnitude(10.0);
			g31.setDistancia("000");
			g31.setDimensoes(0.0);

		GalaxyDTO gDto1 = mapper.map(g1, GalaxyDTO.class);
		GalaxyDTO gDto2 = mapper.map(g2, GalaxyDTO.class);
		GalaxyDTO gDto3 = mapper.map(g3, GalaxyDTO.class);
		GalaxyDTO gDto4 = mapper.map(g4, GalaxyDTO.class);
		GalaxyDTO gDto5 = mapper.map(g5, GalaxyDTO.class);
		GalaxyDTO gDto6 = mapper.map(g6, GalaxyDTO.class);
		GalaxyDTO gDto7 = mapper.map(g7, GalaxyDTO.class);
		GalaxyDTO gDto8 = mapper.map(g8, GalaxyDTO.class);
		GalaxyDTO gDto9 = mapper.map(g9, GalaxyDTO.class);
		GalaxyDTO gDto10 = mapper.map(g10, GalaxyDTO.class);
		GalaxyDTO gDto11 = mapper.map(g11, GalaxyDTO.class);
		GalaxyDTO gDto12 = mapper.map(g12, GalaxyDTO.class);
		GalaxyDTO gDto13 = mapper.map(g13, GalaxyDTO.class);
		GalaxyDTO gDto14 = mapper.map(g14, GalaxyDTO.class);
		GalaxyDTO gDto15 = mapper.map(g15, GalaxyDTO.class);
		GalaxyDTO gDto16 = mapper.map(g16, GalaxyDTO.class);
		GalaxyDTO gDto17 = mapper.map(g17, GalaxyDTO.class);
		GalaxyDTO gDto18 = mapper.map(g18, GalaxyDTO.class);
		GalaxyDTO gDto19 = mapper.map(g19, GalaxyDTO.class);
		GalaxyDTO gDto20 = mapper.map(g20, GalaxyDTO.class);
		GalaxyDTO gDto21 = mapper.map(g21, GalaxyDTO.class);
		GalaxyDTO gDto22 = mapper.map(g22, GalaxyDTO.class);
		GalaxyDTO gDto23 = mapper.map(g23, GalaxyDTO.class);
		GalaxyDTO gDto24 = mapper.map(g24, GalaxyDTO.class);
		GalaxyDTO gDto25 = mapper.map(g25, GalaxyDTO.class);
		GalaxyDTO gDto26 = mapper.map(g26, GalaxyDTO.class);
		GalaxyDTO gDto27 = mapper.map(g27, GalaxyDTO.class);
		GalaxyDTO gDto28 = mapper.map(g28, GalaxyDTO.class);
		GalaxyDTO gDto29 = mapper.map(g29, GalaxyDTO.class);
		GalaxyDTO gDto30 = mapper.map(g30, GalaxyDTO.class);
		GalaxyDTO gDto31 = mapper.map(g31, GalaxyDTO.class);


		repository.saveAll(Arrays.asList(mapper.map(gDto1, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto2, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto3, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto4, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto5, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto6, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto7, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto8, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto9, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto10, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto11, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto12, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto13, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto14, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto15, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto16, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto17, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto18, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto19, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto20, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto21, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto22, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto23, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto24, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto25, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto26, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto27, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto28, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto29, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto30, Galaxy.class)));
		repository.saveAll(Arrays.asList(mapper.map(gDto31, Galaxy.class)));


	}
}
