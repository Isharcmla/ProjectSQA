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

public class NodeUtil_checkForStateChangeHelper_59481725483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35753;
     Object term43848;

    public NodeUtil_checkForStateChangeHelper_59481725483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35753, term35753.getClass(), "type", 52);
        setField(term35753, term35753.getClass(), "first", term35823);
        term43848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43848, term43848.getClass(), "type", 52);
        setField(term43848, term43848.getClass(), "next", null);
        setIntField(term43849, term43849.getClass(), "type", 0);
        setField(term43849, term43849.getClass(), "next", null);
        setField(term43849, term43849.getClass(), "first", null);
        setField(term43849, term43849.getClass(), "last", null);
        setField(term43849, term43849.getClass(), "propListHead", null);
        setIntField(term43849, term43849.getClass(), "sourcePosition", 0);
        setField(term43849, term43849.getClass(), "jsType", null);
        setField(term43849, term43849.getClass(), "parent", null);
        setField(term43848, term43848.getClass(), "first", term43849);
        setField(term43848, term43848.getClass(), "last", null);
        setField(term43848, term43848.getClass(), "propListHead", null);
        setIntField(term43848, term43848.getClass(), "sourcePosition", 0);
        setField(term43848, term43848.getClass(), "jsType", null);
        setField(term43848, term43848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term35753;
        args[1] = false;
        Object retValue = callMethod(klass, "checkForStateChangeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term35753, term43848));
        assertTrue(recursiveEquals(retValue, true));
    }

};


