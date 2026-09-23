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

public class StdValueInstantiator_init_1394365189281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315126;

    public StdValueInstantiator_init_1394365189281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term315022 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term315162 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        Class<? extends Object> term315328 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        Class term315456 = int.class;
        Class<? extends Object> term315628 = Class.forName((String) "java.io.FileInputStream");
        term315126 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term315292 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term315420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term315592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term315126, term315126.getClass(), "_class", term315162);
        setField(term315292, term315292.getClass(), "_canonicalName", null);
        setField(term315292, term315292.getClass(), "_class", term315328);
        setField(term315420, term315420.getClass(), "_canonicalName", null);
        setField(term315420, term315420.getClass(), "_class", term315456);
        setField(term315592, term315592.getClass(), "_canonicalName", null);
        setField(term315592, term315592.getClass(), "_class", term315628);
        setField(term315420, term315420.getClass(), "_keyType", term315592);
        setField(term315292, term315292.getClass(), "_keyType", term315420);
        setField(term315126, term315126.getClass(), "_referencedType", term315292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term315126;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


