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
import java.util.HashMap;

public class JSDocInfoBuilder_recordEnumParameterType_881918703560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197681;
     Object term198173;
     Object term198298;
     Object term198303;

    public JSDocInfoBuilder_recordEnumParameterType_881918703560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term197933 = new HashMap();
        term197681 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term197761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term197885 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term198079 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term197761, term197761.getClass(), "bitset", 0);
        setField(term197885, term197885.getClass(), "parameters", term197933);
        setField(term197885, term197885.getClass(), "baseType", term198079);
        setField(term197761, term197761.getClass(), "info", term197885);
        setField(term197681, term197681.getClass(), "currentInfo", term197761);
        term198173 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term198302 = new HashMap();
        term198298 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term198299 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term198300 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term198301 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term198301, term198301.getClass(), "root", null);
        setField(term198301, term198301.getClass(), "sourceName", null);
        setField(term198301, term198301.getClass(), "registry", null);
        setField(term198300, term198300.getClass(), "baseType", term198301);
        setField(term198300, term198300.getClass(), "implementedInterfaces", null);
        setField(term198300, term198300.getClass(), "parameters", term198302);
        setField(term198300, term198300.getClass(), "thrownTypes", null);
        setField(term198300, term198300.getClass(), "templateTypeName", null);
        setField(term198300, term198300.getClass(), "description", null);
        setField(term198300, term198300.getClass(), "deprecated", null);
        setField(term198300, term198300.getClass(), "license", null);
        setField(term198300, term198300.getClass(), "suppressions", null);
        setField(term198299, term198299.getClass(), "info", term198300);
        setField(term198299, term198299.getClass(), "documentation", null);
        setField(term198299, term198299.getClass(), "sourceName", null);
        setField(term198299, term198299.getClass(), "visibility", null);
        setIntField(term198299, term198299.getClass(), "bitset", 0);
        setField(term198299, term198299.getClass(), "type", null);
        setField(term198299, term198299.getClass(), "thisType", null);
        setBooleanField(term198299, term198299.getClass(), "includeDocumentation", false);
        setField(term198298, term198298.getClass(), "currentInfo", term198299);
        setBooleanField(term198298, term198298.getClass(), "populated", false);
        setBooleanField(term198298, term198298.getClass(), "parseDocumentation", false);
        setField(term198298, term198298.getClass(), "currentMarker", null);
        term198303 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term198303, term198303.getClass(), "root", null);
        setField(term198303, term198303.getClass(), "sourceName", null);
        setField(term198303, term198303.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term198173;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term197681, args);
        assertTrue(recursiveEquals(term197681, term198298));
        assertTrue(recursiveEquals(term198173, term198303));
        assertTrue(recursiveEquals(retValue, false));
    }

};


