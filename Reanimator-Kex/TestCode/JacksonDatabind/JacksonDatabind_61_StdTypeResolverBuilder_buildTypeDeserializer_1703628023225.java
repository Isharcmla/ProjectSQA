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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213042;
     Object term213306;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214416 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term214415 = ((Class) term214416).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term214415).setAccessible(true);
        Object enum277 = ((Field) term214415).get((Object) null);
        term213042 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term213042, term213042.getClass(), "_appliesFor", enum277);
        Class<? extends Object> term213342 = Class.forName((String) "java.lang.invoke.MethodHandleProxies");
        term213306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term213306, term213306.getClass(), "_class", term213342);
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
        args[1] = term213306;
        args[2] = null;
        try {
            callMethod(klass, "buildTypeDeserializer", argTypes, term213042, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


