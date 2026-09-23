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

public class JsonMappingException_wrapWithPath_481861005432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659753;
     Object term660268;
     Object term660032;

    public JsonMappingException_wrapWithPath_481861005432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659753 = newInstance(Class.forName("java.lang.SecurityException"));
        term660268 = newInstance(Class.forName("java.lang.SecurityException"));
        setField(term660268, term660268.getClass(), "backtrace", null);
        setField(term660268, term660268.getClass(), "detailMessage", null);
        setField(term660268, term660268.getClass(), "cause", null);
        setField(term660268, term660268.getClass(), "stackTrace", null);
        setIntField(term660268, term660268.getClass(), "depth", 0);
        setField(term660268, term660268.getClass(), "suppressedExceptions", null);
        LinkedList term660033 = new LinkedList();
        ((LinkedList) term660033).add((Object)null);
        Class<? extends Object> term660105 = Class.forName((String) "java.nio.DirectLongBufferU");
        Class<? extends Object> term660112 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOp$OfLong");
        Class<? extends Object> term660125 = Class.forName((String) "java.util.Collections$SynchronizedMap");
        Class<? extends Object> term660129 = Class.forName((String) "java.nio.HeapIntBufferR");
        Class<? extends Object> term660133 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base");
        Class<? extends Object> term660137 = Class.forName((String) "java.util.concurrent.CompletableFuture$AsynchronousCompletionTask");
        Class<? extends Object> term660143 = Class.forName((String) "java.nio.file.attribute.BasicFileAttributes");
        Class<? extends Object> term660146 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$ReduceValuesTask");
        Class<? extends Object> term660151 = Class.forName((String) "kex.java.util.HashMap$Values");
        Class<? extends Object> term660155 = Class.forName((String) "java.util.AbstractList$Itr");
        Class<? extends Object> term660159 = Class.forName((String) "java.util.EnumMap$ValueIterator");
        Class<? extends Object> term660163 = Class.forName((String) "com.fasterxml.jackson.databind.SerializerProvider");
        Class<? extends Object> term660167 = Class.forName((String) "java.util.stream.TerminalOp");
        Class<? extends Object> term660171 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        Class<? extends Object> term660174 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer");
        Class<? extends Object> term660177 = Class.forName((String) "com.fasterxml.jackson.databind.SerializationFeature");
        Class<? extends Object> term660181 = Class.forName((String) "java.util.zip.GZIPInputStream$1");
        Class<? extends Object> term660185 = Class.forName((String) "java.lang.Module$1");
        Class<? extends Object> term660188 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$ArrayAccess");
        Class<? extends Object> term660192 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$CollectionReferringAccumulator");
        term660032 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term660037 = (Object[]) newArray("java.lang.Object", 5);
        short[] term660038 = (short[]) newShortArray(32);
        int[] term660071 = (int[]) newIntArray(32);
        Object[] term660104 = (Object[]) newArray("java.lang.Object", 32);
        long[] term660196 = (long[]) newLongArray(32);
        Object term660027 = newInstance(Class.forName("java.lang.SecurityException"));
        Object[] term660264 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term660266 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term660032, term660032.getClass(), "_path", term660033);
        setField(term660032, term660032.getClass(), "_processor", null);
        setField(term660032, term660032.getClass(), "_location", null);
        setShortElement(term660038, 0, (short) 20);
        setShortElement(term660038, 4, (short) 27);
        setShortElement(term660038, 5, (short) 2);
        setShortElement(term660038, 6, (short) 3);
        setShortElement(term660038, 10, (short) 2);
        setShortElement(term660038, 11, (short) 4);
        setShortElement(term660038, 12, (short) 4);
        setShortElement(term660038, 13, (short) 3);
        setShortElement(term660038, 14, (short) 4);
        setShortElement(term660038, 15, (short) 4);
        setShortElement(term660038, 16, (short) 1);
        setShortElement(term660038, 17, (short) 2);
        setShortElement(term660038, 18, (short) 3);
        setShortElement(term660038, 19, (short) 3);
        setShortElement(term660038, 20, (short) 13);
        setShortElement(term660038, 21, (short) 1);
        setShortElement(term660038, 22, (short) 2);
        setShortElement(term660038, 23, (short) 12);
        setElement(term660037, 0, term660038);
        setIntElement(term660071, 0, 128385024);
        setIntElement(term660071, 1, 2097152);
        setIntElement(term660071, 2, 393216);
        setIntElement(term660071, 3, 3866630);
        setIntElement(term660071, 4, 1245184);
        setIntElement(term660071, 5, 3211264);
        setIntElement(term660071, 7, 6553600);
        setIntElement(term660071, 8, 393216);
        setIntElement(term660071, 9, 3866630);
        setIntElement(term660071, 10, 14352384);
        setIntElement(term660071, 11, 10354688);
        setIntElement(term660071, 12, 2883584);
        setIntElement(term660071, 13, 786432);
        setIntElement(term660071, 14, 1441792);
        setIntElement(term660071, 15, 7733248);
        setIntElement(term660071, 16, 20774912);
        setIntElement(term660071, 17, 262144);
        setIntElement(term660071, 18, 2555904);
        setIntElement(term660071, 19, 1835008);
        setIntElement(term660071, 20, 6029312);
        setIntElement(term660071, 21, 327680);
        setIntElement(term660071, 22, 1638400);
        setIntElement(term660071, 23, 720907);
        setElement(term660037, 1, term660071);
        setElement(term660104, 0, term660105);
        setElement(term660104, 1, term660112);
        setElement(term660104, 2, term660125);
        setElement(term660104, 3, term660129);
        setElement(term660104, 4, term660133);
        setElement(term660104, 5, term660137);
        setElement(term660104, 6, term660143);
        setElement(term660104, 7, term660143);
        setElement(term660104, 8, term660125);
        setElement(term660104, 9, term660129);
        setElement(term660104, 10, term660146);
        setElement(term660104, 11, term660151);
        setElement(term660104, 12, term660155);
        setElement(term660104, 13, term660159);
        setElement(term660104, 14, term660163);
        setElement(term660104, 15, term660155);
        setElement(term660104, 16, term660167);
        setElement(term660104, 17, term660171);
        setElement(term660104, 18, term660174);
        setElement(term660104, 19, term660177);
        setElement(term660104, 20, term660181);
        setElement(term660104, 21, term660185);
        setElement(term660104, 22, term660188);
        setElement(term660104, 23, term660192);
        setElement(term660037, 2, term660104);
        setLongElement(term660196, 0, 132578328546864L);
        setLongElement(term660196, 1, 34363739368L);
        setLongElement(term660196, 2, 34363739368L);
        setLongElement(term660196, 3, 34363739368L);
        setLongElement(term660196, 4, 132578328998496L);
        setLongElement(term660196, 5, 34363820048L);
        setLongElement(term660196, 6, 34364798256L);
        setLongElement(term660196, 7, 34363739368L);
        setLongElement(term660196, 8, 34363739368L);
        setLongElement(term660196, 9, 34363739368L);
        setLongElement(term660196, 10, 132582552571296L);
        setLongElement(term660196, 11, 132582552640272L);
        setLongElement(term660196, 12, 132582550089488L);
        setLongElement(term660196, 13, 132582552759024L);
        setLongElement(term660196, 14, 132582550089488L);
        setLongElement(term660196, 15, 132582550089488L);
        setLongElement(term660196, 16, 34363745472L);
        setLongElement(term660196, 17, 34364710216L);
        setLongElement(term660196, 18, 34363745472L);
        setLongElement(term660196, 19, 34363745472L);
        setLongElement(term660196, 20, 34364896224L);
        setLongElement(term660196, 21, 34363745472L);
        setLongElement(term660196, 22, 34363745472L);
        setLongElement(term660196, 23, 34363745472L);
        setElement(term660037, 3, term660196);
        setField(term660032, term660032.getClass(), "backtrace", term660037);
        setField(term660032, term660032.getClass(), "detailMessage", "(was java.lang.SecurityException)");
        setField(term660027, term660027.getClass(), "backtrace", null);
        setField(term660027, term660027.getClass(), "detailMessage", null);
        setField(term660027, term660027.getClass(), "cause", null);
        setField(term660027, term660027.getClass(), "stackTrace", null);
        setIntField(term660027, term660027.getClass(), "depth", 0);
        setField(term660027, term660027.getClass(), "suppressedExceptions", null);
        setField(term660032, term660032.getClass(), "cause", term660027);
        setField(term660032, term660032.getClass(), "stackTrace", term660264);
        setIntField(term660032, term660032.getClass(), "depth", 24);
        setIntField(term660266, term660266.getClass(), "modCount", 0);
        setField(term660032, term660032.getClass(), "suppressedExceptions", term660266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term659753;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term659753, term660268));
        assertTrue(recursiveEquals(retValue, term660032));
    }

};


