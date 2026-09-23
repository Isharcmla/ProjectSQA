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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3353;
     Object term3423;
     Object term3718;
     Object term3719;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3353 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term3423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3423, term3423.getClass(), "type", 0);
        term3718 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term3718, term3718.getClass(), "compiler", null);
        term3719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3719, term3719.getClass(), "type", 0);
        setField(term3719, term3719.getClass(), "next", null);
        setField(term3719, term3719.getClass(), "first", null);
        setField(term3719, term3719.getClass(), "last", null);
        setField(term3719, term3719.getClass(), "propListHead", null);
        setIntField(term3719, term3719.getClass(), "sourcePosition", 0);
        setField(term3719, term3719.getClass(), "jsType", null);
        setField(term3719, term3719.getClass(), "parent", null);
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
        args[0] = term3423;
        args[1] = null;
        args[2] = null;
        args[3] = 0;
        args[4] = "";
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term3353, args);
        assertTrue(recursiveEquals(term3353, term3718));
        assertTrue(recursiveEquals(term3423, term3719));
    }

};


