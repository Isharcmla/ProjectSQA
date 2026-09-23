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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116364;
     Object term116434;
     Object term116504;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116364 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term116434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116434, term116434.getClass(), "type", 4);
        setField(term116434, term116434.getClass(), "first", null);
        term116504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116676 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term116746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116574, term116574.getClass(), "type", 105);
        setField(term116504, term116504.getClass(), "next", term116574);
        setIntField(term116676, term116676.getClass(), "propType", 0);
        setField(term116676, term116676.getClass(), "next", null);
        setField(term116504, term116504.getClass(), "propListHead", term116676);
        setIntField(term116504, term116504.getClass(), "sourcePosition", 0);
        setField(term116504, term116504.getClass(), "last", null);
        setField(term116504, term116504.getClass(), "first", term116746);
        setField(term116504, term116504.getClass(), "parent", null);
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
        args[0] = term116434;
        args[1] = null;
        args[2] = term116504;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term116364, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


