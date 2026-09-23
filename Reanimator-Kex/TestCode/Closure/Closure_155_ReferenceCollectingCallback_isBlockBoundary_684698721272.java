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

public class ReferenceCollectingCallback_isBlockBoundary_684698721272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65160;
     Object term65252;
     Object term65266;
     Object term65267;

    public ReferenceCollectingCallback_isBlockBoundary_684698721272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term65252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term65252, term65252.getClass(), "type", 12);
        term65266 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65266, term65266.getClass(), "number", 0.0);
        setIntField(term65266, term65266.getClass(), "type", 12);
        setField(term65266, term65266.getClass(), "next", null);
        setField(term65266, term65266.getClass(), "first", null);
        setField(term65266, term65266.getClass(), "last", null);
        setField(term65266, term65266.getClass(), "propListHead", null);
        setIntField(term65266, term65266.getClass(), "sourcePosition", 0);
        setField(term65266, term65266.getClass(), "jsType", null);
        setField(term65266, term65266.getClass(), "parent", null);
        term65267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65267, term65267.getClass(), "number", 0.0);
        setIntField(term65267, term65267.getClass(), "type", 0);
        setField(term65267, term65267.getClass(), "next", null);
        setField(term65267, term65267.getClass(), "first", null);
        setField(term65267, term65267.getClass(), "last", null);
        setField(term65267, term65267.getClass(), "propListHead", null);
        setIntField(term65267, term65267.getClass(), "sourcePosition", 0);
        setField(term65267, term65267.getClass(), "jsType", null);
        setField(term65267, term65267.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term65160;
        args[1] = term65252;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term65160, term65266));
        assertTrue(recursiveEquals(term65252, term65267));
        assertTrue(recursiveEquals(retValue, false));
    }

};


