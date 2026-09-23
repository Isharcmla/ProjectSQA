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

public class JsonPointer_valueOf_2451776485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985836;

    public JsonPointer_valueOf_2451776485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term985836 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term985837 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term985838 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term985839 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term985840 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term985840, term985840.getClass(), "_nextSegment", null);
        setField(term985840, term985840.getClass(), "_asString", null);
        setField(term985840, term985840.getClass(), "_matchingPropertyName", null);
        setIntField(term985840, term985840.getClass(), "_matchingElementIndex", -1);
        setField(term985839, term985839.getClass(), "_nextSegment", term985840);
        setField(term985839, term985839.getClass(), "_asString", "");
        setField(term985839, term985839.getClass(), "_matchingPropertyName", "");
        setIntField(term985839, term985839.getClass(), "_matchingElementIndex", -1);
        setField(term985838, term985838.getClass(), "_nextSegment", term985839);
        setField(term985838, term985838.getClass(), "_asString", "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term985838, term985838.getClass(), "_matchingPropertyName", "");
        setIntField(term985838, term985838.getClass(), "_matchingElementIndex", -1);
        setField(term985837, term985837.getClass(), "_nextSegment", term985838);
        setField(term985837, term985837.getClass(), "_asString", "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term985837, term985837.getClass(), "_matchingPropertyName", "");
        setIntField(term985837, term985837.getClass(), "_matchingElementIndex", -1);
        setField(term985836, term985836.getClass(), "_nextSegment", term985837);
        setField(term985836, term985836.getClass(), "_asString", "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term985836, term985836.getClass(), "_matchingPropertyName", "");
        setIntField(term985836, term985836.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////";
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term985836));
    }

};


