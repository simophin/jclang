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
public class CXCursor extends Structure {
    public int kind;
    public int xdata;
    public Pointer[] data = new Pointer[3];

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("kind", "xdata", "data");
    }

    public static class ByValue extends CXCursor implements Structure.ByValue {}
}
