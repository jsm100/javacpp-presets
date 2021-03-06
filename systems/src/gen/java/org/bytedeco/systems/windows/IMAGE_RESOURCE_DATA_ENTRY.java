// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



//
// Each resource data entry describes a leaf node in the resource directory
// tree.  It contains an offset, relative to the beginning of the resource
// directory of the data for the resource, a size field that gives the number
// of bytes of data at that offset, a CodePage that should be used when
// decoding code point values within the resource data.  Typically for new
// applications the code page would be the unicode code page.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_RESOURCE_DATA_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_RESOURCE_DATA_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_RESOURCE_DATA_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_RESOURCE_DATA_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_RESOURCE_DATA_ENTRY position(long position) {
        return (IMAGE_RESOURCE_DATA_ENTRY)super.position(position);
    }

    public native @Cast("DWORD") int OffsetToData(); public native IMAGE_RESOURCE_DATA_ENTRY OffsetToData(int OffsetToData);
    public native @Cast("DWORD") int Size(); public native IMAGE_RESOURCE_DATA_ENTRY Size(int Size);
    public native @Cast("DWORD") int CodePage(); public native IMAGE_RESOURCE_DATA_ENTRY CodePage(int CodePage);
    public native @Cast("DWORD") int Reserved(); public native IMAGE_RESOURCE_DATA_ENTRY Reserved(int Reserved);
}
