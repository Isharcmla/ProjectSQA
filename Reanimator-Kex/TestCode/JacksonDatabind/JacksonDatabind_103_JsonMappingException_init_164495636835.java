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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_init_164495636835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53517;

    public JsonMappingException_init_164495636835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53522 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        Class<? extends Object> term53524 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator$OfPrimitive");
        Class<? extends Object> term53525 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJFloat$Merger");
        Class<? extends Object> term53528 = Class.forName((String) "java.nio.file.FileSystemNotFoundException");
        Class<? extends Object> term53532 = Class.forName((String) "java.util.stream.Nodes$LongArrayNode");
        Class<? extends Object> term53536 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$EnsureInitialized");
        Class<? extends Object> term53537 = Class.forName((String) "java.util.ArrayPrefixHelpers$LongCumulateTask");
        Class<? extends Object> term53538 = Class.forName((String) "java.nio.CharBufferSpliterator");
        Class<? extends Object> term53541 = Class.forName((String) "java.util.concurrent.atomic.AtomicLongFieldUpdater");
        Class<? extends Object> term53545 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$Intrinsic");
        Class<? extends Object> term53548 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeId");
        Class<? extends Object> term53551 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$Intrinsic");
        Class<? extends Object> term53554 = Class.forName((String) "java.util.stream.DoublePipeline$1$1");
        Class<? extends Object> term53557 = Class.forName((String) "java.util.Locale");
        Class<? extends Object> term53560 = Class.forName((String) "java.util.concurrent.LinkedBlockingQueue");
        Class<? extends Object> term53562 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1");
        Class<? extends Object> term53564 = Class.forName((String) "java.lang.Process$PipeInputStream");
        Class<? extends Object> term53566 = Class.forName((String) "java.util.ServiceLoader$ProviderImpl$2");
        Class<? extends Object> term53568 = Class.forName((String) "java.util.concurrent.Phaser$QNode");
        Class<? extends Object> term53570 = Class.forName((String) "java.util.Scanner");
        Class<? extends Object> term53573 = Class.forName((String) "com.fasterxml.jackson.core.io.CharacterEscapes");
        term53517 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term53518 = (Object[]) newArray("java.lang.Object", 5);
        short[] term53519 = (short[]) newShortArray(32);
        int[] term53520 = (int[]) newIntArray(32);
        Object[] term53521 = (Object[]) newArray("java.lang.Object", 32);
        long[] term53576 = (long[]) newLongArray(32);
        Object[] term53579 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term53580 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term53517, term53517.getClass(), "_path", null);
        setField(term53517, term53517.getClass(), "_processor", null);
        setField(term53517, term53517.getClass(), "_location", null);
        setShortElement(term53519, 0, (short) 1);
        setShortElement(term53519, 1, (short) 2);
        setShortElement(term53519, 2, (short) 1);
        setShortElement(term53519, 3, (short) 7);
        setShortElement(term53519, 4, (short) 6);
        setShortElement(term53519, 5, (short) 2);
        setShortElement(term53519, 6, (short) 3);
        setShortElement(term53519, 10, (short) 2);
        setShortElement(term53519, 11, (short) 4);
        setShortElement(term53519, 12, (short) 4);
        setShortElement(term53519, 13, (short) 3);
        setShortElement(term53519, 14, (short) 4);
        setShortElement(term53519, 15, (short) 4);
        setShortElement(term53519, 16, (short) 1);
        setShortElement(term53519, 17, (short) 2);
        setShortElement(term53519, 18, (short) 3);
        setShortElement(term53519, 19, (short) 3);
        setShortElement(term53519, 20, (short) 13);
        setShortElement(term53519, 21, (short) 1);
        setShortElement(term53519, 22, (short) 2);
        setShortElement(term53519, 23, (short) 12);
        setElement(term53518, 0, term53519);
        setIntElement(term53520, 1, 5570560);
        setIntElement(term53520, 2, 327680);
        setIntElement(term53520, 3, 4456454);
        setIntElement(term53520, 4, 851968);
        setIntElement(term53520, 5, 2883584);
        setIntElement(term53520, 7, 6553600);
        setIntElement(term53520, 8, 393216);
        setIntElement(term53520, 9, 3866630);
        setIntElement(term53520, 10, 14352384);
        setIntElement(term53520, 11, 10354688);
        setIntElement(term53520, 12, 2883584);
        setIntElement(term53520, 13, 786432);
        setIntElement(term53520, 14, 1441792);
        setIntElement(term53520, 15, 7733248);
        setIntElement(term53520, 16, 20774912);
        setIntElement(term53520, 17, 262144);
        setIntElement(term53520, 18, 2555904);
        setIntElement(term53520, 19, 1835008);
        setIntElement(term53520, 20, 6029312);
        setIntElement(term53520, 21, 327680);
        setIntElement(term53520, 22, 1638400);
        setIntElement(term53520, 23, 720907);
        setElement(term53518, 1, term53520);
        setElement(term53521, 0, term53522);
        setElement(term53521, 1, term53522);
        setElement(term53521, 2, term53524);
        setElement(term53521, 3, term53525);
        setElement(term53521, 4, term53528);
        setElement(term53521, 5, term53532);
        setElement(term53521, 6, term53536);
        setElement(term53521, 7, term53536);
        setElement(term53521, 8, term53537);
        setElement(term53521, 9, term53538);
        setElement(term53521, 10, term53541);
        setElement(term53521, 11, term53545);
        setElement(term53521, 12, term53548);
        setElement(term53521, 13, term53551);
        setElement(term53521, 14, term53554);
        setElement(term53521, 15, term53548);
        setElement(term53521, 16, term53557);
        setElement(term53521, 17, term53560);
        setElement(term53521, 18, term53562);
        setElement(term53521, 19, term53564);
        setElement(term53521, 20, term53566);
        setElement(term53521, 21, term53568);
        setElement(term53521, 22, term53570);
        setElement(term53521, 23, term53573);
        setElement(term53518, 2, term53521);
        setLongElement(term53576, 0, 34363746224L);
        setLongElement(term53576, 1, 34363775512L);
        setLongElement(term53576, 2, 34363775512L);
        setLongElement(term53576, 3, 34363775512L);
        setLongElement(term53576, 4, 132073600938288L);
        setLongElement(term53576, 5, 34363820048L);
        setLongElement(term53576, 6, 34364798256L);
        setLongElement(term53576, 7, 34363739368L);
        setLongElement(term53576, 8, 34363739368L);
        setLongElement(term53576, 9, 34363739368L);
        setLongElement(term53576, 10, 132077283560208L);
        setLongElement(term53576, 11, 132077283629184L);
        setLongElement(term53576, 12, 132077281112816L);
        setLongElement(term53576, 13, 132077283747392L);
        setLongElement(term53576, 14, 132077281112816L);
        setLongElement(term53576, 15, 132077281112816L);
        setLongElement(term53576, 16, 34363745472L);
        setLongElement(term53576, 17, 34364710216L);
        setLongElement(term53576, 18, 34363745472L);
        setLongElement(term53576, 19, 34363745472L);
        setLongElement(term53576, 20, 34364896224L);
        setLongElement(term53576, 21, 34363745472L);
        setLongElement(term53576, 22, 34363745472L);
        setLongElement(term53576, 23, 34363745472L);
        setElement(term53518, 3, term53576);
        setField(term53517, term53517.getClass(), "backtrace", term53518);
        setField(term53517, term53517.getClass(), "detailMessage", "SzjVpOQTyS");
        setField(term53517, term53517.getClass(), "cause", term53517);
        setField(term53517, term53517.getClass(), "stackTrace", term53579);
        setIntField(term53517, term53517.getClass(), "depth", 24);
        setIntField(term53580, term53580.getClass(), "modCount", 0);
        setField(term53517, term53517.getClass(), "suppressedExceptions", term53580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term53517));
    }

};


