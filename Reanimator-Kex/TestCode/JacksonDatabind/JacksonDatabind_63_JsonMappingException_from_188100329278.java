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

public class JsonMappingException_from_188100329278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162832;
     Object term169860;
     Object term169675;

    public JsonMappingException_from_188100329278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162832 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        term169860 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(term169860, term169860.getClass(), "_seenObjectIds", null);
        setField(term169860, term169860.getClass(), "_objectIdGenerators", null);
        setField(term169860, term169860.getClass(), "_generator", null);
        setField(term169860, term169860.getClass(), "_config", null);
        setField(term169860, term169860.getClass(), "_serializationView", null);
        setField(term169860, term169860.getClass(), "_serializerFactory", null);
        setField(term169860, term169860.getClass(), "_serializerCache", null);
        setField(term169860, term169860.getClass(), "_attributes", null);
        setField(term169860, term169860.getClass(), "_unknownTypeSerializer", null);
        setField(term169860, term169860.getClass(), "_keySerializer", null);
        setField(term169860, term169860.getClass(), "_nullValueSerializer", null);
        setField(term169860, term169860.getClass(), "_nullKeySerializer", null);
        setField(term169860, term169860.getClass(), "_knownSerializers", null);
        setField(term169860, term169860.getClass(), "_dateFormat", null);
        setBooleanField(term169860, term169860.getClass(), "_stdNullValueSerializer", false);
        Class<? extends Object> term169744 = Class.forName((String) "java.lang.invoke.ClassSpecializer$1");
        Class<? extends Object> term169751 = Class.forName((String) "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class<? extends Object> term169755 = Class.forName((String) "java.util.stream.ReduceOps$5ReducingSink");
        Class<? extends Object> term169758 = Class.forName((String) "java.io.DeleteOnExitHook$1");
        Class<? extends Object> term169762 = Class.forName((String) "com.fasterxml.jackson.databind.cfg.BaseSettings");
        Class<? extends Object> term169766 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer");
        Class<? extends Object> term169772 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser");
        Class<? extends Object> term169777 = Class.forName((String) "java.util.stream.IntPipeline$7$1");
        Class<? extends Object> term169781 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default");
        Class<? extends Object> term169785 = Class.forName((String) "java.util.stream.Collectors$1OptionalBox");
        Class<? extends Object> term169789 = Class.forName((String) "java.util.function.ToDoubleFunction");
        Class<? extends Object> term169793 = Class.forName((String) "com.fasterxml.jackson.databind.ser.PropertyBuilder$1");
        Class<? extends Object> term169797 = Class.forName((String) "java.nio.file.Files$1");
        Class<? extends Object> term169800 = Class.forName((String) "java.nio.channels.SeekableByteChannel");
        Class<? extends Object> term169803 = Class.forName((String) "java.lang.AbstractMethodError");
        Class<? extends Object> term169807 = Class.forName((String) "java.util.Set");
        Class<? extends Object> term169811 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$Traverser");
        Class<? extends Object> term169814 = Class.forName((String) "java.lang.Runtime$VersionPattern");
        Class<? extends Object> term169818 = Class.forName((String) "java.util.NavigableSet");
        term169675 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term169676 = (Object[]) newArray("java.lang.Object", 5);
        short[] term169677 = (short[]) newShortArray(32);
        int[] term169710 = (int[]) newIntArray(32);
        Object[] term169743 = (Object[]) newArray("java.lang.Object", 32);
        long[] term169822 = (long[]) newLongArray(32);
        Object[] term169855 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term169857 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term169675, term169675.getClass(), "_path", null);
        setField(term169675, term169675.getClass(), "_processor", null);
        setField(term169675, term169675.getClass(), "_location", null);
        setShortElement(term169677, 0, (short) 10);
        setShortElement(term169677, 1, (short) 3);
        setShortElement(term169677, 5, (short) 27);
        setShortElement(term169677, 6, (short) 2);
        setShortElement(term169677, 7, (short) 3);
        setShortElement(term169677, 11, (short) 2);
        setShortElement(term169677, 12, (short) 4);
        setShortElement(term169677, 13, (short) 4);
        setShortElement(term169677, 14, (short) 3);
        setShortElement(term169677, 15, (short) 4);
        setShortElement(term169677, 16, (short) 4);
        setShortElement(term169677, 17, (short) 1);
        setShortElement(term169677, 18, (short) 2);
        setShortElement(term169677, 19, (short) 3);
        setShortElement(term169677, 20, (short) 3);
        setShortElement(term169677, 21, (short) 13);
        setShortElement(term169677, 22, (short) 1);
        setShortElement(term169677, 23, (short) 2);
        setShortElement(term169677, 24, (short) 12);
        setElement(term169676, 0, term169677);
        setIntElement(term169710, 0, 19529728);
        setIntElement(term169710, 2, 6553600);
        setIntElement(term169710, 3, 393216);
        setIntElement(term169710, 4, 3866630);
        setIntElement(term169710, 5, 1245184);
        setIntElement(term169710, 6, 3211264);
        setIntElement(term169710, 8, 6553600);
        setIntElement(term169710, 9, 393216);
        setIntElement(term169710, 10, 3866630);
        setIntElement(term169710, 11, 14352384);
        setIntElement(term169710, 12, 10354688);
        setIntElement(term169710, 13, 2883584);
        setIntElement(term169710, 14, 786432);
        setIntElement(term169710, 15, 1441792);
        setIntElement(term169710, 16, 7733248);
        setIntElement(term169710, 17, 20774912);
        setIntElement(term169710, 18, 262144);
        setIntElement(term169710, 19, 2555904);
        setIntElement(term169710, 20, 1835008);
        setIntElement(term169710, 21, 6029312);
        setIntElement(term169710, 22, 327680);
        setIntElement(term169710, 23, 1638400);
        setIntElement(term169710, 24, 720907);
        setElement(term169676, 1, term169710);
        setElement(term169743, 0, term169744);
        setElement(term169743, 1, term169751);
        setElement(term169743, 2, term169751);
        setElement(term169743, 3, term169755);
        setElement(term169743, 4, term169758);
        setElement(term169743, 5, term169762);
        setElement(term169743, 6, term169766);
        setElement(term169743, 7, term169751);
        setElement(term169743, 8, term169751);
        setElement(term169743, 9, term169755);
        setElement(term169743, 10, term169758);
        setElement(term169743, 11, term169772);
        setElement(term169743, 12, term169777);
        setElement(term169743, 13, term169781);
        setElement(term169743, 14, term169785);
        setElement(term169743, 15, term169789);
        setElement(term169743, 16, term169781);
        setElement(term169743, 17, term169793);
        setElement(term169743, 18, term169797);
        setElement(term169743, 19, term169800);
        setElement(term169743, 20, term169803);
        setElement(term169743, 21, term169807);
        setElement(term169743, 22, term169811);
        setElement(term169743, 23, term169814);
        setElement(term169743, 24, term169818);
        setElement(term169676, 2, term169743);
        setLongElement(term169822, 0, 34363800864L);
        setLongElement(term169822, 1, 34364798256L);
        setLongElement(term169822, 2, 34363739368L);
        setLongElement(term169822, 3, 34363739368L);
        setLongElement(term169822, 4, 34363739368L);
        setLongElement(term169822, 5, 132578328998496L);
        setLongElement(term169822, 6, 34363820048L);
        setLongElement(term169822, 7, 34364798256L);
        setLongElement(term169822, 8, 34363739368L);
        setLongElement(term169822, 9, 34363739368L);
        setLongElement(term169822, 10, 34363739368L);
        setLongElement(term169822, 11, 132582552571296L);
        setLongElement(term169822, 12, 132582552640272L);
        setLongElement(term169822, 13, 132582550089488L);
        setLongElement(term169822, 14, 132582552759024L);
        setLongElement(term169822, 15, 132582550089488L);
        setLongElement(term169822, 16, 132582550089488L);
        setLongElement(term169822, 17, 34363745472L);
        setLongElement(term169822, 18, 34364710216L);
        setLongElement(term169822, 19, 34363745472L);
        setLongElement(term169822, 20, 34363745472L);
        setLongElement(term169822, 21, 34364896224L);
        setLongElement(term169822, 22, 34363745472L);
        setLongElement(term169822, 23, 34363745472L);
        setLongElement(term169822, 24, 34363745472L);
        setElement(term169676, 3, term169822);
        setField(term169675, term169675.getClass(), "backtrace", term169676);
        setField(term169675, term169675.getClass(), "detailMessage", null);
        setField(term169675, term169675.getClass(), "cause", term169675);
        setField(term169675, term169675.getClass(), "stackTrace", term169855);
        setIntField(term169675, term169675.getClass(), "depth", 25);
        setIntField(term169857, term169857.getClass(), "modCount", 0);
        setField(term169675, term169675.getClass(), "suppressedExceptions", term169857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term162832;
        args[1] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term162832, term169860));
        assertTrue(recursiveEquals(retValue, term169675));
    }

};


