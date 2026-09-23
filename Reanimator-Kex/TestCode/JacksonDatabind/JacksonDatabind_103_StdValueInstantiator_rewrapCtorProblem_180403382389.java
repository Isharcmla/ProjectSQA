package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_rewrapCtorProblem_180403382389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9143;

    public StdValueInstantiator_rewrapCtorProblem_180403382389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9212 = Class.forName((String) "java.util.stream.SpinedBuffer");
        Class<? extends Object> term9215 = Class.forName((String) "java.io.BufferedReader");
        Class<? extends Object> term9217 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldStaticReadWrite");
        Class<? extends Object> term9221 = Class.forName((String) "java.nio.file.Files$AcceptAllFilter");
        Class<? extends Object> term9226 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        Class<? extends Object> term9230 = Class.forName((String) "java.util.Locale$Cache");
        Class<? extends Object> term9234 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NullSerializer");
        Class<? extends Object> term9238 = Class.forName((String) "java.util.Locale$Category");
        Class<? extends Object> term9242 = Class.forName((String) "java.util.stream.IntPipeline$8");
        Class<? extends Object> term9246 = Class.forName((String) "com.fasterxml.jackson.databind.deser.AbstractDeserializer");
        Class<? extends Object> term9250 = Class.forName((String) "java.util.stream.Node$Builder$OfInt");
        Class<? extends Object> term9254 = Class.forName((String) "java.io.Console$3");
        Class<? extends Object> term9258 = Class.forName((String) "java.lang.Process$1");
        Class<? extends Object> term9262 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        Class<? extends Object> term9265 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsIterator");
        Class<? extends Object> term9268 = Class.forName((String) "java.util.SplittableRandom$RandomLongsSpliterator");
        Class<? extends Object> term9271 = Class.forName((String) "java.io.FilterOutputStream");
        Class<? extends Object> term9274 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$CounterCell");
        Class<? extends Object> term9378 = Class.forName((String) "java.util.stream.SortedOps");
        Class<? extends Object> term9380 = Class.forName((String) "java.math.MutableBigInteger");
        term9143 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term9144 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9145 = (short[]) newShortArray(32);
        int[] term9178 = (int[]) newIntArray(32);
        Object[] term9211 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9277 = (long[]) newLongArray(32);
        Object[] term9310 = (Object[]) newArray("java.lang.Object", 5);
        short[] term9311 = (short[]) newShortArray(32);
        int[] term9344 = (int[]) newIntArray(32);
        Object[] term9377 = (Object[]) newArray("java.lang.Object", 32);
        long[] term9382 = (long[]) newLongArray(32);
        Object[] term9427 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term9429 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term9145, 0, (short) 1);
        setShortElement(term9145, 1, (short) 2);
        setShortElement(term9145, 2, (short) 1);
        setShortElement(term9145, 3, (short) 7);
        setShortElement(term9145, 4, (short) 2);
        setShortElement(term9145, 5, (short) 1);
        setShortElement(term9145, 6, (short) 6);
        setShortElement(term9145, 7, (short) 2);
        setShortElement(term9145, 8, (short) 10);
        setShortElement(term9145, 9, (short) 11);
        setShortElement(term9145, 10, (short) 29);
        setShortElement(term9145, 11, (short) 5);
        setShortElement(term9145, 12, (short) 4);
        setShortElement(term9145, 13, (short) 5);
        setShortElement(term9145, 14, (short) 6);
        setShortElement(term9145, 15, (short) 6);
        setShortElement(term9145, 16, (short) 9);
        setShortElement(term9145, 17, (short) 10);
        setShortElement(term9145, 18, (short) 11);
        setShortElement(term9145, 19, (short) 4);
        setShortElement(term9145, 20, (short) 1);
        setShortElement(term9145, 23, (short) 3);
        setShortElement(term9145, 24, (short) 4);
        setShortElement(term9145, 25, (short) 4);
        setShortElement(term9145, 26, (short) 1);
        setShortElement(term9145, 27, (short) 2);
        setShortElement(term9145, 28, (short) 3);
        setShortElement(term9145, 29, (short) 3);
        setShortElement(term9145, 30, (short) 13);
        setShortElement(term9145, 31, (short) 1);
        setElement(term9144, 0, term9145);
        setIntElement(term9178, 1, 5570560);
        setIntElement(term9178, 2, 327680);
        setIntElement(term9178, 3, 4456454);
        setIntElement(term9178, 4, 1769472);
        setIntElement(term9178, 5, 14876672);
        setIntElement(term9178, 6, 6225920);
        setIntElement(term9178, 7, 917504);
        setIntElement(term9178, 8, 327680);
        setIntElement(term9178, 9, 8519680);
        setIntElement(term9178, 10, 917504);
        setIntElement(term9178, 11, 11993088);
        setIntElement(term9178, 12, 655360);
        setIntElement(term9178, 13, 7864320);
        setIntElement(term9178, 14, 3735552);
        setIntElement(term9178, 15, 7143424);
        setIntElement(term9178, 16, 8454144);
        setIntElement(term9178, 17, 9240576);
        setIntElement(term9178, 18, 196608);
        setIntElement(term9178, 19, 3801088);
        setIntElement(term9178, 20, 786432);
        setIntElement(term9178, 21, 589824);
        setIntElement(term9178, 22, 17170432);
        setIntElement(term9178, 23, 1376256);
        setIntElement(term9178, 24, 5242880);
        setIntElement(term9178, 25, 2883584);
        setIntElement(term9178, 26, 20774912);
        setIntElement(term9178, 27, 262144);
        setIntElement(term9178, 28, 2555904);
        setIntElement(term9178, 29, 1835008);
        setIntElement(term9178, 30, 6029312);
        setIntElement(term9178, 31, 327680);
        setElement(term9144, 1, term9178);
        setElement(term9211, 0, term9212);
        setElement(term9211, 1, term9212);
        setElement(term9211, 2, term9215);
        setElement(term9211, 3, term9217);
        setElement(term9211, 4, term9221);
        setElement(term9211, 5, term9221);
        setElement(term9211, 6, term9226);
        setElement(term9211, 7, term9226);
        setElement(term9211, 8, term9230);
        setElement(term9211, 9, term9230);
        setElement(term9211, 10, term9230);
        setElement(term9211, 11, term9230);
        setElement(term9211, 12, term9230);
        setElement(term9211, 13, term9234);
        setElement(term9211, 14, term9234);
        setElement(term9211, 15, term9238);
        setElement(term9211, 16, term9238);
        setElement(term9211, 17, term9238);
        setElement(term9211, 18, term9238);
        setElement(term9211, 19, term9242);
        setElement(term9211, 20, term9242);
        setElement(term9211, 21, term9242);
        setElement(term9211, 22, term9246);
        setElement(term9211, 23, term9238);
        setElement(term9211, 24, term9250);
        setElement(term9211, 25, term9254);
        setElement(term9211, 26, term9258);
        setElement(term9211, 27, term9262);
        setElement(term9211, 28, term9265);
        setElement(term9211, 29, term9268);
        setElement(term9211, 30, term9271);
        setElement(term9211, 31, term9274);
        setElement(term9144, 2, term9211);
        setLongElement(term9277, 0, 34363746224L);
        setLongElement(term9277, 1, 34363775512L);
        setLongElement(term9277, 2, 34363775512L);
        setLongElement(term9277, 3, 34363775512L);
        setLongElement(term9277, 4, 140671122080048L);
        setLongElement(term9277, 5, 34364440080L);
        setLongElement(term9277, 6, 140671122147248L);
        setLongElement(term9277, 7, 140671121989648L);
        setLongElement(term9277, 8, 140671121989536L);
        setLongElement(term9277, 9, 140671121989680L);
        setLongElement(term9277, 10, 140671122033680L);
        setLongElement(term9277, 11, 34363766248L);
        setLongElement(term9277, 12, 34363766248L);
        setLongElement(term9277, 13, 140667513310992L);
        setLongElement(term9277, 14, 140667513310992L);
        setLongElement(term9277, 15, 140667513310848L);
        setLongElement(term9277, 16, 140667513354752L);
        setLongElement(term9277, 17, 140667513356400L);
        setLongElement(term9277, 18, 140667513357168L);
        setLongElement(term9277, 19, 140671123758128L);
        setLongElement(term9277, 20, 34363739368L);
        setLongElement(term9277, 21, 34363739368L);
        setLongElement(term9277, 22, 140667513309488L);
        setLongElement(term9277, 23, 34363829248L);
        setLongElement(term9277, 24, 140671123758128L);
        setLongElement(term9277, 25, 140671123559536L);
        setLongElement(term9277, 26, 34363745472L);
        setLongElement(term9277, 27, 34364710216L);
        setLongElement(term9277, 28, 34363745472L);
        setLongElement(term9277, 29, 34363745472L);
        setLongElement(term9277, 30, 34364896224L);
        setLongElement(term9277, 31, 34363745472L);
        setElement(term9144, 3, term9277);
        setShortElement(term9311, 0, (short) 2);
        setShortElement(term9311, 1, (short) 12);
        setElement(term9310, 0, term9311);
        setIntElement(term9344, 0, 1638400);
        setIntElement(term9344, 1, 720907);
        setElement(term9310, 1, term9344);
        setElement(term9377, 0, term9378);
        setElement(term9377, 1, term9380);
        setElement(term9310, 2, term9377);
        setLongElement(term9382, 0, 34363745472L);
        setLongElement(term9382, 1, 34363745472L);
        setElement(term9310, 3, term9382);
        setElement(term9144, 4, term9310);
        setField(term9143, term9143.getClass(), "backtrace", term9144);
        setField(term9143, term9143.getClass(), "detailMessage", "jJCZpVmanW");
        setField(term9143, term9143.getClass(), "cause", term9143);
        setField(term9143, term9143.getClass(), "stackTrace", term9427);
        setIntField(term9143, term9143.getClass(), "depth", 34);
        setIntField(term9429, term9429.getClass(), "modCount", 0);
        setField(term9143, term9143.getClass(), "suppressedExceptions", term9429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9143;
        try {
            callMethod(klass, "rewrapCtorProblem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


