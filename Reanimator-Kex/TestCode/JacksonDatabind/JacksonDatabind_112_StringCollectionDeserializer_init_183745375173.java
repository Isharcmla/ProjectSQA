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

public class StringCollectionDeserializer_init_183745375173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31209;

    public StringCollectionDeserializer_init_183745375173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31105 = Class.forName((String) "java.util.stream.ReduceOps$3");
        Object term31069 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        setField(term31069, term31069.getClass(), "_valueClass", term31105);
        setField(term31069, term31069.getClass(), "_containerType", null);
        setField(term31069, term31069.getClass(), "_unwrapSingle", null);
        setField(term31069, term31069.getClass(), "_nullProvider", null);
        Class<? extends Object> term31245 = Class.forName((String) "java.util.stream.SortedOps$SizedRefSortingSink");
        term31209 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term31209, term31209.getClass(), "_class", term31245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Object[] args = new Object[3];
        args[0] = term31209;
        args[1] = null;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


