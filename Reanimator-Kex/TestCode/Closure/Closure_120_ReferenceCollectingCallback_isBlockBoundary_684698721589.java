package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class ReferenceCollectingCallback_isBlockBoundary_684698721589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184140;
     Object term184232;
     Object term184245;
     Object term184246;

    public ReferenceCollectingCallback_isBlockBoundary_684698721589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184140 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term184140, term184140.getClass(), "type", 111);
        term184232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term184232, term184232.getClass(), "type", 12);
        term184245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term184245, term184245.getClass(), "str", null);
        setIntField(term184245, term184245.getClass(), "type", 12);
        setField(term184245, term184245.getClass(), "next", null);
        setField(term184245, term184245.getClass(), "first", null);
        setField(term184245, term184245.getClass(), "last", null);
        setField(term184245, term184245.getClass(), "propListHead", null);
        setIntField(term184245, term184245.getClass(), "sourcePosition", 0);
        setField(term184245, term184245.getClass(), "jsType", null);
        setField(term184245, term184245.getClass(), "parent", null);
        term184246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term184246, term184246.getClass(), "str", null);
        setIntField(term184246, term184246.getClass(), "type", 111);
        setField(term184246, term184246.getClass(), "next", null);
        setField(term184246, term184246.getClass(), "first", null);
        setField(term184246, term184246.getClass(), "last", null);
        setField(term184246, term184246.getClass(), "propListHead", null);
        setIntField(term184246, term184246.getClass(), "sourcePosition", 0);
        setField(term184246, term184246.getClass(), "jsType", null);
        setField(term184246, term184246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term184140;
        args[1] = term184232;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term184140, term184245));
        assertTrue(recursiveEquals(term184232, term184246));
        assertTrue(recursiveEquals(retValue, true));
    }

};


