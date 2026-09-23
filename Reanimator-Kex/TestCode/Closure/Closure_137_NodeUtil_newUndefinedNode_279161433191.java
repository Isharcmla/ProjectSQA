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

public class NodeUtil_newUndefinedNode_279161433191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13736;

    public NodeUtil_newUndefinedNode_279161433191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13738 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13736, term13736.getClass(), "type", 122);
        setField(term13736, term13736.getClass(), "next", null);
        setDoubleField(term13738, term13738.getClass(), "number", 0.0);
        setIntField(term13738, term13738.getClass(), "type", 39);
        setField(term13738, term13738.getClass(), "next", null);
        setField(term13738, term13738.getClass(), "first", null);
        setField(term13738, term13738.getClass(), "last", null);
        setField(term13738, term13738.getClass(), "propListHead", null);
        setIntField(term13738, term13738.getClass(), "sourcePosition", -1);
        setField(term13738, term13738.getClass(), "jsType", null);
        setField(term13738, term13738.getClass(), "parent", term13736);
        setField(term13736, term13736.getClass(), "first", term13738);
        setField(term13736, term13736.getClass(), "last", term13738);
        setField(term13736, term13736.getClass(), "propListHead", null);
        setIntField(term13736, term13736.getClass(), "sourcePosition", -1);
        setField(term13736, term13736.getClass(), "jsType", null);
        setField(term13736, term13736.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "newUndefinedNode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term13736));
    }

};


