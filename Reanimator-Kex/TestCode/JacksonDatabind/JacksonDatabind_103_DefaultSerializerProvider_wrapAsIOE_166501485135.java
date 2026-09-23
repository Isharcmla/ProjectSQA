package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DefaultSerializerProvider_wrapAsIOE_166501485135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2298;

    public DefaultSerializerProvider_wrapAsIOE_166501485135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2367 = Class.forName((String) "java.lang.invoke.VarHandleBytes");
        Class<? extends Object> term2370 = Class.forName((String) "java.io.DataOutputStream");
        Class<? extends Object> term2372 = Class.forName((String) "kex.java.util.LinkedList");
        Class<? extends Object> term2376 = Class.forName((String) "java.lang.invoke.VarHandleShorts");
        Class<? extends Object> term2381 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers");
        Class<? extends Object> term2385 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfDouble");
        Class<? extends Object> term2389 = Class.forName((String) "java.util.regex.Pattern$SliceS");
        Class<? extends Object> term2393 = Class.forName((String) "java.lang.invoke.VarHandleLongs");
        Class<? extends Object> term2397 = Class.forName((String) "java.lang.Math$RandomNumberGeneratorHolder");
        Class<? extends Object> term2401 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat$Sorter");
        Class<? extends Object> term2405 = Class.forName((String) "java.nio.file.StandardCopyOption");
        Class<? extends Object> term2409 = Class.forName((String) "java.nio.Bits");
        Class<? extends Object> term2413 = Class.forName((String) "java.util.zip.Deflater");
        Class<? extends Object> term2417 = Class.forName((String) "java.util.concurrent.RunnableScheduledFuture");
        Class<? extends Object> term2419 = Class.forName((String) "java.lang.InheritableThreadLocal");
        Class<? extends Object> term2422 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldStaticReadWrite");
        Class<? extends Object> term2424 = Class.forName((String) "java.util.HashMap$HashIterator");
        Class<? extends Object> term2426 = Class.forName((String) "kex.java.util.concurrent.atomic.AtomicStampedReference");
        Class<? extends Object> term2529 = Class.forName((String) "java.nio.channels.UnsupportedAddressTypeException");
        Class<? extends Object> term2531 = Class.forName((String) "java.util.Spliterators$AbstractLongSpliterator$HoldingLongConsumer");
        term2298 = newInstance(Class.forName("java.lang.Exception"));
        Object[] term2299 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2300 = (short[]) newShortArray(32);
        int[] term2333 = (int[]) newIntArray(32);
        Object[] term2366 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2428 = (long[]) newLongArray(32);
        Object[] term2461 = (Object[]) newArray("java.lang.Object", 5);
        short[] term2462 = (short[]) newShortArray(32);
        int[] term2495 = (int[]) newIntArray(32);
        Object[] term2528 = (Object[]) newArray("java.lang.Object", 32);
        long[] term2533 = (long[]) newLongArray(32);
        Object[] term2578 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term2580 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term2300, 0, (short) 1);
        setShortElement(term2300, 1, (short) 2);
        setShortElement(term2300, 2, (short) 1);
        setShortElement(term2300, 3, (short) 7);
        setShortElement(term2300, 4, (short) 2);
        setShortElement(term2300, 5, (short) 1);
        setShortElement(term2300, 6, (short) 6);
        setShortElement(term2300, 7, (short) 2);
        setShortElement(term2300, 8, (short) 10);
        setShortElement(term2300, 9, (short) 11);
        setShortElement(term2300, 10, (short) 29);
        setShortElement(term2300, 11, (short) 5);
        setShortElement(term2300, 12, (short) 4);
        setShortElement(term2300, 13, (short) 5);
        setShortElement(term2300, 14, (short) 6);
        setShortElement(term2300, 15, (short) 7);
        setShortElement(term2300, 16, (short) 10);
        setShortElement(term2300, 17, (short) 11);
        setShortElement(term2300, 18, (short) 12);
        setShortElement(term2300, 19, (short) 4);
        setShortElement(term2300, 20, (short) 1);
        setShortElement(term2300, 23, (short) 3);
        setShortElement(term2300, 24, (short) 4);
        setShortElement(term2300, 25, (short) 4);
        setShortElement(term2300, 26, (short) 1);
        setShortElement(term2300, 27, (short) 2);
        setShortElement(term2300, 28, (short) 3);
        setShortElement(term2300, 29, (short) 3);
        setShortElement(term2300, 30, (short) 13);
        setShortElement(term2300, 31, (short) 1);
        setElement(term2299, 0, term2300);
        setIntElement(term2333, 1, 5570560);
        setIntElement(term2333, 2, 327680);
        setIntElement(term2333, 3, 4456454);
        setIntElement(term2333, 4, 1769472);
        setIntElement(term2333, 5, 14876672);
        setIntElement(term2333, 6, 6225920);
        setIntElement(term2333, 7, 917504);
        setIntElement(term2333, 8, 327680);
        setIntElement(term2333, 9, 8519680);
        setIntElement(term2333, 10, 917504);
        setIntElement(term2333, 11, 11993088);
        setIntElement(term2333, 12, 655360);
        setIntElement(term2333, 13, 7864320);
        setIntElement(term2333, 14, 3735552);
        setIntElement(term2333, 15, 7143424);
        setIntElement(term2333, 16, 8454144);
        setIntElement(term2333, 17, 9240576);
        setIntElement(term2333, 18, 196608);
        setIntElement(term2333, 19, 3801088);
        setIntElement(term2333, 20, 786432);
        setIntElement(term2333, 21, 589824);
        setIntElement(term2333, 22, 17170432);
        setIntElement(term2333, 23, 1376256);
        setIntElement(term2333, 24, 5242880);
        setIntElement(term2333, 25, 2883584);
        setIntElement(term2333, 26, 20774912);
        setIntElement(term2333, 27, 262144);
        setIntElement(term2333, 28, 2555904);
        setIntElement(term2333, 29, 1835008);
        setIntElement(term2333, 30, 6029312);
        setIntElement(term2333, 31, 327680);
        setElement(term2299, 1, term2333);
        setElement(term2366, 0, term2367);
        setElement(term2366, 1, term2367);
        setElement(term2366, 2, term2370);
        setElement(term2366, 3, term2372);
        setElement(term2366, 4, term2376);
        setElement(term2366, 5, term2376);
        setElement(term2366, 6, term2381);
        setElement(term2366, 7, term2381);
        setElement(term2366, 8, term2385);
        setElement(term2366, 9, term2385);
        setElement(term2366, 10, term2385);
        setElement(term2366, 11, term2385);
        setElement(term2366, 12, term2385);
        setElement(term2366, 13, term2389);
        setElement(term2366, 14, term2389);
        setElement(term2366, 15, term2393);
        setElement(term2366, 16, term2393);
        setElement(term2366, 17, term2393);
        setElement(term2366, 18, term2393);
        setElement(term2366, 19, term2397);
        setElement(term2366, 20, term2397);
        setElement(term2366, 21, term2397);
        setElement(term2366, 22, term2401);
        setElement(term2366, 23, term2393);
        setElement(term2366, 24, term2405);
        setElement(term2366, 25, term2409);
        setElement(term2366, 26, term2413);
        setElement(term2366, 27, term2417);
        setElement(term2366, 28, term2419);
        setElement(term2366, 29, term2422);
        setElement(term2366, 30, term2424);
        setElement(term2366, 31, term2426);
        setElement(term2299, 2, term2366);
        setLongElement(term2428, 0, 34363746224L);
        setLongElement(term2428, 1, 34363775512L);
        setLongElement(term2428, 2, 34363775512L);
        setLongElement(term2428, 3, 34363775512L);
        setLongElement(term2428, 4, 134402348647296L);
        setLongElement(term2428, 5, 34364440080L);
        setLongElement(term2428, 6, 134402348714400L);
        setLongElement(term2428, 7, 134402348305760L);
        setLongElement(term2428, 8, 134402348305648L);
        setLongElement(term2428, 9, 134402348305792L);
        setLongElement(term2428, 10, 134402348568128L);
        setLongElement(term2428, 11, 34363766248L);
        setLongElement(term2428, 12, 34363766248L);
        setLongElement(term2428, 13, 134398941312448L);
        setLongElement(term2428, 14, 134398941312448L);
        setLongElement(term2428, 15, 134398941312304L);
        setLongElement(term2428, 16, 134398941356208L);
        setLongElement(term2428, 17, 134398941357856L);
        setLongElement(term2428, 18, 134398941358624L);
        setLongElement(term2428, 19, 134402350485616L);
        setLongElement(term2428, 20, 34363739368L);
        setLongElement(term2428, 21, 34363739368L);
        setLongElement(term2428, 22, 134398941310944L);
        setLongElement(term2428, 23, 34363829248L);
        setLongElement(term2428, 24, 134402350485616L);
        setLongElement(term2428, 25, 134402350315536L);
        setLongElement(term2428, 26, 34363745472L);
        setLongElement(term2428, 27, 34364710216L);
        setLongElement(term2428, 28, 34363745472L);
        setLongElement(term2428, 29, 34363745472L);
        setLongElement(term2428, 30, 34364896224L);
        setLongElement(term2428, 31, 34363745472L);
        setElement(term2299, 3, term2428);
        setShortElement(term2462, 0, (short) 2);
        setShortElement(term2462, 1, (short) 12);
        setElement(term2461, 0, term2462);
        setIntElement(term2495, 0, 1638400);
        setIntElement(term2495, 1, 720907);
        setElement(term2461, 1, term2495);
        setElement(term2528, 0, term2529);
        setElement(term2528, 1, term2531);
        setElement(term2461, 2, term2528);
        setLongElement(term2533, 0, 34363745472L);
        setLongElement(term2533, 1, 34363745472L);
        setElement(term2461, 3, term2533);
        setElement(term2299, 4, term2461);
        setField(term2298, term2298.getClass(), "backtrace", term2299);
        setField(term2298, term2298.getClass(), "detailMessage", "sjlJAEtRrb");
        setField(term2298, term2298.getClass(), "cause", term2298);
        setField(term2298, term2298.getClass(), "stackTrace", term2578);
        setIntField(term2298, term2298.getClass(), "depth", 34);
        setIntField(term2580, term2580.getClass(), "modCount", 0);
        setField(term2298, term2298.getClass(), "suppressedExceptions", term2580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2298;
        try {
            callMethod(klass, "_wrapAsIOE", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


