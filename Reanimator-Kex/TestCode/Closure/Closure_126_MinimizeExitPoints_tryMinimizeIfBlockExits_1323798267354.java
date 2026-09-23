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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132599;
     Object term132691;
     Object term132761;
     Object term132853;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132599 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term132691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term132691, term132691.getClass(), "type", 0);
        setField(term132691, term132691.getClass(), "first", null);
        term132761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term132853 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133025 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term133127 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term132853, term132853.getClass(), "next", term132923);
        setIntField(term133025, term133025.getClass(), "propType", 0);
        setIntField(term133127, term133127.getClass(), "propType", 0);
        setField(term133127, term133127.getClass(), "next", null);
        setField(term133025, term133025.getClass(), "next", term133127);
        setField(term132853, term132853.getClass(), "propListHead", term133025);
        setIntField(term132853, term132853.getClass(), "sourcePosition", 0);
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
        args[0] = term132691;
        args[1] = term132761;
        args[2] = term132853;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term132599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


