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
import java.lang.Boolean;

public class NodeUtil_checkForStateChangeHelper_856076007178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object term476;
     Object term6879;

    public NodeUtil_checkForStateChangeHelper_856076007178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term455, term455.getClass(), "type", -507387516);
        setIntField(term457, term457.getClass(), "type", 114754804);
        setIntField(term459, term459.getClass(), "type", 0);
        setField(term459, term459.getClass(), "next", null);
        setField(term459, term459.getClass(), "first", null);
        setField(term459, term459.getClass(), "last", null);
        setField(term459, term459.getClass(), "propListHead", null);
        setIntField(term459, term459.getClass(), "sourcePosition", 0);
        setField(term459, term459.getClass(), "jsType", null);
        setField(term459, term459.getClass(), "parent", null);
        setField(term457, term457.getClass(), "next", term459);
        setIntField(term462, term462.getClass(), "type", 0);
        setField(term462, term462.getClass(), "next", null);
        setField(term462, term462.getClass(), "first", null);
        setField(term462, term462.getClass(), "last", null);
        setField(term462, term462.getClass(), "propListHead", null);
        setIntField(term462, term462.getClass(), "sourcePosition", 0);
        setField(term462, term462.getClass(), "jsType", null);
        setField(term462, term462.getClass(), "parent", null);
        setField(term457, term457.getClass(), "first", term462);
        setIntField(term465, term465.getClass(), "type", 0);
        setField(term465, term465.getClass(), "next", null);
        setField(term465, term465.getClass(), "first", null);
        setField(term465, term465.getClass(), "last", null);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        setField(term457, term457.getClass(), "last", term465);
        setField(term457, term457.getClass(), "propListHead", null);
        setIntField(term457, term457.getClass(), "sourcePosition", 0);
        setField(term457, term457.getClass(), "jsType", null);
        setField(term457, term457.getClass(), "parent", null);
        setField(term455, term455.getClass(), "next", term457);
        setIntField(term469, term469.getClass(), "type", 0);
        setField(term469, term469.getClass(), "next", null);
        setField(term469, term469.getClass(), "first", null);
        setField(term469, term469.getClass(), "last", null);
        setField(term469, term469.getClass(), "propListHead", null);
        setIntField(term469, term469.getClass(), "sourcePosition", 0);
        setField(term469, term469.getClass(), "jsType", null);
        setField(term469, term469.getClass(), "parent", null);
        setField(term455, term455.getClass(), "first", term469);
        setIntField(term472, term472.getClass(), "type", 0);
        setField(term472, term472.getClass(), "next", null);
        setField(term472, term472.getClass(), "first", null);
        setField(term472, term472.getClass(), "last", null);
        setField(term472, term472.getClass(), "propListHead", null);
        setIntField(term472, term472.getClass(), "sourcePosition", 0);
        setField(term472, term472.getClass(), "jsType", null);
        setField(term472, term472.getClass(), "parent", null);
        setField(term455, term455.getClass(), "last", term472);
        setField(term455, term455.getClass(), "propListHead", null);
        setIntField(term455, term455.getClass(), "sourcePosition", 0);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        term476 = new Boolean(false);
        term6879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6879, term6879.getClass(), "type", -507387516);
        setIntField(term6880, term6880.getClass(), "type", 114754804);
        setIntField(term6881, term6881.getClass(), "type", 0);
        setField(term6881, term6881.getClass(), "next", null);
        setField(term6881, term6881.getClass(), "first", null);
        setField(term6881, term6881.getClass(), "last", null);
        setField(term6881, term6881.getClass(), "propListHead", null);
        setIntField(term6881, term6881.getClass(), "sourcePosition", 0);
        setField(term6881, term6881.getClass(), "jsType", null);
        setField(term6881, term6881.getClass(), "parent", null);
        setField(term6880, term6880.getClass(), "next", term6881);
        setIntField(term6882, term6882.getClass(), "type", 0);
        setField(term6882, term6882.getClass(), "next", null);
        setField(term6882, term6882.getClass(), "first", null);
        setField(term6882, term6882.getClass(), "last", null);
        setField(term6882, term6882.getClass(), "propListHead", null);
        setIntField(term6882, term6882.getClass(), "sourcePosition", 0);
        setField(term6882, term6882.getClass(), "jsType", null);
        setField(term6882, term6882.getClass(), "parent", null);
        setField(term6880, term6880.getClass(), "first", term6882);
        setIntField(term6883, term6883.getClass(), "type", 0);
        setField(term6883, term6883.getClass(), "next", null);
        setField(term6883, term6883.getClass(), "first", null);
        setField(term6883, term6883.getClass(), "last", null);
        setField(term6883, term6883.getClass(), "propListHead", null);
        setIntField(term6883, term6883.getClass(), "sourcePosition", 0);
        setField(term6883, term6883.getClass(), "jsType", null);
        setField(term6883, term6883.getClass(), "parent", null);
        setField(term6880, term6880.getClass(), "last", term6883);
        setField(term6880, term6880.getClass(), "propListHead", null);
        setIntField(term6880, term6880.getClass(), "sourcePosition", 0);
        setField(term6880, term6880.getClass(), "jsType", null);
        setField(term6880, term6880.getClass(), "parent", null);
        setField(term6879, term6879.getClass(), "next", term6880);
        setIntField(term6884, term6884.getClass(), "type", 0);
        setField(term6884, term6884.getClass(), "next", null);
        setField(term6884, term6884.getClass(), "first", null);
        setField(term6884, term6884.getClass(), "last", null);
        setField(term6884, term6884.getClass(), "propListHead", null);
        setIntField(term6884, term6884.getClass(), "sourcePosition", 0);
        setField(term6884, term6884.getClass(), "jsType", null);
        setField(term6884, term6884.getClass(), "parent", null);
        setField(term6879, term6879.getClass(), "first", term6884);
        setIntField(term6885, term6885.getClass(), "type", 0);
        setField(term6885, term6885.getClass(), "next", null);
        setField(term6885, term6885.getClass(), "first", null);
        setField(term6885, term6885.getClass(), "last", null);
        setField(term6885, term6885.getClass(), "propListHead", null);
        setIntField(term6885, term6885.getClass(), "sourcePosition", 0);
        setField(term6885, term6885.getClass(), "jsType", null);
        setField(term6885, term6885.getClass(), "parent", null);
        setField(term6879, term6879.getClass(), "last", term6885);
        setField(term6879, term6879.getClass(), "propListHead", null);
        setIntField(term6879, term6879.getClass(), "sourcePosition", 0);
        setField(term6879, term6879.getClass(), "jsType", null);
        setField(term6879, term6879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term455;
        args[1] = term476;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term455, term6879));
        assertTrue(recursiveEquals(term476, false));
        assertTrue(recursiveEquals(retValue, true));
    }

};


