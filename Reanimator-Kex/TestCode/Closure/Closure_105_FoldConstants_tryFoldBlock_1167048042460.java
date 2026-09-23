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

public class FoldConstants_tryFoldBlock_1167048042460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142184;
     Object term142254;

    public FoldConstants_tryFoldBlock_1167048042460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142184 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term142254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term142534, term142534.getClass(), "next", term142604);
        setIntField(term142534, term142534.getClass(), "type", 121);
        setField(term142464, term142464.getClass(), "next", term142534);
        setIntField(term142464, term142464.getClass(), "type", 68);
        setField(term142394, term142394.getClass(), "next", term142464);
        setIntField(term142394, term142394.getClass(), "type", 55);
        setField(term142324, term142324.getClass(), "next", term142394);
        setIntField(term142324, term142324.getClass(), "type", 31);
        setField(term142254, term142254.getClass(), "first", term142324);
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
        args[1] = term142254;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term142184, args);
    }

};


