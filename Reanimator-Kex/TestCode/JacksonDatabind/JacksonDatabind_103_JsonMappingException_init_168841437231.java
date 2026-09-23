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
     Object term34201;

    public JsonMappingException_init_168841437231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34206 = Class.forName((String) "java.util.WeakHashMap$Entry");
        Class<? extends Object> term34208 = Class.forName((String) "com.fasterxml.jackson.databind.JsonSerializable$Base");
        Class<? extends Object> term34209 = Class.forName((String) "java.util.concurrent.locks.Lock");
        Class<? extends Object> term34212 = Class.forName((String) "java.nio.file.Paths");
        Class<? extends Object> term34216 = Class.forName((String) "java.util.concurrent.SynchronousQueue$TransferQueue$QNode");
        Class<? extends Object> term34220 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadOnly");
        Class<? extends Object> term34221 = Class.forName((String) "java.util.TreeMap$DescendingSubMap");
        Class<? extends Object> term34222 = Class.forName((String) "com.fasterxml.jackson.databind.SerializationFeature");
        Class<? extends Object> term34225 = Class.forName((String) "java.util.ImmutableCollections$AbstractImmutableMap");
        Class<? extends Object> term34229 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
        Class<? extends Object> term34232 = Class.forName((String) "java.util.LinkedList$Node");
        Class<? extends Object> term34235 = Class.forName((String) "kex.java.util.HashMap$EntrySet");
        Class<? extends Object> term34238 = Class.forName((String) "java.util.concurrent.locks.ReentrantLock");
        Class<? extends Object> term34241 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<? extends Object> term34244 = Class.forName((String) "java.lang.module.ModuleDescriptor$Exports$Modifier");
        Class<? extends Object> term34245 = Class.forName((String) "java.util.stream.DistinctOps");
        Class<? extends Object> term34247 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$CollectionReferringAccumulator");
        Class<? extends Object> term34248 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        Class<? extends Object> term34249 = Class.forName((String) "java.nio.charset.CharsetEncoder");
        Class<? extends Object> term34250 = Class.forName((String) "java.lang.ClassLoader");
        Class<? extends Object> term34253 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator");
        term34201 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term34202 = (Object[]) newArray("java.lang.Object", 5);
        short[] term34203 = (short[]) newShortArray(32);
        int[] term34204 = (int[]) newIntArray(32);
        Object[] term34205 = (Object[]) newArray("java.lang.Object", 32);
        long[] term34256 = (long[]) newLongArray(32);
        Object[] term34259 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term34260 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term34201, term34201.getClass(), "_path", null);
        setField(term34201, term34201.getClass(), "_processor", null);
        setField(term34201, term34201.getClass(), "_location", null);
        setShortElement(term34203, 0, (short) 1);
        setShortElement(term34203, 1, (short) 2);
        setShortElement(term34203, 2, (short) 1);
        setShortElement(term34203, 3, (short) 7);
        setShortElement(term34203, 4, (short) 6);
        setShortElement(term34203, 5, (short) 2);
        setShortElement(term34203, 6, (short) 3);
        setShortElement(term34203, 10, (short) 2);
        setShortElement(term34203, 11, (short) 4);
        setShortElement(term34203, 12, (short) 4);
        setShortElement(term34203, 13, (short) 3);
        setShortElement(term34203, 14, (short) 4);
        setShortElement(term34203, 15, (short) 4);
        setShortElement(term34203, 16, (short) 1);
        setShortElement(term34203, 17, (short) 2);
        setShortElement(term34203, 18, (short) 3);
        setShortElement(term34203, 19, (short) 3);
        setShortElement(term34203, 20, (short) 13);
        setShortElement(term34203, 21, (short) 1);
        setShortElement(term34203, 22, (short) 2);
        setShortElement(term34203, 23, (short) 12);
        setElement(term34202, 0, term34203);
        setIntElement(term34204, 1, 5570560);
        setIntElement(term34204, 2, 327680);
        setIntElement(term34204, 3, 4456454);
        setIntElement(term34204, 4, 851968);
        setIntElement(term34204, 5, 2097152);
        setIntElement(term34204, 7, 6553600);
        setIntElement(term34204, 8, 393216);
        setIntElement(term34204, 9, 3866630);
        setIntElement(term34204, 10, 14352384);
        setIntElement(term34204, 11, 10354688);
        setIntElement(term34204, 12, 2883584);
        setIntElement(term34204, 13, 786432);
        setIntElement(term34204, 14, 1441792);
        setIntElement(term34204, 15, 7733248);
        setIntElement(term34204, 16, 20774912);
        setIntElement(term34204, 17, 262144);
        setIntElement(term34204, 18, 2555904);
        setIntElement(term34204, 19, 1835008);
        setIntElement(term34204, 20, 6029312);
        setIntElement(term34204, 21, 327680);
        setIntElement(term34204, 22, 1638400);
        setIntElement(term34204, 23, 720907);
        setElement(term34202, 1, term34204);
        setElement(term34205, 0, term34206);
        setElement(term34205, 1, term34206);
        setElement(term34205, 2, term34208);
        setElement(term34205, 3, term34209);
        setElement(term34205, 4, term34212);
        setElement(term34205, 5, term34216);
        setElement(term34205, 6, term34220);
        setElement(term34205, 7, term34220);
        setElement(term34205, 8, term34221);
        setElement(term34205, 9, term34222);
        setElement(term34205, 10, term34225);
        setElement(term34205, 11, term34229);
        setElement(term34205, 12, term34232);
        setElement(term34205, 13, term34235);
        setElement(term34205, 14, term34238);
        setElement(term34205, 15, term34232);
        setElement(term34205, 16, term34241);
        setElement(term34205, 17, term34244);
        setElement(term34205, 18, term34245);
        setElement(term34205, 19, term34247);
        setElement(term34205, 20, term34248);
        setElement(term34205, 21, term34249);
        setElement(term34205, 22, term34250);
        setElement(term34205, 23, term34253);
        setElement(term34202, 2, term34205);
        setLongElement(term34256, 0, 34363746224L);
        setLongElement(term34256, 1, 34363775512L);
        setLongElement(term34256, 2, 34363775512L);
        setLongElement(term34256, 3, 34363775512L);
        setLongElement(term34256, 4, 132073600938288L);
        setLongElement(term34256, 5, 34363820048L);
        setLongElement(term34256, 6, 34364798256L);
        setLongElement(term34256, 7, 34363739368L);
        setLongElement(term34256, 8, 34363739368L);
        setLongElement(term34256, 9, 34363739368L);
        setLongElement(term34256, 10, 132077283560208L);
        setLongElement(term34256, 11, 132077283629184L);
        setLongElement(term34256, 12, 132077281112816L);
        setLongElement(term34256, 13, 132077283747392L);
        setLongElement(term34256, 14, 132077281112816L);
        setLongElement(term34256, 15, 132077281112816L);
        setLongElement(term34256, 16, 34363745472L);
        setLongElement(term34256, 17, 34364710216L);
        setLongElement(term34256, 18, 34363745472L);
        setLongElement(term34256, 19, 34363745472L);
        setLongElement(term34256, 20, 34364896224L);
        setLongElement(term34256, 21, 34363745472L);
        setLongElement(term34256, 22, 34363745472L);
        setLongElement(term34256, 23, 34363745472L);
        setElement(term34202, 3, term34256);
        setField(term34201, term34201.getClass(), "backtrace", term34202);
        setField(term34201, term34201.getClass(), "detailMessage", "PAEBtnZtTD");
        setField(term34201, term34201.getClass(), "cause", term34201);
        setField(term34201, term34201.getClass(), "stackTrace", term34259);
        setIntField(term34201, term34201.getClass(), "depth", 24);
        setIntField(term34260, term34260.getClass(), "modCount", 0);
        setField(term34201, term34201.getClass(), "suppressedExceptions", term34260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34201));
    }

};


