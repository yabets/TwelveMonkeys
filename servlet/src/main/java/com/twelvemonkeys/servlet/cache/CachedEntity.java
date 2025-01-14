/*
 * Copyright (c) 2008, Harald Kuhr
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.twelvemonkeys.servlet.cache;

import java.io.IOException;

/**
 * CachedEntity
 *
 * @author <a href="mailto:harald.kuhr@gmail.com">Harald Kuhr</a>
 * @version $Id: CachedEntity.java#3 $
 */
@Deprecated
interface CachedEntity {

    /**
     * Renders the cached entity to the response.
     *
     * @param pRequest the request
     * @param pResponse the response
     * @throws java.io.IOException if an I/O exception occurs
     */
    void render(CacheRequest pRequest, CacheResponse pResponse) throws IOException;

    /**
     * Captures (caches) the response for the given request.
     *
     * @param pRequest the request
     * @param pResponse the response
     * @throws java.io.IOException if an I/O exception occurs
     *
     * @see #createCachedResponse()
     */
    void capture(CacheRequest pRequest, CachedResponse pResponse) throws IOException;

    /**
     * Tests if the content of this entity is stale for the given request.
     *
     * @param pRequest the request
     * @return {@code true} if content is stale
     */
    boolean isStale(CacheRequest pRequest);

    /**
     * Creates a {@code WritableCachedResponse} to use to capture the response.
     *
     * @return a {@code WritableCachedResponse}
     */
    WritableCachedResponse createCachedResponse();
}
