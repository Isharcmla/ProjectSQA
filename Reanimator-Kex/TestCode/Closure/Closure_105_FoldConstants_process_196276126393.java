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

public class FoldConstants_process_196276126393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16341;
     Object term16411;

    public FoldConstants_process_196276126393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16341 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term16341, term16341.getClass(), "compiler", null);
        term16411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16411, term16411.getClass(), "type", 26);
        setField(term16481, term16481.getClass(), "next", null);
        setIntField(term16481, term16481.getClass(), "type", 0);
        setField(term16481, term16481.getClass(), "first", null);
        setField(term16411, term16411.getClass(), "first", term16481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16411;
        try {
            callMethod(klass, "process", argTypes, term16341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


