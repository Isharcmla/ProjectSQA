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

public class JsonPointer_parseTail_499124608115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570641;

    public JsonPointer_parseTail_499124608115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1570641 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1570642 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1570643 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1570643, term1570643.getClass(), "_nextSegment", null);
        setField(term1570643, term1570643.getClass(), "_asString", "");
        setField(term1570643, term1570643.getClass(), "_matchingPropertyName", "");
        setIntField(term1570643, term1570643.getClass(), "_matchingElementIndex", -1);
        setField(term1570642, term1570642.getClass(), "_nextSegment", term1570643);
        setField(term1570642, term1570642.getClass(), "_asString", "/                                                                                                                                            ");
        setField(term1570642, term1570642.getClass(), "_matchingPropertyName", "                                                                                                                                            ");
        setIntField(term1570642, term1570642.getClass(), "_matchingElementIndex", -1);
        setField(term1570641, term1570641.getClass(), "_nextSegment", term1570642);
        setField(term1570641, term1570641.getClass(), "_asString", "    ~ /                                                                                                                                            ");
        setField(term1570641, term1570641.getClass(), "_matchingPropertyName", "   ~ ");
        setIntField(term1570641, term1570641.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "    ~ /                                                                                                                                            ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1570641));
    }

};


