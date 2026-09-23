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

public class NodeUtil_checkForStateChangeHelper_856076007369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33182;
     Object term33203;

    public NodeUtil_checkForStateChangeHelper_856076007369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33182, term33182.getClass(), "type", 62);
        term33203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33203, term33203.getClass(), "type", 62);
        setField(term33203, term33203.getClass(), "next", null);
        setField(term33203, term33203.getClass(), "first", null);
        setField(term33203, term33203.getClass(), "last", null);
        setField(term33203, term33203.getClass(), "propListHead", null);
        setIntField(term33203, term33203.getClass(), "sourcePosition", 0);
        setField(term33203, term33203.getClass(), "jsType", null);
        setField(term33203, term33203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term33182;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term33182, term33203));
        assertTrue(recursiveEquals(retValue, true));
    }

};


