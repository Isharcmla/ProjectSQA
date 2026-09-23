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

public class JSDocInfoBuilder_recordParameterDescription_915937072472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172688;
     Object term173398;

    public JSDocInfoBuilder_recordParameterDescription_915937072472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term172768 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term172910 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term172768, term172768.getClass(), "includeDocumentation", true);
        setField(term172910, term172910.getClass(), "parameters", null);
        setField(term172768, term172768.getClass(), "documentation", term172910);
        setField(term172688, term172688.getClass(), "currentInfo", term172768);
        LinkedHashMap term173401 = new LinkedHashMap();
        term173398 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term173399 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term173400 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term173399, term173399.getClass(), "info", null);
        setField(term173400, term173400.getClass(), "markers", null);
        setField(term173400, term173400.getClass(), "parameters", term173401);
        setField(term173400, term173400.getClass(), "throwsDescriptions", null);
        setField(term173400, term173400.getClass(), "blockDescription", null);
        setField(term173400, term173400.getClass(), "fileOverview", null);
        setField(term173400, term173400.getClass(), "returnDescription", null);
        setField(term173400, term173400.getClass(), "version", null);
        setField(term173400, term173400.getClass(), "authors", null);
        setField(term173400, term173400.getClass(), "sees", null);
        setField(term173399, term173399.getClass(), "documentation", term173400);
        setField(term173399, term173399.getClass(), "sourceName", null);
        setField(term173399, term173399.getClass(), "visibility", null);
        setIntField(term173399, term173399.getClass(), "bitset", 0);
        setField(term173399, term173399.getClass(), "type", null);
        setField(term173399, term173399.getClass(), "thisType", null);
        setBooleanField(term173399, term173399.getClass(), "includeDocumentation", true);
        setField(term173398, term173398.getClass(), "currentInfo", term173399);
        setBooleanField(term173398, term173398.getClass(), "populated", true);
        setBooleanField(term173398, term173398.getClass(), "parseDocumentation", false);
        setField(term173398, term173398.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordParameterDescription", argTypes, term172688, args);
        assertTrue(recursiveEquals(term172688, term173398));
        assertTrue(recursiveEquals(retValue, true));
    }

};


