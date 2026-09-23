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

public class StdValueInstantiator_init_1394365189183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138293;

    public StdValueInstantiator_init_1394365189183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138189 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term139666 = Class.forName((String) "com.fasterxml.jackson.core.FormatFeature");
        Class term139657 = Array.newInstance(term139666, 0).getClass();
        Class term139642 = Array.newInstance(term139657, 0).getClass();
        Class term138329 = Array.newInstance(term139642, 0).getClass();
        Class<? extends Object> term139827 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DeserializerFactory");
        Class term139818 = Array.newInstance(term139827, 0).getClass();
        Class term139803 = Array.newInstance(term139818, 0).getClass();
        Class term138495 = Array.newInstance(term139803, 0).getClass();
        Class<? extends Object> term138623 = Class.forName((String) "java.lang.StringCoding$1");
        term138293 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term138459 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term138587 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term138293, term138293.getClass(), "_class", term138329);
        setField(term138459, term138459.getClass(), "_canonicalName", null);
        setField(term138459, term138459.getClass(), "_class", term138495);
        setField(term138587, term138587.getClass(), "_canonicalName", null);
        setField(term138587, term138587.getClass(), "_class", term138623);
        setField(term138459, term138459.getClass(), "_keyType", term138587);
        setField(term138293, term138293.getClass(), "_referencedType", term138459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term138293;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


