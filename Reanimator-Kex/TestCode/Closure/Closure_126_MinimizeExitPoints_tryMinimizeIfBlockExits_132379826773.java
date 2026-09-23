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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13043;
     Object term13183;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13043 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term13183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13183, term13183.getClass(), "type", 4);
        setField(term13183, term13183.getClass(), "first", null);
        setField(term13183, term13183.getClass(), "next", term13183);
        setField(term13183, term13183.getClass(), "propListHead", null);
        setIntField(term13183, term13183.getClass(), "sourcePosition", 0);
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
        args[0] = term13183;
        args[1] = term13183;
        args[2] = term13183;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term13043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


