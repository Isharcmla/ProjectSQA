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

public class JsonPointer_parseTail_49912460850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6950;

    public JsonPointer_parseTail_49912460850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6950 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term6951 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term6952 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term6953 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term6954 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term6954, term6954.getClass(), "_nextSegment", null);
        setField(term6954, term6954.getClass(), "_asString", null);
        setField(term6954, term6954.getClass(), "_matchingPropertyName", null);
        setIntField(term6954, term6954.getClass(), "_matchingElementIndex", -1);
        setField(term6953, term6953.getClass(), "_nextSegment", term6954);
        setField(term6953, term6953.getClass(), "_asString", "");
        setField(term6953, term6953.getClass(), "_matchingPropertyName", "");
        setIntField(term6953, term6953.getClass(), "_matchingElementIndex", -1);
        setField(term6952, term6952.getClass(), "_nextSegment", term6953);
        setField(term6952, term6952.getClass(), "_asString", "//////");
        setField(term6952, term6952.getClass(), "_matchingPropertyName", "");
        setIntField(term6952, term6952.getClass(), "_matchingElementIndex", -1);
        setField(term6951, term6951.getClass(), "_nextSegment", term6952);
        setField(term6951, term6951.getClass(), "_asString", "///////");
        setField(term6951, term6951.getClass(), "_matchingPropertyName", "");
        setIntField(term6951, term6951.getClass(), "_matchingElementIndex", -1);
        setField(term6950, term6950.getClass(), "_nextSegment", term6951);
        setField(term6950, term6950.getClass(), "_asString", "////////");
        setField(term6950, term6950.getClass(), "_matchingPropertyName", "");
        setIntField(term6950, term6950.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "////////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6950));
    }

};


