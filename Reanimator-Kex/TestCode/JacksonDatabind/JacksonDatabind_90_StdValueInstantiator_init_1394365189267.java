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

public class StdValueInstantiator_init_1394365189267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286794;

    public StdValueInstantiator_init_1394365189267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term286690 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term286830 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term286996 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term287124 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionLikeType");
        term286794 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term286960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term287088 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term287268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term286794, term286794.getClass(), "_class", term286830);
        setField(term286960, term286960.getClass(), "_canonicalName", null);
        setField(term286960, term286960.getClass(), "_class", term286996);
        setField(term287088, term287088.getClass(), "_canonicalName", null);
        setField(term287088, term287088.getClass(), "_class", term287124);
        setField(term287088, term287088.getClass(), "_keyType", term287268);
        setField(term286960, term286960.getClass(), "_keyType", term287088);
        setField(term286794, term286794.getClass(), "_referencedType", term286960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term286794;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


