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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101039;
     Object term101131;
     Object term101223;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101039 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term101131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term101131, term101131.getClass(), "type", 0);
        setField(term101131, term101131.getClass(), "first", null);
        term101223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101401 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term101509 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term101579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101293, term101293.getClass(), "type", 0);
        setField(term101223, term101223.getClass(), "next", term101293);
        setIntField(term101401, term101401.getClass(), "propType", 40);
        setField(term101401, term101401.getClass(), "objectValue", null);
        setIntField(term101509, term101509.getClass(), "propType", 0);
        setField(term101509, term101509.getClass(), "next", null);
        setField(term101401, term101401.getClass(), "next", term101509);
        setField(term101223, term101223.getClass(), "propListHead", term101401);
        setIntField(term101223, term101223.getClass(), "sourcePosition", 0);
        setField(term101223, term101223.getClass(), "last", null);
        setField(term101223, term101223.getClass(), "first", null);
        setField(term101223, term101223.getClass(), "parent", term101579);
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
        args[0] = term101131;
        args[1] = null;
        args[2] = term101223;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term101039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


