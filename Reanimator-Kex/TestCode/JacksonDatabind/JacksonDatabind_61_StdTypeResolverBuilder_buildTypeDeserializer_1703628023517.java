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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610160;
     Object term610422;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term611624 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term611623 = ((Class) term611624).getDeclaredField((String) "NON_FINAL");
        ((Field) term611623).setAccessible(true);
        Object enum663 = ((Field) term611623).get((Object) null);
        term610160 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term610160, term610160.getClass(), "_appliesFor", enum663);
        Class<? extends Object> term610550 = Class.forName((String) "java.lang.ClassLoader$NativeLibrary");
        term610422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term610514 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term610514, term610514.getClass(), "_class", term610550);
        setField(term610422, term610422.getClass(), "_referencedType", term610514);
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
        args[1] = term610422;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term610160, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


