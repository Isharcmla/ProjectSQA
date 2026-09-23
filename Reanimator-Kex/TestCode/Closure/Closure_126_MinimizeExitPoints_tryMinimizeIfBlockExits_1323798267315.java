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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114168;
     Object term114260;
     Object term114352;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114168 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term114260 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term114260, term114260.getClass(), "type", 0);
        setField(term114260, term114260.getClass(), "first", null);
        term114352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114524 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term114626 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term114352, term114352.getClass(), "next", term114422);
        setIntField(term114524, term114524.getClass(), "propType", -41);
        setIntField(term114626, term114626.getClass(), "propType", 40);
        setField(term114524, term114524.getClass(), "next", term114626);
        setField(term114352, term114352.getClass(), "propListHead", term114524);
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
        args[0] = term114260;
        args[1] = null;
        args[2] = term114352;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term114168, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


