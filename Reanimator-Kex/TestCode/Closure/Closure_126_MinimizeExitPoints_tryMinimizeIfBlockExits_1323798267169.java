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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50221;
     Object term50313;
     Object term50405;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50221 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term50313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term50313, term50313.getClass(), "type", 0);
        setField(term50313, term50313.getClass(), "first", null);
        term50405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50475, term50475.getClass(), "type", 0);
        setField(term50405, term50405.getClass(), "next", term50475);
        setField(term50405, term50405.getClass(), "propListHead", null);
        setIntField(term50405, term50405.getClass(), "sourcePosition", 0);
        setField(term50405, term50405.getClass(), "last", null);
        setField(term50405, term50405.getClass(), "first", null);
        setField(term50405, term50405.getClass(), "parent", term50475);
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
        args[0] = term50313;
        args[1] = null;
        args[2] = term50405;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term50221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


