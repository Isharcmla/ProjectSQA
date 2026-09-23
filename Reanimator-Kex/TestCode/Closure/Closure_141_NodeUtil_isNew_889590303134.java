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

public class NodeUtil_isNew_889590303134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term6489;

    public NodeUtil_isNew_889590303134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term733, term733.getClass(), "type", 803925431);
        setIntField(term735, term735.getClass(), "type", -1835839814);
        setIntField(term737, term737.getClass(), "type", 0);
        setField(term737, term737.getClass(), "next", null);
        setField(term737, term737.getClass(), "first", null);
        setField(term737, term737.getClass(), "last", null);
        setField(term737, term737.getClass(), "propListHead", null);
        setIntField(term737, term737.getClass(), "sourcePosition", 0);
        setField(term737, term737.getClass(), "jsType", null);
        setField(term737, term737.getClass(), "parent", null);
        setField(term735, term735.getClass(), "next", term737);
        setIntField(term740, term740.getClass(), "type", 0);
        setField(term740, term740.getClass(), "next", null);
        setField(term740, term740.getClass(), "first", null);
        setField(term740, term740.getClass(), "last", null);
        setField(term740, term740.getClass(), "propListHead", null);
        setIntField(term740, term740.getClass(), "sourcePosition", 0);
        setField(term740, term740.getClass(), "jsType", null);
        setField(term740, term740.getClass(), "parent", null);
        setField(term735, term735.getClass(), "first", term740);
        setIntField(term743, term743.getClass(), "type", 0);
        setField(term743, term743.getClass(), "next", null);
        setField(term743, term743.getClass(), "first", null);
        setField(term743, term743.getClass(), "last", null);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term735, term735.getClass(), "last", term743);
        setField(term746, term746.getClass(), "next", null);
        setIntField(term746, term746.getClass(), "type", 0);
        setIntField(term746, term746.getClass(), "intValue", 0);
        setField(term746, term746.getClass(), "objectValue", null);
        setField(term735, term735.getClass(), "propListHead", term746);
        setIntField(term735, term735.getClass(), "sourcePosition", 579006268);
        setField(term735, term735.getClass(), "jsType", null);
        setField(term735, term735.getClass(), "parent", null);
        setField(term733, term733.getClass(), "next", term735);
        setIntField(term750, term750.getClass(), "type", 0);
        setField(term750, term750.getClass(), "next", null);
        setField(term750, term750.getClass(), "first", null);
        setField(term750, term750.getClass(), "last", null);
        setField(term750, term750.getClass(), "propListHead", null);
        setIntField(term750, term750.getClass(), "sourcePosition", 0);
        setField(term750, term750.getClass(), "jsType", null);
        setField(term750, term750.getClass(), "parent", null);
        setField(term733, term733.getClass(), "first", term750);
        setIntField(term753, term753.getClass(), "type", 0);
        setField(term753, term753.getClass(), "next", null);
        setField(term753, term753.getClass(), "first", null);
        setField(term753, term753.getClass(), "last", null);
        setField(term753, term753.getClass(), "propListHead", null);
        setIntField(term753, term753.getClass(), "sourcePosition", 0);
        setField(term753, term753.getClass(), "jsType", null);
        setField(term753, term753.getClass(), "parent", null);
        setField(term733, term733.getClass(), "last", term753);
        setField(term756, term756.getClass(), "next", null);
        setIntField(term756, term756.getClass(), "type", 0);
        setIntField(term756, term756.getClass(), "intValue", 0);
        setField(term756, term756.getClass(), "objectValue", null);
        setField(term733, term733.getClass(), "propListHead", term756);
        setIntField(term733, term733.getClass(), "sourcePosition", -1694747156);
        setField(term733, term733.getClass(), "jsType", null);
        setField(term733, term733.getClass(), "parent", null);
        term6489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6494 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6497 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6489, term6489.getClass(), "type", 803925431);
        setIntField(term6490, term6490.getClass(), "type", -1835839814);
        setIntField(term6491, term6491.getClass(), "type", 0);
        setField(term6491, term6491.getClass(), "next", null);
        setField(term6491, term6491.getClass(), "first", null);
        setField(term6491, term6491.getClass(), "last", null);
        setField(term6491, term6491.getClass(), "propListHead", null);
        setIntField(term6491, term6491.getClass(), "sourcePosition", 0);
        setField(term6491, term6491.getClass(), "jsType", null);
        setField(term6491, term6491.getClass(), "parent", null);
        setField(term6490, term6490.getClass(), "next", term6491);
        setIntField(term6492, term6492.getClass(), "type", 0);
        setField(term6492, term6492.getClass(), "next", null);
        setField(term6492, term6492.getClass(), "first", null);
        setField(term6492, term6492.getClass(), "last", null);
        setField(term6492, term6492.getClass(), "propListHead", null);
        setIntField(term6492, term6492.getClass(), "sourcePosition", 0);
        setField(term6492, term6492.getClass(), "jsType", null);
        setField(term6492, term6492.getClass(), "parent", null);
        setField(term6490, term6490.getClass(), "first", term6492);
        setIntField(term6493, term6493.getClass(), "type", 0);
        setField(term6493, term6493.getClass(), "next", null);
        setField(term6493, term6493.getClass(), "first", null);
        setField(term6493, term6493.getClass(), "last", null);
        setField(term6493, term6493.getClass(), "propListHead", null);
        setIntField(term6493, term6493.getClass(), "sourcePosition", 0);
        setField(term6493, term6493.getClass(), "jsType", null);
        setField(term6493, term6493.getClass(), "parent", null);
        setField(term6490, term6490.getClass(), "last", term6493);
        setField(term6494, term6494.getClass(), "next", null);
        setIntField(term6494, term6494.getClass(), "type", 0);
        setIntField(term6494, term6494.getClass(), "intValue", 0);
        setField(term6494, term6494.getClass(), "objectValue", null);
        setField(term6490, term6490.getClass(), "propListHead", term6494);
        setIntField(term6490, term6490.getClass(), "sourcePosition", 579006268);
        setField(term6490, term6490.getClass(), "jsType", null);
        setField(term6490, term6490.getClass(), "parent", null);
        setField(term6489, term6489.getClass(), "next", term6490);
        setIntField(term6495, term6495.getClass(), "type", 0);
        setField(term6495, term6495.getClass(), "next", null);
        setField(term6495, term6495.getClass(), "first", null);
        setField(term6495, term6495.getClass(), "last", null);
        setField(term6495, term6495.getClass(), "propListHead", null);
        setIntField(term6495, term6495.getClass(), "sourcePosition", 0);
        setField(term6495, term6495.getClass(), "jsType", null);
        setField(term6495, term6495.getClass(), "parent", null);
        setField(term6489, term6489.getClass(), "first", term6495);
        setIntField(term6496, term6496.getClass(), "type", 0);
        setField(term6496, term6496.getClass(), "next", null);
        setField(term6496, term6496.getClass(), "first", null);
        setField(term6496, term6496.getClass(), "last", null);
        setField(term6496, term6496.getClass(), "propListHead", null);
        setIntField(term6496, term6496.getClass(), "sourcePosition", 0);
        setField(term6496, term6496.getClass(), "jsType", null);
        setField(term6496, term6496.getClass(), "parent", null);
        setField(term6489, term6489.getClass(), "last", term6496);
        setField(term6497, term6497.getClass(), "next", null);
        setIntField(term6497, term6497.getClass(), "type", 0);
        setIntField(term6497, term6497.getClass(), "intValue", 0);
        setField(term6497, term6497.getClass(), "objectValue", null);
        setField(term6489, term6489.getClass(), "propListHead", term6497);
        setIntField(term6489, term6489.getClass(), "sourcePosition", -1694747156);
        setField(term6489, term6489.getClass(), "jsType", null);
        setField(term6489, term6489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term733;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term733, term6489));
        assertTrue(recursiveEquals(retValue, false));
    }

};


