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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41213;
     Object term41283;
     Object term41528;
     Object term41423;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41213 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term41283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41283, term41283.getClass(), "type", 4);
        setField(term41283, term41283.getClass(), "first", null);
        term41528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41528, term41528.getClass(), "type", 0);
        setField(term41528, term41528.getClass(), "propListHead", null);
        setIntField(term41528, term41528.getClass(), "sourcePosition", 0);
        setField(term41528, term41528.getClass(), "next", null);
        setField(term41528, term41528.getClass(), "parent", null);
        term41423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41493, term41493.getClass(), "type", 0);
        setField(term41423, term41423.getClass(), "next", term41493);
        setField(term41423, term41423.getClass(), "propListHead", null);
        setIntField(term41423, term41423.getClass(), "sourcePosition", 0);
        setField(term41423, term41423.getClass(), "first", term41528);
        setField(term41423, term41423.getClass(), "last", term41598);
        setField(term41423, term41423.getClass(), "parent", term41668);
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
        args[0] = term41283;
        args[1] = term41528;
        args[2] = term41423;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term41213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


