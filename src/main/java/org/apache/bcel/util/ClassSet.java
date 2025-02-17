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
package org.apache.bcel.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.bcel.classfile.JavaClass;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Utility class implementing a (type-safe) set of JavaClass objects. Since JavaClass has no equals() method, the name of the class is used for comparison.
 *
 * @see ClassStack
 */
public class ClassSet {

    private final Map<String, JavaClass> map = new HashMap<>();

    public boolean add(final JavaClass clazz) {
        return map.putIfAbsent(clazz.getClassName(), clazz) != null;
    }

    public boolean empty() {
        return map.isEmpty();
    }

    public String[] getClassNames() {
        return map.keySet().toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public void remove(final JavaClass clazz) {
        map.remove(clazz.getClassName());
    }

    public JavaClass[] toArray() {
        return map.values().toArray(JavaClass.EMPTY_ARRAY);
    }
}
