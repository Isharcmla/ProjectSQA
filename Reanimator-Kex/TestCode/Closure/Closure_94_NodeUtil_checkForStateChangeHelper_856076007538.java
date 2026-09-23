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

public class NodeUtil_checkForStateChangeHelper_856076007538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43008;
     Object term60111;

    public NodeUtil_checkForStateChangeHelper_856076007538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43008, term43008.getClass(), "type", 39);
        setField(term43008, term43008.getClass(), "first", term43078);
        term60111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60111, term60111.getClass(), "type", 39);
        setField(term60111, term60111.getClass(), "next", null);
        setIntField(term60112, term60112.getClass(), "type", 0);
        setField(term60112, term60112.getClass(), "next", null);
        setField(term60112, term60112.getClass(), "first", null);
        setField(term60112, term60112.getClass(), "last", null);
        setField(term60112, term60112.getClass(), "propListHead", null);
        setIntField(term60112, term60112.getClass(), "sourcePosition", 0);
        setField(term60112, term60112.getClass(), "jsType", null);
        setField(term60112, term60112.getClass(), "parent", null);
        setField(term60111, term60111.getClass(), "first", term60112);
        setField(term60111, term60111.getClass(), "last", null);
        setField(term60111, term60111.getClass(), "propListHead", null);
        setIntField(term60111, term60111.getClass(), "sourcePosition", 0);
        setField(term60111, term60111.getClass(), "jsType", null);
        setField(term60111, term60111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term43008;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term43008, term60111));
        assertTrue(recursiveEquals(retValue, true));
    }

};


