// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #if (_WIN32_WINNT >= 0x0501)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MEMORY_COUNTERS_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MEMORY_COUNTERS_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MEMORY_COUNTERS_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MEMORY_COUNTERS_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MEMORY_COUNTERS_EX position(long position) {
        return (PROCESS_MEMORY_COUNTERS_EX)super.position(position);
    }

    public native @Cast("DWORD") int cb(); public native PROCESS_MEMORY_COUNTERS_EX cb(int cb);
    public native @Cast("DWORD") int PageFaultCount(); public native PROCESS_MEMORY_COUNTERS_EX PageFaultCount(int PageFaultCount);
    public native @Cast("SIZE_T") long PeakWorkingSetSize(); public native PROCESS_MEMORY_COUNTERS_EX PeakWorkingSetSize(long PeakWorkingSetSize);
    public native @Cast("SIZE_T") long WorkingSetSize(); public native PROCESS_MEMORY_COUNTERS_EX WorkingSetSize(long WorkingSetSize);
    public native @Cast("SIZE_T") long QuotaPeakPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS_EX QuotaPeakPagedPoolUsage(long QuotaPeakPagedPoolUsage);
    public native @Cast("SIZE_T") long QuotaPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS_EX QuotaPagedPoolUsage(long QuotaPagedPoolUsage);
    public native @Cast("SIZE_T") long QuotaPeakNonPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS_EX QuotaPeakNonPagedPoolUsage(long QuotaPeakNonPagedPoolUsage);
    public native @Cast("SIZE_T") long QuotaNonPagedPoolUsage(); public native PROCESS_MEMORY_COUNTERS_EX QuotaNonPagedPoolUsage(long QuotaNonPagedPoolUsage);
    public native @Cast("SIZE_T") long PagefileUsage(); public native PROCESS_MEMORY_COUNTERS_EX PagefileUsage(long PagefileUsage);
    public native @Cast("SIZE_T") long PeakPagefileUsage(); public native PROCESS_MEMORY_COUNTERS_EX PeakPagefileUsage(long PeakPagefileUsage);
    public native @Cast("SIZE_T") long PrivateUsage(); public native PROCESS_MEMORY_COUNTERS_EX PrivateUsage(long PrivateUsage);
}
