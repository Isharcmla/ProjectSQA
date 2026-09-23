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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85736;
     Object term85828;
     Object term86220;
     Object term86082;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85736 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term85828 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term85828, term85828.getClass(), "type", 0);
        setField(term85828, term85828.getClass(), "first", null);
        term86220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86220, term86220.getClass(), "type", 0);
        setField(term86220, term86220.getClass(), "propListHead", null);
        setIntField(term86220, term86220.getClass(), "sourcePosition", 0);
        setField(term86220, term86220.getClass(), "next", term86255);
        setField(term86220, term86220.getClass(), "parent", null);
        term86082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term86325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86174, term86174.getClass(), "type", 105);
        setField(term86082, term86082.getClass(), "next", term86174);
        setField(term86082, term86082.getClass(), "propListHead", null);
        setIntField(term86082, term86082.getClass(), "sourcePosition", 0);
        setField(term86082, term86082.getClass(), "first", term86220);
        setField(term86082, term86082.getClass(), "last", null);
        setField(term86082, term86082.getClass(), "parent", term86325);
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
        args[0] = term85828;
        args[1] = term86220;
        args[2] = term86082;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term85736, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


