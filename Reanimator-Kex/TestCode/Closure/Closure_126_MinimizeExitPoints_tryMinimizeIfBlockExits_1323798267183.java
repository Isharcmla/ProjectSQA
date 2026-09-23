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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56077;
     Object term56147;
     Object term56217;
     Object term56389;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56077 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term56147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56147, term56147.getClass(), "type", 4);
        setField(term56147, term56147.getClass(), "first", null);
        term56217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56319 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term56217, term56217.getClass(), "type", 0);
        setField(term56217, term56217.getClass(), "propListHead", term56319);
        term56389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56389, term56389.getClass(), "next", term56459);
        setField(term56389, term56389.getClass(), "propListHead", null);
        setIntField(term56389, term56389.getClass(), "sourcePosition", 0);
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
        args[0] = term56147;
        args[1] = term56217;
        args[2] = term56389;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term56077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


