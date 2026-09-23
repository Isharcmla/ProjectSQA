package com.fasterxml.jackson.databind.deser.std;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308213;

    public StdValueInstantiator_init_1394365189277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term308109 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term308249 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term308427 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term308593 = Class.forName((String) "java.lang.Class");
        term308213 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term308391 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term308557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term308691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term308213, term308213.getClass(), "_class", term308249);
        setField(term308391, term308391.getClass(), "_canonicalName", null);
        setField(term308391, term308391.getClass(), "_class", term308427);
        setField(term308557, term308557.getClass(), "_canonicalName", null);
        setField(term308557, term308557.getClass(), "_class", term308593);
        setField(term308557, term308557.getClass(), "_keyType", term308691);
        setField(term308391, term308391.getClass(), "_referencedType", term308557);
        setField(term308213, term308213.getClass(), "_referencedType", term308391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term308213;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


