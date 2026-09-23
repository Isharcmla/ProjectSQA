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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525289;
     Object term525551;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term526744 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term526743 = ((Class) term526744).getDeclaredField((String) "NON_FINAL");
        ((Field) term526743).setAccessible(true);
        Object enum583 = ((Field) term526743).get((Object) null);
        term525289 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term525289, term525289.getClass(), "_appliesFor", enum583);
        Class<? extends Object> term525691 = Class.forName((String) "java.io.Reader");
        term525551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term525655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term525655, term525655.getClass(), "_class", term525691);
        setField(term525551, term525551.getClass(), "_referencedType", term525655);
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
        args[1] = term525551;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeSerializer", argTypes, term525289, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


