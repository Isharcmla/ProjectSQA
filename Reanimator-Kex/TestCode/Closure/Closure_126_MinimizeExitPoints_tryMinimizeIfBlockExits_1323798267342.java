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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126443;
     Object term126535;
     Object term126627;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126443 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term126535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term126535, term126535.getClass(), "type", 0);
        setField(term126535, term126535.getClass(), "first", null);
        term126627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126799 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term126627, term126627.getClass(), "next", term126697);
        setIntField(term126799, term126799.getClass(), "propType", 40);
        setField(term126627, term126627.getClass(), "propListHead", term126799);
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
        args[0] = term126535;
        args[1] = null;
        args[2] = term126627;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term126443, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


