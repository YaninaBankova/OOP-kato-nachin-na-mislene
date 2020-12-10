package edu.smg;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series got = new Series();
		got.title = "Game of Thrones";
		Seasons s1 = new Seasons();
		s1.number = 8;
		s1.series = got;
		got.seasons.add(s1);
		Series sw = new Series();
		sw.title = "Star Wars";
		Seasons s2 = new Seasons();
		s2.number = 9;
		s2.series = sw;
		Series xmen = new Series();
		sw.seasons.add(s2);
		xmen.title = "X-men";
		Seasons s3 = new Seasons();
		s3.number = 13;
		s3.series = xmen;
		xmen.seasons.add(s3);
		
		Platform hbo = new Platform();
		hbo.name = "HBO";
		hbo.series.add(got);
		Platform netflix = new Platform();
		netflix.name = "Netflix";
		netflix.series.add(xmen);
		netflix.series.add(sw);
		
		Actor emilia = new Actor();
		Characters dany = new Characters();
		dany.name = "Daenerys Targaryen";
		dany.series = got;
		Characters qira = new Characters();
		qira.name = "Qi'ra";
		qira.series = sw;
		emilia.name = "Emilia Clarke";
		emilia.series.add(got);
		emilia.series.add(sw);
		got.actors.add(emilia);
		sw.actors.add(emilia);
		emilia.characters.add(dany);
		emilia.characters.add(qira);
		
		Actor sophie = new Actor();
		Characters sansa = new Characters();
		sansa.name = "Sansa Stark";
		sansa.series = got;
		Characters jean = new Characters();
		jean.name = "Jean Grey";
		jean.series = xmen;
		sophie.name = "Sophie Turner";
		got.actors.add(sophie);
		xmen.actors.add(sophie);
		sophie.characters.add(sansa);
		sophie.characters.add(jean);
		
		System.out.println(emilia.name + "'s roles:");
		for(Characters role: emilia.characters) {
			System.out.println(role.name + " in " + role.series.title);
		}
		System.out.println( "\n"+ sophie.name + "'s roles:");
		for(Characters role: sophie.characters) {
			System.out.println(role.name + " in " + role.series.title);
		}
		System.out.println( "\n"+ hbo.name + "'s movies:");
		for(Series movie: hbo.series) {
			System.out.print(movie.title + " with ");
			for(Seasons s: movie.seasons) {
				System.out.println(s.number + " seasons");
			}
		}
		System.out.println( "\n"+ netflix.name + "'s movies:");
		for(Series movie: netflix.series) {
			System.out.print(movie.title + " with ");
			for(Seasons s: movie.seasons) {
				System.out.println(s.number + " seasons");
			}
		}
	}

}
