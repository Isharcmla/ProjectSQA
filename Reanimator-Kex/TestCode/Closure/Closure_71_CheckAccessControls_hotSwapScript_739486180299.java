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

public class CheckAccessControls_hotSwapScript_739486180299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93139;
     Object term93209;

    public CheckAccessControls_hotSwapScript_739486180299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93139 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term93139, term93139.getClass(), "compiler", null);
        term93209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term93209, term93209.getClass(), "type", 0);
        setField(term93349, term93349.getClass(), "next", term93419);
        setIntField(term93349, term93349.getClass(), "type", 38);
        setField(term93349, term93349.getClass(), "first", null);
        setField(term93279, term93279.getClass(), "next", term93349);
        setIntField(term93279, term93279.getClass(), "type", 30);
        setField(term93279, term93279.getClass(), "first", null);
        setField(term93523, term93523.getClass(), "docInfo", null);
        setField(term93279, term93279.getClass(), "jsType", term93523);
        setField(term93209, term93209.getClass(), "first", term93279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93209;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term93139, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


