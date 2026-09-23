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

public class JsonPointer_parseTail_499124608100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049723;

    public JsonPointer_parseTail_499124608100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049723 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1049724 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1049724, term1049724.getClass(), "_nextSegment", null);
        setField(term1049724, term1049724.getClass(), "_asString", "");
        setField(term1049724, term1049724.getClass(), "_matchingPropertyName", "");
        setIntField(term1049724, term1049724.getClass(), "_matchingElementIndex", -1);
        setField(term1049723, term1049723.getClass(), "_nextSegment", term1049724);
        setField(term1049723, term1049723.getClass(), "_asString", "\u0006\u0006  ");
        setField(term1049723, term1049723.getClass(), "_matchingPropertyName", "\u0006  ");
        setIntField(term1049723, term1049723.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0006\u0006  ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1049723));
    }

};


