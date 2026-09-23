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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636489;
     Object term636575;
     Object term636759;
     Object term636851;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term636575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term636667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term636667, term636667.getClass(), "type", 108);
        setField(term636575, term636575.getClass(), "parent", term636667);
        setIntField(term636575, term636575.getClass(), "type", 100);
        term636759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term636759, term636759.getClass(), "type", 86);
        term636851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term636851, term636851.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term636575;
        args[1] = term636759;
        args[2] = term636851;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term636489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


