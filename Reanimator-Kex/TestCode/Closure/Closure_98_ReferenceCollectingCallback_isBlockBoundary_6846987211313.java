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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400088;
     Object term400180;
     Object term400294;
     Object term400295;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term400180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term400180, term400180.getClass(), "type", 12);
        term400294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term400294, term400294.getClass(), "number", 0.0);
        setIntField(term400294, term400294.getClass(), "type", 12);
        setField(term400294, term400294.getClass(), "next", null);
        setField(term400294, term400294.getClass(), "first", null);
        setField(term400294, term400294.getClass(), "last", null);
        setField(term400294, term400294.getClass(), "propListHead", null);
        setIntField(term400294, term400294.getClass(), "sourcePosition", 0);
        setField(term400294, term400294.getClass(), "jsType", null);
        setField(term400294, term400294.getClass(), "parent", null);
        term400295 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term400295, term400295.getClass(), "str", null);
        setIntField(term400295, term400295.getClass(), "type", 0);
        setField(term400295, term400295.getClass(), "next", null);
        setField(term400295, term400295.getClass(), "first", null);
        setField(term400295, term400295.getClass(), "last", null);
        setField(term400295, term400295.getClass(), "propListHead", null);
        setIntField(term400295, term400295.getClass(), "sourcePosition", 0);
        setField(term400295, term400295.getClass(), "jsType", null);
        setField(term400295, term400295.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term400088;
        args[1] = term400180;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term400088, term400294));
        assertTrue(recursiveEquals(term400180, term400295));
        assertTrue(recursiveEquals(retValue, false));
    }

};


