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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74289;
     Object term74359;
     Object term74429;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74289 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term74359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74359, term74359.getClass(), "type", 0);
        setField(term74359, term74359.getClass(), "first", null);
        term74429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74607 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term74715 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term74429, term74429.getClass(), "next", term74499);
        setIntField(term74607, term74607.getClass(), "propType", -41);
        setField(term74607, term74607.getClass(), "next", term74715);
        setField(term74429, term74429.getClass(), "propListHead", term74607);
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
        args[0] = term74359;
        args[1] = null;
        args[2] = term74429;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term74289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


