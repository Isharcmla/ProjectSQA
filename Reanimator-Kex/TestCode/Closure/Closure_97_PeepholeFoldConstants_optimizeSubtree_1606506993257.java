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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_optimizeSubtree_1606506993257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50742;
     Object term50812;
     Object term51294;
     Object term51295;
     Object term51286;

    public PeepholeFoldConstants_optimizeSubtree_1606506993257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50812, term50812.getClass(), "type", 30);
        term51294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term51294, term51294.getClass(), "currentTraversal", null);
        term51295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51295, term51295.getClass(), "type", 30);
        setField(term51295, term51295.getClass(), "next", null);
        setField(term51295, term51295.getClass(), "first", null);
        setField(term51295, term51295.getClass(), "last", null);
        setField(term51295, term51295.getClass(), "propListHead", null);
        setIntField(term51295, term51295.getClass(), "sourcePosition", 0);
        setField(term51295, term51295.getClass(), "jsType", null);
        setField(term51295, term51295.getClass(), "parent", null);
        term51286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51286, term51286.getClass(), "type", 30);
        setField(term51286, term51286.getClass(), "next", null);
        setField(term51286, term51286.getClass(), "first", null);
        setField(term51286, term51286.getClass(), "last", null);
        setField(term51286, term51286.getClass(), "propListHead", null);
        setIntField(term51286, term51286.getClass(), "sourcePosition", 0);
        setField(term51286, term51286.getClass(), "jsType", null);
        setField(term51286, term51286.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50812;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term50742, args);
        assertTrue(recursiveEquals(term50742, term51294));
        assertTrue(recursiveEquals(term50812, term51295));
        assertTrue(recursiveEquals(retValue, term51286));
    }

};


