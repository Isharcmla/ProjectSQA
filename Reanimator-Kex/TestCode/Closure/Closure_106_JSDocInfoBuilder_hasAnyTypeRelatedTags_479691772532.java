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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189265;
     Object term189629;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189265 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term189345 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term189469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term189563 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term189345, term189345.getClass(), "bitset", 0);
        setField(term189469, term189469.getClass(), "parameters", null);
        setField(term189469, term189469.getClass(), "baseType", null);
        setField(term189345, term189345.getClass(), "info", term189469);
        setField(term189345, term189345.getClass(), "thisType", term189563);
        setField(term189265, term189265.getClass(), "currentInfo", term189345);
        term189629 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term189630 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term189631 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term189632 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term189631, term189631.getClass(), "baseType", null);
        setField(term189631, term189631.getClass(), "implementedInterfaces", null);
        setField(term189631, term189631.getClass(), "parameters", null);
        setField(term189631, term189631.getClass(), "thrownTypes", null);
        setField(term189631, term189631.getClass(), "templateTypeName", null);
        setField(term189631, term189631.getClass(), "description", null);
        setField(term189631, term189631.getClass(), "deprecated", null);
        setField(term189631, term189631.getClass(), "license", null);
        setField(term189631, term189631.getClass(), "suppressions", null);
        setField(term189630, term189630.getClass(), "info", term189631);
        setField(term189630, term189630.getClass(), "documentation", null);
        setField(term189630, term189630.getClass(), "sourceName", null);
        setField(term189630, term189630.getClass(), "visibility", null);
        setIntField(term189630, term189630.getClass(), "bitset", 0);
        setField(term189630, term189630.getClass(), "type", null);
        setField(term189632, term189632.getClass(), "root", null);
        setField(term189632, term189632.getClass(), "sourceName", null);
        setField(term189632, term189632.getClass(), "registry", null);
        setField(term189630, term189630.getClass(), "thisType", term189632);
        setBooleanField(term189630, term189630.getClass(), "includeDocumentation", false);
        setField(term189629, term189629.getClass(), "currentInfo", term189630);
        setBooleanField(term189629, term189629.getClass(), "populated", false);
        setBooleanField(term189629, term189629.getClass(), "parseDocumentation", false);
        setField(term189629, term189629.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term189265, args);
        assertTrue(recursiveEquals(term189265, term189629));
        assertTrue(recursiveEquals(retValue, true));
    }

};


