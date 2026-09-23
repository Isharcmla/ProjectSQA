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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174211;
     Object term174281;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_1829453220109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174211 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term174211, term174211.getClass(), "late", false);
        term174281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term174281, term174281.getClass(), "type", 85);
        setField(term174281, term174281.getClass(), "parent", term174351);
        setField(term174281, term174281.getClass(), "first", term174421);
        setField(term174281, term174281.getClass(), "last", term174491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term174281;
        callMethod(klass, "optimizeSubtree", argTypes, term174211, args);
    }

};


