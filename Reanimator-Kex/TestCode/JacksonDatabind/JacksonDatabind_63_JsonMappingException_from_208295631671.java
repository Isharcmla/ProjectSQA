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

public class JsonMappingException_from_208295631671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154389;
     Object term157354;
     Object term157169;

    public JsonMappingException_from_208295631671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154389 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        term157354 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(term157354, term157354.getClass(), "_seenObjectIds", null);
        setField(term157354, term157354.getClass(), "_objectIdGenerators", null);
        setField(term157354, term157354.getClass(), "_generator", null);
        setField(term157354, term157354.getClass(), "_config", null);
        setField(term157354, term157354.getClass(), "_serializationView", null);
        setField(term157354, term157354.getClass(), "_serializerFactory", null);
        setField(term157354, term157354.getClass(), "_serializerCache", null);
        setField(term157354, term157354.getClass(), "_attributes", null);
        setField(term157354, term157354.getClass(), "_unknownTypeSerializer", null);
        setField(term157354, term157354.getClass(), "_keySerializer", null);
        setField(term157354, term157354.getClass(), "_nullValueSerializer", null);
        setField(term157354, term157354.getClass(), "_nullKeySerializer", null);
        setField(term157354, term157354.getClass(), "_knownSerializers", null);
        setField(term157354, term157354.getClass(), "_dateFormat", null);
        setBooleanField(term157354, term157354.getClass(), "_stdNullValueSerializer", false);
        Class<? extends Object> term157238 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$Sync$HoldCounter");
        Class<? extends Object> term157245 = Class.forName((String) "java.util.stream.ReduceOps$12");
        Class<? extends Object> term157249 = Class.forName((String) "java.util.PrimitiveIterator$OfLong");
        Class<? extends Object> term157252 = Class.forName((String) "java.util.ListResourceBundle");
        Class<? extends Object> term157256 = Class.forName((String) "java.lang.invoke.StringConcatFactory$Recipe");
        Class<? extends Object> term157260 = Class.forName((String) "java.lang.IllegalThreadStateException");
        Class<? extends Object> term157266 = Class.forName((String) "java.util.stream.SpinedBuffer");
        Class<? extends Object> term157271 = Class.forName((String) "java.nio.file.NotLinkException");
        Class<? extends Object> term157275 = Class.forName((String) "com.fasterxml.jackson.databind.util.CompactStringObjectMap");
        Class<? extends Object> term157279 = Class.forName((String) "java.nio.channels.IllegalBlockingModeException");
        Class<? extends Object> term157283 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer");
        Class<? extends Object> term157287 = Class.forName((String) "java.lang.Character$UnicodeScript");
        Class<? extends Object> term157291 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer");
        Class<? extends Object> term157294 = Class.forName((String) "java.lang.UnknownError");
        Class<? extends Object> term157297 = Class.forName((String) "java.util.zip.ZipInputStream");
        Class<? extends Object> term157301 = Class.forName((String) "java.util.stream.Nodes$LongArrayNode");
        Class<? extends Object> term157305 = Class.forName((String) "java.util.stream.ReduceOps$3ReducingSink");
        Class<? extends Object> term157308 = Class.forName((String) "java.util.stream.MatchOps");
        Class<? extends Object> term157312 = Class.forName((String) "java.util.concurrent.LinkedBlockingDeque");
        term157169 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term157170 = (Object[]) newArray("java.lang.Object", 5);
        short[] term157171 = (short[]) newShortArray(32);
        int[] term157204 = (int[]) newIntArray(32);
        Object[] term157237 = (Object[]) newArray("java.lang.Object", 32);
        long[] term157316 = (long[]) newLongArray(32);
        Object[] term157349 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term157351 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term157169, term157169.getClass(), "_path", null);
        setField(term157169, term157169.getClass(), "_processor", null);
        setField(term157169, term157169.getClass(), "_location", null);
        setShortElement(term157171, 0, (short) 11);
        setShortElement(term157171, 1, (short) 3);
        setShortElement(term157171, 5, (short) 27);
        setShortElement(term157171, 6, (short) 2);
        setShortElement(term157171, 7, (short) 3);
        setShortElement(term157171, 11, (short) 2);
        setShortElement(term157171, 12, (short) 4);
        setShortElement(term157171, 13, (short) 4);
        setShortElement(term157171, 14, (short) 3);
        setShortElement(term157171, 15, (short) 4);
        setShortElement(term157171, 16, (short) 4);
        setShortElement(term157171, 17, (short) 1);
        setShortElement(term157171, 18, (short) 2);
        setShortElement(term157171, 19, (short) 3);
        setShortElement(term157171, 20, (short) 3);
        setShortElement(term157171, 21, (short) 13);
        setShortElement(term157171, 22, (short) 1);
        setShortElement(term157171, 23, (short) 2);
        setShortElement(term157171, 24, (short) 12);
        setElement(term157170, 0, term157171);
        setIntElement(term157204, 0, 22937600);
        setIntElement(term157204, 2, 6553600);
        setIntElement(term157204, 3, 393216);
        setIntElement(term157204, 4, 3866630);
        setIntElement(term157204, 5, 1245184);
        setIntElement(term157204, 6, 3997696);
        setIntElement(term157204, 8, 6553600);
        setIntElement(term157204, 9, 393216);
        setIntElement(term157204, 10, 3866630);
        setIntElement(term157204, 11, 14352384);
        setIntElement(term157204, 12, 10354688);
        setIntElement(term157204, 13, 2883584);
        setIntElement(term157204, 14, 786432);
        setIntElement(term157204, 15, 1441792);
        setIntElement(term157204, 16, 7733248);
        setIntElement(term157204, 17, 20774912);
        setIntElement(term157204, 18, 262144);
        setIntElement(term157204, 19, 2555904);
        setIntElement(term157204, 20, 1835008);
        setIntElement(term157204, 21, 6029312);
        setIntElement(term157204, 22, 327680);
        setIntElement(term157204, 23, 1638400);
        setIntElement(term157204, 24, 720907);
        setElement(term157170, 1, term157204);
        setElement(term157237, 0, term157238);
        setElement(term157237, 1, term157245);
        setElement(term157237, 2, term157245);
        setElement(term157237, 3, term157249);
        setElement(term157237, 4, term157252);
        setElement(term157237, 5, term157256);
        setElement(term157237, 6, term157260);
        setElement(term157237, 7, term157245);
        setElement(term157237, 8, term157245);
        setElement(term157237, 9, term157249);
        setElement(term157237, 10, term157252);
        setElement(term157237, 11, term157266);
        setElement(term157237, 12, term157271);
        setElement(term157237, 13, term157275);
        setElement(term157237, 14, term157279);
        setElement(term157237, 15, term157283);
        setElement(term157237, 16, term157275);
        setElement(term157237, 17, term157287);
        setElement(term157237, 18, term157291);
        setElement(term157237, 19, term157294);
        setElement(term157237, 20, term157297);
        setElement(term157237, 21, term157301);
        setElement(term157237, 22, term157305);
        setElement(term157237, 23, term157308);
        setElement(term157237, 24, term157312);
        setElement(term157170, 2, term157237);
        setLongElement(term157316, 0, 34363800864L);
        setLongElement(term157316, 1, 34364798256L);
        setLongElement(term157316, 2, 34363739368L);
        setLongElement(term157316, 3, 34363739368L);
        setLongElement(term157316, 4, 34363739368L);
        setLongElement(term157316, 5, 132578328998496L);
        setLongElement(term157316, 6, 34363820048L);
        setLongElement(term157316, 7, 34364798256L);
        setLongElement(term157316, 8, 34363739368L);
        setLongElement(term157316, 9, 34363739368L);
        setLongElement(term157316, 10, 34363739368L);
        setLongElement(term157316, 11, 132582552571296L);
        setLongElement(term157316, 12, 132582552640272L);
        setLongElement(term157316, 13, 132582550089488L);
        setLongElement(term157316, 14, 132582552759024L);
        setLongElement(term157316, 15, 132582550089488L);
        setLongElement(term157316, 16, 132582550089488L);
        setLongElement(term157316, 17, 34363745472L);
        setLongElement(term157316, 18, 34364710216L);
        setLongElement(term157316, 19, 34363745472L);
        setLongElement(term157316, 20, 34363745472L);
        setLongElement(term157316, 21, 34364896224L);
        setLongElement(term157316, 22, 34363745472L);
        setLongElement(term157316, 23, 34363745472L);
        setLongElement(term157316, 24, 34363745472L);
        setElement(term157170, 3, term157316);
        setField(term157169, term157169.getClass(), "backtrace", term157170);
        setField(term157169, term157169.getClass(), "detailMessage", null);
        setField(term157169, term157169.getClass(), "cause", term157169);
        setField(term157169, term157169.getClass(), "stackTrace", term157349);
        setIntField(term157169, term157169.getClass(), "depth", 25);
        setIntField(term157351, term157351.getClass(), "modCount", 0);
        setField(term157169, term157169.getClass(), "suppressedExceptions", term157351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[3];
        args[0] = term154389;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term154389, term157354));
        assertTrue(recursiveEquals(retValue, term157169));
    }

};


