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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180003;

    public StdValueInstantiator_init_1394365189207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term180039 = Class.forName((String) "com.fasterxml.jackson.databind.type.PlaceholderForType");
        Class<? extends Object> term181502 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$TreeBin");
        Class term181493 = Array.newInstance(term181502, 0).getClass();
        Class term181478 = Array.newInstance(term181493, 0).getClass();
        Class term180217 = Array.newInstance(term181478, 0).getClass();
        term180003 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term180181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term180369 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term180003, term180003.getClass(), "_class", term180039);
        setField(term180181, term180181.getClass(), "_canonicalName", null);
        setField(term180181, term180181.getClass(), "_class", term180217);
        setField(term180181, term180181.getClass(), "_referencedType", term180369);
        setField(term180003, term180003.getClass(), "_referencedType", term180181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term180003;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


