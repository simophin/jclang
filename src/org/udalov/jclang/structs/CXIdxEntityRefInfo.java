package org.udalov.jclang.structs;

import com.sun.jna.Structure;

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

    public CXIdxEntityRefInfo() {
        setFieldOrder(new String[]{"kind", "cursor", "loc", "referencedEntity", "parentEntity", "container"});
    }

    public static class ByReference extends CXIdxEntityRefInfo implements Structure.ByReference {}
}
