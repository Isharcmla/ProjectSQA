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

public class NodeUtil_containsCall_2124673690240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;
     Object term15679;

    public NodeUtil_containsCall_2124673690240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2351, term2351.getClass(), "type", -82632953);
        setIntField(term2353, term2353.getClass(), "type", 360972386);
        setIntField(term2355, term2355.getClass(), "type", 0);
        setField(term2355, term2355.getClass(), "next", null);
        setField(term2355, term2355.getClass(), "first", null);
        setField(term2355, term2355.getClass(), "last", null);
        setField(term2355, term2355.getClass(), "propListHead", null);
        setIntField(term2355, term2355.getClass(), "sourcePosition", 0);
        setField(term2355, term2355.getClass(), "jsType", null);
        setField(term2355, term2355.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "next", term2355);
        setIntField(term2358, term2358.getClass(), "type", 0);
        setField(term2358, term2358.getClass(), "next", null);
        setField(term2358, term2358.getClass(), "first", null);
        setField(term2358, term2358.getClass(), "last", null);
        setField(term2358, term2358.getClass(), "propListHead", null);
        setIntField(term2358, term2358.getClass(), "sourcePosition", 0);
        setField(term2358, term2358.getClass(), "jsType", null);
        setField(term2358, term2358.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "first", term2358);
        setIntField(term2361, term2361.getClass(), "type", 0);
        setField(term2361, term2361.getClass(), "next", null);
        setField(term2361, term2361.getClass(), "first", null);
        setField(term2361, term2361.getClass(), "last", null);
        setField(term2361, term2361.getClass(), "propListHead", null);
        setIntField(term2361, term2361.getClass(), "sourcePosition", 0);
        setField(term2361, term2361.getClass(), "jsType", null);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "last", term2361);
        setField(term2364, term2364.getClass(), "next", null);
        setIntField(term2364, term2364.getClass(), "type", 0);
        setIntField(term2364, term2364.getClass(), "intValue", 0);
        setField(term2364, term2364.getClass(), "objectValue", null);
        setField(term2353, term2353.getClass(), "propListHead", term2364);
        setIntField(term2353, term2353.getClass(), "sourcePosition", 692873905);
        setField(term2353, term2353.getClass(), "jsType", null);
        setField(term2353, term2353.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "next", term2353);
        setIntField(term2368, term2368.getClass(), "type", 0);
        setField(term2368, term2368.getClass(), "next", null);
        setField(term2368, term2368.getClass(), "first", null);
        setField(term2368, term2368.getClass(), "last", null);
        setField(term2368, term2368.getClass(), "propListHead", null);
        setIntField(term2368, term2368.getClass(), "sourcePosition", 0);
        setField(term2368, term2368.getClass(), "jsType", null);
        setField(term2368, term2368.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "first", term2368);
        setIntField(term2371, term2371.getClass(), "type", 0);
        setField(term2371, term2371.getClass(), "next", null);
        setField(term2371, term2371.getClass(), "first", null);
        setField(term2371, term2371.getClass(), "last", null);
        setField(term2371, term2371.getClass(), "propListHead", null);
        setIntField(term2371, term2371.getClass(), "sourcePosition", 0);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "last", term2371);
        setField(term2374, term2374.getClass(), "next", null);
        setIntField(term2374, term2374.getClass(), "type", 0);
        setIntField(term2374, term2374.getClass(), "intValue", 0);
        setField(term2374, term2374.getClass(), "objectValue", null);
        setField(term2351, term2351.getClass(), "propListHead", term2374);
        setIntField(term2351, term2351.getClass(), "sourcePosition", 1734759369);
        setField(term2351, term2351.getClass(), "jsType", null);
        setField(term2351, term2351.getClass(), "parent", null);
        term15679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15684 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15687 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15679, term15679.getClass(), "type", -82632953);
        setIntField(term15680, term15680.getClass(), "type", 360972386);
        setIntField(term15681, term15681.getClass(), "type", 0);
        setField(term15681, term15681.getClass(), "next", null);
        setField(term15681, term15681.getClass(), "first", null);
        setField(term15681, term15681.getClass(), "last", null);
        setField(term15681, term15681.getClass(), "propListHead", null);
        setIntField(term15681, term15681.getClass(), "sourcePosition", 0);
        setField(term15681, term15681.getClass(), "jsType", null);
        setField(term15681, term15681.getClass(), "parent", null);
        setField(term15680, term15680.getClass(), "next", term15681);
        setIntField(term15682, term15682.getClass(), "type", 0);
        setField(term15682, term15682.getClass(), "next", null);
        setField(term15682, term15682.getClass(), "first", null);
        setField(term15682, term15682.getClass(), "last", null);
        setField(term15682, term15682.getClass(), "propListHead", null);
        setIntField(term15682, term15682.getClass(), "sourcePosition", 0);
        setField(term15682, term15682.getClass(), "jsType", null);
        setField(term15682, term15682.getClass(), "parent", null);
        setField(term15680, term15680.getClass(), "first", term15682);
        setIntField(term15683, term15683.getClass(), "type", 0);
        setField(term15683, term15683.getClass(), "next", null);
        setField(term15683, term15683.getClass(), "first", null);
        setField(term15683, term15683.getClass(), "last", null);
        setField(term15683, term15683.getClass(), "propListHead", null);
        setIntField(term15683, term15683.getClass(), "sourcePosition", 0);
        setField(term15683, term15683.getClass(), "jsType", null);
        setField(term15683, term15683.getClass(), "parent", null);
        setField(term15680, term15680.getClass(), "last", term15683);
        setField(term15684, term15684.getClass(), "next", null);
        setIntField(term15684, term15684.getClass(), "type", 0);
        setIntField(term15684, term15684.getClass(), "intValue", 0);
        setField(term15684, term15684.getClass(), "objectValue", null);
        setField(term15680, term15680.getClass(), "propListHead", term15684);
        setIntField(term15680, term15680.getClass(), "sourcePosition", 692873905);
        setField(term15680, term15680.getClass(), "jsType", null);
        setField(term15680, term15680.getClass(), "parent", null);
        setField(term15679, term15679.getClass(), "next", term15680);
        setIntField(term15685, term15685.getClass(), "type", 0);
        setField(term15685, term15685.getClass(), "next", null);
        setField(term15685, term15685.getClass(), "first", null);
        setField(term15685, term15685.getClass(), "last", null);
        setField(term15685, term15685.getClass(), "propListHead", null);
        setIntField(term15685, term15685.getClass(), "sourcePosition", 0);
        setField(term15685, term15685.getClass(), "jsType", null);
        setField(term15685, term15685.getClass(), "parent", null);
        setField(term15679, term15679.getClass(), "first", term15685);
        setIntField(term15686, term15686.getClass(), "type", 0);
        setField(term15686, term15686.getClass(), "next", null);
        setField(term15686, term15686.getClass(), "first", null);
        setField(term15686, term15686.getClass(), "last", null);
        setField(term15686, term15686.getClass(), "propListHead", null);
        setIntField(term15686, term15686.getClass(), "sourcePosition", 0);
        setField(term15686, term15686.getClass(), "jsType", null);
        setField(term15686, term15686.getClass(), "parent", null);
        setField(term15679, term15679.getClass(), "last", term15686);
        setField(term15687, term15687.getClass(), "next", null);
        setIntField(term15687, term15687.getClass(), "type", 0);
        setIntField(term15687, term15687.getClass(), "intValue", 0);
        setField(term15687, term15687.getClass(), "objectValue", null);
        setField(term15679, term15679.getClass(), "propListHead", term15687);
        setIntField(term15679, term15679.getClass(), "sourcePosition", 1734759369);
        setField(term15679, term15679.getClass(), "jsType", null);
        setField(term15679, term15679.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2351;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2351, term15679));
    }

};


