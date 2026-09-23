package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BeanPropertyMap_wrapAndThrow_130235021650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term382;

    public BeanPropertyMap_wrapAndThrow_130235021650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167 = Class.forName((String) "java.nio.ByteBufferAsLongBufferRL");
        Class<? extends Object> term170 = Class.forName((String) "java.io.ObjectOutputStream$1");
        Class<? extends Object> term172 = Class.forName((String) "java.lang.module.ModuleReference");
        Class<? extends Object> term176 = Class.forName((String) "java.util.stream.SliceOps$1");
        Class<? extends Object> term181 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend");
        Class<? extends Object> term185 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer");
        Class<? extends Object> term189 = Class.forName((String) "java.util.stream.LongPipeline$8");
        Class<? extends Object> term193 = Class.forName((String) "java.util.Enumeration");
        Class<? extends Object> term197 = Class.forName((String) "java.lang.invoke.MethodType");
        Class<? extends Object> term201 = Class.forName((String) "java.util.concurrent.ForkJoinPool$InnocuousForkJoinWorkerThreadFactory$1");
        Class<? extends Object> term205 = Class.forName((String) "java.util.BitSet");
        Class<? extends Object> term209 = Class.forName((String) "kex.java.lang.Long");
        Class<? extends Object> term213 = Class.forName((String) "java.util.spi.AbstractResourceBundleProvider");
        Class<? extends Object> term217 = Class.forName((String) "java.io.BufferedReader");
        Class<? extends Object> term219 = Class.forName((String) "java.lang.LiveStackFrameInfo$PrimitiveSlot32");
        Class<? extends Object> term222 = Class.forName((String) "java.lang.invoke.StringConcatFactory$RecipeElement");
        Class<? extends Object> term224 = Class.forName((String) "java.lang.UnknownError");
        Class<? extends Object> term226 = Class.forName((String) "java.util.stream.MatchOps$4MatchSink");
        Class<? extends Object> term329 = Class.forName((String) "java.util.Spliterators$IntIteratorSpliterator");
        Class<? extends Object> term331 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap");
        term98 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term99 = (Object[]) newArray("java.lang.Object", 5);
        short[] term100 = (short[]) newShortArray(32);
        int[] term133 = (int[]) newIntArray(32);
        Object[] term166 = (Object[]) newArray("java.lang.Object", 32);
        long[] term228 = (long[]) newLongArray(32);
        Object[] term261 = (Object[]) newArray("java.lang.Object", 5);
        short[] term262 = (short[]) newShortArray(32);
        int[] term295 = (int[]) newIntArray(32);
        Object[] term328 = (Object[]) newArray("java.lang.Object", 32);
        long[] term333 = (long[]) newLongArray(32);
        Object[] term378 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term380 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term100, 0, (short) 1);
        setShortElement(term100, 1, (short) 2);
        setShortElement(term100, 2, (short) 1);
        setShortElement(term100, 3, (short) 7);
        setShortElement(term100, 4, (short) 2);
        setShortElement(term100, 5, (short) 1);
        setShortElement(term100, 6, (short) 6);
        setShortElement(term100, 7, (short) 2);
        setShortElement(term100, 8, (short) 10);
        setShortElement(term100, 9, (short) 11);
        setShortElement(term100, 10, (short) 29);
        setShortElement(term100, 11, (short) 5);
        setShortElement(term100, 12, (short) 4);
        setShortElement(term100, 13, (short) 6);
        setShortElement(term100, 14, (short) 8);
        setShortElement(term100, 15, (short) 6);
        setShortElement(term100, 16, (short) 9);
        setShortElement(term100, 17, (short) 10);
        setShortElement(term100, 18, (short) 11);
        setShortElement(term100, 19, (short) 4);
        setShortElement(term100, 20, (short) 1);
        setShortElement(term100, 22, (short) 10);
        setShortElement(term100, 23, (short) 3);
        setShortElement(term100, 24, (short) 4);
        setShortElement(term100, 25, (short) 9);
        setShortElement(term100, 26, (short) 1);
        setShortElement(term100, 27, (short) 2);
        setShortElement(term100, 28, (short) 3);
        setShortElement(term100, 29, (short) 3);
        setShortElement(term100, 30, (short) 13);
        setShortElement(term100, 31, (short) 1);
        setElement(term99, 0, term100);
        setIntElement(term133, 1, 5570560);
        setIntElement(term133, 2, 327680);
        setIntElement(term133, 3, 4456454);
        setIntElement(term133, 4, 1769472);
        setIntElement(term133, 5, 14876672);
        setIntElement(term133, 6, 6225920);
        setIntElement(term133, 7, 917504);
        setIntElement(term133, 8, 327680);
        setIntElement(term133, 9, 8519680);
        setIntElement(term133, 10, 917504);
        setIntElement(term133, 11, 11993088);
        setIntElement(term133, 12, 655360);
        setIntElement(term133, 13, 7864320);
        setIntElement(term133, 14, 3735552);
        setIntElement(term133, 15, 7143424);
        setIntElement(term133, 16, 8454144);
        setIntElement(term133, 17, 9240576);
        setIntElement(term133, 18, 196608);
        setIntElement(term133, 19, 3801088);
        setIntElement(term133, 20, 786432);
        setIntElement(term133, 21, 589824);
        setIntElement(term133, 22, 17170432);
        setIntElement(term133, 23, 1376256);
        setIntElement(term133, 24, 5242880);
        setIntElement(term133, 25, 2883584);
        setIntElement(term133, 26, 20774912);
        setIntElement(term133, 27, 262144);
        setIntElement(term133, 28, 2555904);
        setIntElement(term133, 29, 1835008);
        setIntElement(term133, 30, 6029312);
        setIntElement(term133, 31, 327680);
        setElement(term99, 1, term133);
        setElement(term166, 0, term167);
        setElement(term166, 1, term167);
        setElement(term166, 2, term170);
        setElement(term166, 3, term172);
        setElement(term166, 4, term176);
        setElement(term166, 5, term176);
        setElement(term166, 6, term181);
        setElement(term166, 7, term181);
        setElement(term166, 8, term185);
        setElement(term166, 9, term185);
        setElement(term166, 10, term185);
        setElement(term166, 11, term185);
        setElement(term166, 12, term185);
        setElement(term166, 13, term189);
        setElement(term166, 14, term189);
        setElement(term166, 15, term193);
        setElement(term166, 16, term193);
        setElement(term166, 17, term193);
        setElement(term166, 18, term193);
        setElement(term166, 19, term197);
        setElement(term166, 20, term197);
        setElement(term166, 21, term197);
        setElement(term166, 22, term201);
        setElement(term166, 23, term193);
        setElement(term166, 24, term205);
        setElement(term166, 25, term209);
        setElement(term166, 26, term213);
        setElement(term166, 27, term217);
        setElement(term166, 28, term219);
        setElement(term166, 29, term222);
        setElement(term166, 30, term224);
        setElement(term166, 31, term226);
        setElement(term99, 2, term166);
        setLongElement(term228, 0, 34363746224L);
        setLongElement(term228, 1, 34363775512L);
        setLongElement(term228, 2, 34363775512L);
        setLongElement(term228, 3, 34363775512L);
        setLongElement(term228, 4, 123444679378544L);
        setLongElement(term228, 5, 34364440080L);
        setLongElement(term228, 6, 123444679445696L);
        setLongElement(term228, 7, 123444679285808L);
        setLongElement(term228, 8, 123444679285696L);
        setLongElement(term228, 9, 123444679285840L);
        setLongElement(term228, 10, 123444679332128L);
        setLongElement(term228, 11, 34363766248L);
        setLongElement(term228, 12, 34363766248L);
        setLongElement(term228, 13, 123441690738656L);
        setLongElement(term228, 14, 123441690738656L);
        setLongElement(term228, 15, 123441690738512L);
        setLongElement(term228, 16, 123441690783072L);
        setLongElement(term228, 17, 123441690784720L);
        setLongElement(term228, 18, 123441690785488L);
        setLongElement(term228, 19, 123441687712592L);
        setLongElement(term228, 20, 34363739368L);
        setLongElement(term228, 21, 34363739368L);
        setLongElement(term228, 22, 123441690737152L);
        setLongElement(term228, 23, 34363829248L);
        setLongElement(term228, 24, 123441687712592L);
        setLongElement(term228, 25, 123444682943504L);
        setLongElement(term228, 26, 34363745472L);
        setLongElement(term228, 27, 34364710216L);
        setLongElement(term228, 28, 34363745472L);
        setLongElement(term228, 29, 34363745472L);
        setLongElement(term228, 30, 34364896224L);
        setLongElement(term228, 31, 34363745472L);
        setElement(term99, 3, term228);
        setShortElement(term262, 0, (short) 2);
        setShortElement(term262, 1, (short) 12);
        setElement(term261, 0, term262);
        setIntElement(term295, 0, 1638400);
        setIntElement(term295, 1, 720907);
        setElement(term261, 1, term295);
        setElement(term328, 0, term329);
        setElement(term328, 1, term331);
        setElement(term261, 2, term328);
        setLongElement(term333, 0, 34363745472L);
        setLongElement(term333, 1, 34363745472L);
        setElement(term261, 3, term333);
        setElement(term99, 4, term261);
        setField(term98, term98.getClass(), "backtrace", term99);
        setField(term98, term98.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term98, term98.getClass(), "cause", term98);
        setField(term98, term98.getClass(), "stackTrace", term378);
        setIntField(term98, term98.getClass(), "depth", 34);
        setIntField(term380, term380.getClass(), "modCount", 0);
        setField(term98, term98.getClass(), "suppressedExceptions", term380);
        term382 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Object[] args = new Object[4];
        args[0] = term98;
        args[1] = term382;
        args[2] = "jJCZpVmanW";
        args[3] = null;
        try {
            callMethod(klass, "wrapAndThrow", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


