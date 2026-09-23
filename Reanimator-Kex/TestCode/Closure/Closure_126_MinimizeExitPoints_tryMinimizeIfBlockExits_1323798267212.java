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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68157;
     Object term68227;
     Object term68249;
     Object term68250;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68157 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term68227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68227, term68227.getClass(), "type", 0);
        setField(term68227, term68227.getClass(), "first", term68227);
        term68249 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term68249, term68249.getClass(), "compiler", null);
        term68250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68250, term68250.getClass(), "type", 0);
        setField(term68250, term68250.getClass(), "next", null);
        setField(term68250, term68250.getClass(), "first", term68250);
        setField(term68250, term68250.getClass(), "last", null);
        setField(term68250, term68250.getClass(), "propListHead", null);
        setIntField(term68250, term68250.getClass(), "sourcePosition", 0);
        setField(term68250, term68250.getClass(), "jsType", null);
        setField(term68250, term68250.getClass(), "parent", null);
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
        args[0] = term68227;
        args[1] = null;
        args[2] = null;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term68157, args);
        assertTrue(recursiveEquals(term68157, term68249));
        assertTrue(recursiveEquals(term68227, term68250));
    }

};


