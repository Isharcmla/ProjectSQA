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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172779;
     Object term172869;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172779 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term172869 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term172959 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term173049 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term173049, term173049.getClass(), "type", 39);
        setField(term172959, term172959.getClass(), "next", term173049);
        setIntField(term172959, term172959.getClass(), "type", 39);
        setField(term172869, term172869.getClass(), "first", term172959);
        setIntField(term172869, term172869.getClass(), "type", 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term172869;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term172779, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


