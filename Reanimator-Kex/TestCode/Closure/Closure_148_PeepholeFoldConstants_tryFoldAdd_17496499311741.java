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

public class PeepholeFoldConstants_tryFoldAdd_17496499311741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451167;
     Object term451259;
     Object term451351;
     Object term451443;
     Object term451861;
     Object term451862;
     Object term451863;
     Object term451864;
     Object term451835;

    public PeepholeFoldConstants_tryFoldAdd_17496499311741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term451259 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term451259, term451259.getClass(), "type", 21);
        term451351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term451351, term451351.getClass(), "type", 21);
        term451443 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term451861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term451861, term451861.getClass(), "currentTraversal", null);
        term451862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term451862, term451862.getClass(), "str", null);
        setIntField(term451862, term451862.getClass(), "type", 21);
        setField(term451862, term451862.getClass(), "next", null);
        setField(term451862, term451862.getClass(), "first", null);
        setField(term451862, term451862.getClass(), "last", null);
        setField(term451862, term451862.getClass(), "propListHead", null);
        setIntField(term451862, term451862.getClass(), "sourcePosition", 0);
        setField(term451862, term451862.getClass(), "jsType", null);
        setField(term451862, term451862.getClass(), "parent", null);
        term451863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term451863, term451863.getClass(), "str", null);
        setIntField(term451863, term451863.getClass(), "type", 21);
        setField(term451863, term451863.getClass(), "next", null);
        setField(term451863, term451863.getClass(), "first", null);
        setField(term451863, term451863.getClass(), "last", null);
        setField(term451863, term451863.getClass(), "propListHead", null);
        setIntField(term451863, term451863.getClass(), "sourcePosition", 0);
        setField(term451863, term451863.getClass(), "jsType", null);
        setField(term451863, term451863.getClass(), "parent", null);
        term451864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term451864, term451864.getClass(), "str", null);
        setIntField(term451864, term451864.getClass(), "type", 0);
        setField(term451864, term451864.getClass(), "next", null);
        setField(term451864, term451864.getClass(), "first", null);
        setField(term451864, term451864.getClass(), "last", null);
        setField(term451864, term451864.getClass(), "propListHead", null);
        setIntField(term451864, term451864.getClass(), "sourcePosition", 0);
        setField(term451864, term451864.getClass(), "jsType", null);
        setField(term451864, term451864.getClass(), "parent", null);
        term451835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term451835, term451835.getClass(), "str", null);
        setIntField(term451835, term451835.getClass(), "type", 21);
        setField(term451835, term451835.getClass(), "next", null);
        setField(term451835, term451835.getClass(), "first", null);
        setField(term451835, term451835.getClass(), "last", null);
        setField(term451835, term451835.getClass(), "propListHead", null);
        setIntField(term451835, term451835.getClass(), "sourcePosition", 0);
        setField(term451835, term451835.getClass(), "jsType", null);
        setField(term451835, term451835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term451259;
        args[1] = term451351;
        args[2] = term451443;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term451167, args);
        assertTrue(recursiveEquals(term451167, term451861));
        assertTrue(recursiveEquals(term451259, term451862));
        assertTrue(recursiveEquals(term451351, term451863));
        assertTrue(recursiveEquals(term451443, term451864));
        assertTrue(recursiveEquals(retValue, term451835));
    }

};


