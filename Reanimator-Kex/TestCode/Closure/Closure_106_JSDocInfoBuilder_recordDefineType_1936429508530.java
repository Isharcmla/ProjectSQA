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

public class JSDocInfoBuilder_recordDefineType_1936429508530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188743;
     Object term189041;
     Object term189115;
     Object term189118;

    public JSDocInfoBuilder_recordDefineType_1936429508530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term188823 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term188947 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term188823, term188823.getClass(), "bitset", 1073741824);
        setField(term188947, term188947.getClass(), "parameters", null);
        setField(term188823, term188823.getClass(), "info", term188947);
        setField(term188743, term188743.getClass(), "currentInfo", term188823);
        term189041 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term189115 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term189116 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term189117 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term189117, term189117.getClass(), "baseType", null);
        setField(term189117, term189117.getClass(), "implementedInterfaces", null);
        setField(term189117, term189117.getClass(), "parameters", null);
        setField(term189117, term189117.getClass(), "thrownTypes", null);
        setField(term189117, term189117.getClass(), "templateTypeName", null);
        setField(term189117, term189117.getClass(), "description", null);
        setField(term189117, term189117.getClass(), "deprecated", null);
        setField(term189117, term189117.getClass(), "license", null);
        setField(term189117, term189117.getClass(), "suppressions", null);
        setField(term189116, term189116.getClass(), "info", term189117);
        setField(term189116, term189116.getClass(), "documentation", null);
        setField(term189116, term189116.getClass(), "sourceName", null);
        setField(term189116, term189116.getClass(), "visibility", null);
        setIntField(term189116, term189116.getClass(), "bitset", 1073741824);
        setField(term189116, term189116.getClass(), "type", null);
        setField(term189116, term189116.getClass(), "thisType", null);
        setBooleanField(term189116, term189116.getClass(), "includeDocumentation", false);
        setField(term189115, term189115.getClass(), "currentInfo", term189116);
        setBooleanField(term189115, term189115.getClass(), "populated", false);
        setBooleanField(term189115, term189115.getClass(), "parseDocumentation", false);
        setField(term189115, term189115.getClass(), "currentMarker", null);
        term189118 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term189118, term189118.getClass(), "root", null);
        setField(term189118, term189118.getClass(), "sourceName", null);
        setField(term189118, term189118.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term189041;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term188743, args);
        assertTrue(recursiveEquals(term188743, term189115));
        assertTrue(recursiveEquals(term189041, term189118));
        assertTrue(recursiveEquals(retValue, false));
    }

};


