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

public class NodeUtil_checkForStateChangeHelper_59481725505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42110;
     Object term42124;

    public NodeUtil_checkForStateChangeHelper_59481725505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42110, term42110.getClass(), "type", 71);
        term42124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42124, term42124.getClass(), "type", 71);
        setField(term42124, term42124.getClass(), "next", null);
        setField(term42124, term42124.getClass(), "first", null);
        setField(term42124, term42124.getClass(), "last", null);
        setField(term42124, term42124.getClass(), "propListHead", null);
        setIntField(term42124, term42124.getClass(), "sourcePosition", 0);
        setField(term42124, term42124.getClass(), "jsType", null);
        setField(term42124, term42124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42110;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term42110, term42124));
        assertTrue(recursiveEquals(retValue, true));
    }

};


