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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139919;
     Object term139989;
     Object term140234;
     Object term140129;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139919 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term139989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139989, term139989.getClass(), "type", 4);
        setField(term139989, term139989.getClass(), "first", null);
        term140234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140234, term140234.getClass(), "type", 0);
        setField(term140234, term140234.getClass(), "propListHead", null);
        setIntField(term140234, term140234.getClass(), "sourcePosition", 0);
        setField(term140234, term140234.getClass(), "next", null);
        setField(term140234, term140234.getClass(), "parent", null);
        term140129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140199, term140199.getClass(), "type", 105);
        setField(term140129, term140129.getClass(), "next", term140199);
        setField(term140129, term140129.getClass(), "propListHead", null);
        setIntField(term140129, term140129.getClass(), "sourcePosition", 0);
        setField(term140129, term140129.getClass(), "first", term140234);
        setField(term140129, term140129.getClass(), "last", term140304);
        setField(term140129, term140129.getClass(), "parent", null);
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
        args[0] = term139989;
        args[1] = term140234;
        args[2] = term140129;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term139919, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


