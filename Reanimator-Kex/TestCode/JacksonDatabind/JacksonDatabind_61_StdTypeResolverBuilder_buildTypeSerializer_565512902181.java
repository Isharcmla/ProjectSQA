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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162013;
     Object term162277;
     Object term162946;
     Object term162950;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162971 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term162970 = ((Class) term162971).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term162970).setAccessible(true);
        Object enum229 = ((Field) term162970).get((Object) null);
        term162013 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term162013, term162013.getClass(), "_appliesFor", enum229);
        Class<? extends Object> term162313 = Class.forName((String) "java.util.Locale$Category");
        term162277 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term162277, term162277.getClass(), "_class", term162313);
        Class<? extends Object> term163398 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term163397 = ((Class) term163398).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term163397).setAccessible(true);
        Object enum230 = ((Field) term163397).get((Object) null);
        term162946 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term162946, term162946.getClass(), "_appliesFor", enum230);
        setField(term162946, term162946.getClass(), "_idType", null);
        setField(term162946, term162946.getClass(), "_includeAs", null);
        setField(term162946, term162946.getClass(), "_typeProperty", null);
        setBooleanField(term162946, term162946.getClass(), "_typeIdVisible", false);
        setField(term162946, term162946.getClass(), "_defaultImpl", null);
        setField(term162946, term162946.getClass(), "_customIdResolver", null);
        Class<? extends Object> term162951 = Class.forName((String) "com.fasterxml.jackson.databind.JsonDeserializer");
        term162950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term162950, term162950.getClass(), "_elementType", null);
        setField(term162950, term162950.getClass(), "_superClass", null);
        setField(term162950, term162950.getClass(), "_superInterfaces", null);
        setField(term162950, term162950.getClass(), "_bindings", null);
        setField(term162950, term162950.getClass(), "_canonicalName", null);
        setField(term162950, term162950.getClass(), "_class", term162951);
        setIntField(term162950, term162950.getClass(), "_hash", 0);
        setField(term162950, term162950.getClass(), "_valueHandler", null);
        setField(term162950, term162950.getClass(), "_typeHandler", null);
        setBooleanField(term162950, term162950.getClass(), "_asStatic", false);
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
        args[1] = term162277;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term162013, args);
        assertTrue(recursiveEquals(term162013, term162946));
        assertTrue(recursiveEquals(term162277, null));
    }

};


