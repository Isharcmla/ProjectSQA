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

public class NodeUtil_isFunctionDeclaration_1398776191241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;
     Object term15718;

    public NodeUtil_isFunctionDeclaration_1398776191241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2401 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2378, term2378.getClass(), "type", -1986366126);
        setIntField(term2380, term2380.getClass(), "type", -1665928103);
        setIntField(term2382, term2382.getClass(), "type", 0);
        setField(term2382, term2382.getClass(), "next", null);
        setField(term2382, term2382.getClass(), "first", null);
        setField(term2382, term2382.getClass(), "last", null);
        setField(term2382, term2382.getClass(), "propListHead", null);
        setIntField(term2382, term2382.getClass(), "sourcePosition", 0);
        setField(term2382, term2382.getClass(), "jsType", null);
        setField(term2382, term2382.getClass(), "parent", null);
        setField(term2380, term2380.getClass(), "next", term2382);
        setIntField(term2385, term2385.getClass(), "type", 0);
        setField(term2385, term2385.getClass(), "next", null);
        setField(term2385, term2385.getClass(), "first", null);
        setField(term2385, term2385.getClass(), "last", null);
        setField(term2385, term2385.getClass(), "propListHead", null);
        setIntField(term2385, term2385.getClass(), "sourcePosition", 0);
        setField(term2385, term2385.getClass(), "jsType", null);
        setField(term2385, term2385.getClass(), "parent", null);
        setField(term2380, term2380.getClass(), "first", term2385);
        setIntField(term2388, term2388.getClass(), "type", 0);
        setField(term2388, term2388.getClass(), "next", null);
        setField(term2388, term2388.getClass(), "first", null);
        setField(term2388, term2388.getClass(), "last", null);
        setField(term2388, term2388.getClass(), "propListHead", null);
        setIntField(term2388, term2388.getClass(), "sourcePosition", 0);
        setField(term2388, term2388.getClass(), "jsType", null);
        setField(term2388, term2388.getClass(), "parent", null);
        setField(term2380, term2380.getClass(), "last", term2388);
        setField(term2391, term2391.getClass(), "next", null);
        setIntField(term2391, term2391.getClass(), "type", 0);
        setIntField(term2391, term2391.getClass(), "intValue", 0);
        setField(term2391, term2391.getClass(), "objectValue", null);
        setField(term2380, term2380.getClass(), "propListHead", term2391);
        setIntField(term2380, term2380.getClass(), "sourcePosition", -1023366103);
        setField(term2380, term2380.getClass(), "jsType", null);
        setField(term2380, term2380.getClass(), "parent", null);
        setField(term2378, term2378.getClass(), "next", term2380);
        setIntField(term2395, term2395.getClass(), "type", 0);
        setField(term2395, term2395.getClass(), "next", null);
        setField(term2395, term2395.getClass(), "first", null);
        setField(term2395, term2395.getClass(), "last", null);
        setField(term2395, term2395.getClass(), "propListHead", null);
        setIntField(term2395, term2395.getClass(), "sourcePosition", 0);
        setField(term2395, term2395.getClass(), "jsType", null);
        setField(term2395, term2395.getClass(), "parent", null);
        setField(term2378, term2378.getClass(), "first", term2395);
        setIntField(term2398, term2398.getClass(), "type", 0);
        setField(term2398, term2398.getClass(), "next", null);
        setField(term2398, term2398.getClass(), "first", null);
        setField(term2398, term2398.getClass(), "last", null);
        setField(term2398, term2398.getClass(), "propListHead", null);
        setIntField(term2398, term2398.getClass(), "sourcePosition", 0);
        setField(term2398, term2398.getClass(), "jsType", null);
        setField(term2398, term2398.getClass(), "parent", null);
        setField(term2378, term2378.getClass(), "last", term2398);
        setField(term2401, term2401.getClass(), "next", null);
        setIntField(term2401, term2401.getClass(), "type", 0);
        setIntField(term2401, term2401.getClass(), "intValue", 0);
        setField(term2401, term2401.getClass(), "objectValue", null);
        setField(term2378, term2378.getClass(), "propListHead", term2401);
        setIntField(term2378, term2378.getClass(), "sourcePosition", 81427089);
        setField(term2378, term2378.getClass(), "jsType", null);
        setField(term2378, term2378.getClass(), "parent", null);
        term15718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15723 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15726 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15718, term15718.getClass(), "type", -1986366126);
        setIntField(term15719, term15719.getClass(), "type", -1665928103);
        setIntField(term15720, term15720.getClass(), "type", 0);
        setField(term15720, term15720.getClass(), "next", null);
        setField(term15720, term15720.getClass(), "first", null);
        setField(term15720, term15720.getClass(), "last", null);
        setField(term15720, term15720.getClass(), "propListHead", null);
        setIntField(term15720, term15720.getClass(), "sourcePosition", 0);
        setField(term15720, term15720.getClass(), "jsType", null);
        setField(term15720, term15720.getClass(), "parent", null);
        setField(term15719, term15719.getClass(), "next", term15720);
        setIntField(term15721, term15721.getClass(), "type", 0);
        setField(term15721, term15721.getClass(), "next", null);
        setField(term15721, term15721.getClass(), "first", null);
        setField(term15721, term15721.getClass(), "last", null);
        setField(term15721, term15721.getClass(), "propListHead", null);
        setIntField(term15721, term15721.getClass(), "sourcePosition", 0);
        setField(term15721, term15721.getClass(), "jsType", null);
        setField(term15721, term15721.getClass(), "parent", null);
        setField(term15719, term15719.getClass(), "first", term15721);
        setIntField(term15722, term15722.getClass(), "type", 0);
        setField(term15722, term15722.getClass(), "next", null);
        setField(term15722, term15722.getClass(), "first", null);
        setField(term15722, term15722.getClass(), "last", null);
        setField(term15722, term15722.getClass(), "propListHead", null);
        setIntField(term15722, term15722.getClass(), "sourcePosition", 0);
        setField(term15722, term15722.getClass(), "jsType", null);
        setField(term15722, term15722.getClass(), "parent", null);
        setField(term15719, term15719.getClass(), "last", term15722);
        setField(term15723, term15723.getClass(), "next", null);
        setIntField(term15723, term15723.getClass(), "type", 0);
        setIntField(term15723, term15723.getClass(), "intValue", 0);
        setField(term15723, term15723.getClass(), "objectValue", null);
        setField(term15719, term15719.getClass(), "propListHead", term15723);
        setIntField(term15719, term15719.getClass(), "sourcePosition", -1023366103);
        setField(term15719, term15719.getClass(), "jsType", null);
        setField(term15719, term15719.getClass(), "parent", null);
        setField(term15718, term15718.getClass(), "next", term15719);
        setIntField(term15724, term15724.getClass(), "type", 0);
        setField(term15724, term15724.getClass(), "next", null);
        setField(term15724, term15724.getClass(), "first", null);
        setField(term15724, term15724.getClass(), "last", null);
        setField(term15724, term15724.getClass(), "propListHead", null);
        setIntField(term15724, term15724.getClass(), "sourcePosition", 0);
        setField(term15724, term15724.getClass(), "jsType", null);
        setField(term15724, term15724.getClass(), "parent", null);
        setField(term15718, term15718.getClass(), "first", term15724);
        setIntField(term15725, term15725.getClass(), "type", 0);
        setField(term15725, term15725.getClass(), "next", null);
        setField(term15725, term15725.getClass(), "first", null);
        setField(term15725, term15725.getClass(), "last", null);
        setField(term15725, term15725.getClass(), "propListHead", null);
        setIntField(term15725, term15725.getClass(), "sourcePosition", 0);
        setField(term15725, term15725.getClass(), "jsType", null);
        setField(term15725, term15725.getClass(), "parent", null);
        setField(term15718, term15718.getClass(), "last", term15725);
        setField(term15726, term15726.getClass(), "next", null);
        setIntField(term15726, term15726.getClass(), "type", 0);
        setIntField(term15726, term15726.getClass(), "intValue", 0);
        setField(term15726, term15726.getClass(), "objectValue", null);
        setField(term15718, term15718.getClass(), "propListHead", term15726);
        setIntField(term15718, term15718.getClass(), "sourcePosition", 81427089);
        setField(term15718, term15718.getClass(), "jsType", null);
        setField(term15718, term15718.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2378;
        Object retValue = callMethod(klass, "isFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2378, term15718));
        assertTrue(recursiveEquals(retValue, false));
    }

};


