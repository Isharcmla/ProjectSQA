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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134840;
     Object term135098;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134840 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134920 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term134920, term134920.getClass(), "bitset", 0);
        setField(term134840, term134840.getClass(), "currentInfo", term134920);
        term135098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term135099 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term135099, term135099.getClass(), "info", null);
        setField(term135099, term135099.getClass(), "documentation", null);
        setField(term135099, term135099.getClass(), "sourceName", null);
        setField(term135099, term135099.getClass(), "visibility", null);
        setIntField(term135099, term135099.getClass(), "bitset", 0);
        setField(term135099, term135099.getClass(), "type", null);
        setField(term135099, term135099.getClass(), "thisType", null);
        setBooleanField(term135099, term135099.getClass(), "includeDocumentation", false);
        setField(term135098, term135098.getClass(), "currentInfo", term135099);
        setBooleanField(term135098, term135098.getClass(), "populated", false);
        setBooleanField(term135098, term135098.getClass(), "parseDocumentation", false);
        setField(term135098, term135098.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term134840, args);
        assertTrue(recursiveEquals(term134840, term135098));
        assertTrue(recursiveEquals(retValue, false));
    }

};


