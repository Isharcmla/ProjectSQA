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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541780;
     Object term541866;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term541866 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term541952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term542042 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term542042, term542042.getClass(), "type", 44);
        setField(term541952, term541952.getClass(), "next", term542042);
        setIntField(term541952, term541952.getClass(), "type", 0);
        setField(term541866, term541866.getClass(), "first", term541952);
        setIntField(term541866, term541866.getClass(), "type", 100);
        setField(term541866, term541866.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term541866;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term541780, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


