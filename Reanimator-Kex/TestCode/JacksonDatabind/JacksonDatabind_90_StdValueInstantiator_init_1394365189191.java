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

public class StdValueInstantiator_init_1394365189191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153125;

    public StdValueInstantiator_init_1394365189191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term153021 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term154359 = Class.forName((String) "java.nio.file.attribute.AclFileAttributeView");
        Class term154350 = Array.newInstance(term154359, 0).getClass();
        Class term154335 = Array.newInstance(term154350, 0).getClass();
        Class term153161 = Array.newInstance(term154335, 0).getClass();
        Class<? extends Object> term153327 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term153125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term153291 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term153457 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term153599 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term153125, term153125.getClass(), "_class", term153161);
        setField(term153291, term153291.getClass(), "_canonicalName", null);
        setField(term153291, term153291.getClass(), "_class", term153327);
        setField(term153457, term153457.getClass(), "_canonicalName", "int");
        setField(term153291, term153291.getClass(), "_keyType", term153457);
        setField(term153291, term153291.getClass(), "_valueType", term153599);
        setField(term153125, term153125.getClass(), "_referencedType", term153291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term153125;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


