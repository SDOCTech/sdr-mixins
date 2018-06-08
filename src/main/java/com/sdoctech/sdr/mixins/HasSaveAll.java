/*
 * Copyright 2008-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sdoctech.sdr.mixins;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * Mixin interface that provides a {@link org.springframework.data.repository.Repository} the ability to save
 * all of the provided entities.
 *
 * @see org.springframework.data.repository.Repository
 * @see org.springframework.data.repository.CrudRepository
 * @param <T> the domain type the repository manages.
 * @author Derek Stainer
 */
@NoRepositoryBean
public interface HasSaveAll<T> {

    /**
     * Saves all given entities.
     *
     * @param <S> the type of the entity, which is a subclass of T, to be saved.
     * @param entities must not be {@literal null}.
     * @return the saved entities will never be {@literal null}.
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);

}
