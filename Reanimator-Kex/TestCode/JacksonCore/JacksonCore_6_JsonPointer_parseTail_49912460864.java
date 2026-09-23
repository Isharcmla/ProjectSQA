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

public class JsonPointer_parseTail_49912460864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11652;

    public JsonPointer_parseTail_49912460864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11652 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term11653 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term11654 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term11655 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term11656 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term11656, term11656.getClass(), "_nextSegment", null);
        setField(term11656, term11656.getClass(), "_asString", null);
        setField(term11656, term11656.getClass(), "_matchingPropertyName", null);
        setIntField(term11656, term11656.getClass(), "_matchingElementIndex", -1);
        setField(term11655, term11655.getClass(), "_nextSegment", term11656);
        setField(term11655, term11655.getClass(), "_asString", "");
        setField(term11655, term11655.getClass(), "_matchingPropertyName", "");
        setIntField(term11655, term11655.getClass(), "_matchingElementIndex", -1);
        setField(term11654, term11654.getClass(), "_nextSegment", term11655);
        setField(term11654, term11654.getClass(), "_asString", "//");
        setField(term11654, term11654.getClass(), "_matchingPropertyName", "");
        setIntField(term11654, term11654.getClass(), "_matchingElementIndex", -1);
        setField(term11653, term11653.getClass(), "_nextSegment", term11654);
        setField(term11653, term11653.getClass(), "_asString", "///");
        setField(term11653, term11653.getClass(), "_matchingPropertyName", "");
        setIntField(term11653, term11653.getClass(), "_matchingElementIndex", -1);
        setField(term11652, term11652.getClass(), "_nextSegment", term11653);
        setField(term11652, term11652.getClass(), "_asString", "/        ///");
        setField(term11652, term11652.getClass(), "_matchingPropertyName", "        ");
        setIntField(term11652, term11652.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/        ///";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term11652));
    }

};


