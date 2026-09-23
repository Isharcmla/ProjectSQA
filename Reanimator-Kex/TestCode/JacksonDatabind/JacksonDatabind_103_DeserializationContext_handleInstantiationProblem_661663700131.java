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

public class DeserializationContext_handleInstantiationProblem_661663700131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2532;
     Object term2533;

    public DeserializationContext_handleInstantiationProblem_661663700131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2532 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term2602 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        Class<? extends Object> term2605 = Class.forName((String) "java.util.stream.IntPipeline$1");
        Class<? extends Object> term2607 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$EntrySpliterator");
        Class<? extends Object> term2611 = Class.forName((String) "java.util.spi.CalendarNameProvider");
        Class<? extends Object> term2616 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        Class<? extends Object> term2620 = Class.forName((String) "java.nio.file.FileSystemLoopException");
        Class<? extends Object> term2624 = Class.forName((String) "java.lang.InstantiationException");
        Class<? extends Object> term2628 = Class.forName((String) "java.util.function.IntFunction");
        Class<? extends Object> term2632 = Class.forName((String) "java.util.EnumMap$1");
        Class<? extends Object> term2636 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
        Class<? extends Object> term2640 = Class.forName((String) "java.io.ObjectInputStream$Logging");
        Class<? extends Object> term2644 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        Class<? extends Object> term2648 = Class.forName((String) "java.util.EnumMap$ValueIterator");
        Class<? extends Object> term2652 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        Class<? extends Object> term2655 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        Class<? extends Object> term2658 = Class.forName((String) "java.util.Calendar$1");
        Class<? extends Object> term2661 = Class.forName((String) "java.io.ObjectStreamConstants");
        Class<? extends Object> term2664 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term2768 = Class.forName((String) "java.util.SortedSet$1");
        Class<? extends Object> term2770 = Class.forName((String) "java.util.stream.ReduceOps$Box");
        term2533 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term2534 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2535 = (short[]) newShortArray(32);
        int[] term2568 = (int[]) newIntArray(32);
        Object[] term2601 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2667 = (long[]) newLongArray(32);
        Object[] term2700 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2701 = (short[]) newShortArray(32);
        int[] term2734 = (int[]) newIntArray(32);
        Object[] term2767 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2772 = (long[]) newLongArray(32);
        Object[] term2817 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term2819 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term2535, 0, (short) 1);
        setShortElement(term2535, 1, (short) 2);
        setShortElement(term2535, 2, (short) 1);
        setShortElement(term2535, 3, (short) 7);
        setShortElement(term2535, 4, (short) 2);
        setShortElement(term2535, 5, (short) 1);
        setShortElement(term2535, 6, (short) 6);
        setShortElement(term2535, 7, (short) 2);
        setShortElement(term2535, 8, (short) 10);
        setShortElement(term2535, 9, (short) 11);
        setShortElement(term2535, 10, (short) 29);
        setShortElement(term2535, 11, (short) 5);
        setShortElement(term2535, 12, (short) 4);
        setShortElement(term2535, 13, (short) 6);
        setShortElement(term2535, 14, (short) 8);
        setShortElement(term2535, 15, (short) 6);
        setShortElement(term2535, 16, (short) 9);
        setShortElement(term2535, 17, (short) 10);
        setShortElement(term2535, 18, (short) 11);
        setShortElement(term2535, 19, (short) 4);
        setShortElement(term2535, 20, (short) 1);
        setShortElement(term2535, 22, (short) 10);
        setShortElement(term2535, 23, (short) 3);
        setShortElement(term2535, 24, (short) 4);
        setShortElement(term2535, 25, (short) 9);
        setShortElement(term2535, 26, (short) 1);
        setShortElement(term2535, 27, (short) 2);
        setShortElement(term2535, 28, (short) 3);
        setShortElement(term2535, 29, (short) 3);
        setShortElement(term2535, 30, (short) 13);
        setShortElement(term2535, 31, (short) 1);
        setElement(term2534, 0, term2535);
        setIntElement(term2568, 1, 5570560);
        setIntElement(term2568, 2, 327680);
        setIntElement(term2568, 3, 4456454);
        setIntElement(term2568, 4, 1769472);
        setIntElement(term2568, 5, 14876672);
        setIntElement(term2568, 6, 6225920);
        setIntElement(term2568, 7, 917504);
        setIntElement(term2568, 8, 327680);
        setIntElement(term2568, 9, 8519680);
        setIntElement(term2568, 10, 917504);
        setIntElement(term2568, 11, 11993088);
        setIntElement(term2568, 12, 655360);
        setIntElement(term2568, 13, 7864320);
        setIntElement(term2568, 14, 3735552);
        setIntElement(term2568, 15, 7143424);
        setIntElement(term2568, 16, 8454144);
        setIntElement(term2568, 17, 9240576);
        setIntElement(term2568, 18, 196608);
        setIntElement(term2568, 19, 3801088);
        setIntElement(term2568, 20, 786432);
        setIntElement(term2568, 21, 589824);
        setIntElement(term2568, 22, 17170432);
        setIntElement(term2568, 23, 1376256);
        setIntElement(term2568, 24, 5242880);
        setIntElement(term2568, 25, 2883584);
        setIntElement(term2568, 26, 20774912);
        setIntElement(term2568, 27, 262144);
        setIntElement(term2568, 28, 2555904);
        setIntElement(term2568, 29, 1835008);
        setIntElement(term2568, 30, 6029312);
        setIntElement(term2568, 31, 327680);
        setElement(term2534, 1, term2568);
        setElement(term2601, 0, term2602);
        setElement(term2601, 1, term2602);
        setElement(term2601, 2, term2605);
        setElement(term2601, 3, term2607);
        setElement(term2601, 4, term2611);
        setElement(term2601, 5, term2611);
        setElement(term2601, 6, term2616);
        setElement(term2601, 7, term2616);
        setElement(term2601, 8, term2620);
        setElement(term2601, 9, term2620);
        setElement(term2601, 10, term2620);
        setElement(term2601, 11, term2620);
        setElement(term2601, 12, term2620);
        setElement(term2601, 13, term2624);
        setElement(term2601, 14, term2624);
        setElement(term2601, 15, term2628);
        setElement(term2601, 16, term2628);
        setElement(term2601, 17, term2628);
        setElement(term2601, 18, term2628);
        setElement(term2601, 19, term2632);
        setElement(term2601, 20, term2632);
        setElement(term2601, 21, term2632);
        setElement(term2601, 22, term2636);
        setElement(term2601, 23, term2628);
        setElement(term2601, 24, term2640);
        setElement(term2601, 25, term2644);
        setElement(term2601, 26, term2648);
        setElement(term2601, 27, term2652);
        setElement(term2601, 28, term2655);
        setElement(term2601, 29, term2658);
        setElement(term2601, 30, term2661);
        setElement(term2601, 31, term2664);
        setElement(term2534, 2, term2601);
        setLongElement(term2667, 0, 34363746224L);
        setLongElement(term2667, 1, 34363775512L);
        setLongElement(term2667, 2, 34363775512L);
        setLongElement(term2667, 3, 34363775512L);
        setLongElement(term2667, 4, 132755497387184L);
        setLongElement(term2667, 5, 34364440080L);
        setLongElement(term2667, 6, 132755497454240L);
        setLongElement(term2667, 7, 132755497261584L);
        setLongElement(term2667, 8, 132755497261472L);
        setLongElement(term2667, 9, 132755497261616L);
        setLongElement(term2667, 10, 132755497340720L);
        setLongElement(term2667, 11, 34363766248L);
        setLongElement(term2667, 12, 34363766248L);
        setLongElement(term2667, 13, 132752053541984L);
        setLongElement(term2667, 14, 132752053541984L);
        setLongElement(term2667, 15, 132752053541840L);
        setLongElement(term2667, 16, 132752053585744L);
        setLongElement(term2667, 17, 132752053587392L);
        setLongElement(term2667, 18, 132752053588160L);
        setLongElement(term2667, 19, 132755499210672L);
        setLongElement(term2667, 20, 34363739368L);
        setLongElement(term2667, 21, 34363739368L);
        setLongElement(term2667, 22, 132752053540480L);
        setLongElement(term2667, 23, 34363829248L);
        setLongElement(term2667, 24, 132755499210672L);
        setLongElement(term2667, 25, 132755500583712L);
        setLongElement(term2667, 26, 34363745472L);
        setLongElement(term2667, 27, 34364710216L);
        setLongElement(term2667, 28, 34363745472L);
        setLongElement(term2667, 29, 34363745472L);
        setLongElement(term2667, 30, 34364896224L);
        setLongElement(term2667, 31, 34363745472L);
        setElement(term2534, 3, term2667);
        setShortElement(term2701, 0, (short) 2);
        setShortElement(term2701, 1, (short) 12);
        setElement(term2700, 0, term2701);
        setIntElement(term2734, 0, 1638400);
        setIntElement(term2734, 1, 720907);
        setElement(term2700, 1, term2734);
        setElement(term2767, 0, term2768);
        setElement(term2767, 1, term2770);
        setElement(term2700, 2, term2767);
        setLongElement(term2772, 0, 34363745472L);
        setLongElement(term2772, 1, 34363745472L);
        setElement(term2700, 3, term2772);
        setElement(term2534, 4, term2700);
        setField(term2533, term2533.getClass(), "backtrace", term2534);
        setField(term2533, term2533.getClass(), "detailMessage", "NRdvgJlhkX");
        setField(term2533, term2533.getClass(), "cause", term2533);
        setField(term2533, term2533.getClass(), "stackTrace", term2817);
        setIntField(term2533, term2533.getClass(), "depth", 34);
        setIntField(term2819, term2819.getClass(), "modCount", 0);
        setField(term2533, term2533.getClass(), "suppressedExceptions", term2819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2532;
        args[2] = term2533;
        try {
            callMethod(klass, "handleInstantiationProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


