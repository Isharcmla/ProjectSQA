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
import java.lang.Double;
import java.lang.Object;

public class NodeUtil_numberNode_1995454566159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5049;
     Object term5051;

    public NodeUtil_numberNode_1995454566159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5049 = new Double(0.3455959125047594);
        term5051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5051, term5051.getClass(), "type", 1782226794);
        setIntField(term5053, term5053.getClass(), "type", 1115327577);
        setIntField(term5055, term5055.getClass(), "type", 840704993);
        setIntField(term5057, term5057.getClass(), "type", 1297035285);
        setIntField(term5059, term5059.getClass(), "type", -826239685);
        setField(term5059, term5059.getClass(), "next", null);
        setField(term5059, term5059.getClass(), "first", null);
        setField(term5059, term5059.getClass(), "last", null);
        setField(term5059, term5059.getClass(), "propListHead", null);
        setIntField(term5059, term5059.getClass(), "sourcePosition", 0);
        setField(term5059, term5059.getClass(), "jsType", null);
        setField(term5059, term5059.getClass(), "parent", null);
        setField(term5057, term5057.getClass(), "next", term5059);
        setIntField(term5062, term5062.getClass(), "type", -845551243);
        setField(term5062, term5062.getClass(), "next", null);
        setField(term5062, term5062.getClass(), "first", null);
        setField(term5062, term5062.getClass(), "last", term5059);
        setField(term5062, term5062.getClass(), "propListHead", null);
        setIntField(term5062, term5062.getClass(), "sourcePosition", 0);
        setField(term5062, term5062.getClass(), "jsType", null);
        setField(term5062, term5062.getClass(), "parent", null);
        setField(term5057, term5057.getClass(), "first", term5062);
        setField(term5057, term5057.getClass(), "last", term5055);
        setField(term5057, term5057.getClass(), "propListHead", null);
        setIntField(term5057, term5057.getClass(), "sourcePosition", 0);
        setField(term5057, term5057.getClass(), "jsType", null);
        setField(term5057, term5057.getClass(), "parent", null);
        setField(term5055, term5055.getClass(), "next", term5057);
        setField(term5055, term5055.getClass(), "first", term5059);
        setIntField(term5066, term5066.getClass(), "type", 1426800646);
        setIntField(term5068, term5068.getClass(), "type", 954234820);
        setField(term5068, term5068.getClass(), "next", null);
        setField(term5068, term5068.getClass(), "first", term5062);
        setField(term5068, term5068.getClass(), "last", term5057);
        setField(term5068, term5068.getClass(), "propListHead", null);
        setIntField(term5068, term5068.getClass(), "sourcePosition", 0);
        setField(term5068, term5068.getClass(), "jsType", null);
        setField(term5068, term5068.getClass(), "parent", null);
        setField(term5066, term5066.getClass(), "next", term5068);
        setField(term5066, term5066.getClass(), "first", term5053);
        setField(term5066, term5066.getClass(), "last", term5053);
        setField(term5066, term5066.getClass(), "propListHead", null);
        setIntField(term5066, term5066.getClass(), "sourcePosition", 0);
        setField(term5066, term5066.getClass(), "jsType", null);
        setField(term5066, term5066.getClass(), "parent", null);
        setField(term5055, term5055.getClass(), "last", term5066);
        setField(term5055, term5055.getClass(), "propListHead", null);
        setIntField(term5055, term5055.getClass(), "sourcePosition", 0);
        setField(term5055, term5055.getClass(), "jsType", null);
        setField(term5055, term5055.getClass(), "parent", null);
        setField(term5053, term5053.getClass(), "next", term5055);
        setIntField(term5073, term5073.getClass(), "type", 1047346538);
        setField(term5073, term5073.getClass(), "next", term5066);
        setField(term5073, term5073.getClass(), "first", term5068);
        setField(term5073, term5073.getClass(), "last", term5051);
        setField(term5073, term5073.getClass(), "propListHead", null);
        setIntField(term5073, term5073.getClass(), "sourcePosition", 0);
        setField(term5073, term5073.getClass(), "jsType", null);
        setField(term5073, term5073.getClass(), "parent", null);
        setField(term5053, term5053.getClass(), "first", term5073);
        setField(term5053, term5053.getClass(), "last", term5073);
        setField(term5053, term5053.getClass(), "propListHead", null);
        setIntField(term5053, term5053.getClass(), "sourcePosition", 0);
        setField(term5053, term5053.getClass(), "jsType", null);
        setField(term5053, term5053.getClass(), "parent", null);
        setField(term5051, term5051.getClass(), "next", term5053);
        setField(term5051, term5051.getClass(), "first", term5057);
        setField(term5051, term5051.getClass(), "last", term5059);
        setField(term5051, term5051.getClass(), "propListHead", null);
        setIntField(term5051, term5051.getClass(), "sourcePosition", 0);
        setField(term5051, term5051.getClass(), "jsType", null);
        setField(term5051, term5051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5049;
        args[1] = term5051;
        callMethod(klass, "numberNode", argTypes, null, args);
    }

};


