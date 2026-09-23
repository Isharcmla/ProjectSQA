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

public class JsonMappingException_init_168841437231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33350;

    public JsonMappingException_init_168841437231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33355 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsChars$ByteBufferHandle");
        Class<? extends Object> term33357 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base");
        Class<? extends Object> term33358 = Class.forName((String) "java.util.stream.SortedOps$OfInt");
        Class<? extends Object> term33361 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Class<? extends Object> term33365 = Class.forName((String) "java.util.zip.Inflater$InflaterZStreamRef");
        Class<? extends Object> term33369 = Class.forName((String) "com.fasterxml.jackson.databind.node.TreeTraversingParser");
        Class<? extends Object> term33370 = Class.forName((String) "java.lang.invoke.VarHandle$1");
        Class<? extends Object> term33371 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1");
        Class<? extends Object> term33374 = Class.forName((String) "java.nio.channels.IllegalBlockingModeException");
        Class<? extends Object> term33378 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$CharDeser");
        Class<? extends Object> term33381 = Class.forName((String) "java.io.OutputStreamWriter");
        Class<? extends Object> term33384 = Class.forName((String) "java.io.ObjectStreamClass$1");
        Class<? extends Object> term33387 = Class.forName((String) "java.util.InputMismatchException");
        Class<? extends Object> term33390 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceValuesToIntTask");
        Class<? extends Object> term33393 = Class.forName((String) "kex.sun.misc.FloatConsts");
        Class<? extends Object> term33394 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JdkDeserializers");
        Class<? extends Object> term33396 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJShort");
        Class<? extends Object> term33397 = Class.forName((String) "java.util.concurrent.PriorityBlockingQueue");
        Class<? extends Object> term33398 = Class.forName((String) "java.lang.invoke.LambdaFormBuffer");
        Class<? extends Object> term33399 = Class.forName((String) "java.nio.file.Path");
        Class<? extends Object> term33402 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.package-info");
        term33350 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term33351 = (Object[]) newArray("java.lang.Object", 5);
        short[] term33352 = (short[]) newShortArray(32);
        int[] term33353 = (int[]) newIntArray(32);
        Object[] term33354 = (Object[]) newArray("java.lang.Object", 32);
        long[] term33405 = (long[]) newLongArray(32);
        Object[] term33408 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term33409 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term33350, term33350.getClass(), "_path", null);
        setField(term33350, term33350.getClass(), "_processor", null);
        setField(term33350, term33350.getClass(), "_location", null);
        setShortElement(term33352, 0, (short) 1);
        setShortElement(term33352, 1, (short) 2);
        setShortElement(term33352, 2, (short) 1);
        setShortElement(term33352, 3, (short) 7);
        setShortElement(term33352, 4, (short) 14);
        setShortElement(term33352, 5, (short) 2);
        setShortElement(term33352, 6, (short) 3);
        setShortElement(term33352, 10, (short) 2);
        setShortElement(term33352, 11, (short) 4);
        setShortElement(term33352, 12, (short) 4);
        setShortElement(term33352, 13, (short) 3);
        setShortElement(term33352, 14, (short) 4);
        setShortElement(term33352, 15, (short) 4);
        setShortElement(term33352, 16, (short) 1);
        setShortElement(term33352, 17, (short) 2);
        setShortElement(term33352, 18, (short) 3);
        setShortElement(term33352, 19, (short) 3);
        setShortElement(term33352, 20, (short) 13);
        setShortElement(term33352, 21, (short) 1);
        setShortElement(term33352, 22, (short) 2);
        setShortElement(term33352, 23, (short) 12);
        setElement(term33351, 0, term33352);
        setIntElement(term33353, 1, 5570560);
        setIntElement(term33353, 2, 327680);
        setIntElement(term33353, 3, 4456454);
        setIntElement(term33353, 4, 851968);
        setIntElement(term33353, 5, 2097152);
        setIntElement(term33353, 7, 6553600);
        setIntElement(term33353, 8, 393216);
        setIntElement(term33353, 9, 3866630);
        setIntElement(term33353, 10, 14352384);
        setIntElement(term33353, 11, 10354688);
        setIntElement(term33353, 12, 2883584);
        setIntElement(term33353, 13, 786432);
        setIntElement(term33353, 14, 1441792);
        setIntElement(term33353, 15, 7733248);
        setIntElement(term33353, 16, 20774912);
        setIntElement(term33353, 17, 262144);
        setIntElement(term33353, 18, 2555904);
        setIntElement(term33353, 19, 1835008);
        setIntElement(term33353, 20, 6029312);
        setIntElement(term33353, 21, 327680);
        setIntElement(term33353, 22, 1638400);
        setIntElement(term33353, 23, 720907);
        setElement(term33351, 1, term33353);
        setElement(term33354, 0, term33355);
        setElement(term33354, 1, term33355);
        setElement(term33354, 2, term33357);
        setElement(term33354, 3, term33358);
        setElement(term33354, 4, term33361);
        setElement(term33354, 5, term33365);
        setElement(term33354, 6, term33369);
        setElement(term33354, 7, term33369);
        setElement(term33354, 8, term33370);
        setElement(term33354, 9, term33371);
        setElement(term33354, 10, term33374);
        setElement(term33354, 11, term33378);
        setElement(term33354, 12, term33381);
        setElement(term33354, 13, term33384);
        setElement(term33354, 14, term33387);
        setElement(term33354, 15, term33381);
        setElement(term33354, 16, term33390);
        setElement(term33354, 17, term33393);
        setElement(term33354, 18, term33394);
        setElement(term33354, 19, term33396);
        setElement(term33354, 20, term33397);
        setElement(term33354, 21, term33398);
        setElement(term33354, 22, term33399);
        setElement(term33354, 23, term33402);
        setElement(term33351, 2, term33354);
        setLongElement(term33405, 0, 34363746224L);
        setLongElement(term33405, 1, 34363775512L);
        setLongElement(term33405, 2, 34363775512L);
        setLongElement(term33405, 3, 34363775512L);
        setLongElement(term33405, 4, 132578326060064L);
        setLongElement(term33405, 5, 34363820048L);
        setLongElement(term33405, 6, 34364798256L);
        setLongElement(term33405, 7, 34363739368L);
        setLongElement(term33405, 8, 34363739368L);
        setLongElement(term33405, 9, 34363739368L);
        setLongElement(term33405, 10, 132582552571296L);
        setLongElement(term33405, 11, 132582552640272L);
        setLongElement(term33405, 12, 132582550089488L);
        setLongElement(term33405, 13, 132582552759024L);
        setLongElement(term33405, 14, 132582550089488L);
        setLongElement(term33405, 15, 132582550089488L);
        setLongElement(term33405, 16, 34363745472L);
        setLongElement(term33405, 17, 34364710216L);
        setLongElement(term33405, 18, 34363745472L);
        setLongElement(term33405, 19, 34363745472L);
        setLongElement(term33405, 20, 34364896224L);
        setLongElement(term33405, 21, 34363745472L);
        setLongElement(term33405, 22, 34363745472L);
        setLongElement(term33405, 23, 34363745472L);
        setElement(term33351, 3, term33405);
        setField(term33350, term33350.getClass(), "backtrace", term33351);
        setField(term33350, term33350.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term33350, term33350.getClass(), "cause", term33350);
        setField(term33350, term33350.getClass(), "stackTrace", term33408);
        setIntField(term33350, term33350.getClass(), "depth", 24);
        setIntField(term33409, term33409.getClass(), "modCount", 0);
        setField(term33350, term33350.getClass(), "suppressedExceptions", term33409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33350));
    }

};


