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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_getRhsSubexpressions_185555270853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3366;
     Object term3416;

    public NameAnalyzer_getRhsSubexpressions_185555270853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3367 = new HashMap();
        HashMap term3383 = new HashMap();
        Set<Object> term13001 =  ((Map) term3383).keySet();
        HashSet term3382 = new HashSet((Collection<? extends Object>) term13001);
        ArrayList term3389 = new ArrayList();
        HashMap term3394 = new HashMap();
        Set<Object> term13002 =  ((Map) term3394).keySet();
        HashSet term3393 = new HashSet((Collection<? extends Object>) term13002);
        ArrayList term3402 = new ArrayList();
        ((ArrayList) term3402).add((Object)null);
        ((ArrayList) term3402).add((Object)null);
        ((ArrayList) term3402).add((Object)null);
        ((ArrayList) term3402).add((Object)null);
        ((ArrayList) term3402).add((Object)null);
        HashMap term3406 = new HashMap();
        term3366 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3388 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3366, term3366.getClass(), "compiler", null);
        setField(term3366, term3366.getClass(), "allNames", term3367);
        setField(term3366, term3366.getClass(), "referenceGraph", null);
        setField(term3366, term3366.getClass(), "scopes", null);
        setBooleanField(term3366, term3366.getClass(), "removeUnreferenced", false);
        setField(term3366, term3366.getClass(), "globalNames", term3382);
        setField(term3388, term3388.getClass(), "listeners", term3389);
        setField(term3366, term3366.getClass(), "changeProxy", term3388);
        setField(term3366, term3366.getClass(), "externalNames", term3393);
        setField(term3366, term3366.getClass(), "refNodes", term3402);
        setField(term3366, term3366.getClass(), "aliases", term3406);
        term3416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3416, term3416.getClass(), "type", -1498296052);
        setIntField(term3418, term3418.getClass(), "type", 2098647989);
        setIntField(term3420, term3420.getClass(), "type", 1598895173);
        setIntField(term3422, term3422.getClass(), "type", 1830648570);
        setIntField(term3424, term3424.getClass(), "type", -227365013);
        setField(term3424, term3424.getClass(), "next", null);
        setField(term3424, term3424.getClass(), "first", null);
        setField(term3424, term3424.getClass(), "last", null);
        setField(term3424, term3424.getClass(), "propListHead", null);
        setIntField(term3424, term3424.getClass(), "sourcePosition", 0);
        setField(term3424, term3424.getClass(), "jsType", null);
        setField(term3424, term3424.getClass(), "parent", null);
        setField(term3422, term3422.getClass(), "next", term3424);
        setIntField(term3427, term3427.getClass(), "type", 11724947);
        setField(term3427, term3427.getClass(), "next", null);
        setField(term3427, term3427.getClass(), "first", null);
        setField(term3427, term3427.getClass(), "last", term3424);
        setField(term3427, term3427.getClass(), "propListHead", null);
        setIntField(term3427, term3427.getClass(), "sourcePosition", 0);
        setField(term3427, term3427.getClass(), "jsType", null);
        setField(term3427, term3427.getClass(), "parent", null);
        setField(term3422, term3422.getClass(), "first", term3427);
        setField(term3422, term3422.getClass(), "last", term3420);
        setField(term3422, term3422.getClass(), "propListHead", null);
        setIntField(term3422, term3422.getClass(), "sourcePosition", 0);
        setField(term3422, term3422.getClass(), "jsType", null);
        setField(term3422, term3422.getClass(), "parent", null);
        setField(term3420, term3420.getClass(), "next", term3422);
        setField(term3420, term3420.getClass(), "first", term3424);
        setIntField(term3431, term3431.getClass(), "type", 1283079251);
        setIntField(term3433, term3433.getClass(), "type", -523949691);
        setField(term3433, term3433.getClass(), "next", null);
        setField(term3433, term3433.getClass(), "first", term3427);
        setField(term3433, term3433.getClass(), "last", term3422);
        setField(term3433, term3433.getClass(), "propListHead", null);
        setIntField(term3433, term3433.getClass(), "sourcePosition", 0);
        setField(term3433, term3433.getClass(), "jsType", null);
        setField(term3433, term3433.getClass(), "parent", null);
        setField(term3431, term3431.getClass(), "next", term3433);
        setField(term3431, term3431.getClass(), "first", term3418);
        setField(term3431, term3431.getClass(), "last", term3418);
        setField(term3431, term3431.getClass(), "propListHead", null);
        setIntField(term3431, term3431.getClass(), "sourcePosition", 0);
        setField(term3431, term3431.getClass(), "jsType", null);
        setField(term3431, term3431.getClass(), "parent", null);
        setField(term3420, term3420.getClass(), "last", term3431);
        setField(term3420, term3420.getClass(), "propListHead", null);
        setIntField(term3420, term3420.getClass(), "sourcePosition", 0);
        setField(term3420, term3420.getClass(), "jsType", null);
        setField(term3420, term3420.getClass(), "parent", null);
        setField(term3418, term3418.getClass(), "next", term3420);
        setIntField(term3438, term3438.getClass(), "type", 1398204340);
        setField(term3438, term3438.getClass(), "next", term3431);
        setField(term3438, term3438.getClass(), "first", term3433);
        setField(term3438, term3438.getClass(), "last", term3416);
        setField(term3438, term3438.getClass(), "propListHead", null);
        setIntField(term3438, term3438.getClass(), "sourcePosition", 0);
        setField(term3438, term3438.getClass(), "jsType", null);
        setField(term3438, term3438.getClass(), "parent", null);
        setField(term3418, term3418.getClass(), "first", term3438);
        setField(term3418, term3418.getClass(), "last", term3438);
        setField(term3418, term3418.getClass(), "propListHead", null);
        setIntField(term3418, term3418.getClass(), "sourcePosition", 0);
        setField(term3418, term3418.getClass(), "jsType", null);
        setField(term3418, term3418.getClass(), "parent", null);
        setField(term3416, term3416.getClass(), "next", term3418);
        setField(term3416, term3416.getClass(), "first", term3422);
        setField(term3416, term3416.getClass(), "last", term3424);
        setField(term3416, term3416.getClass(), "propListHead", null);
        setIntField(term3416, term3416.getClass(), "sourcePosition", 0);
        setField(term3416, term3416.getClass(), "jsType", null);
        setField(term3416, term3416.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3416;
        try {
            callMethod(klass, "getRhsSubexpressions", argTypes, term3366, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


