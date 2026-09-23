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

public class JsonPointer_parseTail_49912460893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013727;

    public JsonPointer_parseTail_49912460893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1013727 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1013728 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1013729 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1013730 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1013731 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1013731, term1013731.getClass(), "_nextSegment", null);
        setField(term1013731, term1013731.getClass(), "_asString", null);
        setField(term1013731, term1013731.getClass(), "_matchingPropertyName", null);
        setIntField(term1013731, term1013731.getClass(), "_matchingElementIndex", -1);
        setField(term1013730, term1013730.getClass(), "_nextSegment", term1013731);
        setField(term1013730, term1013730.getClass(), "_asString", "");
        setField(term1013730, term1013730.getClass(), "_matchingPropertyName", "");
        setIntField(term1013730, term1013730.getClass(), "_matchingElementIndex", -1);
        setField(term1013729, term1013729.getClass(), "_nextSegment", term1013730);
        setField(term1013729, term1013729.getClass(), "_asString", "/////");
        setField(term1013729, term1013729.getClass(), "_matchingPropertyName", "");
        setIntField(term1013729, term1013729.getClass(), "_matchingElementIndex", -1);
        setField(term1013728, term1013728.getClass(), "_nextSegment", term1013729);
        setField(term1013728, term1013728.getClass(), "_asString", "//////");
        setField(term1013728, term1013728.getClass(), "_matchingPropertyName", "");
        setIntField(term1013728, term1013728.getClass(), "_matchingElementIndex", -1);
        setField(term1013727, term1013727.getClass(), "_nextSegment", term1013728);
        setField(term1013727, term1013727.getClass(), "_asString", "/ //////");
        setField(term1013727, term1013727.getClass(), "_matchingPropertyName", " ");
        setIntField(term1013727, term1013727.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/ //////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1013727));
    }

};


