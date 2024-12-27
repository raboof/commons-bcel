/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.bcel.generic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link ClassGen}.
 */
public class ClassGenTest {

    @Test
    public void testBCELComparator() throws Exception {
        final ClassGen obj = new ClassGen("", "", "", 0, null);
        assertTrue(ClassGen.getComparator().equals(null, null));
        assertTrue(ClassGen.getComparator().equals(obj, obj));
        assertFalse(ClassGen.getComparator().equals(obj, null));
        assertFalse(ClassGen.getComparator().equals(null, obj));
    }
}
