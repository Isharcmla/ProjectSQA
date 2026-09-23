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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113757;
     Object term113849;
     Object term113941;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113757 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term113849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term113849, term113849.getClass(), "type", 0);
        setField(term113849, term113849.getClass(), "first", null);
        term113941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term114011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term114011, term114011.getClass(), "type", 105);
        setField(term113941, term113941.getClass(), "next", term114011);
        setField(term113941, term113941.getClass(), "propListHead", null);
        setIntField(term113941, term113941.getClass(), "sourcePosition", 0);
        setField(term113941, term113941.getClass(), "last", null);
        setField(term113941, term113941.getClass(), "first", null);
        setField(term113941, term113941.getClass(), "parent", null);
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
        args[0] = term113849;
        args[1] = null;
        args[2] = term113941;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term113757, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


