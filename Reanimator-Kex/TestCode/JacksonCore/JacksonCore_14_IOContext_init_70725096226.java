package com.fasterxml.jackson.core.io;

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
import static com.fasterxml.jackson.core.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.io.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.Object;

public class IOContext_init_70725096226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term105;
     Object term107;

    public IOContext_init_70725096226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term2 = new Boolean(false);
        term105 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term106 = newInstance(Class.forName("java.lang.Object"));
        setField(term105, term105.getClass(), "_sourceRef", term106);
        setField(term105, term105.getClass(), "_encoding", null);
        setBooleanField(term105, term105.getClass(), "_managedResource", false);
        setField(term105, term105.getClass(), "_bufferRecycler", null);
        setField(term105, term105.getClass(), "_readIOBuffer", null);
        setField(term105, term105.getClass(), "_writeEncodingBuffer", null);
        setField(term105, term105.getClass(), "_base64Buffer", null);
        setField(term105, term105.getClass(), "_tokenCBuffer", null);
        setField(term105, term105.getClass(), "_concatCBuffer", null);
        setField(term105, term105.getClass(), "_nameCopyBuffer", null);
        term107 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = term2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term105));
        assertTrue(recursiveEquals(term1, term107));
        assertTrue(recursiveEquals(term2, false));
    }

};


