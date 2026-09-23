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

public class StdValueInstantiator_wrapAsJsonMappingException_210558287085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6381;

    public StdValueInstantiator_wrapAsJsonMappingException_210558287085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6450 = Class.forName((String) "java.lang.invoke.InnerClassLambdaMetafactory$ForwardingMethodGenerator");
        Class<? extends Object> term6453 = Class.forName((String) "java.lang.reflect.Parameter");
        Class<? extends Object> term6455 = Class.forName((String) "java.lang.reflect.MalformedParameterizedTypeException");
        Class<? extends Object> term6459 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ValueSpliterator");
        Class<? extends Object> term6464 = Class.forName((String) "java.nio.channels.spi.AsynchronousChannelProvider");
        Class<? extends Object> term6468 = Class.forName((String) "kex.java.util.HashSet");
        Class<? extends Object> term6472 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotatedMethod$Serialization");
        Class<? extends Object> term6476 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class<? extends Object> term6480 = Class.forName((String) "java.lang.StackStreamFactory$CallerClassFinder");
        Class<? extends Object> term6484 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock");
        Class<? extends Object> term6488 = Class.forName((String) "java.nio.file.StandardWatchEventKinds$StdWatchEventKind");
        Class<? extends Object> term6492 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base");
        Class<? extends Object> term6496 = Class.forName((String) "java.util.stream.DoublePipeline$Head");
        Class<? extends Object> term6500 = Class.forName((String) "java.util.InputMismatchException");
        Class<? extends Object> term6503 = Class.forName((String) "java.util.concurrent.CountDownLatch");
        Class<? extends Object> term6506 = Class.forName((String) "java.lang.invoke.StringConcatFactory$1");
        Class<? extends Object> term6509 = Class.forName((String) "java.nio.file.attribute.AclEntryType");
        Class<? extends Object> term6512 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync");
        Class<? extends Object> term6616 = Class.forName((String) "java.lang.invoke.InfoFromMemberName$1");
        Class<? extends Object> term6618 = Class.forName((String) "com.fasterxml.jackson.databind.util.ISO8601DateFormat");
        term6381 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term6382 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6383 = (short[]) newShortArray(32);
        int[] term6416 = (int[]) newIntArray(32);
        Object[] term6449 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6515 = (long[]) newLongArray(32);
        Object[] term6548 = (Object[]) newArray("java.lang.Object", 5);
        short[] term6549 = (short[]) newShortArray(32);
        int[] term6582 = (int[]) newIntArray(32);
        Object[] term6615 = (Object[]) newArray("java.lang.Object", 32);
        long[] term6620 = (long[]) newLongArray(32);
        Object[] term6665 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term6667 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setShortElement(term6383, 0, (short) 1);
        setShortElement(term6383, 1, (short) 2);
        setShortElement(term6383, 2, (short) 1);
        setShortElement(term6383, 3, (short) 7);
        setShortElement(term6383, 4, (short) 2);
        setShortElement(term6383, 5, (short) 1);
        setShortElement(term6383, 6, (short) 6);
        setShortElement(term6383, 7, (short) 2);
        setShortElement(term6383, 8, (short) 10);
        setShortElement(term6383, 9, (short) 11);
        setShortElement(term6383, 10, (short) 29);
        setShortElement(term6383, 11, (short) 5);
        setShortElement(term6383, 12, (short) 4);
        setShortElement(term6383, 13, (short) 5);
        setShortElement(term6383, 14, (short) 6);
        setShortElement(term6383, 15, (short) 6);
        setShortElement(term6383, 16, (short) 9);
        setShortElement(term6383, 17, (short) 10);
        setShortElement(term6383, 18, (short) 11);
        setShortElement(term6383, 19, (short) 4);
        setShortElement(term6383, 20, (short) 1);
        setShortElement(term6383, 23, (short) 3);
        setShortElement(term6383, 24, (short) 4);
        setShortElement(term6383, 25, (short) 4);
        setShortElement(term6383, 26, (short) 1);
        setShortElement(term6383, 27, (short) 2);
        setShortElement(term6383, 28, (short) 3);
        setShortElement(term6383, 29, (short) 3);
        setShortElement(term6383, 30, (short) 13);
        setShortElement(term6383, 31, (short) 1);
        setElement(term6382, 0, term6383);
        setIntElement(term6416, 1, 5570560);
        setIntElement(term6416, 2, 327680);
        setIntElement(term6416, 3, 4456454);
        setIntElement(term6416, 4, 1769472);
        setIntElement(term6416, 5, 14876672);
        setIntElement(term6416, 6, 6225920);
        setIntElement(term6416, 7, 917504);
        setIntElement(term6416, 8, 327680);
        setIntElement(term6416, 9, 8519680);
        setIntElement(term6416, 10, 917504);
        setIntElement(term6416, 11, 11993088);
        setIntElement(term6416, 12, 655360);
        setIntElement(term6416, 13, 7864320);
        setIntElement(term6416, 14, 3735552);
        setIntElement(term6416, 15, 7143424);
        setIntElement(term6416, 16, 8454144);
        setIntElement(term6416, 17, 9240576);
        setIntElement(term6416, 18, 196608);
        setIntElement(term6416, 19, 3801088);
        setIntElement(term6416, 20, 786432);
        setIntElement(term6416, 21, 589824);
        setIntElement(term6416, 22, 17170432);
        setIntElement(term6416, 23, 1376256);
        setIntElement(term6416, 24, 5242880);
        setIntElement(term6416, 25, 2883584);
        setIntElement(term6416, 26, 20774912);
        setIntElement(term6416, 27, 262144);
        setIntElement(term6416, 28, 2555904);
        setIntElement(term6416, 29, 1835008);
        setIntElement(term6416, 30, 6029312);
        setIntElement(term6416, 31, 327680);
        setElement(term6382, 1, term6416);
        setElement(term6449, 0, term6450);
        setElement(term6449, 1, term6450);
        setElement(term6449, 2, term6453);
        setElement(term6449, 3, term6455);
        setElement(term6449, 4, term6459);
        setElement(term6449, 5, term6459);
        setElement(term6449, 6, term6464);
        setElement(term6449, 7, term6464);
        setElement(term6449, 8, term6468);
        setElement(term6449, 9, term6468);
        setElement(term6449, 10, term6468);
        setElement(term6449, 11, term6468);
        setElement(term6449, 12, term6468);
        setElement(term6449, 13, term6472);
        setElement(term6449, 14, term6472);
        setElement(term6449, 15, term6476);
        setElement(term6449, 16, term6476);
        setElement(term6449, 17, term6476);
        setElement(term6449, 18, term6476);
        setElement(term6449, 19, term6480);
        setElement(term6449, 20, term6480);
        setElement(term6449, 21, term6480);
        setElement(term6449, 22, term6484);
        setElement(term6449, 23, term6476);
        setElement(term6449, 24, term6488);
        setElement(term6449, 25, term6492);
        setElement(term6449, 26, term6496);
        setElement(term6449, 27, term6500);
        setElement(term6449, 28, term6503);
        setElement(term6449, 29, term6506);
        setElement(term6449, 30, term6509);
        setElement(term6449, 31, term6512);
        setElement(term6382, 2, term6449);
        setLongElement(term6515, 0, 34363746224L);
        setLongElement(term6515, 1, 34363775512L);
        setLongElement(term6515, 2, 34363775512L);
        setLongElement(term6515, 3, 34363775512L);
        setLongElement(term6515, 4, 127296325552064L);
        setLongElement(term6515, 5, 34364440080L);
        setLongElement(term6515, 6, 127296325619216L);
        setLongElement(term6515, 7, 127296325243872L);
        setLongElement(term6515, 8, 127296325243760L);
        setLongElement(term6515, 9, 127296325243904L);
        setLongElement(term6515, 10, 127296325505648L);
        setLongElement(term6515, 11, 34363766248L);
        setLongElement(term6515, 12, 34363766248L);
        setLongElement(term6515, 13, 127293269653488L);
        setLongElement(term6515, 14, 127293269653488L);
        setLongElement(term6515, 15, 127293269653344L);
        setLongElement(term6515, 16, 127293269697904L);
        setLongElement(term6515, 17, 127293269699552L);
        setLongElement(term6515, 18, 127293269700320L);
        setLongElement(term6515, 19, 127293266625536L);
        setLongElement(term6515, 20, 34363739368L);
        setLongElement(term6515, 21, 34363739368L);
        setLongElement(term6515, 22, 127293269651984L);
        setLongElement(term6515, 23, 34363829248L);
        setLongElement(term6515, 24, 127293266625536L);
        setLongElement(term6515, 25, 127293265779920L);
        setLongElement(term6515, 26, 34363745472L);
        setLongElement(term6515, 27, 34364710216L);
        setLongElement(term6515, 28, 34363745472L);
        setLongElement(term6515, 29, 34363745472L);
        setLongElement(term6515, 30, 34364896224L);
        setLongElement(term6515, 31, 34363745472L);
        setElement(term6382, 3, term6515);
        setShortElement(term6549, 0, (short) 2);
        setShortElement(term6549, 1, (short) 12);
        setElement(term6548, 0, term6549);
        setIntElement(term6582, 0, 1638400);
        setIntElement(term6582, 1, 720907);
        setElement(term6548, 1, term6582);
        setElement(term6615, 0, term6616);
        setElement(term6615, 1, term6618);
        setElement(term6548, 2, term6615);
        setLongElement(term6620, 0, 34363745472L);
        setLongElement(term6620, 1, 34363745472L);
        setElement(term6548, 3, term6620);
        setElement(term6382, 4, term6548);
        setField(term6381, term6381.getClass(), "backtrace", term6382);
        setField(term6381, term6381.getClass(), "detailMessage", "xxtlPwDYFs");
        setField(term6381, term6381.getClass(), "cause", term6381);
        setField(term6381, term6381.getClass(), "stackTrace", term6665);
        setIntField(term6381, term6381.getClass(), "depth", 34);
        setIntField(term6667, term6667.getClass(), "modCount", 0);
        setField(term6381, term6381.getClass(), "suppressedExceptions", term6667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6381;
        try {
            callMethod(klass, "wrapAsJsonMappingException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


