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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13348;
     Object term13418;
     Object term13488;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13348 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term13418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13418, term13418.getClass(), "type", 4);
        setField(term13418, term13418.getClass(), "first", null);
        term13488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13558, term13558.getClass(), "type", 0);
        setField(term13488, term13488.getClass(), "next", term13558);
        setField(term13488, term13488.getClass(), "propListHead", null);
        setIntField(term13488, term13488.getClass(), "sourcePosition", 0);
        setField(term13488, term13488.getClass(), "last", null);
        setField(term13488, term13488.getClass(), "first", null);
        setField(term13488, term13488.getClass(), "parent", term13628);
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
        args[0] = term13418;
        args[1] = null;
        args[2] = term13488;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term13348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


