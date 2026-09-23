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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88946;
     Object term89016;
     Object term89086;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88946 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term89016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89016, term89016.getClass(), "type", 4);
        setField(term89016, term89016.getClass(), "first", null);
        term89086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89258 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term89360 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term89462 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term89564 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term89086, term89086.getClass(), "next", term89156);
        setIntField(term89258, term89258.getClass(), "propType", -1054196978);
        setIntField(term89360, term89360.getClass(), "propType", 51);
        setIntField(term89462, term89462.getClass(), "propType", -1054196978);
        setIntField(term89564, term89564.getClass(), "propType", 0);
        setField(term89564, term89564.getClass(), "next", null);
        setField(term89462, term89462.getClass(), "next", term89564);
        setField(term89360, term89360.getClass(), "next", term89462);
        setField(term89258, term89258.getClass(), "next", term89360);
        setField(term89086, term89086.getClass(), "propListHead", term89258);
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
        args[0] = term89016;
        args[1] = null;
        args[2] = term89086;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term88946, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


