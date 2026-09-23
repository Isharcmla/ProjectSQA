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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38521;
     Object term38591;
     Object term38938;
     Object term38731;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38521 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term38591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38591, term38591.getClass(), "type", 4);
        setField(term38591, term38591.getClass(), "first", null);
        term38938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38938, term38938.getClass(), "type", 0);
        setField(term38938, term38938.getClass(), "propListHead", null);
        setIntField(term38938, term38938.getClass(), "sourcePosition", 0);
        setField(term38938, term38938.getClass(), "next", null);
        term38731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38903 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term38731, term38731.getClass(), "next", term38801);
        setIntField(term38903, term38903.getClass(), "propType", 0);
        setField(term38903, term38903.getClass(), "next", null);
        setField(term38731, term38731.getClass(), "propListHead", term38903);
        setIntField(term38731, term38731.getClass(), "sourcePosition", 0);
        setField(term38731, term38731.getClass(), "first", term38938);
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
        args[0] = term38591;
        args[1] = term38938;
        args[2] = term38731;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term38521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


