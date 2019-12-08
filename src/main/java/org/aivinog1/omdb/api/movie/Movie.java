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
import org.aivinog1.omdb.api.movie.contributor.Contributors;
import org.aivinog1.omdb.api.movie.genre.Genres;
import org.aivinog1.omdb.api.movie.rating.Ratings;

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
     * Movie contributors. Such as actors, directors, etc.
     *
     * @return A movie contributors.
     */
    Contributors contributors();
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
     * A movie coordinate, i.e. IMDB identfier, website, etc.
     *
     * @return A movie coordinates.
     */
    Coordinate coordinate();
    /**
     * A movie dates. I.e. release on dvd date.
     *
     * @return A movie dates.
     */
    Dates dates();
    /**
     * A movie business information. I.e. production company.
     *
     * @return A movie business information.
     */
    Business business();
}
