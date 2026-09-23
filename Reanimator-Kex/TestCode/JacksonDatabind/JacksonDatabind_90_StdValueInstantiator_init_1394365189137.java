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

public class StdValueInstantiator_init_1394365189137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70786;

    public StdValueInstantiator_init_1394365189137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70682 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term71611 = Class.forName((String) "java.lang.FdLibm");
        Class term71602 = Array.newInstance(term71611, 0).getClass();
        Class term71587 = Array.newInstance(term71602, 0).getClass();
        Class term70822 = Array.newInstance(term71587, 0).getClass();
        Class<? extends Object> term71000 = Class.forName((String) "java.util.stream.IntPipeline$10");
        term70786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term70964 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term70786, term70786.getClass(), "_class", term70822);
        setField(term70964, term70964.getClass(), "_canonicalName", null);
        setField(term70964, term70964.getClass(), "_class", term71000);
        setField(term70786, term70786.getClass(), "_referencedType", term70964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term70786;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


