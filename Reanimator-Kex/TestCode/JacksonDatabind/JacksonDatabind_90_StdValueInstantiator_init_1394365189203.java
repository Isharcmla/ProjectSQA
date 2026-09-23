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

public class StdValueInstantiator_init_1394365189203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172827;

    public StdValueInstantiator_init_1394365189203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term172723 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term174109 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedValueIterator");
        Class term174100 = Array.newInstance(term174109, 0).getClass();
        Class term174085 = Array.newInstance(term174100, 0).getClass();
        Class term172863 = Array.newInstance(term174085, 0).getClass();
        Class<? extends Object> term173029 = Class.forName((String) "java.lang.Class");
        term172827 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term172993 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term173159 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term173301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term172827, term172827.getClass(), "_class", term172863);
        setField(term172993, term172993.getClass(), "_canonicalName", null);
        setField(term172993, term172993.getClass(), "_class", term173029);
        setField(term173159, term173159.getClass(), "_canonicalName", "");
        setField(term172993, term172993.getClass(), "_keyType", term173159);
        setField(term173301, term173301.getClass(), "_canonicalName", "byte[]");
        setField(term172993, term172993.getClass(), "_valueType", term173301);
        setField(term172827, term172827.getClass(), "_referencedType", term172993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term172827;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


