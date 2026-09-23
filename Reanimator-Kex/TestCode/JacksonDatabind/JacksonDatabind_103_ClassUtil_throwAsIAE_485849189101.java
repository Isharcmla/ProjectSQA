package com.fasterxml.jackson.databind.util;

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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ClassUtil_throwAsIAE_485849189101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19358;

    public ClassUtil_throwAsIAE_485849189101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19427 = Class.forName((String) "java.io.ByteArrayInputStream");
        Class<? extends Object> term19430 = Class.forName((String) "java.io.SerializablePermission");
        Class<? extends Object> term19432 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$1");
        Class<? extends Object> term19436 = Class.forName((String) "java.nio.charset.CharacterCodingException");
        Class<? extends Object> term19441 = Class.forName((String) "java.util.concurrent.ForkJoinTask$AdaptedCallable");
        Class<? extends Object> term19445 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp");
        Class<? extends Object> term19449 = Class.forName((String) "java.math.BigDecimal$1");
        Class<? extends Object> term19453 = Class.forName((String) "java.util.AbstractList$RandomAccessSpliterator");
        Class<? extends Object> term19457 = Class.forName((String) "kex.java.lang.Double");
        Class<? extends Object> term19461 = Class.forName((String) "kex.java.util.HashMap$Values");
        Class<? extends Object> term19465 = Class.forName((String) "java.nio.file.CopyMoveHelper");
        Class<? extends Object> term19469 = Class.forName((String) "java.util.concurrent.CompletableFuture$Delayer$DaemonThreadFactory");
        Class<? extends Object> term19473 = Class.forName((String) "java.nio.channels.AlreadyBoundException");
        Class<? extends Object> term19477 = Class.forName((String) "java.util.Stack");
        Class<? extends Object> term19480 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase");
        Class<? extends Object> term19483 = Class.forName((String) "java.nio.channels.SelectableChannel");
        Class<? extends Object> term19486 = Class.forName((String) "java.util.ImmutableCollections$Set12$1");
        Class<? extends Object> term19489 = Class.forName((String) "java.util.zip.Deflater");
        Class<? extends Object> term19593 = Class.forName((String) "com.fasterxml.jackson.core.JsonStreamContext");
        Class<? extends Object> term19595 = Class.forName((String) "java.lang.Character$UnicodeBlock");
        term19358 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term19359 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19360 = (short[]) newShortArray(32);
        int[] term19393 = (int[]) newIntArray(32);
        Object[] term19426 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19492 = (long[]) newLongArray(32);
        Object[] term19525 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19526 = (short[]) newShortArray(32);
        int[] term19559 = (int[]) newIntArray(32);
        Object[] term19592 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19597 = (long[]) newLongArray(32);
        Object[] term19642 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term19644 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term19360, 0, (short) 1);
        setShortElement(term19360, 1, (short) 2);
        setShortElement(term19360, 2, (short) 1);
        setShortElement(term19360, 3, (short) 7);
        setShortElement(term19360, 4, (short) 2);
        setShortElement(term19360, 5, (short) 1);
        setShortElement(term19360, 6, (short) 6);
        setShortElement(term19360, 7, (short) 2);
        setShortElement(term19360, 8, (short) 10);
        setShortElement(term19360, 9, (short) 11);
        setShortElement(term19360, 10, (short) 29);
        setShortElement(term19360, 11, (short) 5);
        setShortElement(term19360, 12, (short) 4);
        setShortElement(term19360, 13, (short) 6);
        setShortElement(term19360, 14, (short) 8);
        setShortElement(term19360, 15, (short) 6);
        setShortElement(term19360, 16, (short) 9);
        setShortElement(term19360, 17, (short) 10);
        setShortElement(term19360, 18, (short) 11);
        setShortElement(term19360, 19, (short) 4);
        setShortElement(term19360, 20, (short) 1);
        setShortElement(term19360, 22, (short) 10);
        setShortElement(term19360, 23, (short) 3);
        setShortElement(term19360, 24, (short) 4);
        setShortElement(term19360, 25, (short) 9);
        setShortElement(term19360, 26, (short) 1);
        setShortElement(term19360, 27, (short) 2);
        setShortElement(term19360, 28, (short) 3);
        setShortElement(term19360, 29, (short) 3);
        setShortElement(term19360, 30, (short) 13);
        setShortElement(term19360, 31, (short) 1);
        setElement(term19359, 0, term19360);
        setIntElement(term19393, 1, 5570560);
        setIntElement(term19393, 2, 327680);
        setIntElement(term19393, 3, 4456454);
        setIntElement(term19393, 4, 1769472);
        setIntElement(term19393, 5, 14876672);
        setIntElement(term19393, 6, 6225920);
        setIntElement(term19393, 7, 917504);
        setIntElement(term19393, 8, 327680);
        setIntElement(term19393, 9, 8519680);
        setIntElement(term19393, 10, 917504);
        setIntElement(term19393, 11, 11993088);
        setIntElement(term19393, 12, 655360);
        setIntElement(term19393, 13, 7864320);
        setIntElement(term19393, 14, 3735552);
        setIntElement(term19393, 15, 7143424);
        setIntElement(term19393, 16, 8454144);
        setIntElement(term19393, 17, 9240576);
        setIntElement(term19393, 18, 196608);
        setIntElement(term19393, 19, 3801088);
        setIntElement(term19393, 20, 786432);
        setIntElement(term19393, 21, 589824);
        setIntElement(term19393, 22, 17170432);
        setIntElement(term19393, 23, 1376256);
        setIntElement(term19393, 24, 5242880);
        setIntElement(term19393, 25, 2883584);
        setIntElement(term19393, 26, 20774912);
        setIntElement(term19393, 27, 262144);
        setIntElement(term19393, 28, 2555904);
        setIntElement(term19393, 29, 1835008);
        setIntElement(term19393, 30, 6029312);
        setIntElement(term19393, 31, 327680);
        setElement(term19359, 1, term19393);
        setElement(term19426, 0, term19427);
        setElement(term19426, 1, term19427);
        setElement(term19426, 2, term19430);
        setElement(term19426, 3, term19432);
        setElement(term19426, 4, term19436);
        setElement(term19426, 5, term19436);
        setElement(term19426, 6, term19441);
        setElement(term19426, 7, term19441);
        setElement(term19426, 8, term19445);
        setElement(term19426, 9, term19445);
        setElement(term19426, 10, term19445);
        setElement(term19426, 11, term19445);
        setElement(term19426, 12, term19445);
        setElement(term19426, 13, term19449);
        setElement(term19426, 14, term19449);
        setElement(term19426, 15, term19453);
        setElement(term19426, 16, term19453);
        setElement(term19426, 17, term19453);
        setElement(term19426, 18, term19453);
        setElement(term19426, 19, term19457);
        setElement(term19426, 20, term19457);
        setElement(term19426, 21, term19457);
        setElement(term19426, 22, term19461);
        setElement(term19426, 23, term19453);
        setElement(term19426, 24, term19465);
        setElement(term19426, 25, term19469);
        setElement(term19426, 26, term19473);
        setElement(term19426, 27, term19477);
        setElement(term19426, 28, term19480);
        setElement(term19426, 29, term19483);
        setElement(term19426, 30, term19486);
        setElement(term19426, 31, term19489);
        setElement(term19359, 2, term19426);
        setLongElement(term19492, 0, 34363746224L);
        setLongElement(term19492, 1, 34363775512L);
        setLongElement(term19492, 2, 34363775512L);
        setLongElement(term19492, 3, 34363775512L);
        setLongElement(term19492, 4, 131482375099808L);
        setLongElement(term19492, 5, 34364440080L);
        setLongElement(term19492, 6, 131482375166912L);
        setLongElement(term19492, 7, 131482375009648L);
        setLongElement(term19492, 8, 131482375009536L);
        setLongElement(term19492, 9, 131482375009680L);
        setLongElement(term19492, 10, 131482375053392L);
        setLongElement(term19492, 11, 34363766248L);
        setLongElement(term19492, 12, 34363766248L);
        setLongElement(term19492, 13, 131478873767568L);
        setLongElement(term19492, 14, 131478873767568L);
        setLongElement(term19492, 15, 131478873767424L);
        setLongElement(term19492, 16, 131478873811328L);
        setLongElement(term19492, 17, 131478873812976L);
        setLongElement(term19492, 18, 131478873813744L);
        setLongElement(term19492, 19, 131482377128080L);
        setLongElement(term19492, 20, 34363739368L);
        setLongElement(term19492, 21, 34363739368L);
        setLongElement(term19492, 22, 131478873766064L);
        setLongElement(term19492, 23, 34363829248L);
        setLongElement(term19492, 24, 131482377128080L);
        setLongElement(term19492, 25, 131482377482976L);
        setLongElement(term19492, 26, 34363745472L);
        setLongElement(term19492, 27, 34364710216L);
        setLongElement(term19492, 28, 34363745472L);
        setLongElement(term19492, 29, 34363745472L);
        setLongElement(term19492, 30, 34364896224L);
        setLongElement(term19492, 31, 34363745472L);
        setElement(term19359, 3, term19492);
        setShortElement(term19526, 0, (short) 2);
        setShortElement(term19526, 1, (short) 12);
        setElement(term19525, 0, term19526);
        setIntElement(term19559, 0, 1638400);
        setIntElement(term19559, 1, 720907);
        setElement(term19525, 1, term19559);
        setElement(term19592, 0, term19593);
        setElement(term19592, 1, term19595);
        setElement(term19525, 2, term19592);
        setLongElement(term19597, 0, 34363745472L);
        setLongElement(term19597, 1, 34363745472L);
        setElement(term19525, 3, term19597);
        setElement(term19359, 4, term19525);
        setField(term19358, term19358.getClass(), "backtrace", term19359);
        setField(term19358, term19358.getClass(), "detailMessage", "hNxWaHcfhY");
        setField(term19358, term19358.getClass(), "cause", term19358);
        setField(term19358, term19358.getClass(), "stackTrace", term19642);
        setIntField(term19358, term19358.getClass(), "depth", 34);
        setIntField(term19644, term19644.getClass(), "modCount", 0);
        setField(term19358, term19358.getClass(), "suppressedExceptions", term19644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term19358;
        args[1] = "RkybSrpybU";
        try {
            callMethod(klass, "throwAsIAE", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


