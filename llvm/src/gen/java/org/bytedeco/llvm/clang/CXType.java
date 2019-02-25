// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * The type of an element in the abstract syntax tree.
 *
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXType extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXType() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXType(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXType(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXType position(long position) {
        return (CXType)super.position(position);
    }

  public native @Cast("CXTypeKind") int kind(); public native CXType kind(int kind);
  public native Pointer data(int i); public native CXType data(int i, Pointer data);
  @MemberGetter public native @Cast("void**") PointerPointer data();
}