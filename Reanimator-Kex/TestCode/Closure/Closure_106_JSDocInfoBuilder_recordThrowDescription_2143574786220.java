package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class JSDocInfoBuilder_recordThrowDescription_2143574786220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119634;
     Object term119918;

    public JSDocInfoBuilder_recordThrowDescription_2143574786220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119634 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119714 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term119856 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term119714, term119714.getClass(), "includeDocumentation", true);
        setField(term119714, term119714.getClass(), "documentation", term119856);
        setField(term119634, term119634.getClass(), "currentInfo", term119714);
        LinkedHashMap term119921 = new LinkedHashMap();
        term119918 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119919 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term119920 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term119919, term119919.getClass(), "info", null);
        setField(term119920, term119920.getClass(), "markers", null);
        setField(term119920, term119920.getClass(), "parameters", null);
        setField(term119920, term119920.getClass(), "throwsDescriptions", term119921);
        setField(term119920, term119920.getClass(), "blockDescription", null);
        setField(term119920, term119920.getClass(), "fileOverview", null);
        setField(term119920, term119920.getClass(), "returnDescription", null);
        setField(term119920, term119920.getClass(), "version", null);
        setField(term119920, term119920.getClass(), "authors", null);
        setField(term119920, term119920.getClass(), "sees", null);
        setField(term119919, term119919.getClass(), "documentation", term119920);
        setField(term119919, term119919.getClass(), "sourceName", null);
        setField(term119919, term119919.getClass(), "visibility", null);
        setIntField(term119919, term119919.getClass(), "bitset", 0);
        setField(term119919, term119919.getClass(), "type", null);
        setField(term119919, term119919.getClass(), "thisType", null);
        setBooleanField(term119919, term119919.getClass(), "includeDocumentation", true);
        setField(term119918, term119918.getClass(), "currentInfo", term119919);
        setBooleanField(term119918, term119918.getClass(), "populated", true);
        setBooleanField(term119918, term119918.getClass(), "parseDocumentation", false);
        setField(term119918, term119918.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordThrowDescription", argTypes, term119634, args);
        assertTrue(recursiveEquals(term119634, term119918));
        assertTrue(recursiveEquals(retValue, true));
    }

};


