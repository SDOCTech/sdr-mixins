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
 * an entity.
 *
 * @see org.springframework.data.repository.Repository
 * @see org.springframework.data.repository.CrudRepository
 * @param <T> the domain type the repository manages.
 * @author Derek Stainer
 */
@NoRepositoryBean
public interface HasSave<T> {

    /**
     * Saves a given entity. Use the returned instance for further operations as the save operation might have
     * changed the entity instance completely.
     *
     * @param <S> the type of the entity, which is a subclass of T, to be saved.
     * @param entity must not be {@literal null}.
     * @return the saved entity will never be {@literal null}.
     */
    <S extends T> S save(S entity);

}
