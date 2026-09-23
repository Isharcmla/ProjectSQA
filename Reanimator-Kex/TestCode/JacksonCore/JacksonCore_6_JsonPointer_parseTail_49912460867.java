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

public class JsonPointer_parseTail_49912460867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13813;

    public JsonPointer_parseTail_49912460867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13813 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term13814 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term13815 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term13816 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term13817 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term13817, term13817.getClass(), "_nextSegment", null);
        setField(term13817, term13817.getClass(), "_asString", null);
        setField(term13817, term13817.getClass(), "_matchingPropertyName", null);
        setIntField(term13817, term13817.getClass(), "_matchingElementIndex", -1);
        setField(term13816, term13816.getClass(), "_nextSegment", term13817);
        setField(term13816, term13816.getClass(), "_asString", "");
        setField(term13816, term13816.getClass(), "_matchingPropertyName", "");
        setIntField(term13816, term13816.getClass(), "_matchingElementIndex", -1);
        setField(term13815, term13815.getClass(), "_nextSegment", term13816);
        setField(term13815, term13815.getClass(), "_asString", "////");
        setField(term13815, term13815.getClass(), "_matchingPropertyName", "");
        setIntField(term13815, term13815.getClass(), "_matchingElementIndex", -1);
        setField(term13814, term13814.getClass(), "_nextSegment", term13815);
        setField(term13814, term13814.getClass(), "_asString", "/////");
        setField(term13814, term13814.getClass(), "_matchingPropertyName", "");
        setIntField(term13814, term13814.getClass(), "_matchingElementIndex", -1);
        setField(term13813, term13813.getClass(), "_nextSegment", term13814);
        setField(term13813, term13813.getClass(), "_asString", "/  /////");
        setField(term13813, term13813.getClass(), "_matchingPropertyName", "  ");
        setIntField(term13813, term13813.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/  /////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term13813));
    }

};


