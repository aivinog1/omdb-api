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
package org.aivinog1.omdb.api.movie.contributor;

import org.aivinog1.omdb.api.movie.contributor.actor.Actors;
import org.aivinog1.omdb.api.movie.contributor.director.Directors;
import org.aivinog1.omdb.api.movie.contributor.writer.Writers;

/**
 * This is a base interface for working with a movie
 * contributors.
 *
 * @author Alexey Vinogradov (vinogradov.a.i.93@gmail.com)
 * @version $Id$
 * @see org.aivinog1.omdb.api.movie.contributor.actor.Actors
 * @see org.aivinog1.omdb.api.movie.contributor.director.Directors
 * @see org.aivinog1.omdb.api.movie.contributor.writer.Writers
 * @since 0.0.1
 * @todo #22:30m Let's implement this interface.
 *  It should represent contributors (actors, directors) from API.
 *  For now there is no implementation for it.
 */
public interface Contributors {
    /**
     * A movie
     * {@link org.aivinog1.omdb.api.movie.contributor.director.Directors}.
     *
     * @return Directors of a movie.
     */
    Directors directors();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.contributor.writer.Writers}.
     *
     * @return Writers of a movie.
     */
    Writers writers();
    /**
     * A movie {@link org.aivinog1.omdb.api.movie.contributor.actor.Actors}.
     *
     * @return Actors that participate in a movie.
     */
    Actors actors();
}
