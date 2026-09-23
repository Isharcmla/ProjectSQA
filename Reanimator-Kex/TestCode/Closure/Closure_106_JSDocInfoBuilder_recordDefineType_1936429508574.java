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

public class JSDocInfoBuilder_recordDefineType_1936429508574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202260;
     Object term202658;
     Object term202836;
     Object term202840;

    public JSDocInfoBuilder_recordDefineType_1936429508574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term202512 = new HashMap();
        term202260 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term202340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term202464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term202340, term202340.getClass(), "bitset", 1610612736);
        setField(term202464, term202464.getClass(), "parameters", term202512);
        setField(term202464, term202464.getClass(), "baseType", null);
        setField(term202340, term202340.getClass(), "info", term202464);
        setField(term202340, term202340.getClass(), "thisType", null);
        setField(term202260, term202260.getClass(), "currentInfo", term202340);
        term202658 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term202839 = new HashMap();
        term202836 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term202837 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term202838 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term202838, term202838.getClass(), "baseType", null);
        setField(term202838, term202838.getClass(), "implementedInterfaces", null);
        setField(term202838, term202838.getClass(), "parameters", term202839);
        setField(term202838, term202838.getClass(), "thrownTypes", null);
        setField(term202838, term202838.getClass(), "templateTypeName", null);
        setField(term202838, term202838.getClass(), "description", null);
        setField(term202838, term202838.getClass(), "deprecated", null);
        setField(term202838, term202838.getClass(), "license", null);
        setField(term202838, term202838.getClass(), "suppressions", null);
        setField(term202837, term202837.getClass(), "info", term202838);
        setField(term202837, term202837.getClass(), "documentation", null);
        setField(term202837, term202837.getClass(), "sourceName", null);
        setField(term202837, term202837.getClass(), "visibility", null);
        setIntField(term202837, term202837.getClass(), "bitset", 1610612736);
        setField(term202837, term202837.getClass(), "type", null);
        setField(term202837, term202837.getClass(), "thisType", null);
        setBooleanField(term202837, term202837.getClass(), "includeDocumentation", false);
        setField(term202836, term202836.getClass(), "currentInfo", term202837);
        setBooleanField(term202836, term202836.getClass(), "populated", false);
        setBooleanField(term202836, term202836.getClass(), "parseDocumentation", false);
        setField(term202836, term202836.getClass(), "currentMarker", null);
        term202840 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term202840, term202840.getClass(), "root", null);
        setField(term202840, term202840.getClass(), "sourceName", null);
        setField(term202840, term202840.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term202658;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term202260, args);
        assertTrue(recursiveEquals(term202260, term202836));
        assertTrue(recursiveEquals(term202658, term202840));
        assertTrue(recursiveEquals(retValue, false));
    }

};


