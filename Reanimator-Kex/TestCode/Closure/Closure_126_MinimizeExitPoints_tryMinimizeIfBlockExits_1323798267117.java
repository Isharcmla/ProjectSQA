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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28777;
     Object term28847;
     Object term29092;
     Object term28987;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28777 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term28847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28847, term28847.getClass(), "type", 4);
        setField(term28847, term28847.getClass(), "first", null);
        term29092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29092, term29092.getClass(), "type", 0);
        setField(term29092, term29092.getClass(), "propListHead", null);
        setIntField(term29092, term29092.getClass(), "sourcePosition", 0);
        setField(term29092, term29092.getClass(), "next", null);
        term28987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28987, term28987.getClass(), "next", term29057);
        setField(term28987, term28987.getClass(), "propListHead", null);
        setIntField(term28987, term28987.getClass(), "sourcePosition", 0);
        setField(term28987, term28987.getClass(), "first", term29092);
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
        args[0] = term28847;
        args[1] = term29092;
        args[2] = term28987;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term28777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


