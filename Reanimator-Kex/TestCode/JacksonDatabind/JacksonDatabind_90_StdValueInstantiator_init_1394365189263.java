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

public class StdValueInstantiator_init_1394365189263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281296;

    public StdValueInstantiator_init_1394365189263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term281192 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term281332 = char.class;
        Class<? extends Object> term281510 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term281690 = Class.forName((String) "java.lang.String");
        term281296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term281474 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term281654 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term281820 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term281296, term281296.getClass(), "_class", term281332);
        setField(term281474, term281474.getClass(), "_canonicalName", null);
        setField(term281474, term281474.getClass(), "_class", term281510);
        setField(term281654, term281654.getClass(), "_canonicalName", null);
        setField(term281654, term281654.getClass(), "_class", term281690);
        setField(term281654, term281654.getClass(), "_elementType", term281820);
        setField(term281474, term281474.getClass(), "_referencedType", term281654);
        setField(term281296, term281296.getClass(), "_referencedType", term281474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term281296;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


