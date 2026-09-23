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

public class SerializerProvider_reportBadDefinition_1087543053115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3211;

    public SerializerProvider_reportBadDefinition_1087543053115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3280 = Class.forName((String) "java.lang.InstantiationException");
        Class<? extends Object> term3283 = Class.forName((String) "java.util.function.IntFunction");
        Class<? extends Object> term3285 = Class.forName((String) "java.util.EnumMap$1");
        Class<? extends Object> term3289 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
        Class<? extends Object> term3294 = Class.forName((String) "java.io.ObjectInputStream$Logging");
        Class<? extends Object> term3298 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        Class<? extends Object> term3302 = Class.forName((String) "java.util.EnumMap$ValueIterator");
        Class<? extends Object> term3306 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy");
        Class<? extends Object> term3310 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        Class<? extends Object> term3314 = Class.forName((String) "java.util.Calendar$1");
        Class<? extends Object> term3318 = Class.forName((String) "java.io.ObjectStreamConstants");
        Class<? extends Object> term3322 = Class.forName((String) "java.util.Formatter$DateTime");
        Class<? extends Object> term3326 = Class.forName((String) "java.util.SortedSet$1");
        Class<? extends Object> term3330 = Class.forName((String) "java.util.stream.ReduceOps$Box");
        Class<? extends Object> term3333 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor");
        Class<? extends Object> term3336 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Class<? extends Object> term3339 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJLong$Merger");
        Class<? extends Object> term3342 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<? extends Object> term3446 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        Class<? extends Object> term3448 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        term3211 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term3212 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3213 = (short[]) newShortArray(32);
        int[] term3246 = (int[]) newIntArray(32);
        Object[] term3279 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3345 = (long[]) newLongArray(32);
        Object[] term3378 = (Object[]) newArray("java.lang.Object", 5);
        short[] term3379 = (short[]) newShortArray(32);
        int[] term3412 = (int[]) newIntArray(32);
        Object[] term3445 = (Object[]) newArray("java.lang.Object", 32);
        long[] term3450 = (long[]) newLongArray(32);
        Object[] term3495 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term3497 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term3213, 0, (short) 1);
        setShortElement(term3213, 1, (short) 2);
        setShortElement(term3213, 2, (short) 1);
        setShortElement(term3213, 3, (short) 7);
        setShortElement(term3213, 4, (short) 2);
        setShortElement(term3213, 5, (short) 1);
        setShortElement(term3213, 6, (short) 6);
        setShortElement(term3213, 7, (short) 2);
        setShortElement(term3213, 8, (short) 10);
        setShortElement(term3213, 9, (short) 11);
        setShortElement(term3213, 10, (short) 29);
        setShortElement(term3213, 11, (short) 5);
        setShortElement(term3213, 12, (short) 4);
        setShortElement(term3213, 13, (short) 5);
        setShortElement(term3213, 14, (short) 6);
        setShortElement(term3213, 15, (short) 7);
        setShortElement(term3213, 16, (short) 10);
        setShortElement(term3213, 17, (short) 11);
        setShortElement(term3213, 18, (short) 12);
        setShortElement(term3213, 19, (short) 4);
        setShortElement(term3213, 20, (short) 1);
        setShortElement(term3213, 23, (short) 3);
        setShortElement(term3213, 24, (short) 4);
        setShortElement(term3213, 25, (short) 4);
        setShortElement(term3213, 26, (short) 1);
        setShortElement(term3213, 27, (short) 2);
        setShortElement(term3213, 28, (short) 3);
        setShortElement(term3213, 29, (short) 3);
        setShortElement(term3213, 30, (short) 13);
        setShortElement(term3213, 31, (short) 1);
        setElement(term3212, 0, term3213);
        setIntElement(term3246, 1, 5570560);
        setIntElement(term3246, 2, 327680);
        setIntElement(term3246, 3, 4456454);
        setIntElement(term3246, 4, 1769472);
        setIntElement(term3246, 5, 14876672);
        setIntElement(term3246, 6, 6225920);
        setIntElement(term3246, 7, 917504);
        setIntElement(term3246, 8, 327680);
        setIntElement(term3246, 9, 8519680);
        setIntElement(term3246, 10, 917504);
        setIntElement(term3246, 11, 11993088);
        setIntElement(term3246, 12, 655360);
        setIntElement(term3246, 13, 7864320);
        setIntElement(term3246, 14, 3735552);
        setIntElement(term3246, 15, 7143424);
        setIntElement(term3246, 16, 8454144);
        setIntElement(term3246, 17, 9240576);
        setIntElement(term3246, 18, 196608);
        setIntElement(term3246, 19, 3801088);
        setIntElement(term3246, 20, 786432);
        setIntElement(term3246, 21, 589824);
        setIntElement(term3246, 22, 17170432);
        setIntElement(term3246, 23, 1376256);
        setIntElement(term3246, 24, 5242880);
        setIntElement(term3246, 25, 2883584);
        setIntElement(term3246, 26, 20774912);
        setIntElement(term3246, 27, 262144);
        setIntElement(term3246, 28, 2555904);
        setIntElement(term3246, 29, 1835008);
        setIntElement(term3246, 30, 6029312);
        setIntElement(term3246, 31, 327680);
        setElement(term3212, 1, term3246);
        setElement(term3279, 0, term3280);
        setElement(term3279, 1, term3280);
        setElement(term3279, 2, term3283);
        setElement(term3279, 3, term3285);
        setElement(term3279, 4, term3289);
        setElement(term3279, 5, term3289);
        setElement(term3279, 6, term3294);
        setElement(term3279, 7, term3294);
        setElement(term3279, 8, term3298);
        setElement(term3279, 9, term3298);
        setElement(term3279, 10, term3298);
        setElement(term3279, 11, term3298);
        setElement(term3279, 12, term3298);
        setElement(term3279, 13, term3302);
        setElement(term3279, 14, term3302);
        setElement(term3279, 15, term3306);
        setElement(term3279, 16, term3306);
        setElement(term3279, 17, term3306);
        setElement(term3279, 18, term3306);
        setElement(term3279, 19, term3310);
        setElement(term3279, 20, term3310);
        setElement(term3279, 21, term3310);
        setElement(term3279, 22, term3314);
        setElement(term3279, 23, term3306);
        setElement(term3279, 24, term3318);
        setElement(term3279, 25, term3322);
        setElement(term3279, 26, term3326);
        setElement(term3279, 27, term3330);
        setElement(term3279, 28, term3333);
        setElement(term3279, 29, term3336);
        setElement(term3279, 30, term3339);
        setElement(term3279, 31, term3342);
        setElement(term3212, 2, term3279);
        setLongElement(term3345, 0, 34363746224L);
        setLongElement(term3345, 1, 34363775512L);
        setLongElement(term3345, 2, 34363775512L);
        setLongElement(term3345, 3, 34363775512L);
        setLongElement(term3345, 4, 135751908134864L);
        setLongElement(term3345, 5, 34364440080L);
        setLongElement(term3345, 6, 135751908201968L);
        setLongElement(term3345, 7, 135751907559328L);
        setLongElement(term3345, 8, 135751907559216L);
        setLongElement(term3345, 9, 135751907559360L);
        setLongElement(term3345, 10, 135751907826432L);
        setLongElement(term3345, 11, 34363766248L);
        setLongElement(term3345, 12, 34363766248L);
        setLongElement(term3345, 13, 135748386964304L);
        setLongElement(term3345, 14, 135748386964304L);
        setLongElement(term3345, 15, 135748386964160L);
        setLongElement(term3345, 16, 135748387007376L);
        setLongElement(term3345, 17, 135748387009024L);
        setLongElement(term3345, 18, 135748387009792L);
        setLongElement(term3345, 19, 135748383823440L);
        setLongElement(term3345, 20, 34363739368L);
        setLongElement(term3345, 21, 34363739368L);
        setLongElement(term3345, 22, 135748386976752L);
        setLongElement(term3345, 23, 34363829248L);
        setLongElement(term3345, 24, 135748383823440L);
        setLongElement(term3345, 25, 135748383810544L);
        setLongElement(term3345, 26, 34363745472L);
        setLongElement(term3345, 27, 34364710216L);
        setLongElement(term3345, 28, 34363745472L);
        setLongElement(term3345, 29, 34363745472L);
        setLongElement(term3345, 30, 34364896224L);
        setLongElement(term3345, 31, 34363745472L);
        setElement(term3212, 3, term3345);
        setShortElement(term3379, 0, (short) 2);
        setShortElement(term3379, 1, (short) 12);
        setElement(term3378, 0, term3379);
        setIntElement(term3412, 0, 1638400);
        setIntElement(term3412, 1, 720907);
        setElement(term3378, 1, term3412);
        setElement(term3445, 0, term3446);
        setElement(term3445, 1, term3448);
        setElement(term3378, 2, term3445);
        setLongElement(term3450, 0, 34363745472L);
        setLongElement(term3450, 1, 34363745472L);
        setElement(term3378, 3, term3450);
        setElement(term3212, 4, term3378);
        setField(term3211, term3211.getClass(), "backtrace", term3212);
        setField(term3211, term3211.getClass(), "detailMessage", "hRNSzYYIrc");
        setField(term3211, term3211.getClass(), "cause", term3211);
        setField(term3211, term3211.getClass(), "stackTrace", term3495);
        setIntField(term3211, term3211.getClass(), "depth", 34);
        setIntField(term3497, term3497.getClass(), "modCount", 0);
        setField(term3211, term3211.getClass(), "suppressedExceptions", term3497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "MjGYSRKTNF";
        args[2] = term3211;
        try {
            callMethod(klass, "reportBadDefinition", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


