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

public class FoldConstants_tryFoldBlock_1167048042443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133700;
     Object term133770;

    public FoldConstants_tryFoldBlock_1167048042443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133700 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term133770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term133980, term133980.getClass(), "next", term134050);
        setIntField(term133980, term133980.getClass(), "type", 99);
        setField(term133910, term133910.getClass(), "next", term133980);
        setIntField(term133910, term133910.getClass(), "type", 121);
        setField(term133840, term133840.getClass(), "next", term133910);
        setIntField(term133840, term133840.getClass(), "type", 103);
        setField(term133770, term133770.getClass(), "first", term133840);
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
        args[1] = term133770;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term133700, args);
    }

};


