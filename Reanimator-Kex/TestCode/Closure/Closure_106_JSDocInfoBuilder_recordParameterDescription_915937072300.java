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

public class JSDocInfoBuilder_recordParameterDescription_915937072300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134564;
     Object term134713;

    public JSDocInfoBuilder_recordParameterDescription_915937072300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134644 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term134644, term134644.getClass(), "includeDocumentation", true);
        setField(term134644, term134644.getClass(), "documentation", null);
        setField(term134564, term134564.getClass(), "currentInfo", term134644);
        LinkedHashMap term134716 = new LinkedHashMap();
        term134713 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134714 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term134715 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term134714, term134714.getClass(), "info", null);
        setField(term134715, term134715.getClass(), "markers", null);
        setField(term134715, term134715.getClass(), "parameters", term134716);
        setField(term134715, term134715.getClass(), "throwsDescriptions", null);
        setField(term134715, term134715.getClass(), "blockDescription", null);
        setField(term134715, term134715.getClass(), "fileOverview", null);
        setField(term134715, term134715.getClass(), "returnDescription", null);
        setField(term134715, term134715.getClass(), "version", null);
        setField(term134715, term134715.getClass(), "authors", null);
        setField(term134715, term134715.getClass(), "sees", null);
        setField(term134714, term134714.getClass(), "documentation", term134715);
        setField(term134714, term134714.getClass(), "sourceName", null);
        setField(term134714, term134714.getClass(), "visibility", null);
        setIntField(term134714, term134714.getClass(), "bitset", 0);
        setField(term134714, term134714.getClass(), "type", null);
        setField(term134714, term134714.getClass(), "thisType", null);
        setBooleanField(term134714, term134714.getClass(), "includeDocumentation", true);
        setField(term134713, term134713.getClass(), "currentInfo", term134714);
        setBooleanField(term134713, term134713.getClass(), "populated", true);
        setBooleanField(term134713, term134713.getClass(), "parseDocumentation", false);
        setField(term134713, term134713.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordParameterDescription", argTypes, term134564, args);
        assertTrue(recursiveEquals(term134564, term134713));
        assertTrue(recursiveEquals(retValue, true));
    }

};


