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

public class ReferenceCollectingCallback_isBlockBoundary_684698721456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117377;
     Object term117469;
     Object term117484;
     Object term117485;

    public ReferenceCollectingCallback_isBlockBoundary_684698721456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term117377, term117377.getClass(), "type", 111);
        term117469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term117469, term117469.getClass(), "type", 12);
        term117484 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term117484, term117484.getClass(), "number", 0.0);
        setIntField(term117484, term117484.getClass(), "type", 12);
        setField(term117484, term117484.getClass(), "next", null);
        setField(term117484, term117484.getClass(), "first", null);
        setField(term117484, term117484.getClass(), "last", null);
        setField(term117484, term117484.getClass(), "propListHead", null);
        setIntField(term117484, term117484.getClass(), "sourcePosition", 0);
        setField(term117484, term117484.getClass(), "jsType", null);
        setField(term117484, term117484.getClass(), "parent", null);
        term117485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term117485, term117485.getClass(), "str", null);
        setIntField(term117485, term117485.getClass(), "type", 111);
        setField(term117485, term117485.getClass(), "next", null);
        setField(term117485, term117485.getClass(), "first", null);
        setField(term117485, term117485.getClass(), "last", null);
        setField(term117485, term117485.getClass(), "propListHead", null);
        setIntField(term117485, term117485.getClass(), "sourcePosition", 0);
        setField(term117485, term117485.getClass(), "jsType", null);
        setField(term117485, term117485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term117377;
        args[1] = term117469;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term117377, term117484));
        assertTrue(recursiveEquals(term117469, term117485));
        assertTrue(recursiveEquals(retValue, true));
    }

};


