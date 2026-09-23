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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601369;
     Object term601461;
     Object term601547;
     Object term601633;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601369 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term601461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term601461, term601461.getClass(), "parent", null);
        setIntField(term601461, term601461.getClass(), "type", 0);
        term601547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term601547, term601547.getClass(), "type", 0);
        term601633 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term601633, term601633.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term601461;
        args[1] = term601547;
        args[2] = term601633;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term601369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


