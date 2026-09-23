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

public class JsonPointer_parseTail_49912460889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012334;

    public JsonPointer_parseTail_49912460889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1012334 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1012335 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1012336 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1012337 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1012338 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1012338, term1012338.getClass(), "_nextSegment", null);
        setField(term1012338, term1012338.getClass(), "_asString", null);
        setField(term1012338, term1012338.getClass(), "_matchingPropertyName", null);
        setIntField(term1012338, term1012338.getClass(), "_matchingElementIndex", -1);
        setField(term1012337, term1012337.getClass(), "_nextSegment", term1012338);
        setField(term1012337, term1012337.getClass(), "_asString", "");
        setField(term1012337, term1012337.getClass(), "_matchingPropertyName", "");
        setIntField(term1012337, term1012337.getClass(), "_matchingElementIndex", -1);
        setField(term1012336, term1012336.getClass(), "_nextSegment", term1012337);
        setField(term1012336, term1012336.getClass(), "_asString", "//");
        setField(term1012336, term1012336.getClass(), "_matchingPropertyName", "");
        setIntField(term1012336, term1012336.getClass(), "_matchingElementIndex", -1);
        setField(term1012335, term1012335.getClass(), "_nextSegment", term1012336);
        setField(term1012335, term1012335.getClass(), "_asString", "///");
        setField(term1012335, term1012335.getClass(), "_matchingPropertyName", "");
        setIntField(term1012335, term1012335.getClass(), "_matchingElementIndex", -1);
        setField(term1012334, term1012334.getClass(), "_nextSegment", term1012335);
        setField(term1012334, term1012334.getClass(), "_asString", "/    ///");
        setField(term1012334, term1012334.getClass(), "_matchingPropertyName", "    ");
        setIntField(term1012334, term1012334.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/    ///";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1012334));
    }

};


