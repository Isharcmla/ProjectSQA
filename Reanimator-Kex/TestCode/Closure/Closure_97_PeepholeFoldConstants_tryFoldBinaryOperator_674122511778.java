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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223513;
     Object term223583;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223513 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term223583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term223793, term223793.getClass(), "next", term223863);
        setField(term223723, term223723.getClass(), "first", term223793);
        setField(term223723, term223723.getClass(), "last", term223863);
        setField(term223653, term223653.getClass(), "next", term223723);
        setIntField(term223653, term223653.getClass(), "type", 108);
        setField(term223583, term223583.getClass(), "first", term223653);
        setIntField(term223583, term223583.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term223583;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term223513, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


