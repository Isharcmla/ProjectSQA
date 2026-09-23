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

public class JSDocInfoBuilder_recordBlockDescription_1260634391426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163018;
     Object term163119;

    public JSDocInfoBuilder_recordBlockDescription_1260634391426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163018 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term163098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term163018, term163018.getClass(), "parseDocumentation", true);
        setBooleanField(term163018, term163018.getClass(), "populated", false);
        setBooleanField(term163098, term163098.getClass(), "includeDocumentation", true);
        setField(term163098, term163098.getClass(), "documentation", null);
        setField(term163018, term163018.getClass(), "currentInfo", term163098);
        term163119 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term163120 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term163121 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term163120, term163120.getClass(), "info", null);
        setField(term163121, term163121.getClass(), "markers", null);
        setField(term163121, term163121.getClass(), "parameters", null);
        setField(term163121, term163121.getClass(), "throwsDescriptions", null);
        setField(term163121, term163121.getClass(), "blockDescription", null);
        setField(term163121, term163121.getClass(), "fileOverview", null);
        setField(term163121, term163121.getClass(), "returnDescription", null);
        setField(term163121, term163121.getClass(), "version", null);
        setField(term163121, term163121.getClass(), "authors", null);
        setField(term163121, term163121.getClass(), "sees", null);
        setField(term163120, term163120.getClass(), "documentation", term163121);
        setField(term163120, term163120.getClass(), "sourceName", null);
        setField(term163120, term163120.getClass(), "visibility", null);
        setIntField(term163120, term163120.getClass(), "bitset", 0);
        setField(term163120, term163120.getClass(), "type", null);
        setField(term163120, term163120.getClass(), "thisType", null);
        setBooleanField(term163120, term163120.getClass(), "includeDocumentation", true);
        setField(term163119, term163119.getClass(), "currentInfo", term163120);
        setBooleanField(term163119, term163119.getClass(), "populated", true);
        setBooleanField(term163119, term163119.getClass(), "parseDocumentation", true);
        setField(term163119, term163119.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term163018, args);
        assertTrue(recursiveEquals(term163018, term163119));
    }

};


