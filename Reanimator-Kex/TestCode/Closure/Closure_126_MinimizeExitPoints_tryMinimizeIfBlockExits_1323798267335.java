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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123168;
     Object term123238;
     Object term123330;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123168 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term123238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123238, term123238.getClass(), "type", 0);
        setField(term123238, term123238.getClass(), "first", null);
        term123330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123502 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term123604 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term123330, term123330.getClass(), "next", term123400);
        setIntField(term123502, term123502.getClass(), "propType", -41);
        setIntField(term123604, term123604.getClass(), "propType", 40);
        setField(term123502, term123502.getClass(), "next", term123604);
        setField(term123330, term123330.getClass(), "propListHead", term123502);
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
        args[0] = term123238;
        args[1] = null;
        args[2] = term123330;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term123168, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


