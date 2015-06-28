package org.udalov.jclang;

/**
 * Created by fanchao on 28/06/15.
 */
public enum EntityRefKind {
    DIRECT(1),
    IMPLICIT(2);

    public final int nativeValue;

    EntityRefKind(int nativeValue) {
        this.nativeValue = nativeValue;
    }

    public static EntityRefKind fromNative(int nativeValue) {
        for (EntityRefKind kind : EntityRefKind.values()) {
            if (kind.nativeValue == nativeValue) {
                return kind;
            }
        }

        return null;
    }
}
