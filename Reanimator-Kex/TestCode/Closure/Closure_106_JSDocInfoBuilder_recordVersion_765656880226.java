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

public class JSDocInfoBuilder_recordVersion_765656880226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121130;
     Object term121378;

    public JSDocInfoBuilder_recordVersion_765656880226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121130 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121210 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121352 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term121210, term121210.getClass(), "includeDocumentation", true);
        setField(term121210, term121210.getClass(), "documentation", term121352);
        setField(term121130, term121130.getClass(), "currentInfo", term121210);
        term121378 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term121379, term121379.getClass(), "info", null);
        setField(term121380, term121380.getClass(), "markers", null);
        setField(term121380, term121380.getClass(), "parameters", null);
        setField(term121380, term121380.getClass(), "throwsDescriptions", null);
        setField(term121380, term121380.getClass(), "blockDescription", null);
        setField(term121380, term121380.getClass(), "fileOverview", null);
        setField(term121380, term121380.getClass(), "returnDescription", null);
        setField(term121380, term121380.getClass(), "version", null);
        setField(term121380, term121380.getClass(), "authors", null);
        setField(term121380, term121380.getClass(), "sees", null);
        setField(term121379, term121379.getClass(), "documentation", term121380);
        setField(term121379, term121379.getClass(), "sourceName", null);
        setField(term121379, term121379.getClass(), "visibility", null);
        setIntField(term121379, term121379.getClass(), "bitset", 0);
        setField(term121379, term121379.getClass(), "type", null);
        setField(term121379, term121379.getClass(), "thisType", null);
        setBooleanField(term121379, term121379.getClass(), "includeDocumentation", true);
        setField(term121378, term121378.getClass(), "currentInfo", term121379);
        setBooleanField(term121378, term121378.getClass(), "populated", true);
        setBooleanField(term121378, term121378.getClass(), "parseDocumentation", false);
        setField(term121378, term121378.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordVersion", argTypes, term121130, args);
        assertTrue(recursiveEquals(term121130, term121378));
        assertTrue(recursiveEquals(retValue, true));
    }

};


