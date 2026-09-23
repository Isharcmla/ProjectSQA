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

public class NodeUtil_newVarNode_930235028273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3336;

    public NodeUtil_newVarNode_930235028273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3336, term3336.getClass(), "type", 1498738343);
        setIntField(term3338, term3338.getClass(), "type", -1635571857);
        setIntField(term3340, term3340.getClass(), "type", 1407309162);
        setIntField(term3342, term3342.getClass(), "type", -534033672);
        setIntField(term3344, term3344.getClass(), "type", -1162790806);
        setField(term3344, term3344.getClass(), "next", null);
        setField(term3344, term3344.getClass(), "first", null);
        setField(term3344, term3344.getClass(), "last", null);
        setField(term3344, term3344.getClass(), "propListHead", null);
        setIntField(term3344, term3344.getClass(), "sourcePosition", 0);
        setField(term3344, term3344.getClass(), "jsType", null);
        setField(term3344, term3344.getClass(), "parent", null);
        setField(term3342, term3342.getClass(), "next", term3344);
        setIntField(term3347, term3347.getClass(), "type", -1264595049);
        setField(term3347, term3347.getClass(), "next", null);
        setField(term3347, term3347.getClass(), "first", null);
        setField(term3347, term3347.getClass(), "last", term3344);
        setField(term3347, term3347.getClass(), "propListHead", null);
        setIntField(term3347, term3347.getClass(), "sourcePosition", 0);
        setField(term3347, term3347.getClass(), "jsType", null);
        setField(term3347, term3347.getClass(), "parent", null);
        setField(term3342, term3342.getClass(), "first", term3347);
        setField(term3342, term3342.getClass(), "last", term3340);
        setField(term3342, term3342.getClass(), "propListHead", null);
        setIntField(term3342, term3342.getClass(), "sourcePosition", 0);
        setField(term3342, term3342.getClass(), "jsType", null);
        setField(term3342, term3342.getClass(), "parent", null);
        setField(term3340, term3340.getClass(), "next", term3342);
        setField(term3340, term3340.getClass(), "first", term3344);
        setIntField(term3351, term3351.getClass(), "type", 1064185088);
        setIntField(term3353, term3353.getClass(), "type", -1249782654);
        setField(term3353, term3353.getClass(), "next", null);
        setField(term3353, term3353.getClass(), "first", term3347);
        setField(term3353, term3353.getClass(), "last", term3342);
        setField(term3353, term3353.getClass(), "propListHead", null);
        setIntField(term3353, term3353.getClass(), "sourcePosition", 0);
        setField(term3353, term3353.getClass(), "jsType", null);
        setField(term3353, term3353.getClass(), "parent", null);
        setField(term3351, term3351.getClass(), "next", term3353);
        setField(term3351, term3351.getClass(), "first", term3338);
        setField(term3351, term3351.getClass(), "last", term3338);
        setField(term3351, term3351.getClass(), "propListHead", null);
        setIntField(term3351, term3351.getClass(), "sourcePosition", 0);
        setField(term3351, term3351.getClass(), "jsType", null);
        setField(term3351, term3351.getClass(), "parent", null);
        setField(term3340, term3340.getClass(), "last", term3351);
        setField(term3340, term3340.getClass(), "propListHead", null);
        setIntField(term3340, term3340.getClass(), "sourcePosition", 0);
        setField(term3340, term3340.getClass(), "jsType", null);
        setField(term3340, term3340.getClass(), "parent", null);
        setField(term3338, term3338.getClass(), "next", term3340);
        setIntField(term3358, term3358.getClass(), "type", 399302934);
        setField(term3358, term3358.getClass(), "next", term3351);
        setField(term3358, term3358.getClass(), "first", term3353);
        setField(term3358, term3358.getClass(), "last", term3336);
        setField(term3358, term3358.getClass(), "propListHead", null);
        setIntField(term3358, term3358.getClass(), "sourcePosition", 0);
        setField(term3358, term3358.getClass(), "jsType", null);
        setField(term3358, term3358.getClass(), "parent", null);
        setField(term3338, term3338.getClass(), "first", term3358);
        setField(term3338, term3338.getClass(), "last", term3358);
        setField(term3338, term3338.getClass(), "propListHead", null);
        setIntField(term3338, term3338.getClass(), "sourcePosition", 0);
        setField(term3338, term3338.getClass(), "jsType", null);
        setField(term3338, term3338.getClass(), "parent", null);
        setField(term3336, term3336.getClass(), "next", term3338);
        setField(term3336, term3336.getClass(), "first", term3342);
        setField(term3336, term3336.getClass(), "last", term3344);
        setField(term3336, term3336.getClass(), "propListHead", null);
        setIntField(term3336, term3336.getClass(), "sourcePosition", 0);
        setField(term3336, term3336.getClass(), "jsType", null);
        setField(term3336, term3336.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "flxyYxBRtu";
        args[1] = term3336;
        try {
            callMethod(klass, "newVarNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


