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

public class JsonPointer_parseTail_49912460899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049428;

    public JsonPointer_parseTail_49912460899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049428 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1049429 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1049429, term1049429.getClass(), "_nextSegment", null);
        setField(term1049429, term1049429.getClass(), "_asString", "");
        setField(term1049429, term1049429.getClass(), "_matchingPropertyName", "");
        setIntField(term1049429, term1049429.getClass(), "_matchingElementIndex", -1);
        setField(term1049428, term1049428.getClass(), "_nextSegment", term1049429);
        setField(term1049428, term1049428.getClass(), "_asString", "    ~ ~                                        ");
        setField(term1049428, term1049428.getClass(), "_matchingPropertyName", "   ~ ~                                        ");
        setIntField(term1049428, term1049428.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "    ~ ~                                        ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1049428));
    }

};


