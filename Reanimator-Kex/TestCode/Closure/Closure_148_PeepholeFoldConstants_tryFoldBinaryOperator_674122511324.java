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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63702;
     Object term63792;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63702 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63792 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term63882 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term63972 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term63972, term63972.getClass(), "type", 39);
        setField(term63882, term63882.getClass(), "next", term63972);
        setIntField(term63882, term63882.getClass(), "type", 39);
        setField(term63792, term63792.getClass(), "first", term63882);
        setIntField(term63792, term63792.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63792;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term63702, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


