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

public class NodeUtil_checkForStateChangeHelper_59481725329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25978;
     Object term25995;

    public NodeUtil_checkForStateChangeHelper_59481725329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25978, term25978.getClass(), "type", 56);
        term25995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25995, term25995.getClass(), "type", 56);
        setField(term25995, term25995.getClass(), "next", null);
        setField(term25995, term25995.getClass(), "first", null);
        setField(term25995, term25995.getClass(), "last", null);
        setField(term25995, term25995.getClass(), "propListHead", null);
        setIntField(term25995, term25995.getClass(), "sourcePosition", 0);
        setField(term25995, term25995.getClass(), "jsType", null);
        setField(term25995, term25995.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term25978;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term25978, term25995));
        assertTrue(recursiveEquals(retValue, true));
    }

};


