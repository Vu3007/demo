package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.model.enums.MovieType;
import com.example.demo.model.enums.UserRole;
import com.example.demo.repository.*;
import com.github.javafaker.Faker;
import com.github.slugify.Slugify;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class DemoAppApplicationTests {
	@Autowired
	private MovieRepository movieRepository;
	private ActorRepository actorRepository;
	private CountryRepository countryRepository;
	private DirectorRepository directorRepository;
	private EpisodeRepository episodeRepository;
	private  FavoriteRepository favoriteRepository;
	private GenreRepository genreRepository;
	private HistoryRepository historyRepository;
	private ReviewRepository reviewRepository;
	private UserRepository userRepository;


	@Test
	void save_movies() {
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Movie movie = Movie.builder()
					.name(name)
					.slug(slugify.slugify(name))
					.description(faker.lorem().paragraph())
					.poster("https://placehold.co/600x400?text=" + name.substring(0, 1).toUpperCase())
					.releaseYear(faker.number().numberBetween(2021, 2024))
					.rating(faker.number().randomDouble(1, 1, 10))
					.trailerUrl("https://www.youtube.com/embed/YPY7J-flzE8?si=NIAaDGXL68JdDCux")
					.type(MovieType.values()[faker.number().numberBetween(0, MovieType.values().length - 1)])
					.status(status)
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.publishedAt(status ? LocalDateTime.now() : null)
					.build();
			movieRepository.save(movie);

		}
	}
	@Test
	void save_actor(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Actor actor = Actor.builder()
					.name(name)
					.slug(slugify.slugify(name))
					.avatar("https://placehold.co/600x400?text=")
					.bio("status")
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			actorRepository.save(actor);
		}
	}
	@Test
	void save_country(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Country country = Country.builder()
					.name(name)
					.slug(slugify.slugify(name))
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			countryRepository.save(country);
		}
	}
	@Test
	void save_diretor(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Director director = Director.builder()
					.name(name)
					.slug(slugify.slugify(name))
					.avatar("https://placehold.co/600x400?text=")
					.bio("status")
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			directorRepository.save(director);
		}

	}
	@Test
	void save_episode(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();
		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Episode episode = Episode.builder()
					.name(name)
					.duration(faker.number().numberBetween(1,100))
					.displayOrder(faker.number().numberBetween(1,6))
					.videoUrl("https://www.youtube.com/embed/YPY7J-flzE8?si=NIAaDGXL68JdDCux")
					.status(status)
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			episodeRepository.save(episode);
		}

	}
	@Test
	void save_favorite(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Favorite favorite = Favorite.builder()
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			favoriteRepository.save(favorite);
		}

	}
	@Test
	void save_genre(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Genre genre = Genre.builder()
					.name(name)
					.slug(slugify.slugify(name))
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			genreRepository.save(genre);
		}

	}
	@Test
	void save_history(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			History history = History.builder()
					.duration(faker.number().randomDouble(1,1,30))
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();
			historyRepository.save(history);
		}

	}
	@Test
	void save_review(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			Review review = Review.builder()
					.name(name)
					.content("abc")
					.rating(faker.number().randomDouble(1, 1, 10))
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();

			reviewRepository.save(review);
		}

	}
	@Test
	void save_user(){
		Faker faker = new Faker();
		Slugify slugify = Slugify.builder().build();

		for (int i = 0; i < 100; i++) {
			String name = faker.book().title();
			Boolean status = faker.bool().bool();
			User user = User.builder()
					.name(name)
					.password("123")
					.avatar("https://placehold.co/600x400?text=")
					.role(UserRole.values()[faker.number().numberBetween(0, UserRole.values().length - 1)])
					.createdAt(LocalDateTime.now())
					.updatedAt(LocalDateTime.now())
					.build();

			userRepository.save(user);
		}

	}



}


