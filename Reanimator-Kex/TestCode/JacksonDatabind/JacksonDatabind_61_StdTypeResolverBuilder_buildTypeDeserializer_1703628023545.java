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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term651422;
     Object term651824;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term653223 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term653222 = ((Class) term653223).getDeclaredField((String) "NON_FINAL");
        ((Field) term653222).setAccessible(true);
        Object enum695 = ((Field) term653222).get((Object) null);
        Class<? extends Object> term653542 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term653541 = ((Class) term653542).getDeclaredField((String) "NONE");
        ((Field) term653541).setAccessible(true);
        Object enum696 = ((Field) term653541).get((Object) null);
        term651422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term651422, term651422.getClass(), "_appliesFor", enum695);
        setField(term651422, term651422.getClass(), "_idType", enum696);
        Class<? extends Object> term651980 = Class.forName((String) "java.util.regex.Pattern$Loop");
        term651824 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term651944 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term651944, term651944.getClass(), "_class", term651980);
        setField(term651824, term651824.getClass(), "_referencedType", term651944);
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
        args[1] = term651824;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term651422, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


