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

public class ReferenceCollectingCallback_isBlockBoundary_684698721996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253507;
     Object term253599;
     Object term253878;
     Object term253879;

    public ReferenceCollectingCallback_isBlockBoundary_684698721996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term253507, term253507.getClass(), "type", 111);
        term253599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term253599, term253599.getClass(), "type", 12);
        term253878 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253878, term253878.getClass(), "str", null);
        setIntField(term253878, term253878.getClass(), "type", 12);
        setField(term253878, term253878.getClass(), "next", null);
        setField(term253878, term253878.getClass(), "first", null);
        setField(term253878, term253878.getClass(), "last", null);
        setField(term253878, term253878.getClass(), "propListHead", null);
        setIntField(term253878, term253878.getClass(), "sourcePosition", 0);
        setField(term253878, term253878.getClass(), "jsType", null);
        setField(term253878, term253878.getClass(), "parent", null);
        term253879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term253879, term253879.getClass(), "number", 0.0);
        setIntField(term253879, term253879.getClass(), "type", 111);
        setField(term253879, term253879.getClass(), "next", null);
        setField(term253879, term253879.getClass(), "first", null);
        setField(term253879, term253879.getClass(), "last", null);
        setField(term253879, term253879.getClass(), "propListHead", null);
        setIntField(term253879, term253879.getClass(), "sourcePosition", 0);
        setField(term253879, term253879.getClass(), "jsType", null);
        setField(term253879, term253879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term253507;
        args[1] = term253599;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term253507, term253878));
        assertTrue(recursiveEquals(term253599, term253879));
        assertTrue(recursiveEquals(retValue, true));
    }

};


