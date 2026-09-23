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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169966;
     Object term170175;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169966 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term170046 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term170046, term170046.getClass(), "bitset", 1610612736);
        setField(term170046, term170046.getClass(), "info", null);
        setField(term170046, term170046.getClass(), "thisType", null);
        setField(term169966, term169966.getClass(), "currentInfo", term170046);
        term170175 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term170176 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term170176, term170176.getClass(), "info", null);
        setField(term170176, term170176.getClass(), "documentation", null);
        setField(term170176, term170176.getClass(), "sourceName", null);
        setField(term170176, term170176.getClass(), "visibility", null);
        setIntField(term170176, term170176.getClass(), "bitset", 1610612736);
        setField(term170176, term170176.getClass(), "type", null);
        setField(term170176, term170176.getClass(), "thisType", null);
        setBooleanField(term170176, term170176.getClass(), "includeDocumentation", false);
        setField(term170175, term170175.getClass(), "currentInfo", term170176);
        setBooleanField(term170175, term170175.getClass(), "populated", false);
        setBooleanField(term170175, term170175.getClass(), "parseDocumentation", false);
        setField(term170175, term170175.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term169966, args);
        assertTrue(recursiveEquals(term169966, term170175));
        assertTrue(recursiveEquals(retValue, true));
    }

};


