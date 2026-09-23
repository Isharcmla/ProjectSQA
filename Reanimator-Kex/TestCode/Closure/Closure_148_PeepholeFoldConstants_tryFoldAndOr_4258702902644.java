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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754878;
     Object term755016;
     Object term755102;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term755016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term755016, term755016.getClass(), "parent", null);
        setIntField(term755016, term755016.getClass(), "type", 0);
        term755102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term755102, term755102.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term755016;
        args[1] = term755016;
        args[2] = term755102;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term754878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


