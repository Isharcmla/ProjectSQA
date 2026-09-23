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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714085;
     Object term714171;
     Object term714349;
     Object term714441;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714085 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term714171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term714257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term714257, term714257.getClass(), "type", 113);
        setField(term714171, term714171.getClass(), "parent", term714257);
        setIntField(term714171, term714171.getClass(), "type", 0);
        term714349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term714349, term714349.getClass(), "type", 46);
        term714441 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term714441, term714441.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term714171;
        args[1] = term714349;
        args[2] = term714441;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term714085, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


