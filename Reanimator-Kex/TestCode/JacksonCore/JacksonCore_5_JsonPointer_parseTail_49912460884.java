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

public class JsonPointer_parseTail_49912460884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071934;

    public JsonPointer_parseTail_49912460884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1071934 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1071935 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1071936 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1071937 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1071937, term1071937.getClass(), "_nextSegment", null);
        setField(term1071937, term1071937.getClass(), "_asString", "");
        setField(term1071937, term1071937.getClass(), "_matchingPropertyName", "");
        setIntField(term1071937, term1071937.getClass(), "_matchingElementIndex", -1);
        setField(term1071936, term1071936.getClass(), "_nextSegment", term1071937);
        setField(term1071936, term1071936.getClass(), "_asString", "/                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term1071936, term1071936.getClass(), "_matchingPropertyName", "                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setIntField(term1071936, term1071936.getClass(), "_matchingElementIndex", -1);
        setField(term1071935, term1071935.getClass(), "_nextSegment", term1071936);
        setField(term1071935, term1071935.getClass(), "_asString", "/                                                                                                                               /                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term1071935, term1071935.getClass(), "_matchingPropertyName", "                                                                                                                               ");
        setIntField(term1071935, term1071935.getClass(), "_matchingElementIndex", -1);
        setField(term1071934, term1071934.getClass(), "_nextSegment", term1071935);
        setField(term1071934, term1071934.getClass(), "_asString", " /                                                                                                                               /                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term1071934, term1071934.getClass(), "_matchingPropertyName", "");
        setIntField(term1071934, term1071934.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " /                                                                                                                               /                                                                                                                                                                                                                                                                                                                                                                                                        ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1071934));
    }

};


