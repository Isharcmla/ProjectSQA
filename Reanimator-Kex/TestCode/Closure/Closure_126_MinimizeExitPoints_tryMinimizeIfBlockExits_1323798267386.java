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
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148634;
     Object term148704;
     Object term148774;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148634 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term148704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148704, term148704.getClass(), "type", 0);
        setField(term148704, term148704.getClass(), "first", null);
        term148774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148952 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term149060 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term149130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148844, term148844.getClass(), "type", 105);
        setField(term148774, term148774.getClass(), "next", term148844);
        setIntField(term148952, term148952.getClass(), "propType", 8388608);
        setIntField(term149060, term149060.getClass(), "propType", 0);
        setField(term149060, term149060.getClass(), "next", null);
        setField(term148952, term148952.getClass(), "next", term149060);
        setField(term148774, term148774.getClass(), "propListHead", term148952);
        setIntField(term148774, term148774.getClass(), "sourcePosition", 0);
        setField(term148774, term148774.getClass(), "last", null);
        setField(term148774, term148774.getClass(), "first", null);
        setField(term148774, term148774.getClass(), "parent", term149130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term148704;
        args[1] = null;
        args[2] = term148774;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term148634, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


