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

public class StdValueInstantiator_init_1394365189171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121162;

    public StdValueInstantiator_init_1394365189171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121058 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term121198 = char.class;
        Class<? extends Object> term121364 = Class.forName((String) "java.lang.Class");
        term121162 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term121328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term121494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term121162, term121162.getClass(), "_class", term121198);
        setField(term121328, term121328.getClass(), "_canonicalName", null);
        setField(term121328, term121328.getClass(), "_class", term121364);
        setField(term121328, term121328.getClass(), "_keyType", term121494);
        setField(term121162, term121162.getClass(), "_referencedType", term121328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term121162;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


