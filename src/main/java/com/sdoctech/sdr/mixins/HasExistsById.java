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
 * Mixin interface that provides a {@link org.springframework.data.repository.Repository} the ability to determine
 * if an entity exists by its ID.
 *
 * @see org.springframework.data.repository.Repository
 * @see org.springframework.data.repository.CrudRepository
 * @param <ID> the type of the id of the entity the repository manages.
 * @author Derek Stainer
 */
@NoRepositoryBean
public interface HasExistsById<ID> {

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param id must not be {@literal null}.
     * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    boolean existsById(ID id);

}
