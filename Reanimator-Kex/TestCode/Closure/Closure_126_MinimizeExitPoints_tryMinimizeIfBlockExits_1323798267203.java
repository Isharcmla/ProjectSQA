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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65290;
     Object term65360;
     Object term66169;
     Object term66170;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65290 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term65360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65360, term65360.getClass(), "type", 4);
        setField(term65360, term65360.getClass(), "first", term65360);
        term66169 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term66169, term66169.getClass(), "compiler", null);
        term66170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66170, term66170.getClass(), "type", 4);
        setField(term66170, term66170.getClass(), "next", null);
        setField(term66170, term66170.getClass(), "first", term66170);
        setField(term66170, term66170.getClass(), "last", null);
        setField(term66170, term66170.getClass(), "propListHead", null);
        setIntField(term66170, term66170.getClass(), "sourcePosition", 0);
        setField(term66170, term66170.getClass(), "jsType", null);
        setField(term66170, term66170.getClass(), "parent", null);
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
        args[0] = term65360;
        args[1] = null;
        args[2] = null;
        args[3] = 4;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term65290, args);
        assertTrue(recursiveEquals(term65290, term66169));
        assertTrue(recursiveEquals(term65360, term66170));
    }

};


