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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110368;
     Object term110759;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110368 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term110759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110848 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term110902 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term110759, term110759.getClass(), "type", 0);
        setField(term110759, term110759.getClass(), "first", null);
        setField(term110759, term110759.getClass(), "next", term110794);
        setIntField(term110848, term110848.getClass(), "propType", 51);
        setIntField(term110902, term110902.getClass(), "propType", 0);
        setField(term110902, term110902.getClass(), "next", null);
        setField(term110848, term110848.getClass(), "next", term110902);
        setField(term110759, term110759.getClass(), "propListHead", term110848);
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
        args[0] = term110759;
        args[1] = null;
        args[2] = term110759;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term110368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


