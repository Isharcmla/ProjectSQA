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

public class NodeUtil_getInfoForNameNode_2009241699639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4805335;
     Object term4805457;

    public NodeUtil_getInfoForNameNode_2009241699639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4805335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4805437 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term4805335, term4805335.getClass(), "propListHead", term4805437);
        term4805457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4805458 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term4805457, term4805457.getClass(), "type", 0);
        setField(term4805457, term4805457.getClass(), "next", null);
        setField(term4805457, term4805457.getClass(), "first", null);
        setField(term4805457, term4805457.getClass(), "last", null);
        setIntField(term4805458, term4805458.getClass(), "intValue", 0);
        setField(term4805458, term4805458.getClass(), "next", null);
        setIntField(term4805458, term4805458.getClass(), "propType", 0);
        setField(term4805457, term4805457.getClass(), "propListHead", term4805458);
        setIntField(term4805457, term4805457.getClass(), "sourcePosition", 0);
        setField(term4805457, term4805457.getClass(), "jsType", null);
        setField(term4805457, term4805457.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4805335;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term4805335, term4805457));
        assertTrue(recursiveEquals(retValue, null));
    }

};


