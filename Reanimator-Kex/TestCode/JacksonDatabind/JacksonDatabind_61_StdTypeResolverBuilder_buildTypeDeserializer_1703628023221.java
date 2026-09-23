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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205811;
     Object term206075;
     Object term207156;
     Object term207160;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207181 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term207180 = ((Class) term207181).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term207180).setAccessible(true);
        Object enum271 = ((Field) term207180).get((Object) null);
        term205811 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term205811, term205811.getClass(), "_appliesFor", enum271);
        Class<? extends Object> term206111 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        term206075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term206075, term206075.getClass(), "_class", term206111);
        Class<? extends Object> term207778 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term207777 = ((Class) term207778).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term207777).setAccessible(true);
        Object enum272 = ((Field) term207777).get((Object) null);
        term207156 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term207156, term207156.getClass(), "_appliesFor", enum272);
        setField(term207156, term207156.getClass(), "_idType", null);
        setField(term207156, term207156.getClass(), "_includeAs", null);
        setField(term207156, term207156.getClass(), "_typeProperty", null);
        setBooleanField(term207156, term207156.getClass(), "_typeIdVisible", false);
        setField(term207156, term207156.getClass(), "_defaultImpl", null);
        setField(term207156, term207156.getClass(), "_customIdResolver", null);
        Class<? extends Object> term207161 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$4");
        term207160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term207160, term207160.getClass(), "_elementType", null);
        setField(term207160, term207160.getClass(), "_superClass", null);
        setField(term207160, term207160.getClass(), "_superInterfaces", null);
        setField(term207160, term207160.getClass(), "_bindings", null);
        setField(term207160, term207160.getClass(), "_canonicalName", null);
        setField(term207160, term207160.getClass(), "_class", term207161);
        setIntField(term207160, term207160.getClass(), "_hash", 0);
        setField(term207160, term207160.getClass(), "_valueHandler", null);
        setField(term207160, term207160.getClass(), "_typeHandler", null);
        setBooleanField(term207160, term207160.getClass(), "_asStatic", false);
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
        args[1] = term206075;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term205811, args);
        assertTrue(recursiveEquals(term205811, term207156));
        assertTrue(recursiveEquals(term206075, null));
    }

};


