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

public class JsonPointer_parseTail_499124608101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1054760;

    public JsonPointer_parseTail_499124608101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1054760 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1054761 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1054762 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1054763 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1054763, term1054763.getClass(), "_nextSegment", null);
        setField(term1054763, term1054763.getClass(), "_asString", "");
        setField(term1054763, term1054763.getClass(), "_matchingPropertyName", "");
        setIntField(term1054763, term1054763.getClass(), "_matchingElementIndex", -1);
        setField(term1054762, term1054762.getClass(), "_nextSegment", term1054763);
        setField(term1054762, term1054762.getClass(), "_asString", "/                                                                                                                                                                                                                                     ");
        setField(term1054762, term1054762.getClass(), "_matchingPropertyName", "                                                                                                                                                                                                                                     ");
        setIntField(term1054762, term1054762.getClass(), "_matchingElementIndex", -1);
        setField(term1054761, term1054761.getClass(), "_nextSegment", term1054762);
        setField(term1054761, term1054761.getClass(), "_asString", "/  /                                                                                                                                                                                                                                     ");
        setField(term1054761, term1054761.getClass(), "_matchingPropertyName", "  ");
        setIntField(term1054761, term1054761.getClass(), "_matchingElementIndex", -1);
        setField(term1054760, term1054760.getClass(), "_nextSegment", term1054761);
        setField(term1054760, term1054760.getClass(), "_asString", " @    /  /                                                                                                                                                                                                                                     ");
        setField(term1054760, term1054760.getClass(), "_matchingPropertyName", "@    ");
        setIntField(term1054760, term1054760.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " @    /  /                                                                                                                                                                                                                                     ";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1054760));
    }

};


