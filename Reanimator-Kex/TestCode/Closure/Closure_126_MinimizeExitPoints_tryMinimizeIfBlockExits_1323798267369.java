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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140983;
     Object term141053;
     Object term141123;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140983 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term141053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141053, term141053.getClass(), "type", 4);
        setField(term141053, term141053.getClass(), "first", null);
        term141123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141295 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term141397 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term141499 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term141601 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term141671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141193, term141193.getClass(), "type", 0);
        setField(term141123, term141123.getClass(), "next", term141193);
        setIntField(term141295, term141295.getClass(), "propType", 1073741824);
        setIntField(term141397, term141397.getClass(), "propType", 4194304);
        setIntField(term141499, term141499.getClass(), "propType", 1);
        setIntField(term141601, term141601.getClass(), "propType", 0);
        setField(term141601, term141601.getClass(), "next", null);
        setField(term141499, term141499.getClass(), "next", term141601);
        setField(term141397, term141397.getClass(), "next", term141499);
        setField(term141295, term141295.getClass(), "next", term141397);
        setField(term141123, term141123.getClass(), "propListHead", term141295);
        setIntField(term141123, term141123.getClass(), "sourcePosition", 0);
        setField(term141123, term141123.getClass(), "last", null);
        setField(term141123, term141123.getClass(), "first", null);
        setField(term141123, term141123.getClass(), "parent", term141671);
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
        args[0] = term141053;
        args[1] = null;
        args[2] = term141123;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term140983, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


