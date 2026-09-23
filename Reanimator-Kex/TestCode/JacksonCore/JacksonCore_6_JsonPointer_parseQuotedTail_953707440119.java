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

public class JsonPointer_parseQuotedTail_953707440119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764409;

    public JsonPointer_parseQuotedTail_953707440119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1764409 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1764410 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1764411 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1764411, term1764411.getClass(), "_nextSegment", null);
        setField(term1764411, term1764411.getClass(), "_asString", "");
        setField(term1764411, term1764411.getClass(), "_matchingPropertyName", "");
        setIntField(term1764411, term1764411.getClass(), "_matchingElementIndex", -1);
        setField(term1764410, term1764410.getClass(), "_nextSegment", term1764411);
        setField(term1764410, term1764410.getClass(), "_asString", "/                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setField(term1764410, term1764410.getClass(), "_matchingPropertyName", "                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setIntField(term1764410, term1764410.getClass(), "_matchingElementIndex", -1);
        setField(term1764409, term1764409.getClass(), "_nextSegment", term1764410);
        setField(term1764409, term1764409.getClass(), "_asString", "                                                                                                                     /                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setField(term1764409, term1764409.getClass(), "_matchingPropertyName", "~                                                                                                                   ");
        setIntField(term1764409, term1764409.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                     /                                                                                                                                                                                                                                                                                                                                                                                                     ";
        args[1] = 2;
        Object retValue = callMethod(klass, "_parseQuotedTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1764409));
    }

};


