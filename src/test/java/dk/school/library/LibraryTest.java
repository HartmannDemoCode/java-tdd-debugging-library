package dk.school.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryTest {

    @Test
    void addBookShouldBeIdempotentOnIsbn() {
        // TODO: tilføj samme ISBN to gange, forvent kun én bog
        fail("Skriv testen først (TDD) og fjern denne fail.");
    }

    @Test
    void findByTitleShouldBeCaseInsensitiveAndUseEquals() {
        // TODO
        fail("Skriv testen først (TDD) og fjern denne fail.");
    }

    @Test
    void loanAndReturnHappyPath() {
        // TODO: lån bog til bruger med plads; returnér; tjek availableBooks
        fail("Skriv testen først (TDD) og fjern denne fail.");
    }

    @Test
    void loanShouldNotChangeBookStateIfUserCannotBorrow() {
        // TODO: fyld bruger op med 3 bøger; forsøg at låne en 4.; bogen må ikke blive markeret som udlånt
        fail("Skriv testen først (TDD) og fjern denne fail.");
    }
}
