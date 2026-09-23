package com.fasterxml.jackson.core;

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
import static com.fasterxml.jackson.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.EqualityUtils.*;
import java.lang.Object;

public class JsonPointer_init_188601029795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1014024;

    public JsonPointer_init_188601029795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17542 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term17662 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term17542, term17542.getClass(), "_asString", "");
        setField(term17542, term17542.getClass(), "_nextSegment", term17662);
        setField(term17542, term17542.getClass(), "_matchingPropertyName", "");
        term1014024 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1014024, term1014024.getClass(), "_nextSegment", null);
        setField(term1014024, term1014024.getClass(), "_asString", "");
        setField(term1014024, term1014024.getClass(), "_matchingPropertyName", "        ");
        setIntField(term1014024, term1014024.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = "        ";
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1014024));
    }

};


