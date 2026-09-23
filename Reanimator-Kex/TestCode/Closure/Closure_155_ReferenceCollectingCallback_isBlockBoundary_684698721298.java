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

public class ReferenceCollectingCallback_isBlockBoundary_684698721298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69972;
     Object term70064;
     Object term70371;
     Object term70372;

    public ReferenceCollectingCallback_isBlockBoundary_684698721298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term70064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term70064, term70064.getClass(), "type", 12);
        term70371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70371, term70371.getClass(), "str", null);
        setIntField(term70371, term70371.getClass(), "type", 12);
        setField(term70371, term70371.getClass(), "next", null);
        setField(term70371, term70371.getClass(), "first", null);
        setField(term70371, term70371.getClass(), "last", null);
        setField(term70371, term70371.getClass(), "propListHead", null);
        setIntField(term70371, term70371.getClass(), "sourcePosition", 0);
        setField(term70371, term70371.getClass(), "jsType", null);
        setField(term70371, term70371.getClass(), "parent", null);
        term70372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70372, term70372.getClass(), "str", null);
        setIntField(term70372, term70372.getClass(), "type", 0);
        setField(term70372, term70372.getClass(), "next", null);
        setField(term70372, term70372.getClass(), "first", null);
        setField(term70372, term70372.getClass(), "last", null);
        setField(term70372, term70372.getClass(), "propListHead", null);
        setIntField(term70372, term70372.getClass(), "sourcePosition", 0);
        setField(term70372, term70372.getClass(), "jsType", null);
        setField(term70372, term70372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term69972;
        args[1] = term70064;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term69972, term70371));
        assertTrue(recursiveEquals(term70064, term70372));
        assertTrue(recursiveEquals(retValue, false));
    }

};


