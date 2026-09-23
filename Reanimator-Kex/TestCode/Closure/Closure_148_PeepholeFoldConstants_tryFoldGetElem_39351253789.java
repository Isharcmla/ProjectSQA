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

public class PeepholeFoldConstants_tryFoldGetElem_39351253789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15856;
     Object term15961;
     Object term16241;
     Object term16242;
     Object term16243;
     Object term16232;

    public PeepholeFoldConstants_tryFoldGetElem_39351253789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15961, term15961.getClass(), "type", 35);
        term16241 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16241, term16241.getClass(), "currentTraversal", null);
        term16242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16242, term16242.getClass(), "type", 35);
        setField(term16242, term16242.getClass(), "next", null);
        setField(term16242, term16242.getClass(), "first", null);
        setField(term16242, term16242.getClass(), "last", null);
        setField(term16242, term16242.getClass(), "propListHead", null);
        setIntField(term16242, term16242.getClass(), "sourcePosition", 0);
        setField(term16242, term16242.getClass(), "jsType", null);
        setField(term16242, term16242.getClass(), "parent", null);
        term16243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16243, term16243.getClass(), "type", 35);
        setField(term16243, term16243.getClass(), "next", null);
        setField(term16243, term16243.getClass(), "first", null);
        setField(term16243, term16243.getClass(), "last", null);
        setField(term16243, term16243.getClass(), "propListHead", null);
        setIntField(term16243, term16243.getClass(), "sourcePosition", 0);
        setField(term16243, term16243.getClass(), "jsType", null);
        setField(term16243, term16243.getClass(), "parent", null);
        term16232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16232, term16232.getClass(), "type", 35);
        setField(term16232, term16232.getClass(), "next", null);
        setField(term16232, term16232.getClass(), "first", null);
        setField(term16232, term16232.getClass(), "last", null);
        setField(term16232, term16232.getClass(), "propListHead", null);
        setIntField(term16232, term16232.getClass(), "sourcePosition", 0);
        setField(term16232, term16232.getClass(), "jsType", null);
        setField(term16232, term16232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term15961;
        args[1] = term15961;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldGetElem", argTypes, term15856, args);
        assertTrue(recursiveEquals(term15856, term16241));
        assertTrue(recursiveEquals(term15961, term16242));
        assertTrue(recursiveEquals(term15961, term16243));
        assertTrue(recursiveEquals(retValue, term16232));
    }

};


