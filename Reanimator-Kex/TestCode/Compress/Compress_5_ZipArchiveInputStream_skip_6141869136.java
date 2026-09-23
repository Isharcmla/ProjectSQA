package org.apache.commons.compress.archivers.zip;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Long;

public class ZipArchiveInputStream_skip_6141869136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2712;
     Object term2892;

    public ZipArchiveInputStream_skip_6141869136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2757 = new LinkedHashMap();
        Class<? extends Object> term2903 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2902 = ((Class) term2903).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2902).setAccessible(true);
        Object enum9 = ((Field) term2902).get((Object) null);
        Class<? extends Object> term3101 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3100 = ((Class) term3101).getDeclaredField((String) "MICROSECONDS");
        ((Field) term3100).setAccessible(true);
        Object enum10 = ((Field) term3100).get((Object) null);
        Class<? extends Object> term3299 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3298 = ((Class) term3299).getDeclaredField((String) "MILLISECONDS");
        ((Field) term3298).setAccessible(true);
        Object enum11 = ((Field) term3298).get((Object) null);
        term2712 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term2714 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term2715 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term2717 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2718 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2719 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term2720 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term2722 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term2723 = (byte[]) newByteArray(0);
        byte[] term2733 = (byte[]) newByteArray(2);
        Object term2744 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term2746 = (byte[]) newByteArray(6);
        Object term2753 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2778 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2791 = newInstance(Class.forName("java.time.Instant"));
        Object term2806 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2819 = newInstance(Class.forName("java.time.Instant"));
        Object term2834 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2847 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2867 = (byte[]) newByteArray(1);
        byte[] term2889 = (byte[]) newByteArray(1);
        setField(term2712, term2712.getClass(), "zipEncoding", null);
        setBooleanField(term2712, term2712.getClass(), "useUnicodeExtraFields", false);
        setField(term2712, term2712.getClass(), "in", null);
        setLongField(term2715, term2715.getClass(), "address", 132947026979040L);
        setField(term2717, term2717.getClass(), "action", term2715);
        setField(term2718, term2718.getClass(), "action", null);
        setField(term2718, term2718.getClass(), "prev", null);
        setField(term2718, term2718.getClass(), "next", term2717);
        setField(term2718, term2718.getClass(), "list", term2718);
        setField(term2718, term2718.getClass(), "referent", null);
        setField(term2718, term2718.getClass(), "queue", null);
        setField(term2718, term2718.getClass(), "next", null);
        setField(term2718, term2718.getClass(), "discovered", null);
        setField(term2717, term2717.getClass(), "prev", term2718);
        setField(term2719, term2719.getClass(), "action", null);
        setField(term2719, term2719.getClass(), "prev", term2717);
        setField(term2719, term2719.getClass(), "next", null);
        setField(term2719, term2719.getClass(), "list", term2718);
        setField(term2719, term2719.getClass(), "referent", null);
        setField(term2719, term2719.getClass(), "queue", null);
        setField(term2719, term2719.getClass(), "next", null);
        setField(term2719, term2719.getClass(), "discovered", null);
        setField(term2717, term2717.getClass(), "next", term2719);
        setField(term2717, term2717.getClass(), "list", term2718);
        setField(term2717, term2717.getClass(), "referent", term2714);
        setField(term2720, term2720.getClass(), "lock", null);
        setField(term2720, term2720.getClass(), "head", null);
        setLongField(term2720, term2720.getClass(), "queueLength", 0L);
        setField(term2717, term2717.getClass(), "queue", term2720);
        setField(term2717, term2717.getClass(), "next", null);
        setField(term2717, term2717.getClass(), "discovered", null);
        setField(term2715, term2715.getClass(), "cleanable", term2717);
        setField(term2714, term2714.getClass(), "zsRef", term2715);
        setField(term2722, term2722.getClass(), "hb", term2723);
        setIntField(term2722, term2722.getClass(), "offset", 0);
        setBooleanField(term2722, term2722.getClass(), "isReadOnly", false);
        setBooleanField(term2722, term2722.getClass(), "bigEndian", true);
        setBooleanField(term2722, term2722.getClass(), "nativeByteOrder", false);
        setIntField(term2722, term2722.getClass(), "mark", -1);
        setIntField(term2722, term2722.getClass(), "position", 0);
        setIntField(term2722, term2722.getClass(), "limit", 0);
        setIntField(term2722, term2722.getClass(), "capacity", 0);
        setLongField(term2722, term2722.getClass(), "address", 16L);
        setField(term2714, term2714.getClass(), "input", term2722);
        setByteElement(term2733, 0, (byte) 13);
        setByteElement(term2733, 1, (byte) 44);
        setField(term2714, term2714.getClass(), "inputArray", term2733);
        setIntField(term2714, term2714.getClass(), "inputPos", -1371869594);
        setIntField(term2714, term2714.getClass(), "inputLim", -2095575670);
        setBooleanField(term2714, term2714.getClass(), "finished", false);
        setBooleanField(term2714, term2714.getClass(), "needDict", false);
        setLongField(term2714, term2714.getClass(), "bytesRead", 2486810210675247493L);
        setLongField(term2714, term2714.getClass(), "bytesWritten", 7009926388951271268L);
        setIntField(term2714, term2714.getClass(), "inputConsumed", 1225272962);
        setIntField(term2714, term2714.getClass(), "outputConsumed", 1324040357);
        setField(term2712, term2712.getClass(), "inf", term2714);
        setIntField(term2744, term2744.getClass(), "crc", -1588772968);
        setField(term2712, term2712.getClass(), "crc", term2744);
        setByteElement(term2746, 0, (byte) -63);
        setByteElement(term2746, 1, (byte) 15);
        setByteElement(term2746, 2, (byte) 45);
        setByteElement(term2746, 3, (byte) -39);
        setByteElement(term2746, 4, (byte) -20);
        setByteElement(term2746, 5, (byte) 10);
        setField(term2712, term2712.getClass(), "buf", term2746);
        setIntField(term2753, term2753.getClass(), "internalAttributes", -112921587);
        setIntField(term2753, term2753.getClass(), "platform", 933028652);
        setLongField(term2753, term2753.getClass(), "externalAttributes", -7672528020740371001L);
        setField(term2753, term2753.getClass(), "extraFields", term2757);
        setField(term2753, term2753.getClass(), "name", "");
        setLongField(term2753, term2753.getClass(), "xdostime", -1L);
        setField(term2778, term2778.getClass(), "unit", enum9);
        setLongField(term2778, term2778.getClass(), "value", -4502405999831680926L);
        setLongField(term2791, term2791.getClass(), "seconds", 1745480962L);
        setIntField(term2791, term2791.getClass(), "nanos", 80000000);
        setField(term2778, term2778.getClass(), "instant", term2791);
        setField(term2778, term2778.getClass(), "valueAsString", "xOEqzGAmDU");
        setField(term2753, term2753.getClass(), "mtime", term2778);
        setField(term2806, term2806.getClass(), "unit", enum10);
        setLongField(term2806, term2806.getClass(), "value", 1967728129628047933L);
        setLongField(term2819, term2819.getClass(), "seconds", 1349087753L);
        setIntField(term2819, term2819.getClass(), "nanos", 960000000);
        setField(term2806, term2806.getClass(), "instant", term2819);
        setField(term2806, term2806.getClass(), "valueAsString", "eZFUvlxvGV");
        setField(term2753, term2753.getClass(), "atime", term2806);
        setField(term2834, term2834.getClass(), "unit", enum11);
        setLongField(term2834, term2834.getClass(), "value", 2120084523938730454L);
        setLongField(term2847, term2847.getClass(), "seconds", 1706096172L);
        setIntField(term2847, term2847.getClass(), "nanos", 457000000);
        setField(term2834, term2834.getClass(), "instant", term2847);
        setField(term2834, term2834.getClass(), "valueAsString", "BYqFIqCKAV");
        setField(term2753, term2753.getClass(), "ctime", term2834);
        setLongField(term2753, term2753.getClass(), "crc", -1L);
        setLongField(term2753, term2753.getClass(), "size", -1L);
        setLongField(term2753, term2753.getClass(), "csize", -1L);
        setIntField(term2753, term2753.getClass(), "method", -1);
        setIntField(term2753, term2753.getClass(), "flag", 287287233);
        setByteElement(term2867, 0, (byte) 77);
        setField(term2753, term2753.getClass(), "extra", term2867);
        setField(term2753, term2753.getClass(), "comment", "vrQLuWIDJX");
        setField(term2712, term2712.getClass(), "current", term2753);
        setBooleanField(term2712, term2712.getClass(), "closed", true);
        setBooleanField(term2712, term2712.getClass(), "hitCentralDirectory", true);
        setIntField(term2712, term2712.getClass(), "readBytesOfEntry", 1540719661);
        setIntField(term2712, term2712.getClass(), "offsetInBuffer", 1265463001);
        setIntField(term2712, term2712.getClass(), "bytesReadFromStream", 335112684);
        setIntField(term2712, term2712.getClass(), "lengthOfLastRead", 1551099402);
        setBooleanField(term2712, term2712.getClass(), "hasDataDescriptor", true);
        setByteElement(term2889, 0, (byte) 14);
        setField(term2712, term2712.getClass(), "SINGLE", term2889);
        setIntField(term2712, term2712.getClass(), "bytesRead", -2027534003);
        term2892 = new Long(6855071767938501807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2892;
        callMethod(klass, "skip", argTypes, term2712, args);
    }

};


