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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131492;
     Object term131562;
     Object term131632;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131492 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term131562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term131562, term131562.getClass(), "type", 0);
        setField(term131562, term131562.getClass(), "first", null);
        term131632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131810 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term131918 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term131632, term131632.getClass(), "next", term131702);
        setIntField(term131810, term131810.getClass(), "propType", 40);
        setField(term131810, term131810.getClass(), "objectValue", null);
        setField(term131810, term131810.getClass(), "next", term131918);
        setField(term131632, term131632.getClass(), "propListHead", term131810);
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
        args[0] = term131562;
        args[1] = null;
        args[2] = term131632;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term131492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


