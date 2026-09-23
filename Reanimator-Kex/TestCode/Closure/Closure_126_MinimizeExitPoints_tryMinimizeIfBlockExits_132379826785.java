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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16429;
     Object term16499;
     Object term16591;
     Object term16683;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16429 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term16499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16499, term16499.getClass(), "type", 0);
        setField(term16499, term16499.getClass(), "first", null);
        term16591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term16683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16683, term16683.getClass(), "next", term16753);
        setField(term16683, term16683.getClass(), "propListHead", null);
        setIntField(term16683, term16683.getClass(), "sourcePosition", 0);
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
        args[0] = term16499;
        args[1] = term16591;
        args[2] = term16683;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term16429, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


