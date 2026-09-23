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

public class JsonPointer_init_188601029786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28277;
     Object term1077558;
     Object term1077568;

    public JsonPointer_init_188601029786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28002 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        term28277 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term28002, term28002.getClass(), "_asString", "");
        setField(term28002, term28002.getClass(), "_nextSegment", term28277);
        setField(term28002, term28002.getClass(), "_matchingPropertyName", "");
        term1077558 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1077559 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1077559, term1077559.getClass(), "_nextSegment", null);
        setField(term1077559, term1077559.getClass(), "_asString", null);
        setField(term1077559, term1077559.getClass(), "_matchingPropertyName", null);
        setIntField(term1077559, term1077559.getClass(), "_matchingElementIndex", 0);
        setField(term1077558, term1077558.getClass(), "_nextSegment", term1077559);
        setField(term1077558, term1077558.getClass(), "_asString", "");
        setField(term1077558, term1077558.getClass(), "_matchingPropertyName", "        ");
        setIntField(term1077558, term1077558.getClass(), "_matchingElementIndex", -1);
        term1077568 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1077568, term1077568.getClass(), "_nextSegment", null);
        setField(term1077568, term1077568.getClass(), "_asString", null);
        setField(term1077568, term1077568.getClass(), "_matchingPropertyName", null);
        setIntField(term1077568, term1077568.getClass(), "_matchingElementIndex", 0);
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
        args[2] = term28277;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1077558));
        assertTrue(recursiveEquals(term28277, term1077568));
    }

};


