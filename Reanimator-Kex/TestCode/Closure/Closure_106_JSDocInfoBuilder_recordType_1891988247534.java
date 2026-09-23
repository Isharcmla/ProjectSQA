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

public class JSDocInfoBuilder_recordType_1891988247534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189808;
     Object term190206;
     Object term190325;
     Object term190329;

    public JSDocInfoBuilder_recordType_1891988247534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term190060 = new HashMap();
        term189808 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term189888 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term190012 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term189888, term189888.getClass(), "bitset", 536870912);
        setField(term190012, term190012.getClass(), "parameters", term190060);
        setField(term190012, term190012.getClass(), "baseType", null);
        setField(term189888, term189888.getClass(), "info", term190012);
        setField(term189888, term189888.getClass(), "thisType", null);
        setField(term189808, term189808.getClass(), "currentInfo", term189888);
        term190206 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term190328 = new HashMap();
        term190325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term190326 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term190327 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term190327, term190327.getClass(), "baseType", null);
        setField(term190327, term190327.getClass(), "implementedInterfaces", null);
        setField(term190327, term190327.getClass(), "parameters", term190328);
        setField(term190327, term190327.getClass(), "thrownTypes", null);
        setField(term190327, term190327.getClass(), "templateTypeName", null);
        setField(term190327, term190327.getClass(), "description", null);
        setField(term190327, term190327.getClass(), "deprecated", null);
        setField(term190327, term190327.getClass(), "license", null);
        setField(term190327, term190327.getClass(), "suppressions", null);
        setField(term190326, term190326.getClass(), "info", term190327);
        setField(term190326, term190326.getClass(), "documentation", null);
        setField(term190326, term190326.getClass(), "sourceName", null);
        setField(term190326, term190326.getClass(), "visibility", null);
        setIntField(term190326, term190326.getClass(), "bitset", 536870912);
        setField(term190326, term190326.getClass(), "type", null);
        setField(term190326, term190326.getClass(), "thisType", null);
        setBooleanField(term190326, term190326.getClass(), "includeDocumentation", false);
        setField(term190325, term190325.getClass(), "currentInfo", term190326);
        setBooleanField(term190325, term190325.getClass(), "populated", false);
        setBooleanField(term190325, term190325.getClass(), "parseDocumentation", false);
        setField(term190325, term190325.getClass(), "currentMarker", null);
        term190329 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term190329, term190329.getClass(), "root", null);
        setField(term190329, term190329.getClass(), "sourceName", null);
        setField(term190329, term190329.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term190206;
        Object retValue = callMethod(klass, "recordType", argTypes, term189808, args);
        assertTrue(recursiveEquals(term189808, term190325));
        assertTrue(recursiveEquals(term190206, term190329));
        assertTrue(recursiveEquals(retValue, false));
    }

};


