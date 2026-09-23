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

public class FoldConstants_tryFoldBlock_1167048042205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52141;
     Object term52211;

    public FoldConstants_tryFoldBlock_1167048042205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52141 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term52211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52421, term52421.getClass(), "next", term52491);
        setIntField(term52421, term52421.getClass(), "type", 46);
        setField(term52351, term52351.getClass(), "next", term52421);
        setIntField(term52351, term52351.getClass(), "type", 78);
        setField(term52281, term52281.getClass(), "next", term52351);
        setIntField(term52281, term52281.getClass(), "type", 82);
        setField(term52211, term52211.getClass(), "first", term52281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term52211;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term52141, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


