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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668540;
     Object term668626;
     Object term668810;
     Object term668902;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668540 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term668626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term668718 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term668718, term668718.getClass(), "type", 108);
        setField(term668626, term668626.getClass(), "parent", term668718);
        setIntField(term668626, term668626.getClass(), "type", 0);
        term668810 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term668810, term668810.getClass(), "type", 85);
        term668902 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term668902, term668902.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term668626;
        args[1] = term668810;
        args[2] = term668902;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term668540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


