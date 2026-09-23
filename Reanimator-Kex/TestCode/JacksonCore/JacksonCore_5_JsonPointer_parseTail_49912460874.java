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

public class JsonPointer_parseTail_49912460874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990197;

    public JsonPointer_parseTail_49912460874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term990197 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990198 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990199 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990200 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990201 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term990201, term990201.getClass(), "_nextSegment", null);
        setField(term990201, term990201.getClass(), "_asString", null);
        setField(term990201, term990201.getClass(), "_matchingPropertyName", null);
        setIntField(term990201, term990201.getClass(), "_matchingElementIndex", -1);
        setField(term990200, term990200.getClass(), "_nextSegment", term990201);
        setField(term990200, term990200.getClass(), "_asString", "");
        setField(term990200, term990200.getClass(), "_matchingPropertyName", "");
        setIntField(term990200, term990200.getClass(), "_matchingElementIndex", -1);
        setField(term990199, term990199.getClass(), "_nextSegment", term990200);
        setField(term990199, term990199.getClass(), "_asString", "///");
        setField(term990199, term990199.getClass(), "_matchingPropertyName", "");
        setIntField(term990199, term990199.getClass(), "_matchingElementIndex", -1);
        setField(term990198, term990198.getClass(), "_nextSegment", term990199);
        setField(term990198, term990198.getClass(), "_asString", "////");
        setField(term990198, term990198.getClass(), "_matchingPropertyName", "");
        setIntField(term990198, term990198.getClass(), "_matchingElementIndex", -1);
        setField(term990197, term990197.getClass(), "_nextSegment", term990198);
        setField(term990197, term990197.getClass(), "_asString", "/   ////");
        setField(term990197, term990197.getClass(), "_matchingPropertyName", "   ");
        setIntField(term990197, term990197.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/   ////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term990197));
    }

};


