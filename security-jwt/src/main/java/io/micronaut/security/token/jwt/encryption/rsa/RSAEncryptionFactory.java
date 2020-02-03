/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.token.jwt.encryption.rsa;

import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.security.token.jwt.encryption.EncryptionConfiguration;

/**
 * Creates {@link EncryptionConfiguration} for each {@link RSAEncryptionConfiguration} bean.
 *
 * @author Sergio del Amo
 * @since 1.0
 */
@Factory
public class RSAEncryptionFactory {

    /**
     *
     * @param configuration {@link RSAEncryptionConfiguration} bean.
     * @return The {@link EncryptionConfiguration}
     */
    @EachBean(RSAEncryptionConfiguration.class)
    public EncryptionConfiguration encryptionConfiguration(RSAEncryptionConfiguration configuration) {
        return new RSAEncryption(configuration);
    }
}
