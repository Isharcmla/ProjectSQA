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

public class StdValueInstantiator_init_1394365189173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123960;

    public StdValueInstantiator_init_1394365189173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123856 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term123996 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class term124174 = char.class;
        term123960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124138 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term124318 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term123960, term123960.getClass(), "_class", term123996);
        setField(term124138, term124138.getClass(), "_canonicalName", null);
        setField(term124138, term124138.getClass(), "_class", term124174);
        setField(term124138, term124138.getClass(), "_referencedType", term124318);
        setField(term123960, term123960.getClass(), "_referencedType", term124138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term123960;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


