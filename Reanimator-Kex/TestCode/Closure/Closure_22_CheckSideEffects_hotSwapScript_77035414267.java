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

public class CheckSideEffects_hotSwapScript_77035414267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30526;
     Object term30596;

    public CheckSideEffects_hotSwapScript_77035414267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30526 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term30526, term30526.getClass(), "compiler", null);
        term30596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30596, term30596.getClass(), "type", 85);
        setField(term30596, term30596.getClass(), "parent", null);
        setField(term30666, term30666.getClass(), "next", term30736);
        setIntField(term30666, term30666.getClass(), "type", 0);
        setField(term30666, term30666.getClass(), "first", null);
        setField(term30596, term30596.getClass(), "first", term30666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term30596;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term30526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


