package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217311;
     Object term217561;
     Object term221309;
     Object term221313;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221334 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term221333 = ((Class) term221334).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term221333).setAccessible(true);
        Object enum283 = ((Field) term221333).get((Object) null);
        term217311 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term217311, term217311.getClass(), "_appliesFor", enum283);
        Class<? extends Object> term217597 = Class.forName((String) "com.fasterxml.jackson.core.JsonParseException");
        term217561 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term217561, term217561.getClass(), "_class", term217597);
        Class<? extends Object> term221811 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term221810 = ((Class) term221811).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term221810).setAccessible(true);
        Object enum284 = ((Field) term221810).get((Object) null);
        term221309 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term221309, term221309.getClass(), "_appliesFor", enum284);
        setField(term221309, term221309.getClass(), "_idType", null);
        setField(term221309, term221309.getClass(), "_includeAs", null);
        setField(term221309, term221309.getClass(), "_typeProperty", null);
        setBooleanField(term221309, term221309.getClass(), "_typeIdVisible", false);
        setField(term221309, term221309.getClass(), "_defaultImpl", null);
        setField(term221309, term221309.getClass(), "_customIdResolver", null);
        Class<? extends Object> term221314 = Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.ValueProducer");
        term221313 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term221313, term221313.getClass(), "_keyType", null);
        setField(term221313, term221313.getClass(), "_valueType", null);
        setField(term221313, term221313.getClass(), "_superClass", null);
        setField(term221313, term221313.getClass(), "_superInterfaces", null);
        setField(term221313, term221313.getClass(), "_bindings", null);
        setField(term221313, term221313.getClass(), "_canonicalName", null);
        setField(term221313, term221313.getClass(), "_class", term221314);
        setIntField(term221313, term221313.getClass(), "_hash", 0);
        setField(term221313, term221313.getClass(), "_valueHandler", null);
        setField(term221313, term221313.getClass(), "_typeHandler", null);
        setBooleanField(term221313, term221313.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term217561;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term217311, args);
        assertTrue(recursiveEquals(term217311, term221309));
        assertTrue(recursiveEquals(term217561, null));
    }

};


