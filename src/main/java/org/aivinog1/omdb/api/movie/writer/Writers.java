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
package org.aivinog1.omdb.api.movie.writer;
/**
 * Use this interface to work with
 * a numerous {@link org.aivinog1.omdb.api.movie.writer.Writer}.
 *
 * @author Alexey Vingoradov (vinogradov.a.i.93@gmail.com)
 * @version $Id$
 * @see org.aivinog1.omdb.api.movie.writer.Writer
 * @since 0.0.1
 * @todo #5:30m Needs to implement this interface.
 *  It should work with numerous movie writers.
 */
public interface Writers {
    /**
     * Iterate through existing movie writers.
     *
     * @return The iterable of a movie writers.
     */
    Iterable<Writer> iterate();
}
