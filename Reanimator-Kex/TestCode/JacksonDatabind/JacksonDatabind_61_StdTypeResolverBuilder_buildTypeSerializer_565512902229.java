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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215679;
     Object term215957;
     Object term220068;
     Object term220072;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220093 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term220092 = ((Class) term220093).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term220092).setAccessible(true);
        Object enum281 = ((Field) term220092).get((Object) null);
        term215679 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term215679, term215679.getClass(), "_appliesFor", enum281);
        Class<? extends Object> term215993 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeParser");
        term215957 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term215957, term215957.getClass(), "_class", term215993);
        Class<? extends Object> term220594 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term220593 = ((Class) term220594).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term220593).setAccessible(true);
        Object enum282 = ((Field) term220593).get((Object) null);
        term220068 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term220068, term220068.getClass(), "_appliesFor", enum282);
        setField(term220068, term220068.getClass(), "_idType", null);
        setField(term220068, term220068.getClass(), "_includeAs", null);
        setField(term220068, term220068.getClass(), "_typeProperty", null);
        setBooleanField(term220068, term220068.getClass(), "_typeIdVisible", false);
        setField(term220068, term220068.getClass(), "_defaultImpl", null);
        setField(term220068, term220068.getClass(), "_customIdResolver", null);
        Class<? extends Object> term220073 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        term220072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term220072, term220072.getClass(), "_referencedType", null);
        setField(term220072, term220072.getClass(), "_superClass", null);
        setField(term220072, term220072.getClass(), "_superInterfaces", null);
        setField(term220072, term220072.getClass(), "_bindings", null);
        setField(term220072, term220072.getClass(), "_canonicalName", null);
        setField(term220072, term220072.getClass(), "_class", term220073);
        setIntField(term220072, term220072.getClass(), "_hash", 0);
        setField(term220072, term220072.getClass(), "_valueHandler", null);
        setField(term220072, term220072.getClass(), "_typeHandler", null);
        setBooleanField(term220072, term220072.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term215957;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term215679, args);
        assertTrue(recursiveEquals(term215679, term220068));
        assertTrue(recursiveEquals(term215957, null));
    }

};


