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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279498;
     Object term279752;
     Object term280500;
     Object term280504;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term280525 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term280524 = ((Class) term280525).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term280524).setAccessible(true);
        Object enum337 = ((Field) term280524).get((Object) null);
        term279498 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term279498, term279498.getClass(), "_appliesFor", enum337);
        Class<? extends Object> term279788 = Class.forName((String) "java.util.Observer");
        term279752 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term279752, term279752.getClass(), "_class", term279788);
        Class<? extends Object> term280921 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term280920 = ((Class) term280921).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term280920).setAccessible(true);
        Object enum338 = ((Field) term280920).get((Object) null);
        term280500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term280500, term280500.getClass(), "_appliesFor", enum338);
        setField(term280500, term280500.getClass(), "_idType", null);
        setField(term280500, term280500.getClass(), "_includeAs", null);
        setField(term280500, term280500.getClass(), "_typeProperty", null);
        setBooleanField(term280500, term280500.getClass(), "_typeIdVisible", false);
        setField(term280500, term280500.getClass(), "_defaultImpl", null);
        setField(term280500, term280500.getClass(), "_customIdResolver", null);
        Class<? extends Object> term280505 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$10");
        term280504 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term280504, term280504.getClass(), "_componentType", null);
        setField(term280504, term280504.getClass(), "_emptyArray", null);
        setField(term280504, term280504.getClass(), "_superClass", null);
        setField(term280504, term280504.getClass(), "_superInterfaces", null);
        setField(term280504, term280504.getClass(), "_bindings", null);
        setField(term280504, term280504.getClass(), "_canonicalName", null);
        setField(term280504, term280504.getClass(), "_class", term280505);
        setIntField(term280504, term280504.getClass(), "_hash", 0);
        setField(term280504, term280504.getClass(), "_valueHandler", null);
        setField(term280504, term280504.getClass(), "_typeHandler", null);
        setBooleanField(term280504, term280504.getClass(), "_asStatic", false);
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
        args[1] = term279752;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term279498, args);
        assertTrue(recursiveEquals(term279498, term280500));
        assertTrue(recursiveEquals(term279752, null));
    }

};


