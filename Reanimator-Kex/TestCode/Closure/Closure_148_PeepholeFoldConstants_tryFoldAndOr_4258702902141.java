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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582491;
     Object term582577;
     Object term582761;
     Object term582853;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582491 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term582577 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term582669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term582669, term582669.getClass(), "type", 108);
        setField(term582577, term582577.getClass(), "parent", term582669);
        setIntField(term582577, term582577.getClass(), "type", 100);
        term582761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term582761, term582761.getClass(), "type", 89);
        term582853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term582853, term582853.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term582577;
        args[1] = term582761;
        args[2] = term582853;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term582491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


