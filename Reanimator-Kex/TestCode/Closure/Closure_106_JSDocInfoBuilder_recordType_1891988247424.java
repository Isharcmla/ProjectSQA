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

public class JSDocInfoBuilder_recordType_1891988247424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162439;
     Object term162831;
     Object term162894;
     Object term162898;

    public JSDocInfoBuilder_recordType_1891988247424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162439 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term162519 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term162643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term162737 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term162519, term162519.getClass(), "bitset", 0);
        setField(term162643, term162643.getClass(), "parameters", null);
        setField(term162643, term162643.getClass(), "baseType", term162737);
        setField(term162519, term162519.getClass(), "info", term162643);
        setField(term162439, term162439.getClass(), "currentInfo", term162519);
        term162831 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term162894 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term162895 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term162896 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term162897 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term162897, term162897.getClass(), "root", null);
        setField(term162897, term162897.getClass(), "sourceName", null);
        setField(term162897, term162897.getClass(), "registry", null);
        setField(term162896, term162896.getClass(), "baseType", term162897);
        setField(term162896, term162896.getClass(), "implementedInterfaces", null);
        setField(term162896, term162896.getClass(), "parameters", null);
        setField(term162896, term162896.getClass(), "thrownTypes", null);
        setField(term162896, term162896.getClass(), "templateTypeName", null);
        setField(term162896, term162896.getClass(), "description", null);
        setField(term162896, term162896.getClass(), "deprecated", null);
        setField(term162896, term162896.getClass(), "license", null);
        setField(term162896, term162896.getClass(), "suppressions", null);
        setField(term162895, term162895.getClass(), "info", term162896);
        setField(term162895, term162895.getClass(), "documentation", null);
        setField(term162895, term162895.getClass(), "sourceName", null);
        setField(term162895, term162895.getClass(), "visibility", null);
        setIntField(term162895, term162895.getClass(), "bitset", 0);
        setField(term162895, term162895.getClass(), "type", null);
        setField(term162895, term162895.getClass(), "thisType", null);
        setBooleanField(term162895, term162895.getClass(), "includeDocumentation", false);
        setField(term162894, term162894.getClass(), "currentInfo", term162895);
        setBooleanField(term162894, term162894.getClass(), "populated", false);
        setBooleanField(term162894, term162894.getClass(), "parseDocumentation", false);
        setField(term162894, term162894.getClass(), "currentMarker", null);
        term162898 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term162898, term162898.getClass(), "root", null);
        setField(term162898, term162898.getClass(), "sourceName", null);
        setField(term162898, term162898.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term162831;
        Object retValue = callMethod(klass, "recordType", argTypes, term162439, args);
        assertTrue(recursiveEquals(term162439, term162894));
        assertTrue(recursiveEquals(term162831, term162898));
        assertTrue(recursiveEquals(retValue, false));
    }

};


