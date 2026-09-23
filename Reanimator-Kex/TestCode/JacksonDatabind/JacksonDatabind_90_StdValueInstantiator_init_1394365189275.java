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

public class StdValueInstantiator_init_1394365189275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304592;

    public StdValueInstantiator_init_1394365189275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term304488 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term304628 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term304806 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term304986 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term304592 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term304770 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term304950 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term305128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term304592, term304592.getClass(), "_class", term304628);
        setField(term304770, term304770.getClass(), "_canonicalName", null);
        setField(term304770, term304770.getClass(), "_class", term304806);
        setField(term304950, term304950.getClass(), "_canonicalName", null);
        setField(term304950, term304950.getClass(), "_class", term304986);
        setField(term304950, term304950.getClass(), "_elementType", term305128);
        setField(term304770, term304770.getClass(), "_referencedType", term304950);
        setField(term304592, term304592.getClass(), "_referencedType", term304770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term304592;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


