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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547826;
     Object term547912;
     Object term548154;
     Object term548197;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547826 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term547912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term547982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term548197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term547982, term547982.getClass(), "type", 108);
        setField(term547912, term547912.getClass(), "parent", term547982);
        setIntField(term547912, term547912.getClass(), "type", 0);
        setIntField(term548197, term548197.getClass(), "type", 63);
        setField(term547912, term547912.getClass(), "first", term548197);
        term548154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term548154, term548154.getClass(), "type", 33);
        setField(term548154, term548154.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term547912;
        args[1] = term548154;
        args[2] = term548197;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term547826, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


