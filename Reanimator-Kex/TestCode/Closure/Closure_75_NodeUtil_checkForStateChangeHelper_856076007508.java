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

public class NodeUtil_checkForStateChangeHelper_856076007508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39328;
     Object term77245;

    public NodeUtil_checkForStateChangeHelper_856076007508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39328, term39328.getClass(), "type", 101);
        term77245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77245, term77245.getClass(), "type", 101);
        setField(term77245, term77245.getClass(), "next", null);
        setField(term77245, term77245.getClass(), "first", null);
        setField(term77245, term77245.getClass(), "last", null);
        setField(term77245, term77245.getClass(), "propListHead", null);
        setIntField(term77245, term77245.getClass(), "sourcePosition", 0);
        setField(term77245, term77245.getClass(), "jsType", null);
        setField(term77245, term77245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term39328;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term39328, term77245));
        assertTrue(recursiveEquals(retValue, false));
    }

};


