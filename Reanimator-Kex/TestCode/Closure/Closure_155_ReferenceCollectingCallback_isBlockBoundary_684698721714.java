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

public class ReferenceCollectingCallback_isBlockBoundary_684698721714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189290;
     Object term189382;
     Object term189583;
     Object term189584;

    public ReferenceCollectingCallback_isBlockBoundary_684698721714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term189290, term189290.getClass(), "type", 111);
        term189382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term189382, term189382.getClass(), "type", 12);
        term189583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term189583, term189583.getClass(), "number", 0.0);
        setIntField(term189583, term189583.getClass(), "type", 12);
        setField(term189583, term189583.getClass(), "next", null);
        setField(term189583, term189583.getClass(), "first", null);
        setField(term189583, term189583.getClass(), "last", null);
        setField(term189583, term189583.getClass(), "propListHead", null);
        setIntField(term189583, term189583.getClass(), "sourcePosition", 0);
        setField(term189583, term189583.getClass(), "jsType", null);
        setField(term189583, term189583.getClass(), "parent", null);
        term189584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term189584, term189584.getClass(), "str", null);
        setIntField(term189584, term189584.getClass(), "type", 111);
        setField(term189584, term189584.getClass(), "next", null);
        setField(term189584, term189584.getClass(), "first", null);
        setField(term189584, term189584.getClass(), "last", null);
        setField(term189584, term189584.getClass(), "propListHead", null);
        setIntField(term189584, term189584.getClass(), "sourcePosition", 0);
        setField(term189584, term189584.getClass(), "jsType", null);
        setField(term189584, term189584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term189290;
        args[1] = term189382;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term189290, term189583));
        assertTrue(recursiveEquals(term189382, term189584));
        assertTrue(recursiveEquals(retValue, true));
    }

};


