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

public class PeepholeFoldConstants_optimizeSubtree_160650699393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16675;
     Object term16745;
     Object term16947;
     Object term16948;
     Object term16939;

    public PeepholeFoldConstants_optimizeSubtree_160650699393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16745, term16745.getClass(), "type", 28);
        term16947 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16947, term16947.getClass(), "currentTraversal", null);
        term16948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16948, term16948.getClass(), "type", 28);
        setField(term16948, term16948.getClass(), "next", null);
        setField(term16948, term16948.getClass(), "first", null);
        setField(term16948, term16948.getClass(), "last", null);
        setField(term16948, term16948.getClass(), "propListHead", null);
        setIntField(term16948, term16948.getClass(), "sourcePosition", 0);
        setField(term16948, term16948.getClass(), "jsType", null);
        setField(term16948, term16948.getClass(), "parent", null);
        term16939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16939, term16939.getClass(), "type", 28);
        setField(term16939, term16939.getClass(), "next", null);
        setField(term16939, term16939.getClass(), "first", null);
        setField(term16939, term16939.getClass(), "last", null);
        setField(term16939, term16939.getClass(), "propListHead", null);
        setIntField(term16939, term16939.getClass(), "sourcePosition", 0);
        setField(term16939, term16939.getClass(), "jsType", null);
        setField(term16939, term16939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16745;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term16675, args);
        assertTrue(recursiveEquals(term16675, term16947));
        assertTrue(recursiveEquals(term16745, term16948));
        assertTrue(recursiveEquals(retValue, term16939));
    }

};


