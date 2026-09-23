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

public class JSDocInfoBuilder_recordEnumParameterType_881918703569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200113;
     Object term200511;
     Object term201195;
     Object term201199;

    public JSDocInfoBuilder_recordEnumParameterType_881918703569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term200365 = new HashMap();
        term200113 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term200193 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term200317 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term200193, term200193.getClass(), "bitset", -2147483648);
        setField(term200317, term200317.getClass(), "parameters", term200365);
        setField(term200317, term200317.getClass(), "baseType", null);
        setField(term200193, term200193.getClass(), "info", term200317);
        setField(term200193, term200193.getClass(), "thisType", null);
        setField(term200113, term200113.getClass(), "currentInfo", term200193);
        term200511 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term201198 = new HashMap();
        term201195 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term201196 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term201197 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term201197, term201197.getClass(), "baseType", null);
        setField(term201197, term201197.getClass(), "implementedInterfaces", null);
        setField(term201197, term201197.getClass(), "parameters", term201198);
        setField(term201197, term201197.getClass(), "thrownTypes", null);
        setField(term201197, term201197.getClass(), "templateTypeName", null);
        setField(term201197, term201197.getClass(), "description", null);
        setField(term201197, term201197.getClass(), "deprecated", null);
        setField(term201197, term201197.getClass(), "license", null);
        setField(term201197, term201197.getClass(), "suppressions", null);
        setField(term201196, term201196.getClass(), "info", term201197);
        setField(term201196, term201196.getClass(), "documentation", null);
        setField(term201196, term201196.getClass(), "sourceName", null);
        setField(term201196, term201196.getClass(), "visibility", null);
        setIntField(term201196, term201196.getClass(), "bitset", -2147483648);
        setField(term201196, term201196.getClass(), "type", null);
        setField(term201196, term201196.getClass(), "thisType", null);
        setBooleanField(term201196, term201196.getClass(), "includeDocumentation", false);
        setField(term201195, term201195.getClass(), "currentInfo", term201196);
        setBooleanField(term201195, term201195.getClass(), "populated", false);
        setBooleanField(term201195, term201195.getClass(), "parseDocumentation", false);
        setField(term201195, term201195.getClass(), "currentMarker", null);
        term201199 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term201199, term201199.getClass(), "root", null);
        setField(term201199, term201199.getClass(), "sourceName", null);
        setField(term201199, term201199.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term200511;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term200113, args);
        assertTrue(recursiveEquals(term200113, term201195));
        assertTrue(recursiveEquals(term200511, term201199));
        assertTrue(recursiveEquals(retValue, false));
    }

};


