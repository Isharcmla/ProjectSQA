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

public class JsonMappingException_from_208295631645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19101;

    public JsonMappingException_from_208295631645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19170 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Stringifiers$StringifierMost");
        Class<? extends Object> term19173 = Class.forName((String) "java.lang.FdLibm$Exp");
        Class<? extends Object> term19175 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock");
        Class<? extends Object> term19179 = Class.forName((String) "java.util.stream.IntStream$Builder");
        Class<? extends Object> term19184 = Class.forName((String) "java.io.OutputStream");
        Class<? extends Object> term19188 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor");
        Class<? extends Object> term19192 = Class.forName((String) "java.util.TooManyListenersException");
        Class<? extends Object> term19196 = Class.forName((String) "java.util.stream.AbstractShortCircuitTask");
        Class<? extends Object> term19200 = Class.forName((String) "java.util.Scanner$FindSpliterator");
        Class<? extends Object> term19204 = Class.forName((String) "java.lang.invoke.ConstantGroup$1");
        Class<? extends Object> term19208 = Class.forName((String) "java.util.stream.WhileOps$4");
        Class<? extends Object> term19212 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring");
        Class<? extends Object> term19216 = Class.forName((String) "java.util.concurrent.BrokenBarrierException");
        Class<? extends Object> term19220 = Class.forName((String) "java.io.Closeable");
        Class<? extends Object> term19223 = Class.forName((String) "java.util.EnumMap");
        Class<? extends Object> term19226 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedThreadFactory$1$1");
        Class<? extends Object> term19229 = Class.forName((String) "java.util.function.IntToDoubleFunction");
        Class<? extends Object> term19232 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer");
        Class<? extends Object> term19336 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldStaticReadOnly");
        Class<? extends Object> term19338 = Class.forName((String) "java.util.stream.Node$OfDouble");
        term19101 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term19102 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19103 = (short[]) newShortArray(32);
        int[] term19136 = (int[]) newIntArray(32);
        Object[] term19169 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19235 = (long[]) newLongArray(32);
        Object[] term19268 = (Object[]) newArray("java.lang.Object", 5);
        short[] term19269 = (short[]) newShortArray(32);
        int[] term19302 = (int[]) newIntArray(32);
        Object[] term19335 = (Object[]) newArray("java.lang.Object", 32);
        long[] term19340 = (long[]) newLongArray(32);
        Object[] term19385 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term19387 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term19103, 0, (short) 1);
        setShortElement(term19103, 1, (short) 2);
        setShortElement(term19103, 2, (short) 1);
        setShortElement(term19103, 3, (short) 7);
        setShortElement(term19103, 4, (short) 2);
        setShortElement(term19103, 5, (short) 1);
        setShortElement(term19103, 6, (short) 6);
        setShortElement(term19103, 7, (short) 2);
        setShortElement(term19103, 8, (short) 10);
        setShortElement(term19103, 9, (short) 11);
        setShortElement(term19103, 10, (short) 29);
        setShortElement(term19103, 11, (short) 5);
        setShortElement(term19103, 12, (short) 4);
        setShortElement(term19103, 13, (short) 5);
        setShortElement(term19103, 14, (short) 6);
        setShortElement(term19103, 15, (short) 6);
        setShortElement(term19103, 16, (short) 9);
        setShortElement(term19103, 17, (short) 10);
        setShortElement(term19103, 18, (short) 11);
        setShortElement(term19103, 19, (short) 4);
        setShortElement(term19103, 20, (short) 1);
        setShortElement(term19103, 23, (short) 3);
        setShortElement(term19103, 24, (short) 4);
        setShortElement(term19103, 25, (short) 4);
        setShortElement(term19103, 26, (short) 1);
        setShortElement(term19103, 27, (short) 2);
        setShortElement(term19103, 28, (short) 3);
        setShortElement(term19103, 29, (short) 3);
        setShortElement(term19103, 30, (short) 13);
        setShortElement(term19103, 31, (short) 1);
        setElement(term19102, 0, term19103);
        setIntElement(term19136, 1, 5570560);
        setIntElement(term19136, 2, 327680);
        setIntElement(term19136, 3, 4456454);
        setIntElement(term19136, 4, 1769472);
        setIntElement(term19136, 5, 14876672);
        setIntElement(term19136, 6, 6225920);
        setIntElement(term19136, 7, 917504);
        setIntElement(term19136, 8, 327680);
        setIntElement(term19136, 9, 8519680);
        setIntElement(term19136, 10, 917504);
        setIntElement(term19136, 11, 11993088);
        setIntElement(term19136, 12, 655360);
        setIntElement(term19136, 13, 7864320);
        setIntElement(term19136, 14, 3735552);
        setIntElement(term19136, 15, 7143424);
        setIntElement(term19136, 16, 8454144);
        setIntElement(term19136, 17, 9240576);
        setIntElement(term19136, 18, 196608);
        setIntElement(term19136, 19, 3801088);
        setIntElement(term19136, 20, 786432);
        setIntElement(term19136, 21, 589824);
        setIntElement(term19136, 22, 17170432);
        setIntElement(term19136, 23, 1376256);
        setIntElement(term19136, 24, 5242880);
        setIntElement(term19136, 25, 2883584);
        setIntElement(term19136, 26, 20774912);
        setIntElement(term19136, 27, 262144);
        setIntElement(term19136, 28, 2555904);
        setIntElement(term19136, 29, 1835008);
        setIntElement(term19136, 30, 6029312);
        setIntElement(term19136, 31, 327680);
        setElement(term19102, 1, term19136);
        setElement(term19169, 0, term19170);
        setElement(term19169, 1, term19170);
        setElement(term19169, 2, term19173);
        setElement(term19169, 3, term19175);
        setElement(term19169, 4, term19179);
        setElement(term19169, 5, term19179);
        setElement(term19169, 6, term19184);
        setElement(term19169, 7, term19184);
        setElement(term19169, 8, term19188);
        setElement(term19169, 9, term19188);
        setElement(term19169, 10, term19188);
        setElement(term19169, 11, term19188);
        setElement(term19169, 12, term19188);
        setElement(term19169, 13, term19192);
        setElement(term19169, 14, term19192);
        setElement(term19169, 15, term19196);
        setElement(term19169, 16, term19196);
        setElement(term19169, 17, term19196);
        setElement(term19169, 18, term19196);
        setElement(term19169, 19, term19200);
        setElement(term19169, 20, term19200);
        setElement(term19169, 21, term19200);
        setElement(term19169, 22, term19204);
        setElement(term19169, 23, term19196);
        setElement(term19169, 24, term19208);
        setElement(term19169, 25, term19212);
        setElement(term19169, 26, term19216);
        setElement(term19169, 27, term19220);
        setElement(term19169, 28, term19223);
        setElement(term19169, 29, term19226);
        setElement(term19169, 30, term19229);
        setElement(term19169, 31, term19232);
        setElement(term19102, 2, term19169);
        setLongElement(term19235, 0, 34363746224L);
        setLongElement(term19235, 1, 34363775512L);
        setLongElement(term19235, 2, 34363775512L);
        setLongElement(term19235, 3, 34363775512L);
        setLongElement(term19235, 4, 137704038008160L);
        setLongElement(term19235, 5, 34364440080L);
        setLongElement(term19235, 6, 137704038075264L);
        setLongElement(term19235, 7, 137704037917728L);
        setLongElement(term19235, 8, 137704037917616L);
        setLongElement(term19235, 9, 137704037917760L);
        setLongElement(term19235, 10, 137704037961744L);
        setLongElement(term19235, 11, 34363766248L);
        setLongElement(term19235, 12, 34363766248L);
        setLongElement(term19235, 13, 137700514237344L);
        setLongElement(term19235, 14, 137700514237344L);
        setLongElement(term19235, 15, 137700514237200L);
        setLongElement(term19235, 16, 137700514280496L);
        setLongElement(term19235, 17, 137700514282144L);
        setLongElement(term19235, 18, 137700514282912L);
        setLongElement(term19235, 19, 137704040228208L);
        setLongElement(term19235, 20, 34363739368L);
        setLongElement(term19235, 21, 34363739368L);
        setLongElement(term19235, 22, 137700514235840L);
        setLongElement(term19235, 23, 34363829248L);
        setLongElement(term19235, 24, 137704040228208L);
        setLongElement(term19235, 25, 137704040203680L);
        setLongElement(term19235, 26, 34363745472L);
        setLongElement(term19235, 27, 34364710216L);
        setLongElement(term19235, 28, 34363745472L);
        setLongElement(term19235, 29, 34363745472L);
        setLongElement(term19235, 30, 34364896224L);
        setLongElement(term19235, 31, 34363745472L);
        setElement(term19102, 3, term19235);
        setShortElement(term19269, 0, (short) 2);
        setShortElement(term19269, 1, (short) 12);
        setElement(term19268, 0, term19269);
        setIntElement(term19302, 0, 1638400);
        setIntElement(term19302, 1, 720907);
        setElement(term19268, 1, term19302);
        setElement(term19335, 0, term19336);
        setElement(term19335, 1, term19338);
        setElement(term19268, 2, term19335);
        setLongElement(term19340, 0, 34363745472L);
        setLongElement(term19340, 1, 34363745472L);
        setElement(term19268, 3, term19340);
        setElement(term19102, 4, term19268);
        setField(term19101, term19101.getClass(), "backtrace", term19102);
        setField(term19101, term19101.getClass(), "detailMessage", "RkybSrpybU");
        setField(term19101, term19101.getClass(), "cause", term19101);
        setField(term19101, term19101.getClass(), "stackTrace", term19385);
        setIntField(term19101, term19101.getClass(), "depth", 34);
        setIntField(term19387, term19387.getClass(), "modCount", 0);
        setField(term19101, term19101.getClass(), "suppressedExceptions", term19387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term19101;
        try {
            callMethod(klass, "from", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


