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

public class JsonPointer_compile_61512990571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980004;

    public JsonPointer_compile_61512990571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term980004 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term980005 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term980006 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term980007 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term980008 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term980008, term980008.getClass(), "_nextSegment", null);
        setField(term980008, term980008.getClass(), "_asString", null);
        setField(term980008, term980008.getClass(), "_matchingPropertyName", null);
        setIntField(term980008, term980008.getClass(), "_matchingElementIndex", -1);
        setField(term980007, term980007.getClass(), "_nextSegment", term980008);
        setField(term980007, term980007.getClass(), "_asString", "");
        setField(term980007, term980007.getClass(), "_matchingPropertyName", "");
        setIntField(term980007, term980007.getClass(), "_matchingElementIndex", -1);
        setField(term980006, term980006.getClass(), "_nextSegment", term980007);
        setField(term980006, term980006.getClass(), "_asString", "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term980006, term980006.getClass(), "_matchingPropertyName", "");
        setIntField(term980006, term980006.getClass(), "_matchingElementIndex", -1);
        setField(term980005, term980005.getClass(), "_nextSegment", term980006);
        setField(term980005, term980005.getClass(), "_asString", "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term980005, term980005.getClass(), "_matchingPropertyName", "");
        setIntField(term980005, term980005.getClass(), "_matchingElementIndex", -1);
        setField(term980004, term980004.getClass(), "_nextSegment", term980005);
        setField(term980004, term980004.getClass(), "_asString", "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setField(term980004, term980004.getClass(), "_matchingPropertyName", "");
        setIntField(term980004, term980004.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////";
        Object retValue = callMethod(klass, "compile", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term980004));
    }

};


