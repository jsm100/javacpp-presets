// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_PERFSTATE_DOMAIN_EVENT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_PERFSTATE_DOMAIN_EVENT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_PERFSTATE_DOMAIN_EVENT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_PERFSTATE_DOMAIN_EVENT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_PERFSTATE_DOMAIN_EVENT position(long position) {
        return (PPM_PERFSTATE_DOMAIN_EVENT)super.position(position);
    }

    public native @Cast("DWORD") int State(); public native PPM_PERFSTATE_DOMAIN_EVENT State(int State);
    public native @Cast("DWORD") int Latency(); public native PPM_PERFSTATE_DOMAIN_EVENT Latency(int Latency);
    public native @Cast("DWORD") int Speed(); public native PPM_PERFSTATE_DOMAIN_EVENT Speed(int Speed);
    public native @Cast("DWORD64") long Processors(); public native PPM_PERFSTATE_DOMAIN_EVENT Processors(long Processors);
}
