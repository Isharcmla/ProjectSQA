package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class SerializerProvider_reportMappingProblem_499796544116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6442;
     Object term6742;

    public SerializerProvider_reportMappingProblem_499796544116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6511 = Class.forName((String) "java.lang.ref.Finalizer$1");
        Class<? extends Object> term6514 = Class.forName((String) "java.util.LinkedHashSet");
        Class<? extends Object> term6516 = Class.forName((String) "java.util.function.IntUnaryOperator");
        Class<? extends Object> term6520 = Class.forName((String) "java.util.AbstractMap$2");
        Class<? extends Object> term6525 = Class.forName((String) "java.io.NotSerializableException");
        Class<? extends Object> term6529 = Class.forName((String) "com.fasterxml.jackson.databind.ser.package-info");
        Class<? extends Object> term6533 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term6537 = Class.forName((String) "java.util.BitSet");
        Class<? extends Object> term6541 = Class.forName((String) "java.util.jar.JarInputStream");
        Class<? extends Object> term6545 = Class.forName((String) "java.nio.channels.GatheringByteChannel");
        Class<? extends Object> term6549 = Class.forName((String) "java.io.ObjectStreamClass$4");
        Class<? extends Object> term6553 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term6557 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        Class<? extends Object> term6561 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleInlineCopyStrategy$2");
        Class<? extends Object> term6564 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Class<? extends Object> term6567 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        Class<? extends Object> term6570 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term6573 = Class.forName((String) "java.util.stream.LongPipeline$9$1");
        Class<? extends Object> term6677 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser");
        Class<? extends Object> term6679 = Class.forName((String) "java.lang.InheritableThreadLocal");
        term6442 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6443 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6444 = (short[]) newShortArray(32);
        int[] term6477 = (int[]) newIntArray(32);
        Object[] term6510 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6576 = (long[]) newLongArray(32);
        Object[] term6609 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6610 = (short[]) newShortArray(32);
        int[] term6643 = (int[]) newIntArray(32);
        Object[] term6676 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6681 = (long[]) newLongArray(32);
        Object[] term6726 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6728 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6444, 0, (short) 1);
        setShortElement(term6444, 1, (short) 2);
        setShortElement(term6444, 2, (short) 1);
        setShortElement(term6444, 3, (short) 7);
        setShortElement(term6444, 4, (short) 2);
        setShortElement(term6444, 5, (short) 1);
        setShortElement(term6444, 6, (short) 6);
        setShortElement(term6444, 7, (short) 2);
        setShortElement(term6444, 8, (short) 10);
        setShortElement(term6444, 9, (short) 11);
        setShortElement(term6444, 10, (short) 29);
        setShortElement(term6444, 11, (short) 5);
        setShortElement(term6444, 12, (short) 4);
        setShortElement(term6444, 13, (short) 5);
        setShortElement(term6444, 14, (short) 6);
        setShortElement(term6444, 15, (short) 7);
        setShortElement(term6444, 16, (short) 10);
        setShortElement(term6444, 17, (short) 11);
        setShortElement(term6444, 18, (short) 12);
        setShortElement(term6444, 19, (short) 4);
        setShortElement(term6444, 20, (short) 1);
        setShortElement(term6444, 23, (short) 3);
        setShortElement(term6444, 24, (short) 4);
        setShortElement(term6444, 25, (short) 4);
        setShortElement(term6444, 26, (short) 1);
        setShortElement(term6444, 27, (short) 2);
        setShortElement(term6444, 28, (short) 3);
        setShortElement(term6444, 29, (short) 3);
        setShortElement(term6444, 30, (short) 13);
        setShortElement(term6444, 31, (short) 1);
        setElement(term6443, 0, term6444);
        setIntElement(term6477, 1, 5570560);
        setIntElement(term6477, 2, 327680);
        setIntElement(term6477, 3, 4456454);
        setIntElement(term6477, 4, 1769472);
        setIntElement(term6477, 5, 14876672);
        setIntElement(term6477, 6, 6225920);
        setIntElement(term6477, 7, 917504);
        setIntElement(term6477, 8, 327680);
        setIntElement(term6477, 9, 8519680);
        setIntElement(term6477, 10, 917504);
        setIntElement(term6477, 11, 11993088);
        setIntElement(term6477, 12, 655360);
        setIntElement(term6477, 13, 7864320);
        setIntElement(term6477, 14, 3735552);
        setIntElement(term6477, 15, 7143424);
        setIntElement(term6477, 16, 8454144);
        setIntElement(term6477, 17, 9240576);
        setIntElement(term6477, 18, 196608);
        setIntElement(term6477, 19, 3801088);
        setIntElement(term6477, 20, 786432);
        setIntElement(term6477, 21, 589824);
        setIntElement(term6477, 22, 17170432);
        setIntElement(term6477, 23, 1376256);
        setIntElement(term6477, 24, 5242880);
        setIntElement(term6477, 25, 2883584);
        setIntElement(term6477, 26, 20774912);
        setIntElement(term6477, 27, 262144);
        setIntElement(term6477, 28, 2555904);
        setIntElement(term6477, 29, 1835008);
        setIntElement(term6477, 30, 6029312);
        setIntElement(term6477, 31, 327680);
        setElement(term6443, 1, term6477);
        setElement(term6510, 0, term6511);
        setElement(term6510, 1, term6511);
        setElement(term6510, 2, term6514);
        setElement(term6510, 3, term6516);
        setElement(term6510, 4, term6520);
        setElement(term6510, 5, term6520);
        setElement(term6510, 6, term6525);
        setElement(term6510, 7, term6525);
        setElement(term6510, 8, term6529);
        setElement(term6510, 9, term6529);
        setElement(term6510, 10, term6529);
        setElement(term6510, 11, term6529);
        setElement(term6510, 12, term6529);
        setElement(term6510, 13, term6533);
        setElement(term6510, 14, term6533);
        setElement(term6510, 15, term6537);
        setElement(term6510, 16, term6537);
        setElement(term6510, 17, term6537);
        setElement(term6510, 18, term6537);
        setElement(term6510, 19, term6541);
        setElement(term6510, 20, term6541);
        setElement(term6510, 21, term6541);
        setElement(term6510, 22, term6545);
        setElement(term6510, 23, term6537);
        setElement(term6510, 24, term6549);
        setElement(term6510, 25, term6553);
        setElement(term6510, 26, term6557);
        setElement(term6510, 27, term6561);
        setElement(term6510, 28, term6564);
        setElement(term6510, 29, term6567);
        setElement(term6510, 30, term6570);
        setElement(term6510, 31, term6573);
        setElement(term6443, 2, term6510);
        setLongElement(term6576, 0, 34363746224L);
        setLongElement(term6576, 1, 34363775512L);
        setLongElement(term6576, 2, 34363775512L);
        setLongElement(term6576, 3, 34363775512L);
        setLongElement(term6576, 4, 135751908134864L);
        setLongElement(term6576, 5, 34364440080L);
        setLongElement(term6576, 6, 135751908201968L);
        setLongElement(term6576, 7, 135751907559328L);
        setLongElement(term6576, 8, 135751907559216L);
        setLongElement(term6576, 9, 135751907559360L);
        setLongElement(term6576, 10, 135751907826432L);
        setLongElement(term6576, 11, 34363766248L);
        setLongElement(term6576, 12, 34363766248L);
        setLongElement(term6576, 13, 135748386964304L);
        setLongElement(term6576, 14, 135748386964304L);
        setLongElement(term6576, 15, 135748386964160L);
        setLongElement(term6576, 16, 135748387007376L);
        setLongElement(term6576, 17, 135748387009024L);
        setLongElement(term6576, 18, 135748387009792L);
        setLongElement(term6576, 19, 135748383823440L);
        setLongElement(term6576, 20, 34363739368L);
        setLongElement(term6576, 21, 34363739368L);
        setLongElement(term6576, 22, 135748386976752L);
        setLongElement(term6576, 23, 34363829248L);
        setLongElement(term6576, 24, 135748383823440L);
        setLongElement(term6576, 25, 135748383810544L);
        setLongElement(term6576, 26, 34363745472L);
        setLongElement(term6576, 27, 34364710216L);
        setLongElement(term6576, 28, 34363745472L);
        setLongElement(term6576, 29, 34363745472L);
        setLongElement(term6576, 30, 34364896224L);
        setLongElement(term6576, 31, 34363745472L);
        setElement(term6443, 3, term6576);
        setShortElement(term6610, 0, (short) 2);
        setShortElement(term6610, 1, (short) 12);
        setElement(term6609, 0, term6610);
        setIntElement(term6643, 0, 1638400);
        setIntElement(term6643, 1, 720907);
        setElement(term6609, 1, term6643);
        setElement(term6676, 0, term6677);
        setElement(term6676, 1, term6679);
        setElement(term6609, 2, term6676);
        setLongElement(term6681, 0, 34363745472L);
        setLongElement(term6681, 1, 34363745472L);
        setElement(term6609, 3, term6681);
        setElement(term6443, 4, term6609);
        setField(term6442, term6442.getClass(), "backtrace", term6443);
        setField(term6442, term6442.getClass(), "detailMessage", "RMFIsYGgne");
        setField(term6442, term6442.getClass(), "cause", term6442);
        setField(term6442, term6442.getClass(), "stackTrace", term6726);
        setIntField(term6442, term6442.getClass(), "depth", 34);
        setIntField(term6728, term6728.getClass(), "modCount", 0);
        setField(term6442, term6442.getClass(), "suppressedExceptions", term6728);
        term6742 = (Object[]) newArray("java.lang.Object", 3);
        Object term6743 = newInstance(Class.forName("java.lang.Object"));
        Object term6744 = newInstance(Class.forName("java.lang.Object"));
        Object term6745 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6742, 0, term6743);
        setElement(term6742, 1, term6744);
        setElement(term6742, 2, term6745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term6442;
        args[1] = "NRdvgJlhkX";
        args[2] = term6742;
        try {
            callMethod(klass, "reportMappingProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


