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

public class PeepholeFoldConstants_optimizeSubtree_1606506993234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37859;
     Object term37929;
     Object term38435;
     Object term38436;
     Object term38419;

    public PeepholeFoldConstants_optimizeSubtree_1606506993234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term37929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37929, term37929.getClass(), "type", 79);
        setField(term37929, term37929.getClass(), "first", term37929);
        term38435 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term38435, term38435.getClass(), "currentTraversal", null);
        term38436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38436, term38436.getClass(), "type", 79);
        setField(term38436, term38436.getClass(), "next", null);
        setField(term38436, term38436.getClass(), "first", term38436);
        setField(term38436, term38436.getClass(), "last", null);
        setField(term38436, term38436.getClass(), "propListHead", null);
        setIntField(term38436, term38436.getClass(), "sourcePosition", 0);
        setField(term38436, term38436.getClass(), "jsType", null);
        setField(term38436, term38436.getClass(), "parent", null);
        term38419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38419, term38419.getClass(), "type", 79);
        setField(term38419, term38419.getClass(), "next", null);
        setField(term38419, term38419.getClass(), "first", term38419);
        setField(term38419, term38419.getClass(), "last", null);
        setField(term38419, term38419.getClass(), "propListHead", null);
        setIntField(term38419, term38419.getClass(), "sourcePosition", 0);
        setField(term38419, term38419.getClass(), "jsType", null);
        setField(term38419, term38419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37929;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term37859, args);
        assertTrue(recursiveEquals(term37859, term38435));
        assertTrue(recursiveEquals(term37929, term38436));
        assertTrue(recursiveEquals(retValue, term38419));
    }

};


