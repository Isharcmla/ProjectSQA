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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555369;
     Object term555905;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term557307 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term557306 = ((Class) term557307).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term557306).setAccessible(true);
        Object enum612 = ((Field) term557306).get((Object) null);
        Class<? extends Object> term557647 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term557646 = ((Class) term557647).getDeclaredField((String) "CLASS");
        ((Field) term557646).setAccessible(true);
        Object enum613 = ((Field) term557646).get((Object) null);
        term555369 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term555801 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term555369, term555369.getClass(), "_appliesFor", enum612);
        setField(term555369, term555369.getClass(), "_idType", enum613);
        setField(term555369, term555369.getClass(), "_customIdResolver", term555801);
        Class<? extends Object> term556033 = Class.forName((String) "java.lang.ProcessBuilder$Redirect$4");
        term555905 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term555997 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term555997, term555997.getClass(), "_class", term556033);
        setField(term555905, term555905.getClass(), "_referencedType", term555997);
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
        args[1] = term555905;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term555369, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


