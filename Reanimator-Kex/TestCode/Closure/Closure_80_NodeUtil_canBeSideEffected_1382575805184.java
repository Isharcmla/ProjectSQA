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

public class NodeUtil_canBeSideEffected_1382575805184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;
     Object term9459;

    public NodeUtil_canBeSideEffected_1382575805184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term819 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term829 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term806, term806.getClass(), "type", -1560631747);
        setIntField(term808, term808.getClass(), "type", 68922753);
        setIntField(term810, term810.getClass(), "type", 0);
        setField(term810, term810.getClass(), "next", null);
        setField(term810, term810.getClass(), "first", null);
        setField(term810, term810.getClass(), "last", null);
        setField(term810, term810.getClass(), "propListHead", null);
        setIntField(term810, term810.getClass(), "sourcePosition", 0);
        setField(term810, term810.getClass(), "jsType", null);
        setField(term810, term810.getClass(), "parent", null);
        setField(term808, term808.getClass(), "next", term810);
        setIntField(term813, term813.getClass(), "type", 0);
        setField(term813, term813.getClass(), "next", null);
        setField(term813, term813.getClass(), "first", null);
        setField(term813, term813.getClass(), "last", null);
        setField(term813, term813.getClass(), "propListHead", null);
        setIntField(term813, term813.getClass(), "sourcePosition", 0);
        setField(term813, term813.getClass(), "jsType", null);
        setField(term813, term813.getClass(), "parent", null);
        setField(term808, term808.getClass(), "first", term813);
        setIntField(term816, term816.getClass(), "type", 0);
        setField(term816, term816.getClass(), "next", null);
        setField(term816, term816.getClass(), "first", null);
        setField(term816, term816.getClass(), "last", null);
        setField(term816, term816.getClass(), "propListHead", null);
        setIntField(term816, term816.getClass(), "sourcePosition", 0);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term808, term808.getClass(), "last", term816);
        setField(term819, term819.getClass(), "next", null);
        setIntField(term819, term819.getClass(), "type", 0);
        setIntField(term819, term819.getClass(), "intValue", 0);
        setField(term819, term819.getClass(), "objectValue", null);
        setField(term808, term808.getClass(), "propListHead", term819);
        setIntField(term808, term808.getClass(), "sourcePosition", -2070466617);
        setField(term808, term808.getClass(), "jsType", null);
        setField(term808, term808.getClass(), "parent", null);
        setField(term806, term806.getClass(), "next", term808);
        setIntField(term823, term823.getClass(), "type", 0);
        setField(term823, term823.getClass(), "next", null);
        setField(term823, term823.getClass(), "first", null);
        setField(term823, term823.getClass(), "last", null);
        setField(term823, term823.getClass(), "propListHead", null);
        setIntField(term823, term823.getClass(), "sourcePosition", 0);
        setField(term823, term823.getClass(), "jsType", null);
        setField(term823, term823.getClass(), "parent", null);
        setField(term806, term806.getClass(), "first", term823);
        setIntField(term826, term826.getClass(), "type", 0);
        setField(term826, term826.getClass(), "next", null);
        setField(term826, term826.getClass(), "first", null);
        setField(term826, term826.getClass(), "last", null);
        setField(term826, term826.getClass(), "propListHead", null);
        setIntField(term826, term826.getClass(), "sourcePosition", 0);
        setField(term826, term826.getClass(), "jsType", null);
        setField(term826, term826.getClass(), "parent", null);
        setField(term806, term806.getClass(), "last", term826);
        setField(term829, term829.getClass(), "next", null);
        setIntField(term829, term829.getClass(), "type", 0);
        setIntField(term829, term829.getClass(), "intValue", 0);
        setField(term829, term829.getClass(), "objectValue", null);
        setField(term806, term806.getClass(), "propListHead", term829);
        setIntField(term806, term806.getClass(), "sourcePosition", -1127721881);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        term9459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9464 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9467 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9459, term9459.getClass(), "type", -1560631747);
        setIntField(term9460, term9460.getClass(), "type", 68922753);
        setIntField(term9461, term9461.getClass(), "type", 0);
        setField(term9461, term9461.getClass(), "next", null);
        setField(term9461, term9461.getClass(), "first", null);
        setField(term9461, term9461.getClass(), "last", null);
        setField(term9461, term9461.getClass(), "propListHead", null);
        setIntField(term9461, term9461.getClass(), "sourcePosition", 0);
        setField(term9461, term9461.getClass(), "jsType", null);
        setField(term9461, term9461.getClass(), "parent", null);
        setField(term9460, term9460.getClass(), "next", term9461);
        setIntField(term9462, term9462.getClass(), "type", 0);
        setField(term9462, term9462.getClass(), "next", null);
        setField(term9462, term9462.getClass(), "first", null);
        setField(term9462, term9462.getClass(), "last", null);
        setField(term9462, term9462.getClass(), "propListHead", null);
        setIntField(term9462, term9462.getClass(), "sourcePosition", 0);
        setField(term9462, term9462.getClass(), "jsType", null);
        setField(term9462, term9462.getClass(), "parent", null);
        setField(term9460, term9460.getClass(), "first", term9462);
        setIntField(term9463, term9463.getClass(), "type", 0);
        setField(term9463, term9463.getClass(), "next", null);
        setField(term9463, term9463.getClass(), "first", null);
        setField(term9463, term9463.getClass(), "last", null);
        setField(term9463, term9463.getClass(), "propListHead", null);
        setIntField(term9463, term9463.getClass(), "sourcePosition", 0);
        setField(term9463, term9463.getClass(), "jsType", null);
        setField(term9463, term9463.getClass(), "parent", null);
        setField(term9460, term9460.getClass(), "last", term9463);
        setField(term9464, term9464.getClass(), "next", null);
        setIntField(term9464, term9464.getClass(), "type", 0);
        setIntField(term9464, term9464.getClass(), "intValue", 0);
        setField(term9464, term9464.getClass(), "objectValue", null);
        setField(term9460, term9460.getClass(), "propListHead", term9464);
        setIntField(term9460, term9460.getClass(), "sourcePosition", -2070466617);
        setField(term9460, term9460.getClass(), "jsType", null);
        setField(term9460, term9460.getClass(), "parent", null);
        setField(term9459, term9459.getClass(), "next", term9460);
        setIntField(term9465, term9465.getClass(), "type", 0);
        setField(term9465, term9465.getClass(), "next", null);
        setField(term9465, term9465.getClass(), "first", null);
        setField(term9465, term9465.getClass(), "last", null);
        setField(term9465, term9465.getClass(), "propListHead", null);
        setIntField(term9465, term9465.getClass(), "sourcePosition", 0);
        setField(term9465, term9465.getClass(), "jsType", null);
        setField(term9465, term9465.getClass(), "parent", null);
        setField(term9459, term9459.getClass(), "first", term9465);
        setIntField(term9466, term9466.getClass(), "type", 0);
        setField(term9466, term9466.getClass(), "next", null);
        setField(term9466, term9466.getClass(), "first", null);
        setField(term9466, term9466.getClass(), "last", null);
        setField(term9466, term9466.getClass(), "propListHead", null);
        setIntField(term9466, term9466.getClass(), "sourcePosition", 0);
        setField(term9466, term9466.getClass(), "jsType", null);
        setField(term9466, term9466.getClass(), "parent", null);
        setField(term9459, term9459.getClass(), "last", term9466);
        setField(term9467, term9467.getClass(), "next", null);
        setIntField(term9467, term9467.getClass(), "type", 0);
        setIntField(term9467, term9467.getClass(), "intValue", 0);
        setField(term9467, term9467.getClass(), "objectValue", null);
        setField(term9459, term9459.getClass(), "propListHead", term9467);
        setIntField(term9459, term9459.getClass(), "sourcePosition", -1127721881);
        setField(term9459, term9459.getClass(), "jsType", null);
        setField(term9459, term9459.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term806;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term806, term9459));
    }

};


