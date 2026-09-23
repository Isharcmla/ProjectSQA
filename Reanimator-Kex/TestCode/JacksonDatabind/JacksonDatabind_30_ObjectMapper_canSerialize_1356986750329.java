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

public class ObjectMapper_canSerialize_1356986750329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419;

    public ObjectMapper_canSerialize_1356986750329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term489 = Class.forName((String) "java.io.ObjectStreamClass$3");
        Class<? extends Object> term491 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class<? extends Object> term493 = Class.forName((String) "java.util.concurrent.atomic.AtomicLongArray");
        Class<? extends Object> term495 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer");
        Class<? extends Object> term497 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder");
        Class<? extends Object> term499 = Class.forName((String) "com.fasterxml.jackson.core.filter.JsonPointerBasedFilter");
        Class<? extends Object> term501 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Stringifiers");
        Class<? extends Object> term503 = Class.forName((String) "java.nio.DirectDoubleBufferU");
        Class<? extends Object> term505 = Class.forName((String) "java.lang.Long");
        Class<? extends Object> term507 = Class.forName((String) "java.io.FilterReader");
        Class<? extends Object> term509 = Class.forName((String) "java.util.Formattable");
        Class<? extends Object> term511 = Class.forName((String) "java.util.stream.Tripwire");
        Class<? extends Object> term513 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap");
        Class<? extends Object> term515 = Class.forName((String) "java.nio.file.NoSuchFileException");
        Class<? extends Object> term517 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        term419 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term420 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term421 = (Object[]) newArray("java.lang.Object", 5);
        short[] term422 = (short[]) newShortArray(32);
        int[] term455 = (int[]) newIntArray(32);
        Object[] term488 = (Object[]) newArray("java.lang.Object", 32);
        long[] term519 = (long[]) newLongArray(32);
        Object[] term552 = (Object[]) newArray("java.lang.Object", 5);
        short[] term553 = (short[]) newShortArray(32);
        int[] term586 = (int[]) newIntArray(32);
        Object[] term619 = (Object[]) newArray("java.lang.Object", 32);
        long[] term620 = (long[]) newLongArray(32);
        Object[] term665 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term667 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term422, 0, (short) 1);
        setShortElement(term422, 1, (short) 2);
        setShortElement(term422, 2, (short) 1);
        setShortElement(term422, 3, (short) 7);
        setShortElement(term422, 4, (short) 2);
        setShortElement(term422, 5, (short) 1);
        setShortElement(term422, 6, (short) 6);
        setShortElement(term422, 7, (short) 2);
        setShortElement(term422, 8, (short) 10);
        setShortElement(term422, 9, (short) 11);
        setShortElement(term422, 10, (short) 29);
        setShortElement(term422, 11, (short) 5);
        setShortElement(term422, 12, (short) 19);
        setShortElement(term422, 13, (short) 29);
        setShortElement(term422, 14, (short) 5);
        setShortElement(term422, 15, (short) 4);
        setShortElement(term422, 16, (short) 6);
        setShortElement(term422, 17, (short) 8);
        setShortElement(term422, 18, (short) 7);
        setShortElement(term422, 19, (short) 10);
        setShortElement(term422, 20, (short) 11);
        setShortElement(term422, 21, (short) 12);
        setShortElement(term422, 22, (short) 4);
        setShortElement(term422, 23, (short) 1);
        setShortElement(term422, 25, (short) 10);
        setShortElement(term422, 26, (short) 3);
        setShortElement(term422, 27, (short) 4);
        setShortElement(term422, 28, (short) 4);
        setShortElement(term422, 29, (short) 1);
        setShortElement(term422, 30, (short) 2);
        setShortElement(term422, 31, (short) 3);
        setElement(term421, 0, term422);
        setIntElement(term455, 1, 5570560);
        setIntElement(term455, 2, 327680);
        setIntElement(term455, 3, 4456454);
        setIntElement(term455, 4, 1769472);
        setIntElement(term455, 5, 14876672);
        setIntElement(term455, 6, 6225920);
        setIntElement(term455, 7, 917504);
        setIntElement(term455, 8, 327680);
        setIntElement(term455, 9, 8519680);
        setIntElement(term455, 10, 917504);
        setIntElement(term455, 11, 11993088);
        setIntElement(term455, 12, 38010880);
        setIntElement(term455, 13, 2162688);
        setIntElement(term455, 14, 11993088);
        setIntElement(term455, 15, 655360);
        setIntElement(term455, 16, 7864320);
        setIntElement(term455, 17, 3735552);
        setIntElement(term455, 18, 7143424);
        setIntElement(term455, 19, 8454144);
        setIntElement(term455, 20, 9240576);
        setIntElement(term455, 21, 196608);
        setIntElement(term455, 22, 3801088);
        setIntElement(term455, 23, 786432);
        setIntElement(term455, 24, 589824);
        setIntElement(term455, 25, 17170432);
        setIntElement(term455, 26, 1376256);
        setIntElement(term455, 27, 5242880);
        setIntElement(term455, 28, 2883584);
        setIntElement(term455, 29, 20774912);
        setIntElement(term455, 30, 262144);
        setIntElement(term455, 31, 2555904);
        setElement(term421, 1, term455);
        setElement(term488, 0, term489);
        setElement(term488, 1, term489);
        setElement(term488, 2, term491);
        setElement(term488, 3, term493);
        setElement(term488, 4, term495);
        setElement(term488, 5, term495);
        setElement(term488, 6, term497);
        setElement(term488, 7, term497);
        setElement(term488, 8, term499);
        setElement(term488, 9, term499);
        setElement(term488, 10, term499);
        setElement(term488, 11, term499);
        setElement(term488, 12, term499);
        setElement(term488, 13, term499);
        setElement(term488, 14, term499);
        setElement(term488, 15, term499);
        setElement(term488, 16, term501);
        setElement(term488, 17, term501);
        setElement(term488, 18, term503);
        setElement(term488, 19, term503);
        setElement(term488, 20, term503);
        setElement(term488, 21, term503);
        setElement(term488, 22, term505);
        setElement(term488, 23, term505);
        setElement(term488, 24, term505);
        setElement(term488, 25, term507);
        setElement(term488, 26, term503);
        setElement(term488, 27, term509);
        setElement(term488, 28, term511);
        setElement(term488, 29, term513);
        setElement(term488, 30, term515);
        setElement(term488, 31, term517);
        setElement(term421, 2, term488);
        setLongElement(term519, 0, 34363746224L);
        setLongElement(term519, 1, 34363775512L);
        setLongElement(term519, 2, 34363775512L);
        setLongElement(term519, 3, 34363775512L);
        setLongElement(term519, 4, 136746595575680L);
        setLongElement(term519, 5, 34364440080L);
        setLongElement(term519, 6, 136746595650160L);
        setLongElement(term519, 7, 136746595489312L);
        setLongElement(term519, 8, 136746595489200L);
        setLongElement(term519, 9, 136746595489344L);
        setLongElement(term519, 10, 136746595536608L);
        setLongElement(term519, 11, 34363766248L);
        setLongElement(term519, 12, 136746595534128L);
        setLongElement(term519, 13, 136746595536608L);
        setLongElement(term519, 14, 34363766248L);
        setLongElement(term519, 15, 34363766248L);
        setLongElement(term519, 16, 136743751666144L);
        setLongElement(term519, 17, 136743751666144L);
        setLongElement(term519, 18, 136743751666000L);
        setLongElement(term519, 19, 136743751710576L);
        setLongElement(term519, 20, 136743751712224L);
        setLongElement(term519, 21, 136743751712992L);
        setLongElement(term519, 22, 136743748637360L);
        setLongElement(term519, 23, 34363739368L);
        setLongElement(term519, 24, 34363739368L);
        setLongElement(term519, 25, 136743751664640L);
        setLongElement(term519, 26, 34363829248L);
        setLongElement(term519, 27, 136743748637360L);
        setLongElement(term519, 28, 136743747823024L);
        setLongElement(term519, 29, 34363745472L);
        setLongElement(term519, 30, 34364710216L);
        setLongElement(term519, 31, 34363745472L);
        setElement(term421, 3, term519);
        setShortElement(term553, 0, (short) 3);
        setShortElement(term553, 1, (short) 13);
        setShortElement(term553, 2, (short) 1);
        setShortElement(term553, 3, (short) 2);
        setShortElement(term553, 4, (short) 12);
        setElement(term552, 0, term553);
        setIntElement(term586, 0, 1835008);
        setIntElement(term586, 1, 6029312);
        setIntElement(term586, 2, 327680);
        setIntElement(term586, 3, 1638400);
        setIntElement(term586, 4, 720907);
        setElement(term552, 1, term586);
        setElement(term552, 2, term619);
        setLongElement(term620, 0, 34363745472L);
        setLongElement(term620, 1, 34364896224L);
        setLongElement(term620, 2, 34363745472L);
        setLongElement(term620, 3, 34363745472L);
        setLongElement(term620, 4, 34363745472L);
        setElement(term552, 3, term620);
        setElement(term421, 4, term552);
        setField(term420, term420.getClass(), "backtrace", term421);
        setField(term420, term420.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term420, term420.getClass(), "cause", term420);
        setField(term420, term420.getClass(), "stackTrace", term665);
        setIntField(term420, term420.getClass(), "depth", 37);
        setIntField(term667, term667.getClass(), "modCount", 0);
        setField(term420, term420.getClass(), "suppressedExceptions", term667);
        setField(term419, term419.getClass(), "value", term420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.concurrent.atomic.AtomicReference");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term419;
        try {
            callMethod(klass, "canSerialize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


