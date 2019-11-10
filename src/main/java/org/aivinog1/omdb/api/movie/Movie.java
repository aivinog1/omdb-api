/**
 * MIT License
 *
 * Copyright (c) 2019 Alexey Vinogradov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.aivinog1.omdb.api.movie;

import java.net.URL;
import org.aivinog1.omdb.api.movie.actor.Actors;
import org.aivinog1.omdb.api.movie.director.Directors;
import org.aivinog1.omdb.api.movie.genre.Genres;
import org.aivinog1.omdb.api.movie.rating.Ratings;
import org.aivinog1.omdb.api.movie.writer.Writers;

/**
 * This is a basic interface to working with a movie.
 *
 * @author Alexey Vinogradov (vinogradov.a.i.93@gmail.com)
 * @version $Id$
 * @see org.aivinog1.omdb.api.movie.Movies
 * @since 0.0.1
 * @todo #5:30m We need to implement this interface.
 *  It should work with a movie.
 */
public interface Movie {
    /**
     * A movie's title.
     *
     * @return A string representation of a movie's title.
     */
    String title();
    /**
     * Year of movie was or would be released.
     *
     * @return A string representation of a movie's title.
     */
    String year();
    /**
     * A movie rating. E.G. PG-13.
     *
     * @return A string representation of a movie's rating.
     */
    String rated();
    /**
     * Release date.
     *
     * @return A string representation of a release date.
     */
    String released();
    /**
     * A movie's runtime in minutes.
     *
     * @return A string representation of a movie runtime in minutes.
     */
    String runtime();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.genre.Genres}.
     *
     * @return Genres of a movie.
     */
    Genres genres();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.director.Directors}.
     *
     * @return Directors of a movie.
     */
    Directors directors();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.writer.Writers}.
     *
     * @return Writers of a movie.
     */
    Writers writers();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.actor.Actors}.
     *
     * @return Actors that participate in a movie.
     */
    Actors actors();
    /**
     * Plot.
     *
     * @return A string representation of a plot.
     */
    String plot();
    /**
     * Poster.
     *
     * @return URL that points to the movie poster.
     */
    URL poster();
    /**
     * Ratings of a movie.
     *
     * @return Ratings.
     */
    Ratings ratings();
    /**
     * Votes of a movie.
     *
     * @return A string representation of movie's votes.
     */
    String votes();
    /**
     * IMDB's movie identifier.
     *
     * @return A string representation of IDMB movie identifier.
     */
    String identifier();
    /**
     * Date of release DVD with that movie.
     *
     * @return A string representation of movie DVD date.
     */
    String dvdDate();
    /**
     * A movie's box office in USD.
     *
     * @return A string representation of a movie's box office.
     */
    String boxOffice();
    /**
     * Production company.
     *
     * @return A string that is a movie production company.
     */
    String production();
    /**
     * A movie website.
     *
     * @return A string representation of a movie website.
     */
    String webSite();
}
