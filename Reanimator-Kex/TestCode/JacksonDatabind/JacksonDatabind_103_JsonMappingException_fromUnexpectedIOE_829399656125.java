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

public class JsonMappingException_fromUnexpectedIOE_829399656125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246034;
     Object term248245;
     Object term247919;

    public JsonMappingException_fromUnexpectedIOE_829399656125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246034 = newInstance(Class.forName("java.io.InvalidObjectException"));
        term248245 = newInstance(Class.forName("java.io.InvalidObjectException"));
        setField(term248245, term248245.getClass(), "backtrace", null);
        setField(term248245, term248245.getClass(), "detailMessage", null);
        setField(term248245, term248245.getClass(), "cause", null);
        setField(term248245, term248245.getClass(), "stackTrace", null);
        setIntField(term248245, term248245.getClass(), "depth", 0);
        setField(term248245, term248245.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term247988 = Class.forName((String) "java.lang.invoke.StringConcatFactory$BytecodeStringBuilderStrategy");
        Class<? extends Object> term247995 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator");
        Class<? extends Object> term247998 = Class.forName((String) "java.io.DataInputStream");
        Class<? extends Object> term248000 = Class.forName((String) "java.nio.ByteBufferAsLongBufferRL");
        Class<? extends Object> term248004 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceValuesTask");
        Class<? extends Object> term248008 = Class.forName((String) "java.util.zip.GZIPInputStream");
        Class<? extends Object> term248014 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonTypeResolver");
        Class<? extends Object> term248019 = Class.forName((String) "java.util.regex.Pattern$BnM");
        Class<? extends Object> term248023 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        Class<? extends Object> term248027 = Class.forName((String) "java.lang.reflect.AnnotatedArrayType");
        Class<? extends Object> term248031 = Class.forName((String) "java.util.stream.StreamSpliterators$DelegatingSpliterator$OfDouble");
        Class<? extends Object> term248035 = Class.forName((String) "com.fasterxml.jackson.databind.exc.InvalidNullException");
        Class<? extends Object> term248039 = Class.forName((String) "java.util.stream.LongPipeline$1");
        Class<? extends Object> term248042 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder");
        Class<? extends Object> term248045 = Class.forName((String) "java.util.stream.IntPipeline$7$1");
        Class<? extends Object> term248049 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.BaseSettings");
        Class<? extends Object> term248052 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedKeyIterator");
        Class<? extends Object> term248055 = Class.forName((String) "java.util.concurrent.CompletableFuture$UniRelay");
        Class<? extends Object> term248059 = Class.forName((String) "java.nio.file.FileSystems$DefaultFileSystemHolder");
        term247919 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term247920 = (Object[]) newArray("java.lang.Object", 5);
        short[] term247921 = (short[]) newShortArray(32);
        int[] term247954 = (int[]) newIntArray(32);
        Object[] term247987 = (Object[]) newArray("java.lang.Object", 32);
        long[] term248063 = (long[]) newLongArray(32);
        Object[] term248167 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term248169 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term247919, term247919.getClass(), "_path", null);
        setField(term247919, term247919.getClass(), "_processor", null);
        setField(term247919, term247919.getClass(), "_location", null);
        setShortElement(term247921, 0, (short) 27);
        setShortElement(term247921, 1, (short) 3);
        setShortElement(term247921, 5, (short) 33);
        setShortElement(term247921, 6, (short) 2);
        setShortElement(term247921, 7, (short) 3);
        setShortElement(term247921, 11, (short) 2);
        setShortElement(term247921, 12, (short) 4);
        setShortElement(term247921, 13, (short) 4);
        setShortElement(term247921, 14, (short) 3);
        setShortElement(term247921, 15, (short) 4);
        setShortElement(term247921, 16, (short) 4);
        setShortElement(term247921, 17, (short) 1);
        setShortElement(term247921, 18, (short) 2);
        setShortElement(term247921, 19, (short) 3);
        setShortElement(term247921, 20, (short) 3);
        setShortElement(term247921, 21, (short) 13);
        setShortElement(term247921, 22, (short) 1);
        setShortElement(term247921, 23, (short) 2);
        setShortElement(term247921, 24, (short) 12);
        setElement(term247920, 0, term247921);
        setIntElement(term247954, 0, 57016320);
        setIntElement(term247954, 2, 6553600);
        setIntElement(term247954, 3, 393216);
        setIntElement(term247954, 4, 3866630);
        setIntElement(term247954, 5, 1245184);
        setIntElement(term247954, 6, 2424832);
        setIntElement(term247954, 8, 6553600);
        setIntElement(term247954, 9, 393216);
        setIntElement(term247954, 10, 3866630);
        setIntElement(term247954, 11, 14352384);
        setIntElement(term247954, 12, 10354688);
        setIntElement(term247954, 13, 2883584);
        setIntElement(term247954, 14, 786432);
        setIntElement(term247954, 15, 1441792);
        setIntElement(term247954, 16, 7733248);
        setIntElement(term247954, 17, 20774912);
        setIntElement(term247954, 18, 262144);
        setIntElement(term247954, 19, 2555904);
        setIntElement(term247954, 20, 1835008);
        setIntElement(term247954, 21, 6029312);
        setIntElement(term247954, 22, 327680);
        setIntElement(term247954, 23, 1638400);
        setIntElement(term247954, 24, 720907);
        setElement(term247920, 1, term247954);
        setElement(term247987, 0, term247988);
        setElement(term247987, 1, term247995);
        setElement(term247987, 2, term247995);
        setElement(term247987, 3, term247998);
        setElement(term247987, 4, term248000);
        setElement(term247987, 5, term248004);
        setElement(term247987, 6, term248008);
        setElement(term247987, 7, term247995);
        setElement(term247987, 8, term247995);
        setElement(term247987, 9, term247998);
        setElement(term247987, 10, term248000);
        setElement(term247987, 11, term248014);
        setElement(term247987, 12, term248019);
        setElement(term247987, 13, term248023);
        setElement(term247987, 14, term248027);
        setElement(term247987, 15, term248031);
        setElement(term247987, 16, term248023);
        setElement(term247987, 17, term248035);
        setElement(term247987, 18, term248039);
        setElement(term247987, 19, term248042);
        setElement(term247987, 20, term248045);
        setElement(term247987, 21, term248049);
        setElement(term247987, 22, term248052);
        setElement(term247987, 23, term248055);
        setElement(term247987, 24, term248059);
        setElement(term247920, 2, term247987);
        setLongElement(term248063, 0, 132073604125296L);
        setLongElement(term248063, 1, 34364798256L);
        setLongElement(term248063, 2, 34363739368L);
        setLongElement(term248063, 3, 34363739368L);
        setLongElement(term248063, 4, 34363739368L);
        setLongElement(term248063, 5, 132073603951184L);
        setLongElement(term248063, 6, 34363820048L);
        setLongElement(term248063, 7, 34364798256L);
        setLongElement(term248063, 8, 34363739368L);
        setLongElement(term248063, 9, 34363739368L);
        setLongElement(term248063, 10, 34363739368L);
        setLongElement(term248063, 11, 132077283560208L);
        setLongElement(term248063, 12, 132077283629184L);
        setLongElement(term248063, 13, 132077281112816L);
        setLongElement(term248063, 14, 132077283747392L);
        setLongElement(term248063, 15, 132077281112816L);
        setLongElement(term248063, 16, 132077281112816L);
        setLongElement(term248063, 17, 34363745472L);
        setLongElement(term248063, 18, 34364710216L);
        setLongElement(term248063, 19, 34363745472L);
        setLongElement(term248063, 20, 34363745472L);
        setLongElement(term248063, 21, 34364896224L);
        setLongElement(term248063, 22, 34363745472L);
        setLongElement(term248063, 23, 34363745472L);
        setLongElement(term248063, 24, 34363745472L);
        setElement(term247920, 3, term248063);
        setField(term247919, term247919.getClass(), "backtrace", term247920);
        setField(term247919, term247919.getClass(), "detailMessage", "Unexpected IOException (of type java.io.InvalidObjectException): null");
        setField(term247919, term247919.getClass(), "cause", term247919);
        setField(term247919, term247919.getClass(), "stackTrace", term248167);
        setIntField(term247919, term247919.getClass(), "depth", 25);
        setIntField(term248169, term248169.getClass(), "modCount", 0);
        setField(term247919, term247919.getClass(), "suppressedExceptions", term248169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term246034;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term246034, term248245));
        assertTrue(recursiveEquals(retValue, term247919));
    }

};


