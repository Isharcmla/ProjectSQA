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

public class StdValueInstantiator_init_1394365189283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319071;

    public StdValueInstantiator_init_1394365189283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term318967 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term319107 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term319273 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term319439 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term319605 = Class.forName((String) "java.nio.channels.InterruptedByTimeoutException");
        term319071 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term319237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term319403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term319569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term319071, term319071.getClass(), "_class", term319107);
        setField(term319237, term319237.getClass(), "_canonicalName", null);
        setField(term319237, term319237.getClass(), "_class", term319273);
        setField(term319403, term319403.getClass(), "_canonicalName", null);
        setField(term319403, term319403.getClass(), "_class", term319439);
        setField(term319569, term319569.getClass(), "_canonicalName", null);
        setField(term319569, term319569.getClass(), "_class", term319605);
        setField(term319403, term319403.getClass(), "_keyType", term319569);
        setField(term319237, term319237.getClass(), "_keyType", term319403);
        setField(term319071, term319071.getClass(), "_referencedType", term319237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term319071;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


