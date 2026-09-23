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

public class ReferenceCollectingCallback_isBlockBoundary_684698721203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38333;
     Object term38425;
     Object term38697;
     Object term38698;

    public ReferenceCollectingCallback_isBlockBoundary_684698721203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38333 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term38425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term38425, term38425.getClass(), "type", 12);
        term38697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38697, term38697.getClass(), "str", null);
        setIntField(term38697, term38697.getClass(), "type", 12);
        setField(term38697, term38697.getClass(), "next", null);
        setField(term38697, term38697.getClass(), "first", null);
        setField(term38697, term38697.getClass(), "last", null);
        setField(term38697, term38697.getClass(), "propListHead", null);
        setIntField(term38697, term38697.getClass(), "sourcePosition", 0);
        setField(term38697, term38697.getClass(), "jsType", null);
        setField(term38697, term38697.getClass(), "parent", null);
        term38698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term38698, term38698.getClass(), "number", 0.0);
        setIntField(term38698, term38698.getClass(), "type", 0);
        setField(term38698, term38698.getClass(), "next", null);
        setField(term38698, term38698.getClass(), "first", null);
        setField(term38698, term38698.getClass(), "last", null);
        setField(term38698, term38698.getClass(), "propListHead", null);
        setIntField(term38698, term38698.getClass(), "sourcePosition", 0);
        setField(term38698, term38698.getClass(), "jsType", null);
        setField(term38698, term38698.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term38333;
        args[1] = term38425;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term38333, term38697));
        assertTrue(recursiveEquals(term38425, term38698));
        assertTrue(recursiveEquals(retValue, false));
    }

};


