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

public class JSDocInfoBuilder_recordDefineType_1936429508549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194320;
     Object term194666;
     Object term195338;
     Object term195343;

    public JSDocInfoBuilder_recordDefineType_1936429508549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term194572 = new HashMap();
        term194320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term194400 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term194524 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term194400, term194400.getClass(), "bitset", 0);
        setField(term194524, term194524.getClass(), "parameters", term194572);
        setField(term194400, term194400.getClass(), "info", term194524);
        setField(term194320, term194320.getClass(), "currentInfo", term194400);
        term194666 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term195341 = new HashMap();
        term195338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term195339 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term195340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term195342 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term195340, term195340.getClass(), "baseType", null);
        setField(term195340, term195340.getClass(), "implementedInterfaces", null);
        setField(term195340, term195340.getClass(), "parameters", term195341);
        setField(term195340, term195340.getClass(), "thrownTypes", null);
        setField(term195340, term195340.getClass(), "templateTypeName", null);
        setField(term195340, term195340.getClass(), "description", null);
        setField(term195340, term195340.getClass(), "deprecated", null);
        setField(term195340, term195340.getClass(), "license", null);
        setField(term195340, term195340.getClass(), "suppressions", null);
        setField(term195339, term195339.getClass(), "info", term195340);
        setField(term195339, term195339.getClass(), "documentation", null);
        setField(term195339, term195339.getClass(), "sourceName", null);
        setField(term195339, term195339.getClass(), "visibility", null);
        setIntField(term195339, term195339.getClass(), "bitset", 536870916);
        setField(term195342, term195342.getClass(), "root", null);
        setField(term195342, term195342.getClass(), "sourceName", null);
        setField(term195342, term195342.getClass(), "registry", null);
        setField(term195339, term195339.getClass(), "type", term195342);
        setField(term195339, term195339.getClass(), "thisType", null);
        setBooleanField(term195339, term195339.getClass(), "includeDocumentation", false);
        setField(term195338, term195338.getClass(), "currentInfo", term195339);
        setBooleanField(term195338, term195338.getClass(), "populated", true);
        setBooleanField(term195338, term195338.getClass(), "parseDocumentation", false);
        setField(term195338, term195338.getClass(), "currentMarker", null);
        term195343 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term195343, term195343.getClass(), "root", null);
        setField(term195343, term195343.getClass(), "sourceName", null);
        setField(term195343, term195343.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term194666;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term194320, args);
        assertTrue(recursiveEquals(term194320, term195338));
        assertTrue(recursiveEquals(term194666, term195343));
        assertTrue(recursiveEquals(retValue, true));
    }

};


