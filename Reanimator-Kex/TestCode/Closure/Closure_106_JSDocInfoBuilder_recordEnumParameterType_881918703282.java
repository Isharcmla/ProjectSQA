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

public class JSDocInfoBuilder_recordEnumParameterType_881918703282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131129;
     Object term131427;
     Object term131525;
     Object term131529;

    public JSDocInfoBuilder_recordEnumParameterType_881918703282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131129 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131209 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term131333 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term131209, term131209.getClass(), "bitset", 0);
        setField(term131209, term131209.getClass(), "info", term131333);
        setField(term131129, term131129.getClass(), "currentInfo", term131209);
        term131427 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term131525 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term131526 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term131527 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term131528 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term131527, term131527.getClass(), "baseType", null);
        setField(term131527, term131527.getClass(), "implementedInterfaces", null);
        setField(term131527, term131527.getClass(), "parameters", null);
        setField(term131527, term131527.getClass(), "thrownTypes", null);
        setField(term131527, term131527.getClass(), "templateTypeName", null);
        setField(term131527, term131527.getClass(), "description", null);
        setField(term131527, term131527.getClass(), "deprecated", null);
        setField(term131527, term131527.getClass(), "license", null);
        setField(term131527, term131527.getClass(), "suppressions", null);
        setField(term131526, term131526.getClass(), "info", term131527);
        setField(term131526, term131526.getClass(), "documentation", null);
        setField(term131526, term131526.getClass(), "sourceName", null);
        setField(term131526, term131526.getClass(), "visibility", null);
        setIntField(term131526, term131526.getClass(), "bitset", 1610612736);
        setField(term131528, term131528.getClass(), "root", null);
        setField(term131528, term131528.getClass(), "sourceName", null);
        setField(term131528, term131528.getClass(), "registry", null);
        setField(term131526, term131526.getClass(), "type", term131528);
        setField(term131526, term131526.getClass(), "thisType", null);
        setBooleanField(term131526, term131526.getClass(), "includeDocumentation", false);
        setField(term131525, term131525.getClass(), "currentInfo", term131526);
        setBooleanField(term131525, term131525.getClass(), "populated", true);
        setBooleanField(term131525, term131525.getClass(), "parseDocumentation", false);
        setField(term131525, term131525.getClass(), "currentMarker", null);
        term131529 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term131529, term131529.getClass(), "root", null);
        setField(term131529, term131529.getClass(), "sourceName", null);
        setField(term131529, term131529.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term131427;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term131129, args);
        assertTrue(recursiveEquals(term131129, term131525));
        assertTrue(recursiveEquals(term131427, term131529));
        assertTrue(recursiveEquals(retValue, true));
    }

};


