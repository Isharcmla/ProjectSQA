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

public class MinimizeExitPoints_matchingExitNode_2001279290318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114715;
     Object term116762;

    public MinimizeExitPoints_matchingExitNode_2001279290318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114715, term114715.getClass(), "type", -5);
        setField(term114715, term114715.getClass(), "first", term114785);
        term116762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116762, term116762.getClass(), "type", -5);
        setField(term116762, term116762.getClass(), "next", null);
        setIntField(term116763, term116763.getClass(), "type", 0);
        setField(term116763, term116763.getClass(), "next", null);
        setField(term116763, term116763.getClass(), "first", null);
        setField(term116763, term116763.getClass(), "last", null);
        setField(term116763, term116763.getClass(), "propListHead", null);
        setIntField(term116763, term116763.getClass(), "sourcePosition", 0);
        setField(term116763, term116763.getClass(), "jsType", null);
        setField(term116763, term116763.getClass(), "parent", null);
        setField(term116762, term116762.getClass(), "first", term116763);
        setField(term116762, term116762.getClass(), "last", null);
        setField(term116762, term116762.getClass(), "propListHead", null);
        setIntField(term116762, term116762.getClass(), "sourcePosition", 0);
        setField(term116762, term116762.getClass(), "jsType", null);
        setField(term116762, term116762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term114715;
        args[1] = -5;
        args[2] = null;
        Object retValue = callMethod(klass, "matchingExitNode", argTypes, null, args);
        assertTrue(recursiveEquals(term114715, term116762));
        assertTrue(recursiveEquals(retValue, false));
    }

};


