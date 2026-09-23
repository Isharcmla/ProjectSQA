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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210828;
     Object term211327;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term211080 = new HashMap();
        term210828 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term210908 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term211032 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term211226 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term210908, term210908.getClass(), "bitset", 0);
        setField(term211032, term211032.getClass(), "parameters", term211080);
        setField(term211032, term211032.getClass(), "baseType", null);
        setField(term210908, term210908.getClass(), "info", term211032);
        setField(term210908, term210908.getClass(), "thisType", term211226);
        setField(term210828, term210828.getClass(), "currentInfo", term210908);
        HashMap term211330 = new HashMap();
        term211327 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term211328 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term211329 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term211331 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term211329, term211329.getClass(), "baseType", null);
        setField(term211329, term211329.getClass(), "implementedInterfaces", null);
        setField(term211329, term211329.getClass(), "parameters", term211330);
        setField(term211329, term211329.getClass(), "thrownTypes", null);
        setField(term211329, term211329.getClass(), "templateTypeName", null);
        setField(term211329, term211329.getClass(), "description", null);
        setField(term211329, term211329.getClass(), "deprecated", null);
        setField(term211329, term211329.getClass(), "license", null);
        setField(term211329, term211329.getClass(), "suppressions", null);
        setField(term211328, term211328.getClass(), "info", term211329);
        setField(term211328, term211328.getClass(), "documentation", null);
        setField(term211328, term211328.getClass(), "sourceName", null);
        setField(term211328, term211328.getClass(), "visibility", null);
        setIntField(term211328, term211328.getClass(), "bitset", 0);
        setField(term211328, term211328.getClass(), "type", null);
        setField(term211331, term211331.getClass(), "root", null);
        setField(term211331, term211331.getClass(), "sourceName", null);
        setField(term211331, term211331.getClass(), "registry", null);
        setField(term211328, term211328.getClass(), "thisType", term211331);
        setBooleanField(term211328, term211328.getClass(), "includeDocumentation", false);
        setField(term211327, term211327.getClass(), "currentInfo", term211328);
        setBooleanField(term211327, term211327.getClass(), "populated", false);
        setBooleanField(term211327, term211327.getClass(), "parseDocumentation", false);
        setField(term211327, term211327.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term210828, args);
        assertTrue(recursiveEquals(term210828, term211327));
        assertTrue(recursiveEquals(retValue, true));
    }

};


