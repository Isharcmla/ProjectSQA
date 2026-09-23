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

public class NodeUtil_evaluatesToLocalValue_744664708307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4663;

    public NodeUtil_evaluatesToLocalValue_744664708307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4663, term4663.getClass(), "type", 298082829);
        setIntField(term4665, term4665.getClass(), "type", -1494372780);
        setIntField(term4667, term4667.getClass(), "type", 703799187);
        setIntField(term4669, term4669.getClass(), "type", -1305898281);
        setIntField(term4671, term4671.getClass(), "type", 140501130);
        setField(term4671, term4671.getClass(), "next", null);
        setField(term4671, term4671.getClass(), "first", null);
        setField(term4671, term4671.getClass(), "last", null);
        setField(term4671, term4671.getClass(), "propListHead", null);
        setIntField(term4671, term4671.getClass(), "sourcePosition", 0);
        setField(term4671, term4671.getClass(), "jsType", null);
        setField(term4671, term4671.getClass(), "parent", null);
        setField(term4669, term4669.getClass(), "next", term4671);
        setIntField(term4674, term4674.getClass(), "type", -1458890291);
        setField(term4674, term4674.getClass(), "next", null);
        setField(term4674, term4674.getClass(), "first", null);
        setField(term4674, term4674.getClass(), "last", term4671);
        setField(term4674, term4674.getClass(), "propListHead", null);
        setIntField(term4674, term4674.getClass(), "sourcePosition", 0);
        setField(term4674, term4674.getClass(), "jsType", null);
        setField(term4674, term4674.getClass(), "parent", null);
        setField(term4669, term4669.getClass(), "first", term4674);
        setField(term4669, term4669.getClass(), "last", term4667);
        setField(term4669, term4669.getClass(), "propListHead", null);
        setIntField(term4669, term4669.getClass(), "sourcePosition", 0);
        setField(term4669, term4669.getClass(), "jsType", null);
        setField(term4669, term4669.getClass(), "parent", null);
        setField(term4667, term4667.getClass(), "next", term4669);
        setField(term4667, term4667.getClass(), "first", term4671);
        setIntField(term4678, term4678.getClass(), "type", 1957748979);
        setIntField(term4680, term4680.getClass(), "type", -1290093259);
        setField(term4680, term4680.getClass(), "next", null);
        setField(term4680, term4680.getClass(), "first", term4674);
        setField(term4680, term4680.getClass(), "last", term4669);
        setField(term4680, term4680.getClass(), "propListHead", null);
        setIntField(term4680, term4680.getClass(), "sourcePosition", 0);
        setField(term4680, term4680.getClass(), "jsType", null);
        setField(term4680, term4680.getClass(), "parent", null);
        setField(term4678, term4678.getClass(), "next", term4680);
        setField(term4678, term4678.getClass(), "first", term4665);
        setField(term4678, term4678.getClass(), "last", term4665);
        setField(term4678, term4678.getClass(), "propListHead", null);
        setIntField(term4678, term4678.getClass(), "sourcePosition", 0);
        setField(term4678, term4678.getClass(), "jsType", null);
        setField(term4678, term4678.getClass(), "parent", null);
        setField(term4667, term4667.getClass(), "last", term4678);
        setField(term4667, term4667.getClass(), "propListHead", null);
        setIntField(term4667, term4667.getClass(), "sourcePosition", 0);
        setField(term4667, term4667.getClass(), "jsType", null);
        setField(term4667, term4667.getClass(), "parent", null);
        setField(term4665, term4665.getClass(), "next", term4667);
        setIntField(term4685, term4685.getClass(), "type", -1200934890);
        setField(term4685, term4685.getClass(), "next", term4678);
        setField(term4685, term4685.getClass(), "first", term4680);
        setField(term4685, term4685.getClass(), "last", term4663);
        setField(term4685, term4685.getClass(), "propListHead", null);
        setIntField(term4685, term4685.getClass(), "sourcePosition", 0);
        setField(term4685, term4685.getClass(), "jsType", null);
        setField(term4685, term4685.getClass(), "parent", null);
        setField(term4665, term4665.getClass(), "first", term4685);
        setField(term4665, term4665.getClass(), "last", term4685);
        setField(term4665, term4665.getClass(), "propListHead", null);
        setIntField(term4665, term4665.getClass(), "sourcePosition", 0);
        setField(term4665, term4665.getClass(), "jsType", null);
        setField(term4665, term4665.getClass(), "parent", null);
        setField(term4663, term4663.getClass(), "next", term4665);
        setField(term4663, term4663.getClass(), "first", term4669);
        setField(term4663, term4663.getClass(), "last", term4671);
        setField(term4663, term4663.getClass(), "propListHead", null);
        setIntField(term4663, term4663.getClass(), "sourcePosition", 0);
        setField(term4663, term4663.getClass(), "jsType", null);
        setField(term4663, term4663.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4663;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


