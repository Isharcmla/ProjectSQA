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

public class NodeUtil_checkForStateChangeHelper_856076007497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38456;
     Object term76097;

    public NodeUtil_checkForStateChangeHelper_856076007497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38456, term38456.getClass(), "type", 123);
        term76097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76097, term76097.getClass(), "type", 123);
        setField(term76097, term76097.getClass(), "next", null);
        setField(term76097, term76097.getClass(), "first", null);
        setField(term76097, term76097.getClass(), "last", null);
        setField(term76097, term76097.getClass(), "propListHead", null);
        setIntField(term76097, term76097.getClass(), "sourcePosition", 0);
        setField(term76097, term76097.getClass(), "jsType", null);
        setField(term76097, term76097.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term38456;
        args[1] = false;
        args[2] = null;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term38456, term76097));
        assertTrue(recursiveEquals(retValue, true));
    }

};


