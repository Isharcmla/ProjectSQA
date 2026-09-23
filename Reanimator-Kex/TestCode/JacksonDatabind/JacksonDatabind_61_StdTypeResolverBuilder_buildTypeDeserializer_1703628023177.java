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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157332;
     Object term157586;
     Object term157993;
     Object term157997;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157999 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term157998 = ((Class) term157999).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term157998).setAccessible(true);
        Object enum224 = ((Field) term157998).get((Object) null);
        term157332 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term157332, term157332.getClass(), "_appliesFor", enum224);
        term157586 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term158360 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term158359 = ((Class) term158360).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term158359).setAccessible(true);
        Object enum225 = ((Field) term158359).get((Object) null);
        term157993 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term157993, term157993.getClass(), "_appliesFor", enum225);
        setField(term157993, term157993.getClass(), "_idType", null);
        setField(term157993, term157993.getClass(), "_includeAs", null);
        setField(term157993, term157993.getClass(), "_typeProperty", null);
        setBooleanField(term157993, term157993.getClass(), "_typeIdVisible", false);
        setField(term157993, term157993.getClass(), "_defaultImpl", null);
        setField(term157993, term157993.getClass(), "_customIdResolver", null);
        term157997 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term157997, term157997.getClass(), "_componentType", null);
        setField(term157997, term157997.getClass(), "_emptyArray", null);
        setField(term157997, term157997.getClass(), "_superClass", null);
        setField(term157997, term157997.getClass(), "_superInterfaces", null);
        setField(term157997, term157997.getClass(), "_bindings", null);
        setField(term157997, term157997.getClass(), "_canonicalName", null);
        setField(term157997, term157997.getClass(), "_class", null);
        setIntField(term157997, term157997.getClass(), "_hash", 0);
        setField(term157997, term157997.getClass(), "_valueHandler", null);
        setField(term157997, term157997.getClass(), "_typeHandler", null);
        setBooleanField(term157997, term157997.getClass(), "_asStatic", false);
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
        args[1] = term157586;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term157332, args);
        assertTrue(recursiveEquals(term157332, term157993));
        assertTrue(recursiveEquals(term157586, null));
    }

};


