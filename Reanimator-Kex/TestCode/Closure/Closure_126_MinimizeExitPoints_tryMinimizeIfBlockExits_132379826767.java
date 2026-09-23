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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10939;
     Object term11009;
     Object term11079;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10939 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term11009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11009, term11009.getClass(), "type", 0);
        setField(term11009, term11009.getClass(), "first", null);
        term11079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11149, term11149.getClass(), "type", 0);
        setField(term11079, term11079.getClass(), "next", term11149);
        setField(term11079, term11079.getClass(), "propListHead", null);
        setIntField(term11079, term11079.getClass(), "sourcePosition", 0);
        setField(term11079, term11079.getClass(), "last", null);
        setField(term11079, term11079.getClass(), "first", null);
        setField(term11079, term11079.getClass(), "parent", term11219);
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
        args[0] = term11009;
        args[1] = null;
        args[2] = term11079;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term10939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


