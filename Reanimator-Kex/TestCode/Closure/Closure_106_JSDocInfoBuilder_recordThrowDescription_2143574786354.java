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

public class JSDocInfoBuilder_recordThrowDescription_2143574786354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145135;
     Object term145411;

    public JSDocInfoBuilder_recordThrowDescription_2143574786354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145135 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term145215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term145357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term145215, term145215.getClass(), "includeDocumentation", true);
        setField(term145357, term145357.getClass(), "throwsDescriptions", null);
        setField(term145215, term145215.getClass(), "documentation", term145357);
        setField(term145135, term145135.getClass(), "currentInfo", term145215);
        LinkedHashMap term145414 = new LinkedHashMap();
        term145411 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term145412 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term145413 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term145412, term145412.getClass(), "info", null);
        setField(term145413, term145413.getClass(), "markers", null);
        setField(term145413, term145413.getClass(), "parameters", null);
        setField(term145413, term145413.getClass(), "throwsDescriptions", term145414);
        setField(term145413, term145413.getClass(), "blockDescription", null);
        setField(term145413, term145413.getClass(), "fileOverview", null);
        setField(term145413, term145413.getClass(), "returnDescription", null);
        setField(term145413, term145413.getClass(), "version", null);
        setField(term145413, term145413.getClass(), "authors", null);
        setField(term145413, term145413.getClass(), "sees", null);
        setField(term145412, term145412.getClass(), "documentation", term145413);
        setField(term145412, term145412.getClass(), "sourceName", null);
        setField(term145412, term145412.getClass(), "visibility", null);
        setIntField(term145412, term145412.getClass(), "bitset", 0);
        setField(term145412, term145412.getClass(), "type", null);
        setField(term145412, term145412.getClass(), "thisType", null);
        setBooleanField(term145412, term145412.getClass(), "includeDocumentation", true);
        setField(term145411, term145411.getClass(), "currentInfo", term145412);
        setBooleanField(term145411, term145411.getClass(), "populated", true);
        setBooleanField(term145411, term145411.getClass(), "parseDocumentation", false);
        setField(term145411, term145411.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordThrowDescription", argTypes, term145135, args);
        assertTrue(recursiveEquals(term145135, term145411));
        assertTrue(recursiveEquals(retValue, true));
    }

};


