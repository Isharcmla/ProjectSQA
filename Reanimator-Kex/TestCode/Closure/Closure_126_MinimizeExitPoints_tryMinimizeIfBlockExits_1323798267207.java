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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66717;
     Object term66809;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66717 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term66809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term66901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66809, term66809.getClass(), "type", 0);
        setField(term66809, term66809.getClass(), "first", term66901);
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
        args[0] = term66809;
        args[1] = null;
        args[2] = null;
        args[3] = 0;
        args[4] = "";
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term66717, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


