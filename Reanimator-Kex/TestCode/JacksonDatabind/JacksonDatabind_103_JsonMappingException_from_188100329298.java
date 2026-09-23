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

public class JsonMappingException_from_188100329298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208104;
     Object term210567;
     Object term210117;

    public JsonMappingException_from_188100329298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208104 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        term210567 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(term210567, term210567.getClass(), "_seenObjectIds", null);
        setField(term210567, term210567.getClass(), "_objectIdGenerators", null);
        setField(term210567, term210567.getClass(), "_generator", null);
        setField(term210567, term210567.getClass(), "_config", null);
        setField(term210567, term210567.getClass(), "_serializationView", null);
        setField(term210567, term210567.getClass(), "_serializerFactory", null);
        setField(term210567, term210567.getClass(), "_serializerCache", null);
        setField(term210567, term210567.getClass(), "_attributes", null);
        setField(term210567, term210567.getClass(), "_unknownTypeSerializer", null);
        setField(term210567, term210567.getClass(), "_keySerializer", null);
        setField(term210567, term210567.getClass(), "_nullValueSerializer", null);
        setField(term210567, term210567.getClass(), "_nullKeySerializer", null);
        setField(term210567, term210567.getClass(), "_knownSerializers", null);
        setField(term210567, term210567.getClass(), "_dateFormat", null);
        setBooleanField(term210567, term210567.getClass(), "_stdNullValueSerializer", false);
        Class<? extends Object> term210186 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
        Class<? extends Object> term210193 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanSerializerFactory");
        Class<? extends Object> term210196 = Class.forName((String) "java.lang.StackStreamFactory$LiveStackInfoTraverser$LiveStackFrameBuffer");
        Class<? extends Object> term210198 = Class.forName((String) "java.util.Formatter$FormatSpecifier");
        Class<? extends Object> term210202 = Class.forName((String) "com.fasterxml.jackson.databind.module.SimpleModule");
        Class<? extends Object> term210206 = Class.forName((String) "java.util.regex.Pattern$Ques");
        Class<? extends Object> term210212 = Class.forName((String) "java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy");
        Class<? extends Object> term210217 = Class.forName((String) "java.util.Hashtable$ValueCollection");
        Class<? extends Object> term210221 = Class.forName((String) "java.lang.CharacterData01");
        Class<? extends Object> term210225 = Class.forName((String) "java.util.DualPivotQuicksort");
        Class<? extends Object> term210229 = Class.forName((String) "java.lang.Package$1PackageInfoProxy");
        Class<? extends Object> term210233 = Class.forName((String) "com.fasterxml.jackson.databind.util.ISO8601Utils");
        Class<? extends Object> term210237 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<? extends Object> term210240 = Class.forName((String) "java.lang.Thread$State");
        Class<? extends Object> term210243 = Class.forName((String) "java.util.PrimitiveIterator$OfLong");
        Class<? extends Object> term210247 = Class.forName((String) "java.util.LinkedList$LLSpliterator");
        Class<? extends Object> term210250 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer");
        Class<? extends Object> term210253 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer");
        Class<? extends Object> term210257 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator$OfPrimitive");
        term210117 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object[] term210118 = (Object[]) newArray("java.lang.Object", 5);
        short[] term210119 = (short[]) newShortArray(32);
        int[] term210152 = (int[]) newIntArray(32);
        Object[] term210185 = (Object[]) newArray("java.lang.Object", 32);
        long[] term210261 = (long[]) newLongArray(32);
        Object[] term210294 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term210296 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term210117, term210117.getClass(), "_path", null);
        setField(term210117, term210117.getClass(), "_processor", null);
        setField(term210117, term210117.getClass(), "_location", null);
        setShortElement(term210119, 0, (short) 10);
        setShortElement(term210119, 1, (short) 3);
        setShortElement(term210119, 5, (short) 33);
        setShortElement(term210119, 6, (short) 2);
        setShortElement(term210119, 7, (short) 3);
        setShortElement(term210119, 11, (short) 2);
        setShortElement(term210119, 12, (short) 4);
        setShortElement(term210119, 13, (short) 4);
        setShortElement(term210119, 14, (short) 3);
        setShortElement(term210119, 15, (short) 4);
        setShortElement(term210119, 16, (short) 4);
        setShortElement(term210119, 17, (short) 1);
        setShortElement(term210119, 18, (short) 2);
        setShortElement(term210119, 19, (short) 3);
        setShortElement(term210119, 20, (short) 3);
        setShortElement(term210119, 21, (short) 13);
        setShortElement(term210119, 22, (short) 1);
        setShortElement(term210119, 23, (short) 2);
        setShortElement(term210119, 24, (short) 12);
        setElement(term210118, 0, term210119);
        setIntElement(term210152, 0, 19529728);
        setIntElement(term210152, 2, 6553600);
        setIntElement(term210152, 3, 393216);
        setIntElement(term210152, 4, 3866630);
        setIntElement(term210152, 5, 1245184);
        setIntElement(term210152, 6, 3211264);
        setIntElement(term210152, 8, 6553600);
        setIntElement(term210152, 9, 393216);
        setIntElement(term210152, 10, 3866630);
        setIntElement(term210152, 11, 14352384);
        setIntElement(term210152, 12, 10354688);
        setIntElement(term210152, 13, 2883584);
        setIntElement(term210152, 14, 786432);
        setIntElement(term210152, 15, 1441792);
        setIntElement(term210152, 16, 7733248);
        setIntElement(term210152, 17, 20774912);
        setIntElement(term210152, 18, 262144);
        setIntElement(term210152, 19, 2555904);
        setIntElement(term210152, 20, 1835008);
        setIntElement(term210152, 21, 6029312);
        setIntElement(term210152, 22, 327680);
        setIntElement(term210152, 23, 1638400);
        setIntElement(term210152, 24, 720907);
        setElement(term210118, 1, term210152);
        setElement(term210185, 0, term210186);
        setElement(term210185, 1, term210193);
        setElement(term210185, 2, term210193);
        setElement(term210185, 3, term210196);
        setElement(term210185, 4, term210198);
        setElement(term210185, 5, term210202);
        setElement(term210185, 6, term210206);
        setElement(term210185, 7, term210193);
        setElement(term210185, 8, term210193);
        setElement(term210185, 9, term210196);
        setElement(term210185, 10, term210198);
        setElement(term210185, 11, term210212);
        setElement(term210185, 12, term210217);
        setElement(term210185, 13, term210221);
        setElement(term210185, 14, term210225);
        setElement(term210185, 15, term210229);
        setElement(term210185, 16, term210221);
        setElement(term210185, 17, term210233);
        setElement(term210185, 18, term210237);
        setElement(term210185, 19, term210240);
        setElement(term210185, 20, term210243);
        setElement(term210185, 21, term210247);
        setElement(term210185, 22, term210250);
        setElement(term210185, 23, term210253);
        setElement(term210185, 24, term210257);
        setElement(term210118, 2, term210185);
        setLongElement(term210261, 0, 34363800864L);
        setLongElement(term210261, 1, 34364798256L);
        setLongElement(term210261, 2, 34363739368L);
        setLongElement(term210261, 3, 34363739368L);
        setLongElement(term210261, 4, 34363739368L);
        setLongElement(term210261, 5, 132073603951184L);
        setLongElement(term210261, 6, 34363820048L);
        setLongElement(term210261, 7, 34364798256L);
        setLongElement(term210261, 8, 34363739368L);
        setLongElement(term210261, 9, 34363739368L);
        setLongElement(term210261, 10, 34363739368L);
        setLongElement(term210261, 11, 132077283560208L);
        setLongElement(term210261, 12, 132077283629184L);
        setLongElement(term210261, 13, 132077281112816L);
        setLongElement(term210261, 14, 132077283747392L);
        setLongElement(term210261, 15, 132077281112816L);
        setLongElement(term210261, 16, 132077281112816L);
        setLongElement(term210261, 17, 34363745472L);
        setLongElement(term210261, 18, 34364710216L);
        setLongElement(term210261, 19, 34363745472L);
        setLongElement(term210261, 20, 34363745472L);
        setLongElement(term210261, 21, 34364896224L);
        setLongElement(term210261, 22, 34363745472L);
        setLongElement(term210261, 23, 34363745472L);
        setLongElement(term210261, 24, 34363745472L);
        setElement(term210118, 3, term210261);
        setField(term210117, term210117.getClass(), "backtrace", term210118);
        setField(term210117, term210117.getClass(), "detailMessage", null);
        setField(term210117, term210117.getClass(), "cause", term210117);
        setField(term210117, term210117.getClass(), "stackTrace", term210294);
        setIntField(term210117, term210117.getClass(), "depth", 25);
        setIntField(term210296, term210296.getClass(), "modCount", 0);
        setField(term210117, term210117.getClass(), "suppressedExceptions", term210296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term208104;
        args[1] = null;
        Object retValue = callMethod(klass, "from", argTypes, null, args);
        assertTrue(recursiveEquals(term208104, term210567));
        assertTrue(recursiveEquals(retValue, term210117));
    }

};


