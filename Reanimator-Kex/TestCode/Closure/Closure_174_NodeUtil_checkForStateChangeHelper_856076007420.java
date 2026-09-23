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

public class NodeUtil_checkForStateChangeHelper_856076007420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36958;
     Object term58617;

    public NodeUtil_checkForStateChangeHelper_856076007420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36958, term36958.getClass(), "type", 41);
        term58617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58617, term58617.getClass(), "type", 41);
        setField(term58617, term58617.getClass(), "next", null);
        setField(term58617, term58617.getClass(), "first", null);
        setField(term58617, term58617.getClass(), "last", null);
        setField(term58617, term58617.getClass(), "propListHead", null);
        setIntField(term58617, term58617.getClass(), "sourcePosition", 0);
        setField(term58617, term58617.getClass(), "jsType", null);
        setField(term58617, term58617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term36958;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term36958, term58617));
        assertTrue(recursiveEquals(retValue, false));
    }

};


