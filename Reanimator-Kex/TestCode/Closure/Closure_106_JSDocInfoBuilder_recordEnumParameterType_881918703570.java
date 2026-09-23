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

public class JSDocInfoBuilder_recordEnumParameterType_881918703570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200669;
     Object term201067;
     Object term201278;
     Object term201282;

    public JSDocInfoBuilder_recordEnumParameterType_881918703570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term200921 = new HashMap();
        term200669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term200749 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term200873 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term200749, term200749.getClass(), "bitset", 1073741824);
        setField(term200873, term200873.getClass(), "parameters", term200921);
        setField(term200749, term200749.getClass(), "info", term200873);
        setField(term200669, term200669.getClass(), "currentInfo", term200749);
        term201067 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term201281 = new HashMap();
        term201278 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term201279 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term201280 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term201280, term201280.getClass(), "baseType", null);
        setField(term201280, term201280.getClass(), "implementedInterfaces", null);
        setField(term201280, term201280.getClass(), "parameters", term201281);
        setField(term201280, term201280.getClass(), "thrownTypes", null);
        setField(term201280, term201280.getClass(), "templateTypeName", null);
        setField(term201280, term201280.getClass(), "description", null);
        setField(term201280, term201280.getClass(), "deprecated", null);
        setField(term201280, term201280.getClass(), "license", null);
        setField(term201280, term201280.getClass(), "suppressions", null);
        setField(term201279, term201279.getClass(), "info", term201280);
        setField(term201279, term201279.getClass(), "documentation", null);
        setField(term201279, term201279.getClass(), "sourceName", null);
        setField(term201279, term201279.getClass(), "visibility", null);
        setIntField(term201279, term201279.getClass(), "bitset", 1073741824);
        setField(term201279, term201279.getClass(), "type", null);
        setField(term201279, term201279.getClass(), "thisType", null);
        setBooleanField(term201279, term201279.getClass(), "includeDocumentation", false);
        setField(term201278, term201278.getClass(), "currentInfo", term201279);
        setBooleanField(term201278, term201278.getClass(), "populated", false);
        setBooleanField(term201278, term201278.getClass(), "parseDocumentation", false);
        setField(term201278, term201278.getClass(), "currentMarker", null);
        term201282 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term201282, term201282.getClass(), "root", null);
        setField(term201282, term201282.getClass(), "sourceName", null);
        setField(term201282, term201282.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term201067;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term200669, args);
        assertTrue(recursiveEquals(term200669, term201278));
        assertTrue(recursiveEquals(term201067, term201282));
        assertTrue(recursiveEquals(retValue, false));
    }

};


