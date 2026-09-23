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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141679;
     Object term141749;

    public FoldConstants_tryFoldBlock_1167048042459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141679 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term141749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141959, term141959.getClass(), "next", term142029);
        setIntField(term141959, term141959.getClass(), "type", 106);
        setField(term141889, term141889.getClass(), "next", term141959);
        setIntField(term141889, term141889.getClass(), "type", 99);
        setField(term141819, term141819.getClass(), "next", term141889);
        setIntField(term141819, term141819.getClass(), "type", 107);
        setField(term141749, term141749.getClass(), "first", term141819);
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
        args[1] = term141749;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term141679, args);
    }

};


