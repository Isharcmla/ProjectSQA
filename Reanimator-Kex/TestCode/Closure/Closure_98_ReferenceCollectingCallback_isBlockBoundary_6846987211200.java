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
import java.lang.Object;

public class ReferenceCollectingCallback_isBlockBoundary_6846987211200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355951;
     Object term356043;
     Object term358285;
     Object term358287;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355951 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term356043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term356135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term356043, term356043.getClass(), "type", 98);
        setField(term356043, term356043.getClass(), "first", term356135);
        term358285 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term358286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term358285, term358285.getClass(), "str", null);
        setIntField(term358285, term358285.getClass(), "type", 98);
        setField(term358285, term358285.getClass(), "next", null);
        setField(term358286, term358286.getClass(), "str", null);
        setIntField(term358286, term358286.getClass(), "type", 0);
        setField(term358286, term358286.getClass(), "next", null);
        setField(term358286, term358286.getClass(), "first", null);
        setField(term358286, term358286.getClass(), "last", null);
        setField(term358286, term358286.getClass(), "propListHead", null);
        setIntField(term358286, term358286.getClass(), "sourcePosition", 0);
        setField(term358286, term358286.getClass(), "jsType", null);
        setField(term358286, term358286.getClass(), "parent", null);
        setField(term358285, term358285.getClass(), "first", term358286);
        setField(term358285, term358285.getClass(), "last", null);
        setField(term358285, term358285.getClass(), "propListHead", null);
        setIntField(term358285, term358285.getClass(), "sourcePosition", 0);
        setField(term358285, term358285.getClass(), "jsType", null);
        setField(term358285, term358285.getClass(), "parent", null);
        term358287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term358287, term358287.getClass(), "str", null);
        setIntField(term358287, term358287.getClass(), "type", 0);
        setField(term358287, term358287.getClass(), "next", null);
        setField(term358287, term358287.getClass(), "first", null);
        setField(term358287, term358287.getClass(), "last", null);
        setField(term358287, term358287.getClass(), "propListHead", null);
        setIntField(term358287, term358287.getClass(), "sourcePosition", 0);
        setField(term358287, term358287.getClass(), "jsType", null);
        setField(term358287, term358287.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term355951;
        args[1] = term356043;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term355951, term358285));
        assertTrue(recursiveEquals(term356043, term358287));
        assertTrue(recursiveEquals(retValue, true));
    }

};


