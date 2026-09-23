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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62808;
     Object term62878;
     Object term62970;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62808 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term62878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62878, term62878.getClass(), "type", 0);
        setField(term62878, term62878.getClass(), "first", null);
        term62970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term63040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63142 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term63244 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term62970, term62970.getClass(), "next", term63040);
        setIntField(term63142, term63142.getClass(), "propType", 0);
        setIntField(term63244, term63244.getClass(), "propType", 51);
        setField(term63244, term63244.getClass(), "next", null);
        setField(term63142, term63142.getClass(), "next", term63244);
        setField(term62970, term62970.getClass(), "propListHead", term63142);
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
        args[0] = term62878;
        args[1] = null;
        args[2] = term62970;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term62808, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


