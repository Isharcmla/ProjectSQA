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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19362;
     Object term19432;
     Object term19502;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19362 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term19432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19432, term19432.getClass(), "type", 4);
        setField(term19432, term19432.getClass(), "first", null);
        term19502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19674 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term19502, term19502.getClass(), "next", term19572);
        setIntField(term19674, term19674.getClass(), "propType", 51);
        setField(term19674, term19674.getClass(), "next", null);
        setField(term19502, term19502.getClass(), "propListHead", term19674);
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
        args[0] = term19432;
        args[1] = null;
        args[2] = term19502;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term19362, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


