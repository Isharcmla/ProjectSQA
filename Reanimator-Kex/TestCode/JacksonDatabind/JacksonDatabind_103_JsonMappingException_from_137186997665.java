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

public class JsonMappingException_from_137186997665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161193;

    public JsonMappingException_from_137186997665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term161262 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfDouble");
        Class<? extends Object> term161269 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer");
        Class<? extends Object> term161272 = Class.forName((String) "java.util.concurrent.atomic.AtomicMarkableReference$Pair");
        Class<? extends Object> term161274 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonAutoDetect");
        Class<? extends Object> term161278 = Class.forName((String) "java.nio.DirectFloatBufferS");
        Class<? extends Object> term161282 = Class.forName((String) "com.fasterxml.jackson.core.io.UTF8Writer");
        Class<? extends Object> term161288 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceValuesTask");
        Class<? extends Object> term161293 = Class.forName((String) "java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy");
        Class<? extends Object> term161297 = Class.forName((String) "java.util.Collections$EmptySet");
        Class<? extends Object> term161301 = Class.forName((String) "java.util.stream.StreamSpliterators$ArrayBuffer$OfInt");
        Class<? extends Object> term161305 = Class.forName((String) "com.fasterxml.jackson.core.io.InputDecorator");
        Class<? extends Object> term161309 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer");
        Class<? extends Object> term161313 = Class.forName((String) "java.util.regex.Pattern$Bound");
        Class<? extends Object> term161316 = Class.forName((String) "java.util.IdentityHashMap$KeySet");
        Class<? extends Object> term161319 = Class.forName((String) "java.util.stream.StreamSpliterators");
        Class<? extends Object> term161323 = Class.forName((String) "java.lang.invoke.VarHandleBooleans$FieldStaticReadOnly");
        Class<? extends Object> term161326 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.FileSerializer");
        Class<? extends Object> term161329 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Sorter");
        Class<? extends Object> term161333 = Class.forName((String) "java.lang.VirtualMachineError");
        term161193 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term161194 = (Object[]) newArray("java.lang.Object", 5);
        short[] term161195 = (short[]) newShortArray(32);
        int[] term161228 = (int[]) newIntArray(32);
        Object[] term161261 = (Object[]) newArray("java.lang.Object", 32);
        long[] term161337 = (long[]) newLongArray(32);
        Object[] term161372 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term161374 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term161193, term161193.getClass(), "_path", null);
        setField(term161193, term161193.getClass(), "_processor", null);
        setField(term161193, term161193.getClass(), "_location", null);
        setShortElement(term161195, 0, (short) 13);
        setShortElement(term161195, 1, (short) 3);
        setShortElement(term161195, 5, (short) 33);
        setShortElement(term161195, 6, (short) 2);
        setShortElement(term161195, 7, (short) 3);
        setShortElement(term161195, 11, (short) 2);
        setShortElement(term161195, 12, (short) 4);
        setShortElement(term161195, 13, (short) 4);
        setShortElement(term161195, 14, (short) 3);
        setShortElement(term161195, 15, (short) 4);
        setShortElement(term161195, 16, (short) 4);
        setShortElement(term161195, 17, (short) 1);
        setShortElement(term161195, 18, (short) 2);
        setShortElement(term161195, 19, (short) 3);
        setShortElement(term161195, 20, (short) 3);
        setShortElement(term161195, 21, (short) 13);
        setShortElement(term161195, 22, (short) 1);
        setShortElement(term161195, 23, (short) 2);
        setShortElement(term161195, 24, (short) 12);
        setElement(term161194, 0, term161195);
        setIntElement(term161228, 0, 16449536);
        setIntElement(term161228, 2, 6553600);
        setIntElement(term161228, 3, 393216);
        setIntElement(term161228, 4, 3866630);
        setIntElement(term161228, 5, 1245184);
        setIntElement(term161228, 6, 3866624);
        setIntElement(term161228, 8, 6553600);
        setIntElement(term161228, 9, 393216);
        setIntElement(term161228, 10, 3866630);
        setIntElement(term161228, 11, 14352384);
        setIntElement(term161228, 12, 10354688);
        setIntElement(term161228, 13, 2883584);
        setIntElement(term161228, 14, 786432);
        setIntElement(term161228, 15, 1441792);
        setIntElement(term161228, 16, 7733248);
        setIntElement(term161228, 17, 20774912);
        setIntElement(term161228, 18, 262144);
        setIntElement(term161228, 19, 2555904);
        setIntElement(term161228, 20, 1835008);
        setIntElement(term161228, 21, 6029312);
        setIntElement(term161228, 22, 327680);
        setIntElement(term161228, 23, 1638400);
        setIntElement(term161228, 24, 720907);
        setElement(term161194, 1, term161228);
        setElement(term161261, 0, term161262);
        setElement(term161261, 1, term161269);
        setElement(term161261, 2, term161269);
        setElement(term161261, 3, term161272);
        setElement(term161261, 4, term161274);
        setElement(term161261, 5, term161278);
        setElement(term161261, 6, term161282);
        setElement(term161261, 7, term161269);
        setElement(term161261, 8, term161269);
        setElement(term161261, 9, term161272);
        setElement(term161261, 10, term161274);
        setElement(term161261, 11, term161288);
        setElement(term161261, 12, term161293);
        setElement(term161261, 13, term161297);
        setElement(term161261, 14, term161301);
        setElement(term161261, 15, term161305);
        setElement(term161261, 16, term161297);
        setElement(term161261, 17, term161309);
        setElement(term161261, 18, term161313);
        setElement(term161261, 19, term161316);
        setElement(term161261, 20, term161319);
        setElement(term161261, 21, term161323);
        setElement(term161261, 22, term161326);
        setElement(term161261, 23, term161329);
        setElement(term161261, 24, term161333);
        setElement(term161194, 2, term161261);
        setLongElement(term161337, 0, 34363800864L);
        setLongElement(term161337, 1, 34364798256L);
        setLongElement(term161337, 2, 34363739368L);
        setLongElement(term161337, 3, 34363739368L);
        setLongElement(term161337, 4, 34363739368L);
        setLongElement(term161337, 5, 132073603951184L);
        setLongElement(term161337, 6, 34363820048L);
        setLongElement(term161337, 7, 34364798256L);
        setLongElement(term161337, 8, 34363739368L);
        setLongElement(term161337, 9, 34363739368L);
        setLongElement(term161337, 10, 34363739368L);
        setLongElement(term161337, 11, 132077283560208L);
        setLongElement(term161337, 12, 132077283629184L);
        setLongElement(term161337, 13, 132077281112816L);
        setLongElement(term161337, 14, 132077283747392L);
        setLongElement(term161337, 15, 132077281112816L);
        setLongElement(term161337, 16, 132077281112816L);
        setLongElement(term161337, 17, 34363745472L);
        setLongElement(term161337, 18, 34364710216L);
        setLongElement(term161337, 19, 34363745472L);
        setLongElement(term161337, 20, 34363745472L);
        setLongElement(term161337, 21, 34364896224L);
        setLongElement(term161337, 22, 34363745472L);
        setLongElement(term161337, 23, 34363745472L);
        setLongElement(term161337, 24, 34363745472L);
        setElement(term161194, 3, term161337);
        setField(term161193, term161193.getClass(), "backtrace", term161194);
        setField(term161193, term161193.getClass(), "detailMessage", "");
        setField(term161193, term161193.getClass(), "cause", term161193);
        setField(term161193, term161193.getClass(), "stackTrace", term161372);
        setIntField(term161193, term161193.getClass(), "depth", 25);
        setIntField(term161374, term161374.getClass(), "modCount", 0);
        setField(term161193, term161193.getClass(), "suppressedExceptions", term161374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term161193));
    }

};


