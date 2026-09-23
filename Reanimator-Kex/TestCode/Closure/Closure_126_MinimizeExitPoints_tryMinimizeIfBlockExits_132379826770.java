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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11944;
     Object term12154;
     Object term12119;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11944 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term12154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12154, term12154.getClass(), "type", 0);
        setField(term12154, term12154.getClass(), "first", null);
        term12119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12119, term12119.getClass(), "next", term12154);
        setField(term12119, term12119.getClass(), "propListHead", null);
        setIntField(term12119, term12119.getClass(), "sourcePosition", 0);
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
        args[0] = term12154;
        args[1] = term12154;
        args[2] = term12119;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term11944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


