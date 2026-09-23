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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionToBlockMutator_convertLastReturnToStatement_72219242121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;

    public FunctionToBlockMutator_convertLastReturnToStatement_72219242121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term500 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term487, term487.getClass(), "type", 202001407);
        setIntField(term489, term489.getClass(), "type", 98922530);
        setIntField(term491, term491.getClass(), "type", 0);
        setField(term491, term491.getClass(), "next", null);
        setField(term491, term491.getClass(), "first", null);
        setField(term491, term491.getClass(), "last", null);
        setField(term491, term491.getClass(), "propListHead", null);
        setIntField(term491, term491.getClass(), "sourcePosition", 0);
        setField(term491, term491.getClass(), "jsType", null);
        setField(term491, term491.getClass(), "parent", null);
        setField(term489, term489.getClass(), "next", term491);
        setIntField(term494, term494.getClass(), "type", 0);
        setField(term494, term494.getClass(), "next", null);
        setField(term494, term494.getClass(), "first", null);
        setField(term494, term494.getClass(), "last", null);
        setField(term494, term494.getClass(), "propListHead", null);
        setIntField(term494, term494.getClass(), "sourcePosition", 0);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term489, term489.getClass(), "first", term494);
        setIntField(term497, term497.getClass(), "type", 0);
        setField(term497, term497.getClass(), "next", null);
        setField(term497, term497.getClass(), "first", null);
        setField(term497, term497.getClass(), "last", null);
        setField(term497, term497.getClass(), "propListHead", null);
        setIntField(term497, term497.getClass(), "sourcePosition", 0);
        setField(term497, term497.getClass(), "jsType", null);
        setField(term497, term497.getClass(), "parent", null);
        setField(term489, term489.getClass(), "last", term497);
        setField(term500, term500.getClass(), "next", null);
        setIntField(term500, term500.getClass(), "type", 0);
        setIntField(term500, term500.getClass(), "intValue", 0);
        setField(term500, term500.getClass(), "objectValue", null);
        setField(term489, term489.getClass(), "propListHead", term500);
        setIntField(term489, term489.getClass(), "sourcePosition", 2098647989);
        setField(term489, term489.getClass(), "jsType", null);
        setField(term489, term489.getClass(), "parent", null);
        setField(term487, term487.getClass(), "next", term489);
        setIntField(term504, term504.getClass(), "type", 0);
        setField(term504, term504.getClass(), "next", null);
        setField(term504, term504.getClass(), "first", null);
        setField(term504, term504.getClass(), "last", null);
        setField(term504, term504.getClass(), "propListHead", null);
        setIntField(term504, term504.getClass(), "sourcePosition", 0);
        setField(term504, term504.getClass(), "jsType", null);
        setField(term504, term504.getClass(), "parent", null);
        setField(term487, term487.getClass(), "first", term504);
        setIntField(term507, term507.getClass(), "type", 0);
        setField(term507, term507.getClass(), "next", null);
        setField(term507, term507.getClass(), "first", null);
        setField(term507, term507.getClass(), "last", null);
        setField(term507, term507.getClass(), "propListHead", null);
        setIntField(term507, term507.getClass(), "sourcePosition", 0);
        setField(term507, term507.getClass(), "jsType", null);
        setField(term507, term507.getClass(), "parent", null);
        setField(term487, term487.getClass(), "last", term507);
        setField(term510, term510.getClass(), "next", null);
        setIntField(term510, term510.getClass(), "type", 0);
        setIntField(term510, term510.getClass(), "intValue", 0);
        setField(term510, term510.getClass(), "objectValue", null);
        setField(term487, term487.getClass(), "propListHead", term510);
        setIntField(term487, term487.getClass(), "sourcePosition", 1598895173);
        setField(term487, term487.getClass(), "jsType", null);
        setField(term487, term487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term487;
        args[1] = "tbcdzjIfER";
        try {
            callMethod(klass, "convertLastReturnToStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


