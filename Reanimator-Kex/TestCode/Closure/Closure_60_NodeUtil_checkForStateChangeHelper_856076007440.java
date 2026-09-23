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

public class NodeUtil_checkForStateChangeHelper_856076007440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64627;
     Object term64638;

    public NodeUtil_checkForStateChangeHelper_856076007440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64627, term64627.getClass(), "type", 83);
        term64638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64638, term64638.getClass(), "type", 83);
        setField(term64638, term64638.getClass(), "next", null);
        setField(term64638, term64638.getClass(), "first", null);
        setField(term64638, term64638.getClass(), "last", null);
        setField(term64638, term64638.getClass(), "propListHead", null);
        setIntField(term64638, term64638.getClass(), "sourcePosition", 0);
        setField(term64638, term64638.getClass(), "jsType", null);
        setField(term64638, term64638.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term64627;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term64627, term64638));
        assertTrue(recursiveEquals(retValue, false));
    }

};


