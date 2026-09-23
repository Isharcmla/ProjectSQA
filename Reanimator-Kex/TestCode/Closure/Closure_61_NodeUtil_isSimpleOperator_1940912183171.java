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
import java.lang.Object;

public class NodeUtil_isSimpleOperator_1940912183171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term6360;

    public NodeUtil_isSimpleOperator_1940912183171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term327, term327.getClass(), "type", 568954359);
        setIntField(term329, term329.getClass(), "type", 480137250);
        setIntField(term331, term331.getClass(), "type", 0);
        setField(term331, term331.getClass(), "next", null);
        setField(term331, term331.getClass(), "first", null);
        setField(term331, term331.getClass(), "last", null);
        setField(term331, term331.getClass(), "propListHead", null);
        setIntField(term331, term331.getClass(), "sourcePosition", 0);
        setField(term331, term331.getClass(), "jsType", null);
        setField(term331, term331.getClass(), "parent", null);
        setField(term329, term329.getClass(), "next", term331);
        setIntField(term334, term334.getClass(), "type", 0);
        setField(term334, term334.getClass(), "next", null);
        setField(term334, term334.getClass(), "first", null);
        setField(term334, term334.getClass(), "last", null);
        setField(term334, term334.getClass(), "propListHead", null);
        setIntField(term334, term334.getClass(), "sourcePosition", 0);
        setField(term334, term334.getClass(), "jsType", null);
        setField(term334, term334.getClass(), "parent", null);
        setField(term329, term329.getClass(), "first", term334);
        setIntField(term337, term337.getClass(), "type", 0);
        setField(term337, term337.getClass(), "next", null);
        setField(term337, term337.getClass(), "first", null);
        setField(term337, term337.getClass(), "last", null);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
        setField(term329, term329.getClass(), "last", term337);
        setField(term329, term329.getClass(), "propListHead", null);
        setIntField(term329, term329.getClass(), "sourcePosition", 0);
        setField(term329, term329.getClass(), "jsType", null);
        setField(term329, term329.getClass(), "parent", null);
        setField(term327, term327.getClass(), "next", term329);
        setIntField(term341, term341.getClass(), "type", 0);
        setField(term341, term341.getClass(), "next", null);
        setField(term341, term341.getClass(), "first", null);
        setField(term341, term341.getClass(), "last", null);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term327, term327.getClass(), "first", term341);
        setIntField(term344, term344.getClass(), "type", 0);
        setField(term344, term344.getClass(), "next", null);
        setField(term344, term344.getClass(), "first", null);
        setField(term344, term344.getClass(), "last", null);
        setField(term344, term344.getClass(), "propListHead", null);
        setIntField(term344, term344.getClass(), "sourcePosition", 0);
        setField(term344, term344.getClass(), "jsType", null);
        setField(term344, term344.getClass(), "parent", null);
        setField(term327, term327.getClass(), "last", term344);
        setField(term327, term327.getClass(), "propListHead", null);
        setIntField(term327, term327.getClass(), "sourcePosition", 0);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        term6360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6360, term6360.getClass(), "type", 568954359);
        setIntField(term6361, term6361.getClass(), "type", 480137250);
        setIntField(term6362, term6362.getClass(), "type", 0);
        setField(term6362, term6362.getClass(), "next", null);
        setField(term6362, term6362.getClass(), "first", null);
        setField(term6362, term6362.getClass(), "last", null);
        setField(term6362, term6362.getClass(), "propListHead", null);
        setIntField(term6362, term6362.getClass(), "sourcePosition", 0);
        setField(term6362, term6362.getClass(), "jsType", null);
        setField(term6362, term6362.getClass(), "parent", null);
        setField(term6361, term6361.getClass(), "next", term6362);
        setIntField(term6363, term6363.getClass(), "type", 0);
        setField(term6363, term6363.getClass(), "next", null);
        setField(term6363, term6363.getClass(), "first", null);
        setField(term6363, term6363.getClass(), "last", null);
        setField(term6363, term6363.getClass(), "propListHead", null);
        setIntField(term6363, term6363.getClass(), "sourcePosition", 0);
        setField(term6363, term6363.getClass(), "jsType", null);
        setField(term6363, term6363.getClass(), "parent", null);
        setField(term6361, term6361.getClass(), "first", term6363);
        setIntField(term6364, term6364.getClass(), "type", 0);
        setField(term6364, term6364.getClass(), "next", null);
        setField(term6364, term6364.getClass(), "first", null);
        setField(term6364, term6364.getClass(), "last", null);
        setField(term6364, term6364.getClass(), "propListHead", null);
        setIntField(term6364, term6364.getClass(), "sourcePosition", 0);
        setField(term6364, term6364.getClass(), "jsType", null);
        setField(term6364, term6364.getClass(), "parent", null);
        setField(term6361, term6361.getClass(), "last", term6364);
        setField(term6361, term6361.getClass(), "propListHead", null);
        setIntField(term6361, term6361.getClass(), "sourcePosition", 0);
        setField(term6361, term6361.getClass(), "jsType", null);
        setField(term6361, term6361.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "next", term6361);
        setIntField(term6365, term6365.getClass(), "type", 0);
        setField(term6365, term6365.getClass(), "next", null);
        setField(term6365, term6365.getClass(), "first", null);
        setField(term6365, term6365.getClass(), "last", null);
        setField(term6365, term6365.getClass(), "propListHead", null);
        setIntField(term6365, term6365.getClass(), "sourcePosition", 0);
        setField(term6365, term6365.getClass(), "jsType", null);
        setField(term6365, term6365.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "first", term6365);
        setIntField(term6366, term6366.getClass(), "type", 0);
        setField(term6366, term6366.getClass(), "next", null);
        setField(term6366, term6366.getClass(), "first", null);
        setField(term6366, term6366.getClass(), "last", null);
        setField(term6366, term6366.getClass(), "propListHead", null);
        setIntField(term6366, term6366.getClass(), "sourcePosition", 0);
        setField(term6366, term6366.getClass(), "jsType", null);
        setField(term6366, term6366.getClass(), "parent", null);
        setField(term6360, term6360.getClass(), "last", term6366);
        setField(term6360, term6360.getClass(), "propListHead", null);
        setIntField(term6360, term6360.getClass(), "sourcePosition", 0);
        setField(term6360, term6360.getClass(), "jsType", null);
        setField(term6360, term6360.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term327;
        callMethod(klass, "isSimpleOperator", argTypes, null, args);
        assertTrue(recursiveEquals(term327, term6360));
    }

};


