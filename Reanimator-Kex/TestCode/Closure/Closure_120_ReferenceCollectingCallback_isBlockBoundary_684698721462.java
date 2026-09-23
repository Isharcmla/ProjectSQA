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

public class ReferenceCollectingCallback_isBlockBoundary_684698721462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119467;
     Object term119559;
     Object term119937;
     Object term119939;

    public ReferenceCollectingCallback_isBlockBoundary_684698721462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119467 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term119559 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term119559, term119559.getClass(), "type", 101);
        setField(term119559, term119559.getClass(), "first", term119651);
        term119937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term119937, term119937.getClass(), "number", 0.0);
        setIntField(term119937, term119937.getClass(), "type", 101);
        setField(term119937, term119937.getClass(), "next", null);
        setDoubleField(term119938, term119938.getClass(), "number", 0.0);
        setIntField(term119938, term119938.getClass(), "type", 0);
        setField(term119938, term119938.getClass(), "next", null);
        setField(term119938, term119938.getClass(), "first", null);
        setField(term119938, term119938.getClass(), "last", null);
        setField(term119938, term119938.getClass(), "propListHead", null);
        setIntField(term119938, term119938.getClass(), "sourcePosition", 0);
        setField(term119938, term119938.getClass(), "jsType", null);
        setField(term119938, term119938.getClass(), "parent", null);
        setField(term119937, term119937.getClass(), "first", term119938);
        setField(term119937, term119937.getClass(), "last", null);
        setField(term119937, term119937.getClass(), "propListHead", null);
        setIntField(term119937, term119937.getClass(), "sourcePosition", 0);
        setField(term119937, term119937.getClass(), "jsType", null);
        setField(term119937, term119937.getClass(), "parent", null);
        term119939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term119939, term119939.getClass(), "number", 0.0);
        setIntField(term119939, term119939.getClass(), "type", 0);
        setField(term119939, term119939.getClass(), "next", null);
        setField(term119939, term119939.getClass(), "first", null);
        setField(term119939, term119939.getClass(), "last", null);
        setField(term119939, term119939.getClass(), "propListHead", null);
        setIntField(term119939, term119939.getClass(), "sourcePosition", 0);
        setField(term119939, term119939.getClass(), "jsType", null);
        setField(term119939, term119939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term119467;
        args[1] = term119559;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term119467, term119937));
        assertTrue(recursiveEquals(term119559, term119939));
        assertTrue(recursiveEquals(retValue, true));
    }

};


