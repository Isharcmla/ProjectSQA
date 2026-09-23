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

public class StdValueInstantiator_init_1394365189299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347215;

    public StdValueInstantiator_init_1394365189299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term347111 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term348463 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator");
        Class term348454 = Array.newInstance(term348463, 0).getClass();
        Class term348439 = Array.newInstance(term348454, 0).getClass();
        Class term347251 = Array.newInstance(term348439, 0).getClass();
        Class<? extends Object> term347429 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term347609 = Class.forName((String) "java.lang.String");
        term347215 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term347393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term347573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term347743 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term347215, term347215.getClass(), "_class", term347251);
        setField(term347393, term347393.getClass(), "_canonicalName", null);
        setField(term347393, term347393.getClass(), "_class", term347429);
        setField(term347573, term347573.getClass(), "_canonicalName", null);
        setField(term347573, term347573.getClass(), "_class", term347609);
        setField(term347573, term347573.getClass(), "_elementType", term347743);
        setField(term347393, term347393.getClass(), "_referencedType", term347573);
        setField(term347215, term347215.getClass(), "_referencedType", term347393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term347215;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


