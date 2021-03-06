/*
 * Copyright 2013 Alexander Udalov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.udalov.jclang.structs;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class CXIdxLoc extends Structure {
    public Pointer[] ptr_data = new Pointer[2];
    public int int_data;

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("ptr_data", "int_data");
    }

    public static class ByValue extends CXIdxLoc implements Structure.ByValue {}
}
