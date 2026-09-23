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

public class JsonMappingException_wrapWithPath_481861005183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318328;
     Object term319205;
     Object term318962;

    public JsonMappingException_wrapWithPath_481861005183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318328 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        term319205 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        setField(term319205, term319205.getClass(), "backtrace", null);
        setField(term319205, term319205.getClass(), "detailMessage", null);
        setField(term319205, term319205.getClass(), "cause", null);
        setField(term319205, term319205.getClass(), "stackTrace", null);
        setIntField(term319205, term319205.getClass(), "depth", 0);
        setField(term319205, term319205.getClass(), "suppressedExceptions", null);
        LinkedList term318963 = new LinkedList();
        ((LinkedList) term318963).add((Object)null);
        Class<? extends Object> term319035 = Class.forName((String) "java.util.concurrent.CompletableFuture$ThreadPerTaskExecutor");
        Class<? extends Object> term319042 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary$Unloader");
        Class<? extends Object> term319046 = Class.forName((String) "java.util.Collections$CheckedQueue");
        Class<? extends Object> term319049 = Class.forName((String) "java.lang.Class$AnnotationData");
        Class<? extends Object> term319053 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<? extends Object> term319057 = Class.forName((String) "java.util.concurrent.CompletableFuture$AnyOf");
        Class<? extends Object> term319063 = Class.forName((String) "java.nio.file.ClosedWatchServiceException");
        Class<? extends Object> term319068 = Class.forName((String) "java.lang.ProcessEnvironment$StringEnvironment");
        Class<? extends Object> term319072 = Class.forName((String) "java.util.AbstractList$SubList$1");
        Class<? extends Object> term319076 = Class.forName((String) "java.util.zip.CRC32");
        Class<? extends Object> term319080 = Class.forName((String) "java.io.StreamTokenizer");
        Class<? extends Object> term319084 = Class.forName((String) "java.lang.Class$2");
        Class<? extends Object> term319088 = Class.forName((String) "java.lang.ProcessHandle$Info");
        Class<? extends Object> term319091 = Class.forName((String) "java.lang.annotation.Documented");
        Class<? extends Object> term319094 = Class.forName((String) "java.lang.Byte$ByteCache");
        Class<? extends Object> term319098 = Class.forName((String) "java.lang.invoke.VarHandleFloats$FieldInstanceReadOnly");
        Class<? extends Object> term319102 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        Class<? extends Object> term319105 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer");
        Class<? extends Object> term319109 = Class.forName((String) "java.util.LinkedHashMap$LinkedHashIterator");
        term318962 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term318967 = (Object[]) newArray("java.lang.Object", 5);
        short[] term318968 = (short[]) newShortArray(32);
        int[] term319001 = (int[]) newIntArray(32);
        Object[] term319034 = (Object[]) newArray("java.lang.Object", 32);
        long[] term319113 = (long[]) newLongArray(32);
        Object term318957 = newInstance(Class.forName("java.util.concurrent.RejectedExecutionException"));
        Object[] term319201 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term319203 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term318962, term318962.getClass(), "_path", term318963);
        setField(term318962, term318962.getClass(), "_processor", null);
        setField(term318962, term318962.getClass(), "_location", null);
        setShortElement(term318968, 0, (short) 20);
        setShortElement(term318968, 1, (short) 3);
        setShortElement(term318968, 5, (short) 27);
        setShortElement(term318968, 6, (short) 2);
        setShortElement(term318968, 7, (short) 3);
        setShortElement(term318968, 11, (short) 2);
        setShortElement(term318968, 12, (short) 4);
        setShortElement(term318968, 13, (short) 4);
        setShortElement(term318968, 14, (short) 3);
        setShortElement(term318968, 15, (short) 4);
        setShortElement(term318968, 16, (short) 4);
        setShortElement(term318968, 17, (short) 1);
        setShortElement(term318968, 18, (short) 2);
        setShortElement(term318968, 19, (short) 3);
        setShortElement(term318968, 20, (short) 3);
        setShortElement(term318968, 21, (short) 13);
        setShortElement(term318968, 22, (short) 1);
        setShortElement(term318968, 23, (short) 2);
        setShortElement(term318968, 24, (short) 12);
        setElement(term318967, 0, term318968);
        setIntElement(term319001, 0, 128385024);
        setIntElement(term319001, 2, 6553600);
        setIntElement(term319001, 3, 393216);
        setIntElement(term319001, 4, 3866630);
        setIntElement(term319001, 5, 1245184);
        setIntElement(term319001, 6, 3211264);
        setIntElement(term319001, 8, 6553600);
        setIntElement(term319001, 9, 393216);
        setIntElement(term319001, 10, 3866630);
        setIntElement(term319001, 11, 14352384);
        setIntElement(term319001, 12, 10354688);
        setIntElement(term319001, 13, 2883584);
        setIntElement(term319001, 14, 786432);
        setIntElement(term319001, 15, 1441792);
        setIntElement(term319001, 16, 7733248);
        setIntElement(term319001, 17, 20774912);
        setIntElement(term319001, 18, 262144);
        setIntElement(term319001, 19, 2555904);
        setIntElement(term319001, 20, 1835008);
        setIntElement(term319001, 21, 6029312);
        setIntElement(term319001, 22, 327680);
        setIntElement(term319001, 23, 1638400);
        setIntElement(term319001, 24, 720907);
        setElement(term318967, 1, term319001);
        setElement(term319034, 0, term319035);
        setElement(term319034, 1, term319042);
        setElement(term319034, 2, term319042);
        setElement(term319034, 3, term319046);
        setElement(term319034, 4, term319049);
        setElement(term319034, 5, term319053);
        setElement(term319034, 6, term319057);
        setElement(term319034, 7, term319042);
        setElement(term319034, 8, term319042);
        setElement(term319034, 9, term319046);
        setElement(term319034, 10, term319049);
        setElement(term319034, 11, term319063);
        setElement(term319034, 12, term319068);
        setElement(term319034, 13, term319072);
        setElement(term319034, 14, term319076);
        setElement(term319034, 15, term319080);
        setElement(term319034, 16, term319072);
        setElement(term319034, 17, term319084);
        setElement(term319034, 18, term319088);
        setElement(term319034, 19, term319091);
        setElement(term319034, 20, term319094);
        setElement(term319034, 21, term319098);
        setElement(term319034, 22, term319102);
        setElement(term319034, 23, term319105);
        setElement(term319034, 24, term319109);
        setElement(term318967, 2, term319034);
        setLongElement(term319113, 0, 132578328546864L);
        setLongElement(term319113, 1, 34364798256L);
        setLongElement(term319113, 2, 34363739368L);
        setLongElement(term319113, 3, 34363739368L);
        setLongElement(term319113, 4, 34363739368L);
        setLongElement(term319113, 5, 132578328998496L);
        setLongElement(term319113, 6, 34363820048L);
        setLongElement(term319113, 7, 34364798256L);
        setLongElement(term319113, 8, 34363739368L);
        setLongElement(term319113, 9, 34363739368L);
        setLongElement(term319113, 10, 34363739368L);
        setLongElement(term319113, 11, 132582552571296L);
        setLongElement(term319113, 12, 132582552640272L);
        setLongElement(term319113, 13, 132582550089488L);
        setLongElement(term319113, 14, 132582552759024L);
        setLongElement(term319113, 15, 132582550089488L);
        setLongElement(term319113, 16, 132582550089488L);
        setLongElement(term319113, 17, 34363745472L);
        setLongElement(term319113, 18, 34364710216L);
        setLongElement(term319113, 19, 34363745472L);
        setLongElement(term319113, 20, 34363745472L);
        setLongElement(term319113, 21, 34364896224L);
        setLongElement(term319113, 22, 34363745472L);
        setLongElement(term319113, 23, 34363745472L);
        setLongElement(term319113, 24, 34363745472L);
        setElement(term318967, 3, term319113);
        setField(term318962, term318962.getClass(), "backtrace", term318967);
        setField(term318962, term318962.getClass(), "detailMessage", "(was java.util.concurrent.RejectedExecutionException)");
        setField(term318957, term318957.getClass(), "backtrace", null);
        setField(term318957, term318957.getClass(), "detailMessage", null);
        setField(term318957, term318957.getClass(), "cause", null);
        setField(term318957, term318957.getClass(), "stackTrace", null);
        setIntField(term318957, term318957.getClass(), "depth", 0);
        setField(term318957, term318957.getClass(), "suppressedExceptions", null);
        setField(term318962, term318962.getClass(), "cause", term318957);
        setField(term318962, term318962.getClass(), "stackTrace", term319201);
        setIntField(term318962, term318962.getClass(), "depth", 25);
        setIntField(term319203, term319203.getClass(), "modCount", 0);
        setField(term318962, term318962.getClass(), "suppressedExceptions", term319203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term318328;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term318328, term319205));
        assertTrue(recursiveEquals(retValue, term318962));
    }

};


