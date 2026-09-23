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

public class JsonMappingException_init_1899646002230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374064;

    public JsonMappingException_init_1899646002230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term373794 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term373838 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term373662 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term373794, term373794.getClass(), "cause", term373838);
        setField(term373794, term373794.getClass(), "stackTrace", term373662);
        setField(term373794, term373794.getClass(), "suppressedExceptions", null);
        setField(term373794, term373794.getClass(), "detailMessage", "");
        Class<? extends Object> term374069 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator");
        Class<? extends Object> term374071 = Class.forName((String) "java.nio.file.StandardWatchEventKinds$StdWatchEventKind");
        Class<? extends Object> term374072 = Class.forName((String) "java.lang.reflect.Method");
        Class<? extends Object> term374075 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<? extends Object> term374079 = Class.forName((String) "java.util.ImmutableCollections$MapN");
        Class<? extends Object> term374083 = Class.forName((String) "java.util.stream.MatchOps$1MatchSink");
        Class<? extends Object> term374085 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectWriter");
        Class<? extends Object> term374087 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedEntryIterator");
        Class<? extends Object> term374090 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer");
        Class<? extends Object> term374094 = Class.forName((String) "java.util.stream.LongPipeline$4");
        Class<? extends Object> term374097 = Class.forName((String) "com.fasterxml.jackson.core.JsonTokenId");
        Class<? extends Object> term374100 = Class.forName((String) "java.util.Spliterators$DoubleArraySpliterator");
        Class<? extends Object> term374103 = Class.forName((String) "java.util.regex.Pattern$2");
        Class<? extends Object> term374106 = Class.forName((String) "java.lang.ProcessEnvironment$Variable");
        Class<? extends Object> term374109 = Class.forName((String) "kex.java.util.HashMap$KeySet");
        Class<? extends Object> term374111 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor$Base");
        Class<? extends Object> term374113 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonGetter");
        Class<? extends Object> term374116 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        Class<? extends Object> term374119 = Class.forName((String) "java.io.FilterWriter");
        Class<? extends Object> term374121 = Class.forName((String) "java.lang.invoke.VarHandleShorts$FieldInstanceReadOnly");
        Class<? extends Object> term374124 = Class.forName((String) "java.lang.Math$RandomNumberGeneratorHolder");
        term374064 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term374065 = (Object[]) newArray("java.lang.Object", 5);
        short[] term374066 = (short[]) newShortArray(32);
        int[] term374067 = (int[]) newIntArray(32);
        Object[] term374068 = (Object[]) newArray("java.lang.Object", 32);
        long[] term374127 = (long[]) newLongArray(32);
        Object[] term374128 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term374129 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term374064, term374064.getClass(), "_path", null);
        setField(term374064, term374064.getClass(), "_processor", null);
        setField(term374064, term374064.getClass(), "_location", null);
        setShortElement(term374066, 0, (short) 1);
        setShortElement(term374066, 1, (short) 2);
        setShortElement(term374066, 2, (short) 1);
        setShortElement(term374066, 3, (short) 7);
        setShortElement(term374066, 4, (short) 14);
        setShortElement(term374066, 5, (short) 2);
        setShortElement(term374066, 6, (short) 3);
        setShortElement(term374066, 10, (short) 2);
        setShortElement(term374066, 11, (short) 4);
        setShortElement(term374066, 12, (short) 4);
        setShortElement(term374066, 13, (short) 3);
        setShortElement(term374066, 14, (short) 4);
        setShortElement(term374066, 15, (short) 4);
        setShortElement(term374066, 16, (short) 1);
        setShortElement(term374066, 17, (short) 2);
        setShortElement(term374066, 18, (short) 3);
        setShortElement(term374066, 19, (short) 3);
        setShortElement(term374066, 20, (short) 13);
        setShortElement(term374066, 21, (short) 1);
        setShortElement(term374066, 22, (short) 2);
        setShortElement(term374066, 23, (short) 12);
        setElement(term374065, 0, term374066);
        setIntElement(term374067, 1, 5570560);
        setIntElement(term374067, 2, 327680);
        setIntElement(term374067, 3, 4456454);
        setIntElement(term374067, 4, 851968);
        setIntElement(term374067, 5, 3604480);
        setIntElement(term374067, 7, 6553600);
        setIntElement(term374067, 8, 393216);
        setIntElement(term374067, 9, 3866630);
        setIntElement(term374067, 10, 14352384);
        setIntElement(term374067, 11, 10354688);
        setIntElement(term374067, 12, 2883584);
        setIntElement(term374067, 13, 786432);
        setIntElement(term374067, 14, 1441792);
        setIntElement(term374067, 15, 7733248);
        setIntElement(term374067, 16, 20774912);
        setIntElement(term374067, 17, 262144);
        setIntElement(term374067, 18, 2555904);
        setIntElement(term374067, 19, 1835008);
        setIntElement(term374067, 20, 6029312);
        setIntElement(term374067, 21, 327680);
        setIntElement(term374067, 22, 1638400);
        setIntElement(term374067, 23, 720907);
        setElement(term374065, 1, term374067);
        setElement(term374068, 0, term374069);
        setElement(term374068, 1, term374069);
        setElement(term374068, 2, term374071);
        setElement(term374068, 3, term374072);
        setElement(term374068, 4, term374075);
        setElement(term374068, 5, term374079);
        setElement(term374068, 6, term374083);
        setElement(term374068, 7, term374083);
        setElement(term374068, 8, term374085);
        setElement(term374068, 9, term374087);
        setElement(term374068, 10, term374090);
        setElement(term374068, 11, term374094);
        setElement(term374068, 12, term374097);
        setElement(term374068, 13, term374100);
        setElement(term374068, 14, term374103);
        setElement(term374068, 15, term374097);
        setElement(term374068, 16, term374106);
        setElement(term374068, 17, term374109);
        setElement(term374068, 18, term374111);
        setElement(term374068, 19, term374113);
        setElement(term374068, 20, term374116);
        setElement(term374068, 21, term374119);
        setElement(term374068, 22, term374121);
        setElement(term374068, 23, term374124);
        setElement(term374065, 2, term374068);
        setLongElement(term374127, 0, 34363746224L);
        setLongElement(term374127, 1, 34363775512L);
        setLongElement(term374127, 2, 34363775512L);
        setLongElement(term374127, 3, 34363775512L);
        setLongElement(term374127, 4, 132578326060064L);
        setLongElement(term374127, 5, 34363820048L);
        setLongElement(term374127, 6, 34364798256L);
        setLongElement(term374127, 7, 34363739368L);
        setLongElement(term374127, 8, 34363739368L);
        setLongElement(term374127, 9, 34363739368L);
        setLongElement(term374127, 10, 132582552571296L);
        setLongElement(term374127, 11, 132582552640272L);
        setLongElement(term374127, 12, 132582550089488L);
        setLongElement(term374127, 13, 132582552759024L);
        setLongElement(term374127, 14, 132582550089488L);
        setLongElement(term374127, 15, 132582550089488L);
        setLongElement(term374127, 16, 34363745472L);
        setLongElement(term374127, 17, 34364710216L);
        setLongElement(term374127, 18, 34363745472L);
        setLongElement(term374127, 19, 34363745472L);
        setLongElement(term374127, 20, 34364896224L);
        setLongElement(term374127, 21, 34363745472L);
        setLongElement(term374127, 22, 34363745472L);
        setLongElement(term374127, 23, 34363745472L);
        setElement(term374065, 3, term374127);
        setField(term374064, term374064.getClass(), "backtrace", term374065);
        setField(term374064, term374064.getClass(), "detailMessage", null);
        setField(term374064, term374064.getClass(), "cause", term374064);
        setField(term374064, term374064.getClass(), "stackTrace", term374128);
        setIntField(term374064, term374064.getClass(), "depth", 24);
        setIntField(term374129, term374129.getClass(), "modCount", 0);
        setField(term374064, term374064.getClass(), "suppressedExceptions", term374129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonLocation");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term374064));
    }

};


