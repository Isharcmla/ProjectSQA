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
import java.util.LinkedHashMap;

public class NodeUtil_getVarsDeclaredInBranch_1317953546211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2779;
     Object term15450;
     Object term15443;

    public NodeUtil_getVarsDeclaredInBranch_1317953546211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2792 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2802 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2779, term2779.getClass(), "type", 919994471);
        setIntField(term2781, term2781.getClass(), "type", -1870339027);
        setIntField(term2783, term2783.getClass(), "type", 0);
        setField(term2783, term2783.getClass(), "next", null);
        setField(term2783, term2783.getClass(), "first", null);
        setField(term2783, term2783.getClass(), "last", null);
        setField(term2783, term2783.getClass(), "propListHead", null);
        setIntField(term2783, term2783.getClass(), "sourcePosition", 0);
        setField(term2783, term2783.getClass(), "jsType", null);
        setField(term2783, term2783.getClass(), "parent", null);
        setField(term2781, term2781.getClass(), "next", term2783);
        setIntField(term2786, term2786.getClass(), "type", 0);
        setField(term2786, term2786.getClass(), "next", null);
        setField(term2786, term2786.getClass(), "first", null);
        setField(term2786, term2786.getClass(), "last", null);
        setField(term2786, term2786.getClass(), "propListHead", null);
        setIntField(term2786, term2786.getClass(), "sourcePosition", 0);
        setField(term2786, term2786.getClass(), "jsType", null);
        setField(term2786, term2786.getClass(), "parent", null);
        setField(term2781, term2781.getClass(), "first", term2786);
        setIntField(term2789, term2789.getClass(), "type", 0);
        setField(term2789, term2789.getClass(), "next", null);
        setField(term2789, term2789.getClass(), "first", null);
        setField(term2789, term2789.getClass(), "last", null);
        setField(term2789, term2789.getClass(), "propListHead", null);
        setIntField(term2789, term2789.getClass(), "sourcePosition", 0);
        setField(term2789, term2789.getClass(), "jsType", null);
        setField(term2789, term2789.getClass(), "parent", null);
        setField(term2781, term2781.getClass(), "last", term2789);
        setField(term2792, term2792.getClass(), "next", null);
        setIntField(term2792, term2792.getClass(), "type", 0);
        setIntField(term2792, term2792.getClass(), "intValue", 0);
        setField(term2792, term2792.getClass(), "objectValue", null);
        setField(term2781, term2781.getClass(), "propListHead", term2792);
        setIntField(term2781, term2781.getClass(), "sourcePosition", -1823813592);
        setField(term2781, term2781.getClass(), "jsType", null);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "next", term2781);
        setIntField(term2796, term2796.getClass(), "type", 0);
        setField(term2796, term2796.getClass(), "next", null);
        setField(term2796, term2796.getClass(), "first", null);
        setField(term2796, term2796.getClass(), "last", null);
        setField(term2796, term2796.getClass(), "propListHead", null);
        setIntField(term2796, term2796.getClass(), "sourcePosition", 0);
        setField(term2796, term2796.getClass(), "jsType", null);
        setField(term2796, term2796.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "first", term2796);
        setIntField(term2799, term2799.getClass(), "type", 0);
        setField(term2799, term2799.getClass(), "next", null);
        setField(term2799, term2799.getClass(), "first", null);
        setField(term2799, term2799.getClass(), "last", null);
        setField(term2799, term2799.getClass(), "propListHead", null);
        setIntField(term2799, term2799.getClass(), "sourcePosition", 0);
        setField(term2799, term2799.getClass(), "jsType", null);
        setField(term2799, term2799.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "last", term2799);
        setField(term2802, term2802.getClass(), "next", null);
        setIntField(term2802, term2802.getClass(), "type", 0);
        setIntField(term2802, term2802.getClass(), "intValue", 0);
        setField(term2802, term2802.getClass(), "objectValue", null);
        setField(term2779, term2779.getClass(), "propListHead", term2802);
        setIntField(term2779, term2779.getClass(), "sourcePosition", -1644358555);
        setField(term2779, term2779.getClass(), "jsType", null);
        setField(term2779, term2779.getClass(), "parent", null);
        term15450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15455 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15458 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15450, term15450.getClass(), "type", 919994471);
        setIntField(term15451, term15451.getClass(), "type", -1870339027);
        setIntField(term15452, term15452.getClass(), "type", 0);
        setField(term15452, term15452.getClass(), "next", null);
        setField(term15452, term15452.getClass(), "first", null);
        setField(term15452, term15452.getClass(), "last", null);
        setField(term15452, term15452.getClass(), "propListHead", null);
        setIntField(term15452, term15452.getClass(), "sourcePosition", 0);
        setField(term15452, term15452.getClass(), "jsType", null);
        setField(term15452, term15452.getClass(), "parent", null);
        setField(term15451, term15451.getClass(), "next", term15452);
        setIntField(term15453, term15453.getClass(), "type", 0);
        setField(term15453, term15453.getClass(), "next", null);
        setField(term15453, term15453.getClass(), "first", null);
        setField(term15453, term15453.getClass(), "last", null);
        setField(term15453, term15453.getClass(), "propListHead", null);
        setIntField(term15453, term15453.getClass(), "sourcePosition", 0);
        setField(term15453, term15453.getClass(), "jsType", null);
        setField(term15453, term15453.getClass(), "parent", null);
        setField(term15451, term15451.getClass(), "first", term15453);
        setIntField(term15454, term15454.getClass(), "type", 0);
        setField(term15454, term15454.getClass(), "next", null);
        setField(term15454, term15454.getClass(), "first", null);
        setField(term15454, term15454.getClass(), "last", null);
        setField(term15454, term15454.getClass(), "propListHead", null);
        setIntField(term15454, term15454.getClass(), "sourcePosition", 0);
        setField(term15454, term15454.getClass(), "jsType", null);
        setField(term15454, term15454.getClass(), "parent", null);
        setField(term15451, term15451.getClass(), "last", term15454);
        setField(term15455, term15455.getClass(), "next", null);
        setIntField(term15455, term15455.getClass(), "type", 0);
        setIntField(term15455, term15455.getClass(), "intValue", 0);
        setField(term15455, term15455.getClass(), "objectValue", null);
        setField(term15451, term15451.getClass(), "propListHead", term15455);
        setIntField(term15451, term15451.getClass(), "sourcePosition", -1823813592);
        setField(term15451, term15451.getClass(), "jsType", null);
        setField(term15451, term15451.getClass(), "parent", null);
        setField(term15450, term15450.getClass(), "next", term15451);
        setIntField(term15456, term15456.getClass(), "type", 0);
        setField(term15456, term15456.getClass(), "next", null);
        setField(term15456, term15456.getClass(), "first", null);
        setField(term15456, term15456.getClass(), "last", null);
        setField(term15456, term15456.getClass(), "propListHead", null);
        setIntField(term15456, term15456.getClass(), "sourcePosition", 0);
        setField(term15456, term15456.getClass(), "jsType", null);
        setField(term15456, term15456.getClass(), "parent", null);
        setField(term15450, term15450.getClass(), "first", term15456);
        setIntField(term15457, term15457.getClass(), "type", 0);
        setField(term15457, term15457.getClass(), "next", null);
        setField(term15457, term15457.getClass(), "first", null);
        setField(term15457, term15457.getClass(), "last", null);
        setField(term15457, term15457.getClass(), "propListHead", null);
        setIntField(term15457, term15457.getClass(), "sourcePosition", 0);
        setField(term15457, term15457.getClass(), "jsType", null);
        setField(term15457, term15457.getClass(), "parent", null);
        setField(term15450, term15450.getClass(), "last", term15457);
        setField(term15458, term15458.getClass(), "next", null);
        setIntField(term15458, term15458.getClass(), "type", 0);
        setIntField(term15458, term15458.getClass(), "intValue", 0);
        setField(term15458, term15458.getClass(), "objectValue", null);
        setField(term15450, term15450.getClass(), "propListHead", term15458);
        setIntField(term15450, term15450.getClass(), "sourcePosition", -1644358555);
        setField(term15450, term15450.getClass(), "jsType", null);
        setField(term15450, term15450.getClass(), "parent", null);
        LinkedHashMap term15444 = new LinkedHashMap();
        term15443 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term15443, term15443.getClass(), "this$0", term15444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2779;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2779, term15450));
        assertTrue(recursiveEquals(retValue, term15443));
    }

};


