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

public class VarCheck_process_146632422046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12772;
     Object term12842;

    public VarCheck_process_146632422046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12772 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term12772, term12772.getClass(), "sanityCheck", false);
        setField(term12772, term12772.getClass(), "compiler", null);
        term12842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12842, term12842.getClass(), "type", 0);
        setField(term12912, term12912.getClass(), "next", null);
        setIntField(term12912, term12912.getClass(), "type", 0);
        setField(term12982, term12982.getClass(), "next", null);
        setIntField(term12982, term12982.getClass(), "type", 0);
        setField(term12982, term12982.getClass(), "first", null);
        setField(term12912, term12912.getClass(), "first", term12982);
        setField(term12842, term12842.getClass(), "first", term12912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12842;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term12772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


