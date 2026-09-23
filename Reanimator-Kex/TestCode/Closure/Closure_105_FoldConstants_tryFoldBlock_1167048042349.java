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

public class FoldConstants_tryFoldBlock_1167048042349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97261;
     Object term97331;

    public FoldConstants_tryFoldBlock_1167048042349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97261 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term97331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97541, term97541.getClass(), "next", term97611);
        setIntField(term97541, term97541.getClass(), "type", 92);
        setField(term97471, term97471.getClass(), "next", term97541);
        setIntField(term97471, term97471.getClass(), "type", 99);
        setField(term97401, term97401.getClass(), "next", term97471);
        setIntField(term97401, term97401.getClass(), "type", 107);
        setField(term97331, term97331.getClass(), "first", term97401);
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
        args[1] = term97331;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term97261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


