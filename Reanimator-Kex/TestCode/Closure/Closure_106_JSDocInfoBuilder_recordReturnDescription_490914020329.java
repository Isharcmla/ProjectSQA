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

public class JSDocInfoBuilder_recordReturnDescription_490914020329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139477;
     Object term140302;

    public JSDocInfoBuilder_recordReturnDescription_490914020329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139477 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term139557 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term139699 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term139557, term139557.getClass(), "includeDocumentation", true);
        setField(term139699, term139699.getClass(), "returnDescription", "");
        setField(term139557, term139557.getClass(), "documentation", term139699);
        setField(term139477, term139477.getClass(), "currentInfo", term139557);
        term140302 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term140303 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term140304 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term140303, term140303.getClass(), "info", null);
        setField(term140304, term140304.getClass(), "markers", null);
        setField(term140304, term140304.getClass(), "parameters", null);
        setField(term140304, term140304.getClass(), "throwsDescriptions", null);
        setField(term140304, term140304.getClass(), "blockDescription", null);
        setField(term140304, term140304.getClass(), "fileOverview", null);
        setField(term140304, term140304.getClass(), "returnDescription", "");
        setField(term140304, term140304.getClass(), "version", null);
        setField(term140304, term140304.getClass(), "authors", null);
        setField(term140304, term140304.getClass(), "sees", null);
        setField(term140303, term140303.getClass(), "documentation", term140304);
        setField(term140303, term140303.getClass(), "sourceName", null);
        setField(term140303, term140303.getClass(), "visibility", null);
        setIntField(term140303, term140303.getClass(), "bitset", 0);
        setField(term140303, term140303.getClass(), "type", null);
        setField(term140303, term140303.getClass(), "thisType", null);
        setBooleanField(term140303, term140303.getClass(), "includeDocumentation", true);
        setField(term140302, term140302.getClass(), "currentInfo", term140303);
        setBooleanField(term140302, term140302.getClass(), "populated", false);
        setBooleanField(term140302, term140302.getClass(), "parseDocumentation", false);
        setField(term140302, term140302.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordReturnDescription", argTypes, term139477, args);
        assertTrue(recursiveEquals(term139477, term140302));
        assertTrue(recursiveEquals(retValue, false));
    }

};


