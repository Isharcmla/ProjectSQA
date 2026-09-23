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

public class FoldConstants_tryFoldBlock_1167048042288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77051;
     Object term77121;

    public FoldConstants_tryFoldBlock_1167048042288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77051 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term77121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term77331, term77331.getClass(), "next", term77401);
        setIntField(term77331, term77331.getClass(), "type", 52);
        setField(term77261, term77261.getClass(), "next", term77331);
        setIntField(term77261, term77261.getClass(), "type", 62);
        setField(term77191, term77191.getClass(), "next", term77261);
        setIntField(term77191, term77191.getClass(), "type", 48);
        setField(term77121, term77121.getClass(), "first", term77191);
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
        args[1] = term77121;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term77051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


