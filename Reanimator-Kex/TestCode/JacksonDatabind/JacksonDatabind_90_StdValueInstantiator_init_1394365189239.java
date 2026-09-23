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

public class StdValueInstantiator_init_1394365189239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236202;

    public StdValueInstantiator_init_1394365189239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term236098 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term236238 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class<? extends Object> term236416 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Class term236558 = byte.class;
        term236202 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term236380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term236522 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term236702 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term236202, term236202.getClass(), "_class", term236238);
        setField(term236380, term236380.getClass(), "_canonicalName", null);
        setField(term236380, term236380.getClass(), "_class", term236416);
        setField(term236522, term236522.getClass(), "_canonicalName", null);
        setField(term236522, term236522.getClass(), "_class", term236558);
        setField(term236522, term236522.getClass(), "_elementType", term236702);
        setField(term236380, term236380.getClass(), "_referencedType", term236522);
        setField(term236202, term236202.getClass(), "_referencedType", term236380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term236202;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


