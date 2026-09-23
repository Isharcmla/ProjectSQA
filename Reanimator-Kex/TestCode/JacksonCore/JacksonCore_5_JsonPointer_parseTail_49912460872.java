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

public class JsonPointer_parseTail_49912460872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term987563;

    public JsonPointer_parseTail_49912460872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term987563 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term987564 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term987565 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term987566 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term987567 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term987567, term987567.getClass(), "_nextSegment", null);
        setField(term987567, term987567.getClass(), "_asString", null);
        setField(term987567, term987567.getClass(), "_matchingPropertyName", null);
        setIntField(term987567, term987567.getClass(), "_matchingElementIndex", -1);
        setField(term987566, term987566.getClass(), "_nextSegment", term987567);
        setField(term987566, term987566.getClass(), "_asString", "");
        setField(term987566, term987566.getClass(), "_matchingPropertyName", "");
        setIntField(term987566, term987566.getClass(), "_matchingElementIndex", -1);
        setField(term987565, term987565.getClass(), "_nextSegment", term987566);
        setField(term987565, term987565.getClass(), "_asString", "///////////////////////");
        setField(term987565, term987565.getClass(), "_matchingPropertyName", "");
        setIntField(term987565, term987565.getClass(), "_matchingElementIndex", -1);
        setField(term987564, term987564.getClass(), "_nextSegment", term987565);
        setField(term987564, term987564.getClass(), "_asString", "////////////////////////");
        setField(term987564, term987564.getClass(), "_matchingPropertyName", "");
        setIntField(term987564, term987564.getClass(), "_matchingElementIndex", -1);
        setField(term987563, term987563.getClass(), "_nextSegment", term987564);
        setField(term987563, term987563.getClass(), "_asString", "/       ////////////////////////");
        setField(term987563, term987563.getClass(), "_matchingPropertyName", "       ");
        setIntField(term987563, term987563.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/       ////////////////////////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term987563));
    }

};


