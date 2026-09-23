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

public class NodeUtil_isNew_889590303133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term6462;

    public NodeUtil_isNew_889590303133() {
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
        term6462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6467 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6470 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6462, term6462.getClass(), "type", 803925431);
        setIntField(term6463, term6463.getClass(), "type", -1835839814);
        setIntField(term6464, term6464.getClass(), "type", 0);
        setField(term6464, term6464.getClass(), "next", null);
        setField(term6464, term6464.getClass(), "first", null);
        setField(term6464, term6464.getClass(), "last", null);
        setField(term6464, term6464.getClass(), "propListHead", null);
        setIntField(term6464, term6464.getClass(), "sourcePosition", 0);
        setField(term6464, term6464.getClass(), "jsType", null);
        setField(term6464, term6464.getClass(), "parent", null);
        setField(term6463, term6463.getClass(), "next", term6464);
        setIntField(term6465, term6465.getClass(), "type", 0);
        setField(term6465, term6465.getClass(), "next", null);
        setField(term6465, term6465.getClass(), "first", null);
        setField(term6465, term6465.getClass(), "last", null);
        setField(term6465, term6465.getClass(), "propListHead", null);
        setIntField(term6465, term6465.getClass(), "sourcePosition", 0);
        setField(term6465, term6465.getClass(), "jsType", null);
        setField(term6465, term6465.getClass(), "parent", null);
        setField(term6463, term6463.getClass(), "first", term6465);
        setIntField(term6466, term6466.getClass(), "type", 0);
        setField(term6466, term6466.getClass(), "next", null);
        setField(term6466, term6466.getClass(), "first", null);
        setField(term6466, term6466.getClass(), "last", null);
        setField(term6466, term6466.getClass(), "propListHead", null);
        setIntField(term6466, term6466.getClass(), "sourcePosition", 0);
        setField(term6466, term6466.getClass(), "jsType", null);
        setField(term6466, term6466.getClass(), "parent", null);
        setField(term6463, term6463.getClass(), "last", term6466);
        setField(term6467, term6467.getClass(), "next", null);
        setIntField(term6467, term6467.getClass(), "type", 0);
        setIntField(term6467, term6467.getClass(), "intValue", 0);
        setField(term6467, term6467.getClass(), "objectValue", null);
        setField(term6463, term6463.getClass(), "propListHead", term6467);
        setIntField(term6463, term6463.getClass(), "sourcePosition", 579006268);
        setField(term6463, term6463.getClass(), "jsType", null);
        setField(term6463, term6463.getClass(), "parent", null);
        setField(term6462, term6462.getClass(), "next", term6463);
        setIntField(term6468, term6468.getClass(), "type", 0);
        setField(term6468, term6468.getClass(), "next", null);
        setField(term6468, term6468.getClass(), "first", null);
        setField(term6468, term6468.getClass(), "last", null);
        setField(term6468, term6468.getClass(), "propListHead", null);
        setIntField(term6468, term6468.getClass(), "sourcePosition", 0);
        setField(term6468, term6468.getClass(), "jsType", null);
        setField(term6468, term6468.getClass(), "parent", null);
        setField(term6462, term6462.getClass(), "first", term6468);
        setIntField(term6469, term6469.getClass(), "type", 0);
        setField(term6469, term6469.getClass(), "next", null);
        setField(term6469, term6469.getClass(), "first", null);
        setField(term6469, term6469.getClass(), "last", null);
        setField(term6469, term6469.getClass(), "propListHead", null);
        setIntField(term6469, term6469.getClass(), "sourcePosition", 0);
        setField(term6469, term6469.getClass(), "jsType", null);
        setField(term6469, term6469.getClass(), "parent", null);
        setField(term6462, term6462.getClass(), "last", term6469);
        setField(term6470, term6470.getClass(), "next", null);
        setIntField(term6470, term6470.getClass(), "type", 0);
        setIntField(term6470, term6470.getClass(), "intValue", 0);
        setField(term6470, term6470.getClass(), "objectValue", null);
        setField(term6462, term6462.getClass(), "propListHead", term6470);
        setIntField(term6462, term6462.getClass(), "sourcePosition", -1694747156);
        setField(term6462, term6462.getClass(), "jsType", null);
        setField(term6462, term6462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term733;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term733, term6462));
        assertTrue(recursiveEquals(retValue, false));
    }

};


