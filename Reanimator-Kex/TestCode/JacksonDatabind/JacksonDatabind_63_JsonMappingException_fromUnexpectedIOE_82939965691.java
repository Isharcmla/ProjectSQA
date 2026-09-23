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

public class JsonMappingException_fromUnexpectedIOE_82939965691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183623;
     Object term187548;
     Object term187205;

    public JsonMappingException_fromUnexpectedIOE_82939965691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183623 = newInstance(Class.forName("java.nio.file.FileSystemLoopException"));
        term187548 = newInstance(Class.forName("java.nio.file.FileSystemLoopException"));
        setField(term187548, term187548.getClass(), "file", null);
        setField(term187548, term187548.getClass(), "other", null);
        setField(term187548, term187548.getClass(), "backtrace", null);
        setField(term187548, term187548.getClass(), "detailMessage", null);
        setField(term187548, term187548.getClass(), "cause", null);
        setField(term187548, term187548.getClass(), "stackTrace", null);
        setIntField(term187548, term187548.getClass(), "depth", 0);
        setField(term187548, term187548.getClass(), "suppressedExceptions", null);
        Class<? extends Object> term187274 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Feature");
        Class<? extends Object> term187281 = Class.forName((String) "java.nio.channels.Pipe$SourceChannel");
        Class<? extends Object> term187285 = Class.forName((String) "java.lang.invoke.VarHandleObjects$FieldInstanceReadOnly");
        Class<? extends Object> term187288 = Class.forName((String) "java.lang.reflect.ReflectPermission");
        Class<? extends Object> term187292 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer");
        Class<? extends Object> term187296 = Class.forName((String) "com.fasterxml.jackson.databind.node.MissingNode");
        Class<? extends Object> term187302 = Class.forName((String) "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate");
        Class<? extends Object> term187307 = Class.forName((String) "java.util.regex.Pattern$UnixDollar");
        Class<? extends Object> term187311 = Class.forName((String) "java.util.stream.ReduceOps$2");
        Class<? extends Object> term187315 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeParser$MyTokenizer");
        Class<? extends Object> term187319 = Class.forName((String) "java.util.concurrent.DelayQueue");
        Class<? extends Object> term187323 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Class<? extends Object> term187327 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonPropertyOrder");
        Class<? extends Object> term187330 = Class.forName((String) "java.util.stream.Nodes$LongArrayNode");
        Class<? extends Object> term187333 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.package-info");
        Class<? extends Object> term187337 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor");
        Class<? extends Object> term187341 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList$COWSubList");
        Class<? extends Object> term187344 = Class.forName((String) "java.util.regex.Pattern$LazyLoop");
        Class<? extends Object> term187348 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$NonfairSync");
        term187205 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term187206 = (Object[]) newArray("java.lang.Object", 5);
        short[] term187207 = (short[]) newShortArray(32);
        int[] term187240 = (int[]) newIntArray(32);
        Object[] term187273 = (Object[]) newArray("java.lang.Object", 32);
        long[] term187352 = (long[]) newLongArray(32);
        Object[] term187463 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term187465 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term187205, term187205.getClass(), "_path", null);
        setField(term187205, term187205.getClass(), "_processor", null);
        setField(term187205, term187205.getClass(), "_location", null);
        setShortElement(term187207, 0, (short) 30);
        setShortElement(term187207, 1, (short) 3);
        setShortElement(term187207, 5, (short) 27);
        setShortElement(term187207, 6, (short) 2);
        setShortElement(term187207, 7, (short) 3);
        setShortElement(term187207, 11, (short) 2);
        setShortElement(term187207, 12, (short) 4);
        setShortElement(term187207, 13, (short) 4);
        setShortElement(term187207, 14, (short) 3);
        setShortElement(term187207, 15, (short) 4);
        setShortElement(term187207, 16, (short) 4);
        setShortElement(term187207, 17, (short) 1);
        setShortElement(term187207, 18, (short) 2);
        setShortElement(term187207, 19, (short) 3);
        setShortElement(term187207, 20, (short) 3);
        setShortElement(term187207, 21, (short) 13);
        setShortElement(term187207, 22, (short) 1);
        setShortElement(term187207, 23, (short) 2);
        setShortElement(term187207, 24, (short) 12);
        setElement(term187206, 0, term187207);
        setIntElement(term187240, 0, 57016320);
        setIntElement(term187240, 2, 6553600);
        setIntElement(term187240, 3, 393216);
        setIntElement(term187240, 4, 3866630);
        setIntElement(term187240, 5, 1245184);
        setIntElement(term187240, 6, 2424832);
        setIntElement(term187240, 8, 6553600);
        setIntElement(term187240, 9, 393216);
        setIntElement(term187240, 10, 3866630);
        setIntElement(term187240, 11, 14352384);
        setIntElement(term187240, 12, 10354688);
        setIntElement(term187240, 13, 2883584);
        setIntElement(term187240, 14, 786432);
        setIntElement(term187240, 15, 1441792);
        setIntElement(term187240, 16, 7733248);
        setIntElement(term187240, 17, 20774912);
        setIntElement(term187240, 18, 262144);
        setIntElement(term187240, 19, 2555904);
        setIntElement(term187240, 20, 1835008);
        setIntElement(term187240, 21, 6029312);
        setIntElement(term187240, 22, 327680);
        setIntElement(term187240, 23, 1638400);
        setIntElement(term187240, 24, 720907);
        setElement(term187206, 1, term187240);
        setElement(term187273, 0, term187274);
        setElement(term187273, 1, term187281);
        setElement(term187273, 2, term187281);
        setElement(term187273, 3, term187285);
        setElement(term187273, 4, term187288);
        setElement(term187273, 5, term187292);
        setElement(term187273, 6, term187296);
        setElement(term187273, 7, term187281);
        setElement(term187273, 8, term187281);
        setElement(term187273, 9, term187285);
        setElement(term187273, 10, term187288);
        setElement(term187273, 11, term187302);
        setElement(term187273, 12, term187307);
        setElement(term187273, 13, term187311);
        setElement(term187273, 14, term187315);
        setElement(term187273, 15, term187319);
        setElement(term187273, 16, term187311);
        setElement(term187273, 17, term187323);
        setElement(term187273, 18, term187327);
        setElement(term187273, 19, term187330);
        setElement(term187273, 20, term187333);
        setElement(term187273, 21, term187337);
        setElement(term187273, 22, term187341);
        setElement(term187273, 23, term187344);
        setElement(term187273, 24, term187348);
        setElement(term187206, 2, term187273);
        setLongElement(term187352, 0, 132578329177248L);
        setLongElement(term187352, 1, 34364798256L);
        setLongElement(term187352, 2, 34363739368L);
        setLongElement(term187352, 3, 34363739368L);
        setLongElement(term187352, 4, 34363739368L);
        setLongElement(term187352, 5, 132578328998496L);
        setLongElement(term187352, 6, 34363820048L);
        setLongElement(term187352, 7, 34364798256L);
        setLongElement(term187352, 8, 34363739368L);
        setLongElement(term187352, 9, 34363739368L);
        setLongElement(term187352, 10, 34363739368L);
        setLongElement(term187352, 11, 132582552571296L);
        setLongElement(term187352, 12, 132582552640272L);
        setLongElement(term187352, 13, 132582550089488L);
        setLongElement(term187352, 14, 132582552759024L);
        setLongElement(term187352, 15, 132582550089488L);
        setLongElement(term187352, 16, 132582550089488L);
        setLongElement(term187352, 17, 34363745472L);
        setLongElement(term187352, 18, 34364710216L);
        setLongElement(term187352, 19, 34363745472L);
        setLongElement(term187352, 20, 34363745472L);
        setLongElement(term187352, 21, 34364896224L);
        setLongElement(term187352, 22, 34363745472L);
        setLongElement(term187352, 23, 34363745472L);
        setLongElement(term187352, 24, 34363745472L);
        setElement(term187206, 3, term187352);
        setField(term187205, term187205.getClass(), "backtrace", term187206);
        setField(term187205, term187205.getClass(), "detailMessage", "Unexpected IOException (of type java.nio.file.FileSystemLoopException): null");
        setField(term187205, term187205.getClass(), "cause", term187205);
        setField(term187205, term187205.getClass(), "stackTrace", term187463);
        setIntField(term187205, term187205.getClass(), "depth", 25);
        setIntField(term187465, term187465.getClass(), "modCount", 0);
        setField(term187205, term187205.getClass(), "suppressedExceptions", term187465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.IOException");
        Object[] args = new Object[1];
        args[0] = term183623;
        Object retValue = callMethod(klass, "fromUnexpectedIOE", argTypes, null, args);
        assertTrue(recursiveEquals(term183623, term187548));
        assertTrue(recursiveEquals(retValue, term187205));
    }

};


