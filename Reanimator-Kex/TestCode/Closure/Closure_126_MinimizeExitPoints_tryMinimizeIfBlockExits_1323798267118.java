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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29685;
     Object term29755;
     Object term29825;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29685 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term29755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29755, term29755.getClass(), "type", 4);
        setField(term29755, term29755.getClass(), "first", null);
        term29825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29997 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term30099 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term29825, term29825.getClass(), "next", term29895);
        setIntField(term29997, term29997.getClass(), "propType", -41);
        setField(term29997, term29997.getClass(), "next", term30099);
        setField(term29825, term29825.getClass(), "propListHead", term29997);
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
        args[0] = term29755;
        args[1] = null;
        args[2] = term29825;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term29685, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


