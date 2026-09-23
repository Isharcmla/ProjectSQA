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

public class JSDocInfoBuilder_recordEnumParameterType_881918703481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174478;
     Object term174824;
     Object term175174;
     Object term175179;

    public JSDocInfoBuilder_recordEnumParameterType_881918703481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term174730 = new HashMap();
        term174478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term174558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term174682 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term174558, term174558.getClass(), "bitset", 0);
        setField(term174682, term174682.getClass(), "parameters", term174730);
        setField(term174558, term174558.getClass(), "info", term174682);
        setField(term174478, term174478.getClass(), "currentInfo", term174558);
        term174824 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term175177 = new HashMap();
        term175174 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term175175 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term175176 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term175178 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term175176, term175176.getClass(), "baseType", null);
        setField(term175176, term175176.getClass(), "implementedInterfaces", null);
        setField(term175176, term175176.getClass(), "parameters", term175177);
        setField(term175176, term175176.getClass(), "thrownTypes", null);
        setField(term175176, term175176.getClass(), "templateTypeName", null);
        setField(term175176, term175176.getClass(), "description", null);
        setField(term175176, term175176.getClass(), "deprecated", null);
        setField(term175176, term175176.getClass(), "license", null);
        setField(term175176, term175176.getClass(), "suppressions", null);
        setField(term175175, term175175.getClass(), "info", term175176);
        setField(term175175, term175175.getClass(), "documentation", null);
        setField(term175175, term175175.getClass(), "sourceName", null);
        setField(term175175, term175175.getClass(), "visibility", null);
        setIntField(term175175, term175175.getClass(), "bitset", 1610612736);
        setField(term175178, term175178.getClass(), "root", null);
        setField(term175178, term175178.getClass(), "sourceName", null);
        setField(term175178, term175178.getClass(), "registry", null);
        setField(term175175, term175175.getClass(), "type", term175178);
        setField(term175175, term175175.getClass(), "thisType", null);
        setBooleanField(term175175, term175175.getClass(), "includeDocumentation", false);
        setField(term175174, term175174.getClass(), "currentInfo", term175175);
        setBooleanField(term175174, term175174.getClass(), "populated", true);
        setBooleanField(term175174, term175174.getClass(), "parseDocumentation", false);
        setField(term175174, term175174.getClass(), "currentMarker", null);
        term175179 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term175179, term175179.getClass(), "root", null);
        setField(term175179, term175179.getClass(), "sourceName", null);
        setField(term175179, term175179.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term174824;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term174478, args);
        assertTrue(recursiveEquals(term174478, term175174));
        assertTrue(recursiveEquals(term174824, term175179));
        assertTrue(recursiveEquals(retValue, true));
    }

};


