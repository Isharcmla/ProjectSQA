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

public class JsonPointer_parseTail_49912460887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990269;

    public JsonPointer_parseTail_49912460887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term990269 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990270 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990271 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990272 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term990273 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term990273, term990273.getClass(), "_nextSegment", null);
        setField(term990273, term990273.getClass(), "_asString", null);
        setField(term990273, term990273.getClass(), "_matchingPropertyName", null);
        setIntField(term990273, term990273.getClass(), "_matchingElementIndex", -1);
        setField(term990272, term990272.getClass(), "_nextSegment", term990273);
        setField(term990272, term990272.getClass(), "_asString", "");
        setField(term990272, term990272.getClass(), "_matchingPropertyName", "");
        setIntField(term990272, term990272.getClass(), "_matchingElementIndex", -1);
        setField(term990271, term990271.getClass(), "_nextSegment", term990272);
        setField(term990271, term990271.getClass(), "_asString", "///");
        setField(term990271, term990271.getClass(), "_matchingPropertyName", "");
        setIntField(term990271, term990271.getClass(), "_matchingElementIndex", -1);
        setField(term990270, term990270.getClass(), "_nextSegment", term990271);
        setField(term990270, term990270.getClass(), "_asString", "////");
        setField(term990270, term990270.getClass(), "_matchingPropertyName", "");
        setIntField(term990270, term990270.getClass(), "_matchingElementIndex", -1);
        setField(term990269, term990269.getClass(), "_nextSegment", term990270);
        setField(term990269, term990269.getClass(), "_asString", "/   ////");
        setField(term990269, term990269.getClass(), "_matchingPropertyName", "   ");
        setIntField(term990269, term990269.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "/   ////";
        Object retValue = callMethod(klass, "_parseTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term990269));
    }

};


