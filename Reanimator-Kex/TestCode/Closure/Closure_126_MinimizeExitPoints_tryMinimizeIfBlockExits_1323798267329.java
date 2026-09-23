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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119792;
     Object term119862;
     Object term119932;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119792 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term119862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term119862, term119862.getClass(), "type", 4);
        setField(term119862, term119862.getClass(), "first", null);
        term119932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term120104 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term120206 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term120308 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term119932, term119932.getClass(), "next", term120002);
        setIntField(term120104, term120104.getClass(), "propType", 0);
        setIntField(term120206, term120206.getClass(), "propType", 51);
        setIntField(term120308, term120308.getClass(), "propType", 0);
        setField(term120308, term120308.getClass(), "next", null);
        setField(term120206, term120206.getClass(), "next", term120308);
        setField(term120104, term120104.getClass(), "next", term120206);
        setField(term119932, term119932.getClass(), "propListHead", term120104);
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
        args[0] = term119862;
        args[1] = null;
        args[2] = term119932;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term119792, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


