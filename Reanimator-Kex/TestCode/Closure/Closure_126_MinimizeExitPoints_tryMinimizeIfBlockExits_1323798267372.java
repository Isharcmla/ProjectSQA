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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143065;
     Object term143135;
     Object term143205;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143065 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term143135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143135, term143135.getClass(), "type", 0);
        setField(term143135, term143135.getClass(), "first", null);
        term143205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143313 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term143421 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term143205, term143205.getClass(), "next", term143205);
        setIntField(term143313, term143313.getClass(), "propType", -41);
        setIntField(term143421, term143421.getClass(), "propType", 40);
        setField(term143313, term143313.getClass(), "next", term143421);
        setField(term143205, term143205.getClass(), "propListHead", term143313);
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
        args[0] = term143135;
        args[1] = null;
        args[2] = term143205;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term143065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


