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

public class NodeUtil_getInfoForNameNode_2009241699232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3463;
     Object term19964;

    public NodeUtil_getInfoForNameNode_2009241699232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3476 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3486 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3463, term3463.getClass(), "type", -58633039);
        setIntField(term3465, term3465.getClass(), "type", -91240911);
        setIntField(term3467, term3467.getClass(), "type", 0);
        setField(term3467, term3467.getClass(), "next", null);
        setField(term3467, term3467.getClass(), "first", null);
        setField(term3467, term3467.getClass(), "last", null);
        setField(term3467, term3467.getClass(), "propListHead", null);
        setIntField(term3467, term3467.getClass(), "sourcePosition", 0);
        setField(term3467, term3467.getClass(), "jsType", null);
        setField(term3467, term3467.getClass(), "parent", null);
        setField(term3465, term3465.getClass(), "next", term3467);
        setIntField(term3470, term3470.getClass(), "type", 0);
        setField(term3470, term3470.getClass(), "next", null);
        setField(term3470, term3470.getClass(), "first", null);
        setField(term3470, term3470.getClass(), "last", null);
        setField(term3470, term3470.getClass(), "propListHead", null);
        setIntField(term3470, term3470.getClass(), "sourcePosition", 0);
        setField(term3470, term3470.getClass(), "jsType", null);
        setField(term3470, term3470.getClass(), "parent", null);
        setField(term3465, term3465.getClass(), "first", term3470);
        setIntField(term3473, term3473.getClass(), "type", 0);
        setField(term3473, term3473.getClass(), "next", null);
        setField(term3473, term3473.getClass(), "first", null);
        setField(term3473, term3473.getClass(), "last", null);
        setField(term3473, term3473.getClass(), "propListHead", null);
        setIntField(term3473, term3473.getClass(), "sourcePosition", 0);
        setField(term3473, term3473.getClass(), "jsType", null);
        setField(term3473, term3473.getClass(), "parent", null);
        setField(term3465, term3465.getClass(), "last", term3473);
        setField(term3476, term3476.getClass(), "next", null);
        setIntField(term3476, term3476.getClass(), "type", 0);
        setIntField(term3476, term3476.getClass(), "intValue", 0);
        setField(term3476, term3476.getClass(), "objectValue", null);
        setField(term3465, term3465.getClass(), "propListHead", term3476);
        setIntField(term3465, term3465.getClass(), "sourcePosition", -215979293);
        setField(term3465, term3465.getClass(), "jsType", null);
        setField(term3465, term3465.getClass(), "parent", null);
        setField(term3463, term3463.getClass(), "next", term3465);
        setIntField(term3480, term3480.getClass(), "type", 0);
        setField(term3480, term3480.getClass(), "next", null);
        setField(term3480, term3480.getClass(), "first", null);
        setField(term3480, term3480.getClass(), "last", null);
        setField(term3480, term3480.getClass(), "propListHead", null);
        setIntField(term3480, term3480.getClass(), "sourcePosition", 0);
        setField(term3480, term3480.getClass(), "jsType", null);
        setField(term3480, term3480.getClass(), "parent", null);
        setField(term3463, term3463.getClass(), "first", term3480);
        setIntField(term3483, term3483.getClass(), "type", 0);
        setField(term3483, term3483.getClass(), "next", null);
        setField(term3483, term3483.getClass(), "first", null);
        setField(term3483, term3483.getClass(), "last", null);
        setField(term3483, term3483.getClass(), "propListHead", null);
        setIntField(term3483, term3483.getClass(), "sourcePosition", 0);
        setField(term3483, term3483.getClass(), "jsType", null);
        setField(term3483, term3483.getClass(), "parent", null);
        setField(term3463, term3463.getClass(), "last", term3483);
        setField(term3486, term3486.getClass(), "next", null);
        setIntField(term3486, term3486.getClass(), "type", 0);
        setIntField(term3486, term3486.getClass(), "intValue", 0);
        setField(term3486, term3486.getClass(), "objectValue", null);
        setField(term3463, term3463.getClass(), "propListHead", term3486);
        setIntField(term3463, term3463.getClass(), "sourcePosition", -19567889);
        setField(term3463, term3463.getClass(), "jsType", null);
        setField(term3463, term3463.getClass(), "parent", null);
        term19964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19969 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19972 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term19964, term19964.getClass(), "type", -58633039);
        setIntField(term19965, term19965.getClass(), "type", -91240911);
        setIntField(term19966, term19966.getClass(), "type", 0);
        setField(term19966, term19966.getClass(), "next", null);
        setField(term19966, term19966.getClass(), "first", null);
        setField(term19966, term19966.getClass(), "last", null);
        setField(term19966, term19966.getClass(), "propListHead", null);
        setIntField(term19966, term19966.getClass(), "sourcePosition", 0);
        setField(term19966, term19966.getClass(), "jsType", null);
        setField(term19966, term19966.getClass(), "parent", null);
        setField(term19965, term19965.getClass(), "next", term19966);
        setIntField(term19967, term19967.getClass(), "type", 0);
        setField(term19967, term19967.getClass(), "next", null);
        setField(term19967, term19967.getClass(), "first", null);
        setField(term19967, term19967.getClass(), "last", null);
        setField(term19967, term19967.getClass(), "propListHead", null);
        setIntField(term19967, term19967.getClass(), "sourcePosition", 0);
        setField(term19967, term19967.getClass(), "jsType", null);
        setField(term19967, term19967.getClass(), "parent", null);
        setField(term19965, term19965.getClass(), "first", term19967);
        setIntField(term19968, term19968.getClass(), "type", 0);
        setField(term19968, term19968.getClass(), "next", null);
        setField(term19968, term19968.getClass(), "first", null);
        setField(term19968, term19968.getClass(), "last", null);
        setField(term19968, term19968.getClass(), "propListHead", null);
        setIntField(term19968, term19968.getClass(), "sourcePosition", 0);
        setField(term19968, term19968.getClass(), "jsType", null);
        setField(term19968, term19968.getClass(), "parent", null);
        setField(term19965, term19965.getClass(), "last", term19968);
        setField(term19969, term19969.getClass(), "next", null);
        setIntField(term19969, term19969.getClass(), "type", 0);
        setIntField(term19969, term19969.getClass(), "intValue", 0);
        setField(term19969, term19969.getClass(), "objectValue", null);
        setField(term19965, term19965.getClass(), "propListHead", term19969);
        setIntField(term19965, term19965.getClass(), "sourcePosition", -215979293);
        setField(term19965, term19965.getClass(), "jsType", null);
        setField(term19965, term19965.getClass(), "parent", null);
        setField(term19964, term19964.getClass(), "next", term19965);
        setIntField(term19970, term19970.getClass(), "type", 0);
        setField(term19970, term19970.getClass(), "next", null);
        setField(term19970, term19970.getClass(), "first", null);
        setField(term19970, term19970.getClass(), "last", null);
        setField(term19970, term19970.getClass(), "propListHead", null);
        setIntField(term19970, term19970.getClass(), "sourcePosition", 0);
        setField(term19970, term19970.getClass(), "jsType", null);
        setField(term19970, term19970.getClass(), "parent", null);
        setField(term19964, term19964.getClass(), "first", term19970);
        setIntField(term19971, term19971.getClass(), "type", 0);
        setField(term19971, term19971.getClass(), "next", null);
        setField(term19971, term19971.getClass(), "first", null);
        setField(term19971, term19971.getClass(), "last", null);
        setField(term19971, term19971.getClass(), "propListHead", null);
        setIntField(term19971, term19971.getClass(), "sourcePosition", 0);
        setField(term19971, term19971.getClass(), "jsType", null);
        setField(term19971, term19971.getClass(), "parent", null);
        setField(term19964, term19964.getClass(), "last", term19971);
        setField(term19972, term19972.getClass(), "next", null);
        setIntField(term19972, term19972.getClass(), "type", 0);
        setIntField(term19972, term19972.getClass(), "intValue", 0);
        setField(term19972, term19972.getClass(), "objectValue", null);
        setField(term19964, term19964.getClass(), "propListHead", term19972);
        setIntField(term19964, term19964.getClass(), "sourcePosition", -19567889);
        setField(term19964, term19964.getClass(), "jsType", null);
        setField(term19964, term19964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3463;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term3463, term19964));
        assertTrue(recursiveEquals(retValue, null));
    }

};


