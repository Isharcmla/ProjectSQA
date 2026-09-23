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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147313;
     Object term147634;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147313 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term147634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147688 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term147742 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term147634, term147634.getClass(), "type", 0);
        setField(term147634, term147634.getClass(), "first", null);
        setField(term147634, term147634.getClass(), "next", term147634);
        setIntField(term147688, term147688.getClass(), "propType", 0);
        setIntField(term147742, term147742.getClass(), "propType", 51);
        setField(term147742, term147742.getClass(), "next", null);
        setField(term147688, term147688.getClass(), "next", term147742);
        setField(term147634, term147634.getClass(), "propListHead", term147688);
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
        args[0] = term147634;
        args[1] = null;
        args[2] = term147634;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term147313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


