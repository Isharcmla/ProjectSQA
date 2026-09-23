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

public class TypeCheck_visit_8595247841396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425537;
     Object term425607;

    public TypeCheck_visit_8595247841396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425537 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term425607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term425677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term425771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term425841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term425607, term425607.getClass(), "type", 11);
        setField(term425677, term425677.getClass(), "jsType", term425771);
        setField(term425607, term425607.getClass(), "first", term425677);
        setField(term425607, term425607.getClass(), "last", term425841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term425607;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term425537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


