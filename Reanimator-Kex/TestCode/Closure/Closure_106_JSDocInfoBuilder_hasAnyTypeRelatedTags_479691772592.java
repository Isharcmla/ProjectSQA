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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209013;
     Object term209455;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term209265 = new HashMap();
        term209013 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term209093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term209217 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term209093, term209093.getClass(), "bitset", 1610612736);
        setField(term209217, term209217.getClass(), "parameters", term209265);
        setField(term209217, term209217.getClass(), "baseType", null);
        setField(term209093, term209093.getClass(), "info", term209217);
        setField(term209093, term209093.getClass(), "thisType", null);
        setField(term209013, term209013.getClass(), "currentInfo", term209093);
        HashMap term209458 = new HashMap();
        term209455 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term209456 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term209457 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term209457, term209457.getClass(), "baseType", null);
        setField(term209457, term209457.getClass(), "implementedInterfaces", null);
        setField(term209457, term209457.getClass(), "parameters", term209458);
        setField(term209457, term209457.getClass(), "thrownTypes", null);
        setField(term209457, term209457.getClass(), "templateTypeName", null);
        setField(term209457, term209457.getClass(), "description", null);
        setField(term209457, term209457.getClass(), "deprecated", null);
        setField(term209457, term209457.getClass(), "license", null);
        setField(term209457, term209457.getClass(), "suppressions", null);
        setField(term209456, term209456.getClass(), "info", term209457);
        setField(term209456, term209456.getClass(), "documentation", null);
        setField(term209456, term209456.getClass(), "sourceName", null);
        setField(term209456, term209456.getClass(), "visibility", null);
        setIntField(term209456, term209456.getClass(), "bitset", 1610612736);
        setField(term209456, term209456.getClass(), "type", null);
        setField(term209456, term209456.getClass(), "thisType", null);
        setBooleanField(term209456, term209456.getClass(), "includeDocumentation", false);
        setField(term209455, term209455.getClass(), "currentInfo", term209456);
        setBooleanField(term209455, term209455.getClass(), "populated", false);
        setBooleanField(term209455, term209455.getClass(), "parseDocumentation", false);
        setField(term209455, term209455.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term209013, args);
        assertTrue(recursiveEquals(term209013, term209455));
        assertTrue(recursiveEquals(retValue, true));
    }

};


