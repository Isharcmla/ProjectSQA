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

public class JsonMappingException_init_71748431667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167090;

    public JsonMappingException_init_71748431667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term161109 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term161153 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term160977 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        setField(term161109, term161109.getClass(), "cause", term161153);
        setField(term161109, term161109.getClass(), "stackTrace", term160977);
        setField(term161109, term161109.getClass(), "suppressedExceptions", null);
        setField(term161109, term161109.getClass(), "detailMessage", "");
        Class<? extends Object> term167095 = Class.forName((String) "java.lang.Error");
        Class<? extends Object> term167097 = Class.forName((String) "java.util.concurrent.LinkedBlockingQueue$Node");
        Class<? extends Object> term167098 = Class.forName((String) "java.lang.ClassLoader");
        Class<? extends Object> term167101 = Class.forName((String) "java.util.ResourceBundle$NoFallbackControl");
        Class<? extends Object> term167105 = Class.forName((String) "java.io.ObjectInputStream$FieldValues");
        Class<? extends Object> term167109 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer");
        Class<? extends Object> term167110 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer");
        Class<? extends Object> term167111 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class<? extends Object> term167114 = Class.forName((String) "java.util.stream.DistinctOps$1$2");
        Class<? extends Object> term167118 = Class.forName((String) "java.lang.module.ResolvedModule");
        Class<? extends Object> term167121 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$SearchMappingsTask");
        Class<? extends Object> term167124 = Class.forName((String) "java.util.stream.FindOps$FindSink$OfDouble");
        Class<? extends Object> term167127 = Class.forName((String) "java.nio.channels.InterruptedByTimeoutException");
        Class<? extends Object> term167130 = Class.forName((String) "java.nio.channels.NonWritableChannelException");
        Class<? extends Object> term167133 = Class.forName((String) "java.lang.invoke.VarHandle$TypesAndInvokers");
        Class<? extends Object> term167135 = Class.forName((String) "java.util.regex.Pattern$Begin");
        Class<? extends Object> term167137 = Class.forName((String) "java.lang.Package$1PackageInfoProxy");
        Class<? extends Object> term167140 = Class.forName((String) "java.nio.file.attribute.FileAttributeView");
        Class<? extends Object> term167142 = Class.forName((String) "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl");
        Class<? extends Object> term167144 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer");
        Class<? extends Object> term167147 = Class.forName((String) "java.lang.invoke.BootstrapMethodInvoker$PullAdapter");
        term167090 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term167091 = (Object[]) newArray("java.lang.Object", 5);
        short[] term167092 = (short[]) newShortArray(32);
        int[] term167093 = (int[]) newIntArray(32);
        Object[] term167094 = (Object[]) newArray("java.lang.Object", 32);
        long[] term167150 = (long[]) newLongArray(32);
        Object[] term167151 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term167152 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term167090, term167090.getClass(), "_path", null);
        setField(term167090, term167090.getClass(), "_processor", null);
        setField(term167090, term167090.getClass(), "_location", null);
        setShortElement(term167092, 0, (short) 1);
        setShortElement(term167092, 1, (short) 2);
        setShortElement(term167092, 2, (short) 1);
        setShortElement(term167092, 3, (short) 7);
        setShortElement(term167092, 4, (short) 6);
        setShortElement(term167092, 5, (short) 2);
        setShortElement(term167092, 6, (short) 3);
        setShortElement(term167092, 10, (short) 2);
        setShortElement(term167092, 11, (short) 4);
        setShortElement(term167092, 12, (short) 4);
        setShortElement(term167092, 13, (short) 3);
        setShortElement(term167092, 14, (short) 4);
        setShortElement(term167092, 15, (short) 4);
        setShortElement(term167092, 16, (short) 1);
        setShortElement(term167092, 17, (short) 2);
        setShortElement(term167092, 18, (short) 3);
        setShortElement(term167092, 19, (short) 3);
        setShortElement(term167092, 20, (short) 13);
        setShortElement(term167092, 21, (short) 1);
        setShortElement(term167092, 22, (short) 2);
        setShortElement(term167092, 23, (short) 12);
        setElement(term167091, 0, term167092);
        setIntElement(term167093, 1, 5570560);
        setIntElement(term167093, 2, 327680);
        setIntElement(term167093, 3, 4456454);
        setIntElement(term167093, 4, 851968);
        setIntElement(term167093, 5, 3604480);
        setIntElement(term167093, 7, 6553600);
        setIntElement(term167093, 8, 393216);
        setIntElement(term167093, 9, 3866630);
        setIntElement(term167093, 10, 14352384);
        setIntElement(term167093, 11, 10354688);
        setIntElement(term167093, 12, 2883584);
        setIntElement(term167093, 13, 786432);
        setIntElement(term167093, 14, 1441792);
        setIntElement(term167093, 15, 7733248);
        setIntElement(term167093, 16, 20774912);
        setIntElement(term167093, 17, 262144);
        setIntElement(term167093, 18, 2555904);
        setIntElement(term167093, 19, 1835008);
        setIntElement(term167093, 20, 6029312);
        setIntElement(term167093, 21, 327680);
        setIntElement(term167093, 22, 1638400);
        setIntElement(term167093, 23, 720907);
        setElement(term167091, 1, term167093);
        setElement(term167094, 0, term167095);
        setElement(term167094, 1, term167095);
        setElement(term167094, 2, term167097);
        setElement(term167094, 3, term167098);
        setElement(term167094, 4, term167101);
        setElement(term167094, 5, term167105);
        setElement(term167094, 6, term167109);
        setElement(term167094, 7, term167109);
        setElement(term167094, 8, term167110);
        setElement(term167094, 9, term167111);
        setElement(term167094, 10, term167114);
        setElement(term167094, 11, term167118);
        setElement(term167094, 12, term167121);
        setElement(term167094, 13, term167124);
        setElement(term167094, 14, term167127);
        setElement(term167094, 15, term167121);
        setElement(term167094, 16, term167130);
        setElement(term167094, 17, term167133);
        setElement(term167094, 18, term167135);
        setElement(term167094, 19, term167137);
        setElement(term167094, 20, term167140);
        setElement(term167094, 21, term167142);
        setElement(term167094, 22, term167144);
        setElement(term167094, 23, term167147);
        setElement(term167091, 2, term167094);
        setLongElement(term167150, 0, 34363746224L);
        setLongElement(term167150, 1, 34363775512L);
        setLongElement(term167150, 2, 34363775512L);
        setLongElement(term167150, 3, 34363775512L);
        setLongElement(term167150, 4, 132073600938288L);
        setLongElement(term167150, 5, 34363820048L);
        setLongElement(term167150, 6, 34364798256L);
        setLongElement(term167150, 7, 34363739368L);
        setLongElement(term167150, 8, 34363739368L);
        setLongElement(term167150, 9, 34363739368L);
        setLongElement(term167150, 10, 132077283560208L);
        setLongElement(term167150, 11, 132077283629184L);
        setLongElement(term167150, 12, 132077281112816L);
        setLongElement(term167150, 13, 132077283747392L);
        setLongElement(term167150, 14, 132077281112816L);
        setLongElement(term167150, 15, 132077281112816L);
        setLongElement(term167150, 16, 34363745472L);
        setLongElement(term167150, 17, 34364710216L);
        setLongElement(term167150, 18, 34363745472L);
        setLongElement(term167150, 19, 34363745472L);
        setLongElement(term167150, 20, 34364896224L);
        setLongElement(term167150, 21, 34363745472L);
        setLongElement(term167150, 22, 34363745472L);
        setLongElement(term167150, 23, 34363745472L);
        setElement(term167091, 3, term167150);
        setField(term167090, term167090.getClass(), "backtrace", term167091);
        setField(term167090, term167090.getClass(), "detailMessage", null);
        setField(term167090, term167090.getClass(), "cause", term167090);
        setField(term167090, term167090.getClass(), "stackTrace", term167151);
        setIntField(term167090, term167090.getClass(), "depth", 24);
        setIntField(term167152, term167152.getClass(), "modCount", 0);
        setField(term167090, term167090.getClass(), "suppressedExceptions", term167152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term167090));
    }

};


