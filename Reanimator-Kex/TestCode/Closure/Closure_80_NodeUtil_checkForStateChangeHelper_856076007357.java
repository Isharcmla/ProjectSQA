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

public class NodeUtil_checkForStateChangeHelper_856076007357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32795;
     Object term32824;

    public NodeUtil_checkForStateChangeHelper_856076007357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32795, term32795.getClass(), "type", 119);
        term32824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32824, term32824.getClass(), "type", 119);
        setField(term32824, term32824.getClass(), "next", null);
        setField(term32824, term32824.getClass(), "first", null);
        setField(term32824, term32824.getClass(), "last", null);
        setField(term32824, term32824.getClass(), "propListHead", null);
        setIntField(term32824, term32824.getClass(), "sourcePosition", 0);
        setField(term32824, term32824.getClass(), "jsType", null);
        setField(term32824, term32824.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term32795;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term32795, term32824));
        assertTrue(recursiveEquals(retValue, true));
    }

};


