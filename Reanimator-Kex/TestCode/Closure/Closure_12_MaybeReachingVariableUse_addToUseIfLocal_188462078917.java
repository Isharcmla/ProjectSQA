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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class MaybeReachingVariableUse_addToUseIfLocal_188462078917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;
     Object term361;
     Object term388;

    public MaybeReachingVariableUse_addToUseIfLocal_188462078917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term333 = new HashMap();
        term331 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term332 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term341 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term332, term332.getClass(), "vars", term333);
        setField(term341, term341.getClass(), "vars", null);
        setField(term341, term341.getClass(), "parent", null);
        setIntField(term341, term341.getClass(), "depth", 0);
        setField(term341, term341.getClass(), "rootNode", null);
        setField(term341, term341.getClass(), "thisType", null);
        setBooleanField(term341, term341.getClass(), "isBottom", false);
        setField(term341, term341.getClass(), "arguments", null);
        setField(term332, term332.getClass(), "parent", term341);
        setIntField(term332, term332.getClass(), "depth", 906181092);
        setIntField(term345, term345.getClass(), "type", 0);
        setField(term345, term345.getClass(), "next", null);
        setField(term345, term345.getClass(), "first", null);
        setField(term345, term345.getClass(), "last", null);
        setField(term345, term345.getClass(), "propListHead", null);
        setIntField(term345, term345.getClass(), "sourcePosition", 0);
        setField(term345, term345.getClass(), "jsType", null);
        setField(term345, term345.getClass(), "parent", null);
        setField(term332, term332.getClass(), "rootNode", term345);
        setField(term332, term332.getClass(), "thisType", null);
        setBooleanField(term332, term332.getClass(), "isBottom", false);
        setField(term332, term332.getClass(), "arguments", null);
        setField(term331, term331.getClass(), "jsScope", term332);
        setField(term331, term331.getClass(), "escaped", null);
        setField(term331, term331.getClass(), "cfg", null);
        setField(term331, term331.getClass(), "joinOp", null);
        setField(term331, term331.getClass(), "orderedWorkSet", null);
        term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term361, term361.getClass(), "type", 1045657203);
        setIntField(term363, term363.getClass(), "type", 1386130016);
        setIntField(term365, term365.getClass(), "type", 1072005683);
        setIntField(term367, term367.getClass(), "type", 1861318859);
        setIntField(term369, term369.getClass(), "type", 1474524152);
        setField(term369, term369.getClass(), "next", null);
        setField(term369, term369.getClass(), "first", null);
        setField(term369, term369.getClass(), "last", null);
        setField(term369, term369.getClass(), "propListHead", null);
        setIntField(term369, term369.getClass(), "sourcePosition", 0);
        setField(term369, term369.getClass(), "jsType", null);
        setField(term369, term369.getClass(), "parent", null);
        setField(term367, term367.getClass(), "next", term369);
        setIntField(term372, term372.getClass(), "type", 568954359);
        setField(term372, term372.getClass(), "next", null);
        setField(term372, term372.getClass(), "first", null);
        setField(term372, term372.getClass(), "last", term369);
        setField(term372, term372.getClass(), "propListHead", null);
        setIntField(term372, term372.getClass(), "sourcePosition", 0);
        setField(term372, term372.getClass(), "jsType", null);
        setField(term372, term372.getClass(), "parent", null);
        setField(term367, term367.getClass(), "first", term372);
        setField(term367, term367.getClass(), "last", term365);
        setField(term367, term367.getClass(), "propListHead", null);
        setIntField(term367, term367.getClass(), "sourcePosition", 0);
        setField(term367, term367.getClass(), "jsType", null);
        setField(term367, term367.getClass(), "parent", null);
        setField(term365, term365.getClass(), "next", term367);
        setField(term365, term365.getClass(), "first", term369);
        setIntField(term376, term376.getClass(), "type", -375014958);
        setIntField(term378, term378.getClass(), "type", 1107176718);
        setField(term378, term378.getClass(), "next", null);
        setField(term378, term378.getClass(), "first", term372);
        setField(term378, term378.getClass(), "last", term367);
        setField(term378, term378.getClass(), "propListHead", null);
        setIntField(term378, term378.getClass(), "sourcePosition", 0);
        setField(term378, term378.getClass(), "jsType", null);
        setField(term378, term378.getClass(), "parent", null);
        setField(term376, term376.getClass(), "next", term378);
        setField(term376, term376.getClass(), "first", term363);
        setField(term376, term376.getClass(), "last", term363);
        setField(term376, term376.getClass(), "propListHead", null);
        setIntField(term376, term376.getClass(), "sourcePosition", 0);
        setField(term376, term376.getClass(), "jsType", null);
        setField(term376, term376.getClass(), "parent", null);
        setField(term365, term365.getClass(), "last", term376);
        setField(term365, term365.getClass(), "propListHead", null);
        setIntField(term365, term365.getClass(), "sourcePosition", 0);
        setField(term365, term365.getClass(), "jsType", null);
        setField(term365, term365.getClass(), "parent", null);
        setField(term363, term363.getClass(), "next", term365);
        setIntField(term383, term383.getClass(), "type", 480137250);
        setField(term383, term383.getClass(), "next", term376);
        setField(term383, term383.getClass(), "first", term378);
        setField(term383, term383.getClass(), "last", term361);
        setField(term383, term383.getClass(), "propListHead", null);
        setIntField(term383, term383.getClass(), "sourcePosition", 0);
        setField(term383, term383.getClass(), "jsType", null);
        setField(term383, term383.getClass(), "parent", null);
        setField(term363, term363.getClass(), "first", term383);
        setField(term363, term363.getClass(), "last", term383);
        setField(term363, term363.getClass(), "propListHead", null);
        setIntField(term363, term363.getClass(), "sourcePosition", 0);
        setField(term363, term363.getClass(), "jsType", null);
        setField(term363, term363.getClass(), "parent", null);
        setField(term361, term361.getClass(), "next", term363);
        setField(term361, term361.getClass(), "first", term367);
        setField(term361, term361.getClass(), "last", term369);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        HashMap term391 = new HashMap();
        term388 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term389 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term389, term389.getClass(), "expectedValuesPerKey", 8);
        setField(term389, term389.getClass(), "map", term391);
        setIntField(term389, term389.getClass(), "totalSize", 0);
        setField(term389, term389.getClass(), "keySet", null);
        setField(term389, term389.getClass(), "multiset", null);
        setField(term389, term389.getClass(), "valuesCollection", null);
        setField(term389, term389.getClass(), "entries", null);
        setField(term389, term389.getClass(), "asMap", null);
        setField(term388, term388.getClass(), "mayUseMap", term389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[3];
        args[0] = "ZiaGIbnzTs";
        args[1] = term361;
        args[2] = term388;
        try {
            callMethod(klass, "addToUseIfLocal", argTypes, term331, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


