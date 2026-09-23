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

public class JSDocInfoBuilder_recordTypedef_595478264430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163392;
     Object term163790;
     Object term163911;
     Object term163915;

    public JSDocInfoBuilder_recordTypedef_595478264430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term163644 = new HashMap();
        term163392 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term163472 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term163596 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term163472, term163472.getClass(), "bitset", 536870912);
        setField(term163596, term163596.getClass(), "parameters", term163644);
        setField(term163596, term163596.getClass(), "baseType", null);
        setField(term163472, term163472.getClass(), "info", term163596);
        setField(term163472, term163472.getClass(), "thisType", null);
        setField(term163392, term163392.getClass(), "currentInfo", term163472);
        term163790 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term163914 = new HashMap();
        term163911 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term163912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term163913 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term163913, term163913.getClass(), "baseType", null);
        setField(term163913, term163913.getClass(), "implementedInterfaces", null);
        setField(term163913, term163913.getClass(), "parameters", term163914);
        setField(term163913, term163913.getClass(), "thrownTypes", null);
        setField(term163913, term163913.getClass(), "templateTypeName", null);
        setField(term163913, term163913.getClass(), "description", null);
        setField(term163913, term163913.getClass(), "deprecated", null);
        setField(term163913, term163913.getClass(), "license", null);
        setField(term163913, term163913.getClass(), "suppressions", null);
        setField(term163912, term163912.getClass(), "info", term163913);
        setField(term163912, term163912.getClass(), "documentation", null);
        setField(term163912, term163912.getClass(), "sourceName", null);
        setField(term163912, term163912.getClass(), "visibility", null);
        setIntField(term163912, term163912.getClass(), "bitset", 536870912);
        setField(term163912, term163912.getClass(), "type", null);
        setField(term163912, term163912.getClass(), "thisType", null);
        setBooleanField(term163912, term163912.getClass(), "includeDocumentation", false);
        setField(term163911, term163911.getClass(), "currentInfo", term163912);
        setBooleanField(term163911, term163911.getClass(), "populated", false);
        setBooleanField(term163911, term163911.getClass(), "parseDocumentation", false);
        setField(term163911, term163911.getClass(), "currentMarker", null);
        term163915 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term163915, term163915.getClass(), "root", null);
        setField(term163915, term163915.getClass(), "sourceName", null);
        setField(term163915, term163915.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term163790;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term163392, args);
        assertTrue(recursiveEquals(term163392, term163911));
        assertTrue(recursiveEquals(term163790, term163915));
        assertTrue(recursiveEquals(retValue, false));
    }

};


