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

public class StdValueInstantiator_init_1394365189251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259579;

    public StdValueInstantiator_init_1394365189251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term259475 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term259615 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class term259793 = int.class;
        Class term259973 = char.class;
        term259579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term259757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term259937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term260125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term259579, term259579.getClass(), "_class", term259615);
        setField(term259757, term259757.getClass(), "_canonicalName", null);
        setField(term259757, term259757.getClass(), "_class", term259793);
        setField(term259937, term259937.getClass(), "_canonicalName", null);
        setField(term259937, term259937.getClass(), "_class", term259973);
        setField(term259937, term259937.getClass(), "_elementType", term260125);
        setField(term259757, term259757.getClass(), "_referencedType", term259937);
        setField(term259579, term259579.getClass(), "_referencedType", term259757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term259579;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


