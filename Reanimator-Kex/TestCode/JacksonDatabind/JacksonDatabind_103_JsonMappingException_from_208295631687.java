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

public class JsonMappingException_from_208295631687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182095;
     Object term193239;
     Object term193057;

    public JsonMappingException_from_208295631687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182095 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        term193239 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(term193239, term193239.getClass(), "_seenObjectIds", null);
        setField(term193239, term193239.getClass(), "_objectIdGenerators", null);
        setField(term193239, term193239.getClass(), "_generator", null);
        setField(term193239, term193239.getClass(), "_config", null);
        setField(term193239, term193239.getClass(), "_serializationView", null);
        setField(term193239, term193239.getClass(), "_serializerFactory", null);
        setField(term193239, term193239.getClass(), "_serializerCache", null);
        setField(term193239, term193239.getClass(), "_attributes", null);
        setField(term193239, term193239.getClass(), "_unknownTypeSerializer", null);
        setField(term193239, term193239.getClass(), "_keySerializer", null);
        setField(term193239, term193239.getClass(), "_nullValueSerializer", null);
        setField(term193239, term193239.getClass(), "_nullKeySerializer", null);
        setField(term193239, term193239.getClass(), "_knownSerializers", null);
        setField(term193239, term193239.getClass(), "_dateFormat", null);
        setBooleanField(term193239, term193239.getClass(), "_stdNullValueSerializer", false);
        Class<? extends Object> term193126 = Class.forName((String) "com.fasterxml.jackson.databind.util.TypeKey");
        Class<? extends Object> term193133 = Class.forName((String) "java.util.regex.Pattern$Caret");
        Class<? extends Object> term193136 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferRB");
        Class<? extends Object> term193138 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSetter$Value");
        Class<? extends Object> term193142 = Class.forName((String) "java.util.HashMap$ValueSpliterator");
        Class<? extends Object> term193146 = Class.forName((String) "java.util.stream.ReferencePipeline$11$1");
        Class<? extends Object> term193152 = Class.forName((String) "java.nio.DirectCharBufferS");
        Class<? extends Object> term193157 = Class.forName((String) "kex.java.util.HashMap$HashIterator");
        Class<? extends Object> term193161 = Class.forName((String) "java.lang.reflect.Field");
        Class<? extends Object> term193165 = Class.forName((String) "java.lang.StackWalker");
        Class<? extends Object> term193169 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer");
        Class<? extends Object> term193173 = Class.forName((String) "java.nio.file.WatchEvent");
        Class<? extends Object> term193177 = Class.forName((String) "java.nio.ByteBufferAsCharBufferL");
        Class<? extends Object> term193180 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$Node");
        Class<? extends Object> term193183 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedExecutor");
        Class<? extends Object> term193187 = Class.forName((String) "java.io.File$TempDirectory");
        Class<? extends Object> term193190 = Class.forName((String) "com.fasterxml.jackson.core.io.UTF32Reader");
        Class<? extends Object> term193193 = Class.forName((String) "java.util.stream.SortedOps$LongSortingSink");
        Class<? extends Object> term193197 = Class.forName((String) "java.lang.invoke.BoundMethodHandle$Specializer$Factory");
        term193057 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term193058 = (Object[]) newArray("java.lang.Object", 5);
        short[] term193059 = (short[]) newShortArray(32);
        int[] term193092 = (int[]) newIntArray(32);
        Object[] term193125 = (Object[]) newArray("java.lang.Object", 32);
        long[] term193201 = (long[]) newLongArray(32);
        Object[] term193234 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term193236 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term193057, term193057.getClass(), "_path", null);
        setField(term193057, term193057.getClass(), "_processor", null);
        setField(term193057, term193057.getClass(), "_location", null);
        setShortElement(term193059, 0, (short) 11);
        setShortElement(term193059, 1, (short) 3);
        setShortElement(term193059, 5, (short) 33);
        setShortElement(term193059, 6, (short) 2);
        setShortElement(term193059, 7, (short) 3);
        setShortElement(term193059, 11, (short) 2);
        setShortElement(term193059, 12, (short) 4);
        setShortElement(term193059, 13, (short) 4);
        setShortElement(term193059, 14, (short) 3);
        setShortElement(term193059, 15, (short) 4);
        setShortElement(term193059, 16, (short) 4);
        setShortElement(term193059, 17, (short) 1);
        setShortElement(term193059, 18, (short) 2);
        setShortElement(term193059, 19, (short) 3);
        setShortElement(term193059, 20, (short) 3);
        setShortElement(term193059, 21, (short) 13);
        setShortElement(term193059, 22, (short) 1);
        setShortElement(term193059, 23, (short) 2);
        setShortElement(term193059, 24, (short) 12);
        setElement(term193058, 0, term193059);
        setIntElement(term193092, 0, 22937600);
        setIntElement(term193092, 2, 6553600);
        setIntElement(term193092, 3, 393216);
        setIntElement(term193092, 4, 3866630);
        setIntElement(term193092, 5, 1245184);
        setIntElement(term193092, 6, 3997696);
        setIntElement(term193092, 8, 6553600);
        setIntElement(term193092, 9, 393216);
        setIntElement(term193092, 10, 3866630);
        setIntElement(term193092, 11, 14352384);
        setIntElement(term193092, 12, 10354688);
        setIntElement(term193092, 13, 2883584);
        setIntElement(term193092, 14, 786432);
        setIntElement(term193092, 15, 1441792);
        setIntElement(term193092, 16, 7733248);
        setIntElement(term193092, 17, 20774912);
        setIntElement(term193092, 18, 262144);
        setIntElement(term193092, 19, 2555904);
        setIntElement(term193092, 20, 1835008);
        setIntElement(term193092, 21, 6029312);
        setIntElement(term193092, 22, 327680);
        setIntElement(term193092, 23, 1638400);
        setIntElement(term193092, 24, 720907);
        setElement(term193058, 1, term193092);
        setElement(term193125, 0, term193126);
        setElement(term193125, 1, term193133);
        setElement(term193125, 2, term193133);
        setElement(term193125, 3, term193136);
        setElement(term193125, 4, term193138);
        setElement(term193125, 5, term193142);
        setElement(term193125, 6, term193146);
        setElement(term193125, 7, term193133);
        setElement(term193125, 8, term193133);
        setElement(term193125, 9, term193136);
        setElement(term193125, 10, term193138);
        setElement(term193125, 11, term193152);
        setElement(term193125, 12, term193157);
        setElement(term193125, 13, term193161);
        setElement(term193125, 14, term193165);
        setElement(term193125, 15, term193169);
        setElement(term193125, 16, term193161);
        setElement(term193125, 17, term193173);
        setElement(term193125, 18, term193177);
        setElement(term193125, 19, term193180);
        setElement(term193125, 20, term193183);
        setElement(term193125, 21, term193187);
        setElement(term193125, 22, term193190);
        setElement(term193125, 23, term193193);
        setElement(term193125, 24, term193197);
        setElement(term193058, 2, term193125);
        setLongElement(term193201, 0, 34363800864L);
        setLongElement(term193201, 1, 34364798256L);
        setLongElement(term193201, 2, 34363739368L);
        setLongElement(term193201, 3, 34363739368L);
        setLongElement(term193201, 4, 34363739368L);
        setLongElement(term193201, 5, 132073603951184L);
        setLongElement(term193201, 6, 34363820048L);
        setLongElement(term193201, 7, 34364798256L);
        setLongElement(term193201, 8, 34363739368L);
        setLongElement(term193201, 9, 34363739368L);
        setLongElement(term193201, 10, 34363739368L);
        setLongElement(term193201, 11, 132077283560208L);
        setLongElement(term193201, 12, 132077283629184L);
        setLongElement(term193201, 13, 132077281112816L);
        setLongElement(term193201, 14, 132077283747392L);
        setLongElement(term193201, 15, 132077281112816L);
        setLongElement(term193201, 16, 132077281112816L);
        setLongElement(term193201, 17, 34363745472L);
        setLongElement(term193201, 18, 34364710216L);
        setLongElement(term193201, 19, 34363745472L);
        setLongElement(term193201, 20, 34363745472L);
        setLongElement(term193201, 21, 34364896224L);
        setLongElement(term193201, 22, 34363745472L);
        setLongElement(term193201, 23, 34363745472L);
        setLongElement(term193201, 24, 34363745472L);
        setElement(term193058, 3, term193201);
        setField(term193057, term193057.getClass(), "backtrace", term193058);
        setField(term193057, term193057.getClass(), "detailMessage", null);
        setField(term193057, term193057.getClass(), "cause", term193057);
        setField(term193057, term193057.getClass(), "stackTrace", term193234);
        setIntField(term193057, term193057.getClass(), "depth", 25);
        setIntField(term193236, term193236.getClass(), "modCount", 0);
        setField(term193057, term193057.getClass(), "suppressedExceptions", term193236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term182095;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term182095, term193239));
        assertTrue(recursiveEquals(retValue, term193057));
    }

};


