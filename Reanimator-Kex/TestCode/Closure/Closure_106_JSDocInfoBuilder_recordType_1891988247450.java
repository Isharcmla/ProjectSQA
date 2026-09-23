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

public class JSDocInfoBuilder_recordType_1891988247450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167941;
     Object term168239;
     Object term168322;
     Object term168325;

    public JSDocInfoBuilder_recordType_1891988247450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167941 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term168021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term168145 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term168021, term168021.getClass(), "bitset", -2147483648);
        setField(term168145, term168145.getClass(), "parameters", null);
        setField(term168145, term168145.getClass(), "baseType", null);
        setField(term168021, term168021.getClass(), "info", term168145);
        setField(term168021, term168021.getClass(), "thisType", null);
        setField(term167941, term167941.getClass(), "currentInfo", term168021);
        term168239 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term168322 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term168323 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term168324 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term168324, term168324.getClass(), "baseType", null);
        setField(term168324, term168324.getClass(), "implementedInterfaces", null);
        setField(term168324, term168324.getClass(), "parameters", null);
        setField(term168324, term168324.getClass(), "thrownTypes", null);
        setField(term168324, term168324.getClass(), "templateTypeName", null);
        setField(term168324, term168324.getClass(), "description", null);
        setField(term168324, term168324.getClass(), "deprecated", null);
        setField(term168324, term168324.getClass(), "license", null);
        setField(term168324, term168324.getClass(), "suppressions", null);
        setField(term168323, term168323.getClass(), "info", term168324);
        setField(term168323, term168323.getClass(), "documentation", null);
        setField(term168323, term168323.getClass(), "sourceName", null);
        setField(term168323, term168323.getClass(), "visibility", null);
        setIntField(term168323, term168323.getClass(), "bitset", -2147483648);
        setField(term168323, term168323.getClass(), "type", null);
        setField(term168323, term168323.getClass(), "thisType", null);
        setBooleanField(term168323, term168323.getClass(), "includeDocumentation", false);
        setField(term168322, term168322.getClass(), "currentInfo", term168323);
        setBooleanField(term168322, term168322.getClass(), "populated", false);
        setBooleanField(term168322, term168322.getClass(), "parseDocumentation", false);
        setField(term168322, term168322.getClass(), "currentMarker", null);
        term168325 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term168325, term168325.getClass(), "root", null);
        setField(term168325, term168325.getClass(), "sourceName", null);
        setField(term168325, term168325.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term168239;
        Object retValue = callMethod(klass, "recordType", argTypes, term167941, args);
        assertTrue(recursiveEquals(term167941, term168322));
        assertTrue(recursiveEquals(term168239, term168325));
        assertTrue(recursiveEquals(retValue, false));
    }

};


