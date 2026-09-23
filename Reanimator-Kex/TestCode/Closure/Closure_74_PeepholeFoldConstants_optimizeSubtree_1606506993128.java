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

public class PeepholeFoldConstants_optimizeSubtree_1606506993128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22605;
     Object term22675;
     Object term23432;
     Object term23433;
     Object term23423;

    public PeepholeFoldConstants_optimizeSubtree_1606506993128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22605 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22675, term22675.getClass(), "type", 67);
        term23432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23432, term23432.getClass(), "currentTraversal", null);
        term23433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23433, term23433.getClass(), "type", 67);
        setField(term23433, term23433.getClass(), "next", null);
        setField(term23433, term23433.getClass(), "first", null);
        setField(term23433, term23433.getClass(), "last", null);
        setField(term23433, term23433.getClass(), "propListHead", null);
        setIntField(term23433, term23433.getClass(), "sourcePosition", 0);
        setField(term23433, term23433.getClass(), "jsType", null);
        setField(term23433, term23433.getClass(), "parent", null);
        term23423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23423, term23423.getClass(), "type", 67);
        setField(term23423, term23423.getClass(), "next", null);
        setField(term23423, term23423.getClass(), "first", null);
        setField(term23423, term23423.getClass(), "last", null);
        setField(term23423, term23423.getClass(), "propListHead", null);
        setIntField(term23423, term23423.getClass(), "sourcePosition", 0);
        setField(term23423, term23423.getClass(), "jsType", null);
        setField(term23423, term23423.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22675;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term22605, args);
        assertTrue(recursiveEquals(term22605, term23432));
        assertTrue(recursiveEquals(term22675, term23433));
        assertTrue(recursiveEquals(retValue, term23423));
    }

};


