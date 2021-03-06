// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_THERMAL_POLICY_EVENT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_THERMAL_POLICY_EVENT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_THERMAL_POLICY_EVENT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_THERMAL_POLICY_EVENT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_THERMAL_POLICY_EVENT position(long position) {
        return (PPM_THERMAL_POLICY_EVENT)super.position(position);
    }

    public native @Cast("BYTE") byte Mode(); public native PPM_THERMAL_POLICY_EVENT Mode(byte Mode);
    public native @Cast("DWORD64") long Processors(); public native PPM_THERMAL_POLICY_EVENT Processors(long Processors);
}
