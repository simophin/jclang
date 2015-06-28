package org.udalov.jclang;

import org.udalov.jclang.structs.CXIdxEntityRefInfo;

/**
 * Created by fanchao on 28/06/15.
 */
public class EntityRefInfo {
    private final EntityRefKind entityRefKind;
    private final Cursor cursor;
    private final IndexLocation loc;
    private final EntityInfo referencedEntity;
    private final EntityInfo parentEntity;
    private final ContainerInfo containerInfo;

    public EntityRefInfo(final CXIdxEntityRefInfo.ByReference info) {
        entityRefKind = EntityRefKind.fromNative(info.kind);
        cursor = new Cursor(info.cursor);
        loc = new IndexLocation(info.loc);
        referencedEntity = new EntityInfo(info.referencedEntity);
        parentEntity = new EntityInfo(info.parentEntity);
        containerInfo = new ContainerInfo(info.container);
    }

    public EntityRefKind getEntityRefKind() {
        return entityRefKind;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public IndexLocation getLoc() {
        return loc;
    }

    public EntityInfo getReferencedEntity() {
        return referencedEntity;
    }

    public EntityInfo getParentEntity() {
        return parentEntity;
    }

    public ContainerInfo getContainerInfo() {
        return containerInfo;
    }
}
