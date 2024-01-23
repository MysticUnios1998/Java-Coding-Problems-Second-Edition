// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union __mingw_dbl_type_t {
 *     double x;
 *     unsigned long long val;
 *     struct  lh;
 * };
 * }
 */
public class __mingw_dbl_type_t {

    public static MemoryLayout $LAYOUT() {
        return constants$4.const$1;
    }
    public static VarHandle x$VH() {
        return constants$4.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)constants$4.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$4.const$2.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)constants$4.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        constants$4.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle val$VH() {
        return constants$4.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long val;
     * }
     */
    public static long val$get(MemorySegment seg) {
        return (long)constants$4.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long val;
     * }
     */
    public static void val$set(MemorySegment seg, long x) {
        constants$4.const$3.set(seg, x);
    }
    public static long val$get(MemorySegment seg, long index) {
        return (long)constants$4.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void val$set(MemorySegment seg, long index, long x) {
        constants$4.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     unsigned int low;
     *     unsigned int high;
     * };
     * }
     */
    public static final class lh {

        // Suppresses default constructor, ensuring non-instantiability.
        private lh() {}
        public static MemoryLayout $LAYOUT() {
            return constants$4.const$4;
        }
        public static VarHandle low$VH() {
            return constants$4.const$5;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int low;
         * }
         */
        public static int low$get(MemorySegment seg) {
            return (int)constants$4.const$5.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int low;
         * }
         */
        public static void low$set(MemorySegment seg, int x) {
            constants$4.const$5.set(seg, x);
        }
        public static int low$get(MemorySegment seg, long index) {
            return (int)constants$4.const$5.get(seg.asSlice(index*sizeof()));
        }
        public static void low$set(MemorySegment seg, long index, int x) {
            constants$4.const$5.set(seg.asSlice(index*sizeof()), x);
        }
        public static VarHandle high$VH() {
            return constants$5.const$0;
        }
        /**
         * Getter for field:
         * {@snippet :
         * unsigned int high;
         * }
         */
        public static int high$get(MemorySegment seg) {
            return (int)constants$5.const$0.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * unsigned int high;
         * }
         */
        public static void high$set(MemorySegment seg, int x) {
            constants$5.const$0.set(seg, x);
        }
        public static int high$get(MemorySegment seg, long index) {
            return (int)constants$5.const$0.get(seg.asSlice(index*sizeof()));
        }
        public static void high$set(MemorySegment seg, long index, int x) {
            constants$5.const$0.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
    }

    public static MemorySegment lh$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

