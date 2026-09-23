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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25777;
     Object term25847;
     Object term26092;
     Object term25987;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25777 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term25847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25847, term25847.getClass(), "type", 0);
        setField(term25847, term25847.getClass(), "first", null);
        term26092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26092, term26092.getClass(), "type", 0);
        setField(term26092, term26092.getClass(), "propListHead", null);
        setIntField(term26092, term26092.getClass(), "sourcePosition", 0);
        setField(term26092, term26092.getClass(), "next", null);
        setField(term26092, term26092.getClass(), "parent", null);
        term25987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26057, term26057.getClass(), "type", 0);
        setField(term25987, term25987.getClass(), "next", term26057);
        setField(term25987, term25987.getClass(), "propListHead", null);
        setIntField(term25987, term25987.getClass(), "sourcePosition", 0);
        setField(term25987, term25987.getClass(), "first", term26092);
        setField(term25987, term25987.getClass(), "last", null);
        setField(term25987, term25987.getClass(), "parent", term26162);
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
        args[0] = term25847;
        args[1] = term26092;
        args[2] = term25987;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term25777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


