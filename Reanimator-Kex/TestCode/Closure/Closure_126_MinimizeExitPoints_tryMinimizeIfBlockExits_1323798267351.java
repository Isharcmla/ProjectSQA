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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130210;
     Object term130779;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130210 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term130779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130868 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term130922 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term130779, term130779.getClass(), "type", 0);
        setField(term130779, term130779.getClass(), "first", null);
        setField(term130779, term130779.getClass(), "next", term130814);
        setIntField(term130868, term130868.getClass(), "propType", 0);
        setIntField(term130922, term130922.getClass(), "propType", 0);
        setField(term130922, term130922.getClass(), "next", null);
        setField(term130868, term130868.getClass(), "next", term130922);
        setField(term130779, term130779.getClass(), "propListHead", term130868);
        setIntField(term130779, term130779.getClass(), "sourcePosition", 0);
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
        args[0] = term130779;
        args[1] = term130779;
        args[2] = term130779;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term130210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


