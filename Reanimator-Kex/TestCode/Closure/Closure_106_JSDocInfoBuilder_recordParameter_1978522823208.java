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

public class JSDocInfoBuilder_recordParameter_1978522823208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118040;
     Object term118183;

    public JSDocInfoBuilder_recordParameter_1978522823208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118040 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118120 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term118120, term118120.getClass(), "bitset", -1073741824);
        setField(term118040, term118040.getClass(), "currentInfo", term118120);
        LinkedHashMap term118186 = new LinkedHashMap();
        term118183 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118184 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term118185 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term118185, term118185.getClass(), "baseType", null);
        setField(term118185, term118185.getClass(), "implementedInterfaces", null);
        setField(term118185, term118185.getClass(), "parameters", term118186);
        setField(term118185, term118185.getClass(), "thrownTypes", null);
        setField(term118185, term118185.getClass(), "templateTypeName", null);
        setField(term118185, term118185.getClass(), "description", null);
        setField(term118185, term118185.getClass(), "deprecated", null);
        setField(term118185, term118185.getClass(), "license", null);
        setField(term118185, term118185.getClass(), "suppressions", null);
        setField(term118184, term118184.getClass(), "info", term118185);
        setField(term118184, term118184.getClass(), "documentation", null);
        setField(term118184, term118184.getClass(), "sourceName", null);
        setField(term118184, term118184.getClass(), "visibility", null);
        setIntField(term118184, term118184.getClass(), "bitset", -1073741824);
        setField(term118184, term118184.getClass(), "type", null);
        setField(term118184, term118184.getClass(), "thisType", null);
        setBooleanField(term118184, term118184.getClass(), "includeDocumentation", false);
        setField(term118183, term118183.getClass(), "currentInfo", term118184);
        setBooleanField(term118183, term118183.getClass(), "populated", true);
        setBooleanField(term118183, term118183.getClass(), "parseDocumentation", false);
        setField(term118183, term118183.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameter", argTypes, term118040, args);
        assertTrue(recursiveEquals(term118040, term118183));
        assertTrue(recursiveEquals(retValue, true));
    }

};


