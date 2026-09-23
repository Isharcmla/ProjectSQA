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

public class JsonPointer_parseTail_49912460846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8728;

    public JsonPointer_parseTail_49912460846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8728 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term8729 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term8729, term8729.getClass(), "_nextSegment", null);
        setField(term8729, term8729.getClass(), "_asString", "");
        setField(term8729, term8729.getClass(), "_matchingPropertyName", "");
        setIntField(term8729, term8729.getClass(), "_matchingElementIndex", -1);
        setField(term8728, term8728.getClass(), "_nextSegment", term8729);
        setField(term8728, term8728.getClass(), "_asString", "          ");
        setField(term8728, term8728.getClass(), "_matchingPropertyName", "         ");
        setIntField(term8728, term8728.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "          ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term8728));
    }

};


