package org.udalov.jclang.structs;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fanchao on 28/06/15.
 */
public class CXIdxEntityRefInfo extends Structure {
    public int kind;
    public CXCursor.ByValue cursor;
    public CXIdxLoc.ByValue loc;
    public CXIdxEntityInfo.ByReference referencedEntity;
    public CXIdxEntityInfo.ByReference parentEntity;
    public CXIdxContainerInfo.ByReference container;

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("kind", "cursor", "loc", "referencedEntity", "parentEntity", "container");
    }

    public static class ByReference extends CXIdxEntityRefInfo implements Structure.ByReference {}
}
