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

public class VarCheck_process_146632422066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22404;
     Object term22474;

    public VarCheck_process_146632422066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22404 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term22404, term22404.getClass(), "sanityCheck", false);
        setField(term22404, term22404.getClass(), "compiler", null);
        term22474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term22652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term22474, term22474.getClass(), "type", 0);
        setField(term22560, term22560.getClass(), "next", term22652);
        setIntField(term22560, term22560.getClass(), "type", 0);
        setField(term22560, term22560.getClass(), "first", term22744);
        setField(term22474, term22474.getClass(), "first", term22560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term22474;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term22404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


