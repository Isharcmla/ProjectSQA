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

public class JSDocInfoBuilder_recordParameterDescription_915937072216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119208;
     Object term119328;

    public JSDocInfoBuilder_recordParameterDescription_915937072216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119208 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119288 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term119288, term119288.getClass(), "includeDocumentation", true);
        setField(term119288, term119288.getClass(), "documentation", null);
        setField(term119208, term119208.getClass(), "currentInfo", term119288);
        LinkedHashMap term119331 = new LinkedHashMap();
        term119328 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119329 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term119330 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term119329, term119329.getClass(), "info", null);
        setField(term119330, term119330.getClass(), "markers", null);
        setField(term119330, term119330.getClass(), "parameters", term119331);
        setField(term119330, term119330.getClass(), "throwsDescriptions", null);
        setField(term119330, term119330.getClass(), "blockDescription", null);
        setField(term119330, term119330.getClass(), "fileOverview", null);
        setField(term119330, term119330.getClass(), "returnDescription", null);
        setField(term119330, term119330.getClass(), "version", null);
        setField(term119330, term119330.getClass(), "authors", null);
        setField(term119330, term119330.getClass(), "sees", null);
        setField(term119329, term119329.getClass(), "documentation", term119330);
        setField(term119329, term119329.getClass(), "sourceName", null);
        setField(term119329, term119329.getClass(), "visibility", null);
        setIntField(term119329, term119329.getClass(), "bitset", 0);
        setField(term119329, term119329.getClass(), "type", null);
        setField(term119329, term119329.getClass(), "thisType", null);
        setBooleanField(term119329, term119329.getClass(), "includeDocumentation", true);
        setField(term119328, term119328.getClass(), "currentInfo", term119329);
        setBooleanField(term119328, term119328.getClass(), "populated", true);
        setBooleanField(term119328, term119328.getClass(), "parseDocumentation", false);
        setField(term119328, term119328.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameterDescription", argTypes, term119208, args);
        assertTrue(recursiveEquals(term119208, term119328));
        assertTrue(recursiveEquals(retValue, true));
    }

};


