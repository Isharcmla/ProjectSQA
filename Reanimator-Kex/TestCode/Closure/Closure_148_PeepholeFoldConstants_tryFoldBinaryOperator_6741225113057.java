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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900662;
     Object term900754;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term900662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term900754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term900846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term900938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term901030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term900938, term900938.getClass(), "type", 47);
        setField(term900846, term900846.getClass(), "next", term900938);
        setIntField(term900846, term900846.getClass(), "type", 0);
        setField(term900754, term900754.getClass(), "first", term900846);
        setIntField(term900754, term900754.getClass(), "type", 101);
        setIntField(term901030, term901030.getClass(), "type", 113);
        setField(term900754, term900754.getClass(), "parent", term901030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term900754;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term900662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


