/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package net.consensys.orion.enclave.sodium.serialization;

import static org.apache.tuweni.io.Base64.decodeBytes;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.tuweni.crypto.sodium.Box;

public final class PublicKeyDeserializer extends JsonDeserializer<Box.PublicKey> {

  @Override
  public Box.PublicKey deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException {
    return Box.PublicKey.fromBytes(decodeBytes(p.getValueAsString()));
  }
}
