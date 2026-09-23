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

public class StdValueInstantiator_init_1394365189265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283516;

    public StdValueInstantiator_init_1394365189265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term283412 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term283552 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        Class<? extends Object> term283718 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term283516 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term283682 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term283848 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term283986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term283516, term283516.getClass(), "_class", term283552);
        setField(term283682, term283682.getClass(), "_canonicalName", null);
        setField(term283682, term283682.getClass(), "_class", term283718);
        setField(term283848, term283848.getClass(), "_canonicalName", "");
        setField(term283682, term283682.getClass(), "_keyType", term283848);
        setField(term283682, term283682.getClass(), "_valueType", term283986);
        setField(term283516, term283516.getClass(), "_referencedType", term283682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term283516;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


