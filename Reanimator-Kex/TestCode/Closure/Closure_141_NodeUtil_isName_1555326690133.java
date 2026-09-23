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

public class NodeUtil_isName_1555326690133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term6449;

    public NodeUtil_isName_1555326690133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term706, term706.getClass(), "type", -1070592289);
        setIntField(term708, term708.getClass(), "type", 1252951645);
        setIntField(term710, term710.getClass(), "type", 0);
        setField(term710, term710.getClass(), "next", null);
        setField(term710, term710.getClass(), "first", null);
        setField(term710, term710.getClass(), "last", null);
        setField(term710, term710.getClass(), "propListHead", null);
        setIntField(term710, term710.getClass(), "sourcePosition", 0);
        setField(term710, term710.getClass(), "jsType", null);
        setField(term710, term710.getClass(), "parent", null);
        setField(term708, term708.getClass(), "next", term710);
        setIntField(term713, term713.getClass(), "type", 0);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "first", null);
        setField(term713, term713.getClass(), "last", null);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term708, term708.getClass(), "first", term713);
        setIntField(term716, term716.getClass(), "type", 0);
        setField(term716, term716.getClass(), "next", null);
        setField(term716, term716.getClass(), "first", null);
        setField(term716, term716.getClass(), "last", null);
        setField(term716, term716.getClass(), "propListHead", null);
        setIntField(term716, term716.getClass(), "sourcePosition", 0);
        setField(term716, term716.getClass(), "jsType", null);
        setField(term716, term716.getClass(), "parent", null);
        setField(term708, term708.getClass(), "last", term716);
        setField(term719, term719.getClass(), "next", null);
        setIntField(term719, term719.getClass(), "type", 0);
        setIntField(term719, term719.getClass(), "intValue", 0);
        setField(term719, term719.getClass(), "objectValue", null);
        setField(term708, term708.getClass(), "propListHead", term719);
        setIntField(term708, term708.getClass(), "sourcePosition", -634976996);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term706, term706.getClass(), "next", term708);
        setIntField(term723, term723.getClass(), "type", 0);
        setField(term723, term723.getClass(), "next", null);
        setField(term723, term723.getClass(), "first", null);
        setField(term723, term723.getClass(), "last", null);
        setField(term723, term723.getClass(), "propListHead", null);
        setIntField(term723, term723.getClass(), "sourcePosition", 0);
        setField(term723, term723.getClass(), "jsType", null);
        setField(term723, term723.getClass(), "parent", null);
        setField(term706, term706.getClass(), "first", term723);
        setIntField(term726, term726.getClass(), "type", 0);
        setField(term726, term726.getClass(), "next", null);
        setField(term726, term726.getClass(), "first", null);
        setField(term726, term726.getClass(), "last", null);
        setField(term726, term726.getClass(), "propListHead", null);
        setIntField(term726, term726.getClass(), "sourcePosition", 0);
        setField(term726, term726.getClass(), "jsType", null);
        setField(term726, term726.getClass(), "parent", null);
        setField(term706, term706.getClass(), "last", term726);
        setField(term729, term729.getClass(), "next", null);
        setIntField(term729, term729.getClass(), "type", 0);
        setIntField(term729, term729.getClass(), "intValue", 0);
        setField(term729, term729.getClass(), "objectValue", null);
        setField(term706, term706.getClass(), "propListHead", term729);
        setIntField(term706, term706.getClass(), "sourcePosition", -1015274146);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        term6449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6454 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6457 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6449, term6449.getClass(), "type", -1070592289);
        setIntField(term6450, term6450.getClass(), "type", 1252951645);
        setIntField(term6451, term6451.getClass(), "type", 0);
        setField(term6451, term6451.getClass(), "next", null);
        setField(term6451, term6451.getClass(), "first", null);
        setField(term6451, term6451.getClass(), "last", null);
        setField(term6451, term6451.getClass(), "propListHead", null);
        setIntField(term6451, term6451.getClass(), "sourcePosition", 0);
        setField(term6451, term6451.getClass(), "jsType", null);
        setField(term6451, term6451.getClass(), "parent", null);
        setField(term6450, term6450.getClass(), "next", term6451);
        setIntField(term6452, term6452.getClass(), "type", 0);
        setField(term6452, term6452.getClass(), "next", null);
        setField(term6452, term6452.getClass(), "first", null);
        setField(term6452, term6452.getClass(), "last", null);
        setField(term6452, term6452.getClass(), "propListHead", null);
        setIntField(term6452, term6452.getClass(), "sourcePosition", 0);
        setField(term6452, term6452.getClass(), "jsType", null);
        setField(term6452, term6452.getClass(), "parent", null);
        setField(term6450, term6450.getClass(), "first", term6452);
        setIntField(term6453, term6453.getClass(), "type", 0);
        setField(term6453, term6453.getClass(), "next", null);
        setField(term6453, term6453.getClass(), "first", null);
        setField(term6453, term6453.getClass(), "last", null);
        setField(term6453, term6453.getClass(), "propListHead", null);
        setIntField(term6453, term6453.getClass(), "sourcePosition", 0);
        setField(term6453, term6453.getClass(), "jsType", null);
        setField(term6453, term6453.getClass(), "parent", null);
        setField(term6450, term6450.getClass(), "last", term6453);
        setField(term6454, term6454.getClass(), "next", null);
        setIntField(term6454, term6454.getClass(), "type", 0);
        setIntField(term6454, term6454.getClass(), "intValue", 0);
        setField(term6454, term6454.getClass(), "objectValue", null);
        setField(term6450, term6450.getClass(), "propListHead", term6454);
        setIntField(term6450, term6450.getClass(), "sourcePosition", -634976996);
        setField(term6450, term6450.getClass(), "jsType", null);
        setField(term6450, term6450.getClass(), "parent", null);
        setField(term6449, term6449.getClass(), "next", term6450);
        setIntField(term6455, term6455.getClass(), "type", 0);
        setField(term6455, term6455.getClass(), "next", null);
        setField(term6455, term6455.getClass(), "first", null);
        setField(term6455, term6455.getClass(), "last", null);
        setField(term6455, term6455.getClass(), "propListHead", null);
        setIntField(term6455, term6455.getClass(), "sourcePosition", 0);
        setField(term6455, term6455.getClass(), "jsType", null);
        setField(term6455, term6455.getClass(), "parent", null);
        setField(term6449, term6449.getClass(), "first", term6455);
        setIntField(term6456, term6456.getClass(), "type", 0);
        setField(term6456, term6456.getClass(), "next", null);
        setField(term6456, term6456.getClass(), "first", null);
        setField(term6456, term6456.getClass(), "last", null);
        setField(term6456, term6456.getClass(), "propListHead", null);
        setIntField(term6456, term6456.getClass(), "sourcePosition", 0);
        setField(term6456, term6456.getClass(), "jsType", null);
        setField(term6456, term6456.getClass(), "parent", null);
        setField(term6449, term6449.getClass(), "last", term6456);
        setField(term6457, term6457.getClass(), "next", null);
        setIntField(term6457, term6457.getClass(), "type", 0);
        setIntField(term6457, term6457.getClass(), "intValue", 0);
        setField(term6457, term6457.getClass(), "objectValue", null);
        setField(term6449, term6449.getClass(), "propListHead", term6457);
        setIntField(term6449, term6449.getClass(), "sourcePosition", -1015274146);
        setField(term6449, term6449.getClass(), "jsType", null);
        setField(term6449, term6449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term706;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term706, term6449));
        assertTrue(recursiveEquals(retValue, false));
    }

};


