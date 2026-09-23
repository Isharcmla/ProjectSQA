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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768520;
     Object term768606;
     Object term768790;
     Object term768882;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term768606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term768698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term768698, term768698.getClass(), "type", 108);
        setField(term768606, term768606.getClass(), "parent", term768698);
        setIntField(term768606, term768606.getClass(), "type", 101);
        term768790 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term768790, term768790.getClass(), "type", 0);
        term768882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term768882, term768882.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term768606;
        args[1] = term768790;
        args[2] = term768882;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term768520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


