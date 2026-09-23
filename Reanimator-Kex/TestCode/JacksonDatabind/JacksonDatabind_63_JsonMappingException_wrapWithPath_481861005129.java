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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class JsonMappingException_wrapWithPath_481861005129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223751;
     Object term232900;
     Object term232265;

    public JsonMappingException_wrapWithPath_481861005129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223751 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        term232900 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        setField(term232900, term232900.getClass(), "backtrace", null);
        setField(term232900, term232900.getClass(), "detailMessage", null);
        setField(term232900, term232900.getClass(), "cause", null);
        setField(term232900, term232900.getClass(), "stackTrace", null);
        setIntField(term232900, term232900.getClass(), "depth", 0);
        setField(term232900, term232900.getClass(), "suppressedExceptions", null);
        LinkedList term232266 = new LinkedList();
        ((LinkedList) term232266).add((Object)null);
        Class<? extends Object> term232338 = Class.forName((String) "java.util.concurrent.ForkJoinPool$1");
        Class<? extends Object> term232345 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfDouble");
        Class<? extends Object> term232349 = Class.forName((String) "java.util.stream.FindOps$FindSink$OfInt");
        Class<? extends Object> term232352 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base");
        Class<? extends Object> term232356 = Class.forName((String) "java.io.ObjectStreamClass$FieldReflector");
        Class<? extends Object> term232360 = Class.forName((String) "java.lang.Character");
        Class<? extends Object> term232366 = Class.forName((String) "java.util.stream.Nodes$ConcNode");
        Class<? extends Object> term232371 = Class.forName((String) "java.util.stream.ForEachOps");
        Class<? extends Object> term232375 = Class.forName((String) "java.util.Spliterators$IntIteratorSpliterator");
        Class<? extends Object> term232379 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsIterator");
        Class<? extends Object> term232383 = Class.forName((String) "java.nio.channels.AlreadyConnectedException");
        Class<? extends Object> term232387 = Class.forName((String) "java.util.function.LongFunction");
        Class<? extends Object> term232391 = Class.forName((String) "java.util.regex.Pattern$BranchConn");
        Class<? extends Object> term232394 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJByte");
        Class<? extends Object> term232397 = Class.forName((String) "java.util.WeakHashMap$ValueSpliterator");
        Class<? extends Object> term232401 = Class.forName((String) "java.io.ObjectInputStream$ValidationList");
        Class<? extends Object> term232406 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ByteArrayViewVarHandle");
        Class<? extends Object> term232409 = Class.forName((String) "java.util.concurrent.CompletableFuture$ThreadPerTaskExecutor");
        Class<? extends Object> term232413 = Class.forName((String) "java.util.concurrent.ConcurrentNavigableMap");
        term232265 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term232270 = (Object[]) newArray("java.lang.Object", 5);
        short[] term232271 = (short[]) newShortArray(32);
        int[] term232304 = (int[]) newIntArray(32);
        Object[] term232337 = (Object[]) newArray("java.lang.Object", 32);
        long[] term232424 = (long[]) newLongArray(32);
        Object term232084 = newInstance(Class.forName("java.io.UTFDataFormatException"));
        Object[] term232572 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term232577 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term232265, term232265.getClass(), "_path", term232266);
        setField(term232265, term232265.getClass(), "_processor", null);
        setField(term232265, term232265.getClass(), "_location", null);
        setShortElement(term232271, 0, (short) 20);
        setShortElement(term232271, 1, (short) 3);
        setShortElement(term232271, 5, (short) 27);
        setShortElement(term232271, 6, (short) 2);
        setShortElement(term232271, 7, (short) 3);
        setShortElement(term232271, 11, (short) 2);
        setShortElement(term232271, 12, (short) 4);
        setShortElement(term232271, 13, (short) 4);
        setShortElement(term232271, 14, (short) 3);
        setShortElement(term232271, 15, (short) 4);
        setShortElement(term232271, 16, (short) 4);
        setShortElement(term232271, 17, (short) 1);
        setShortElement(term232271, 18, (short) 2);
        setShortElement(term232271, 19, (short) 3);
        setShortElement(term232271, 20, (short) 3);
        setShortElement(term232271, 21, (short) 13);
        setShortElement(term232271, 22, (short) 1);
        setShortElement(term232271, 23, (short) 2);
        setShortElement(term232271, 24, (short) 12);
        setElement(term232270, 0, term232271);
        setIntElement(term232304, 0, 128385024);
        setIntElement(term232304, 2, 6553600);
        setIntElement(term232304, 3, 393216);
        setIntElement(term232304, 4, 3866630);
        setIntElement(term232304, 5, 1245184);
        setIntElement(term232304, 6, 3211264);
        setIntElement(term232304, 8, 6553600);
        setIntElement(term232304, 9, 393216);
        setIntElement(term232304, 10, 3866630);
        setIntElement(term232304, 11, 14352384);
        setIntElement(term232304, 12, 10354688);
        setIntElement(term232304, 13, 2883584);
        setIntElement(term232304, 14, 786432);
        setIntElement(term232304, 15, 1441792);
        setIntElement(term232304, 16, 7733248);
        setIntElement(term232304, 17, 20774912);
        setIntElement(term232304, 18, 262144);
        setIntElement(term232304, 19, 2555904);
        setIntElement(term232304, 20, 1835008);
        setIntElement(term232304, 21, 6029312);
        setIntElement(term232304, 22, 327680);
        setIntElement(term232304, 23, 1638400);
        setIntElement(term232304, 24, 720907);
        setElement(term232270, 1, term232304);
        setElement(term232337, 0, term232338);
        setElement(term232337, 1, term232345);
        setElement(term232337, 2, term232345);
        setElement(term232337, 3, term232349);
        setElement(term232337, 4, term232352);
        setElement(term232337, 5, term232356);
        setElement(term232337, 6, term232360);
        setElement(term232337, 7, term232345);
        setElement(term232337, 8, term232345);
        setElement(term232337, 9, term232349);
        setElement(term232337, 10, term232352);
        setElement(term232337, 11, term232366);
        setElement(term232337, 12, term232371);
        setElement(term232337, 13, term232375);
        setElement(term232337, 14, term232379);
        setElement(term232337, 15, term232383);
        setElement(term232337, 16, term232375);
        setElement(term232337, 17, term232387);
        setElement(term232337, 18, term232391);
        setElement(term232337, 19, term232394);
        setElement(term232337, 20, term232397);
        setElement(term232337, 21, term232401);
        setElement(term232337, 22, term232406);
        setElement(term232337, 23, term232409);
        setElement(term232337, 24, term232413);
        setElement(term232270, 2, term232337);
        setLongElement(term232424, 0, 132578328546864L);
        setLongElement(term232424, 1, 34364798256L);
        setLongElement(term232424, 2, 34363739368L);
        setLongElement(term232424, 3, 34363739368L);
        setLongElement(term232424, 4, 34363739368L);
        setLongElement(term232424, 5, 132578328998496L);
        setLongElement(term232424, 6, 34363820048L);
        setLongElement(term232424, 7, 34364798256L);
        setLongElement(term232424, 8, 34363739368L);
        setLongElement(term232424, 9, 34363739368L);
        setLongElement(term232424, 10, 34363739368L);
        setLongElement(term232424, 11, 132582552571296L);
        setLongElement(term232424, 12, 132582552640272L);
        setLongElement(term232424, 13, 132582550089488L);
        setLongElement(term232424, 14, 132582552759024L);
        setLongElement(term232424, 15, 132582550089488L);
        setLongElement(term232424, 16, 132582550089488L);
        setLongElement(term232424, 17, 34363745472L);
        setLongElement(term232424, 18, 34364710216L);
        setLongElement(term232424, 19, 34363745472L);
        setLongElement(term232424, 20, 34363745472L);
        setLongElement(term232424, 21, 34364896224L);
        setLongElement(term232424, 22, 34363745472L);
        setLongElement(term232424, 23, 34363745472L);
        setLongElement(term232424, 24, 34363745472L);
        setElement(term232270, 3, term232424);
        setField(term232265, term232265.getClass(), "backtrace", term232270);
        setField(term232265, term232265.getClass(), "detailMessage", "(was java.io.UTFDataFormatException)");
        setField(term232084, term232084.getClass(), "backtrace", null);
        setField(term232084, term232084.getClass(), "detailMessage", null);
        setField(term232084, term232084.getClass(), "cause", null);
        setField(term232084, term232084.getClass(), "stackTrace", null);
        setIntField(term232084, term232084.getClass(), "depth", 0);
        setField(term232084, term232084.getClass(), "suppressedExceptions", null);
        setField(term232265, term232265.getClass(), "cause", term232084);
        setField(term232265, term232265.getClass(), "stackTrace", term232572);
        setIntField(term232265, term232265.getClass(), "depth", 25);
        setIntField(term232577, term232577.getClass(), "modCount", 0);
        setField(term232265, term232265.getClass(), "suppressedExceptions", term232577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term223751;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term223751, term232900));
        assertTrue(recursiveEquals(retValue, term232265));
    }

};


