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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182132;
     Object term182969;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182132 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term182212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term182336 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term182212, term182212.getClass(), "bitset", 536870912);
        setField(term182336, term182336.getClass(), "parameters", null);
        setField(term182336, term182336.getClass(), "baseType", null);
        setField(term182212, term182212.getClass(), "info", term182336);
        setField(term182212, term182212.getClass(), "thisType", null);
        setField(term182132, term182132.getClass(), "currentInfo", term182212);
        term182969 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term182970 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term182971 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term182971, term182971.getClass(), "baseType", null);
        setField(term182971, term182971.getClass(), "implementedInterfaces", null);
        setField(term182971, term182971.getClass(), "parameters", null);
        setField(term182971, term182971.getClass(), "thrownTypes", null);
        setField(term182971, term182971.getClass(), "templateTypeName", null);
        setField(term182971, term182971.getClass(), "description", null);
        setField(term182971, term182971.getClass(), "deprecated", null);
        setField(term182971, term182971.getClass(), "license", null);
        setField(term182971, term182971.getClass(), "suppressions", null);
        setField(term182970, term182970.getClass(), "info", term182971);
        setField(term182970, term182970.getClass(), "documentation", null);
        setField(term182970, term182970.getClass(), "sourceName", null);
        setField(term182970, term182970.getClass(), "visibility", null);
        setIntField(term182970, term182970.getClass(), "bitset", 536870912);
        setField(term182970, term182970.getClass(), "type", null);
        setField(term182970, term182970.getClass(), "thisType", null);
        setBooleanField(term182970, term182970.getClass(), "includeDocumentation", false);
        setField(term182969, term182969.getClass(), "currentInfo", term182970);
        setBooleanField(term182969, term182969.getClass(), "populated", false);
        setBooleanField(term182969, term182969.getClass(), "parseDocumentation", false);
        setField(term182969, term182969.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term182132, args);
        assertTrue(recursiveEquals(term182132, term182969));
        assertTrue(recursiveEquals(retValue, true));
    }

};


