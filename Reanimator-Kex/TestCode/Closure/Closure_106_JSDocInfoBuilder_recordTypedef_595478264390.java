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

public class JSDocInfoBuilder_recordTypedef_595478264390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153966;
     Object term154264;
     Object term154347;
     Object term154350;

    public JSDocInfoBuilder_recordTypedef_595478264390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153966 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term154046 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term154170 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term154046, term154046.getClass(), "bitset", -2147483648);
        setField(term154170, term154170.getClass(), "parameters", null);
        setField(term154170, term154170.getClass(), "baseType", null);
        setField(term154046, term154046.getClass(), "info", term154170);
        setField(term154046, term154046.getClass(), "thisType", null);
        setField(term153966, term153966.getClass(), "currentInfo", term154046);
        term154264 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term154347 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term154348 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term154349 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term154349, term154349.getClass(), "baseType", null);
        setField(term154349, term154349.getClass(), "implementedInterfaces", null);
        setField(term154349, term154349.getClass(), "parameters", null);
        setField(term154349, term154349.getClass(), "thrownTypes", null);
        setField(term154349, term154349.getClass(), "templateTypeName", null);
        setField(term154349, term154349.getClass(), "description", null);
        setField(term154349, term154349.getClass(), "deprecated", null);
        setField(term154349, term154349.getClass(), "license", null);
        setField(term154349, term154349.getClass(), "suppressions", null);
        setField(term154348, term154348.getClass(), "info", term154349);
        setField(term154348, term154348.getClass(), "documentation", null);
        setField(term154348, term154348.getClass(), "sourceName", null);
        setField(term154348, term154348.getClass(), "visibility", null);
        setIntField(term154348, term154348.getClass(), "bitset", -2147483648);
        setField(term154348, term154348.getClass(), "type", null);
        setField(term154348, term154348.getClass(), "thisType", null);
        setBooleanField(term154348, term154348.getClass(), "includeDocumentation", false);
        setField(term154347, term154347.getClass(), "currentInfo", term154348);
        setBooleanField(term154347, term154347.getClass(), "populated", false);
        setBooleanField(term154347, term154347.getClass(), "parseDocumentation", false);
        setField(term154347, term154347.getClass(), "currentMarker", null);
        term154350 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term154350, term154350.getClass(), "root", null);
        setField(term154350, term154350.getClass(), "sourceName", null);
        setField(term154350, term154350.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term154264;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term153966, args);
        assertTrue(recursiveEquals(term153966, term154347));
        assertTrue(recursiveEquals(term154264, term154350));
        assertTrue(recursiveEquals(retValue, false));
    }

};


