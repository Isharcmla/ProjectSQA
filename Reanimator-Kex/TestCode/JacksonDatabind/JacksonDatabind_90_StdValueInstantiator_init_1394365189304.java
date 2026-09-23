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

public class StdValueInstantiator_init_1394365189304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354764;

    public StdValueInstantiator_init_1394365189304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term354660 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term354800 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term358816 = Class.forName((String) "java.util.concurrent.atomic.DoubleAdder");
        Class term358807 = Array.newInstance(term358816, 0).getClass();
        Class term358792 = Array.newInstance(term358807, 0).getClass();
        Class term354978 = Array.newInstance(term358792, 0).getClass();
        Class<? extends Object> term355158 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term354764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term354942 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term355122 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term355262 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term354764, term354764.getClass(), "_class", term354800);
        setField(term354942, term354942.getClass(), "_canonicalName", null);
        setField(term354942, term354942.getClass(), "_class", term354978);
        setField(term355122, term355122.getClass(), "_canonicalName", null);
        setField(term355122, term355122.getClass(), "_class", term355158);
        setField(term355122, term355122.getClass(), "_elementType", term355262);
        setField(term354942, term354942.getClass(), "_referencedType", term355122);
        setField(term354764, term354764.getClass(), "_referencedType", term354942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term354764;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


