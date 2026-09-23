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

public class NodeUtil_isUndefined_497061199195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;
     Object term9598;

    public NodeUtil_isUndefined_497061199195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term820, term820.getClass(), "type", -2005784375);
        setIntField(term822, term822.getClass(), "type", -1332748804);
        setIntField(term824, term824.getClass(), "type", 0);
        setField(term824, term824.getClass(), "next", null);
        setField(term824, term824.getClass(), "first", null);
        setField(term824, term824.getClass(), "last", null);
        setField(term824, term824.getClass(), "propListHead", null);
        setIntField(term824, term824.getClass(), "sourcePosition", 0);
        setField(term824, term824.getClass(), "jsType", null);
        setField(term824, term824.getClass(), "parent", null);
        setField(term822, term822.getClass(), "next", term824);
        setIntField(term827, term827.getClass(), "type", 0);
        setField(term827, term827.getClass(), "next", null);
        setField(term827, term827.getClass(), "first", null);
        setField(term827, term827.getClass(), "last", null);
        setField(term827, term827.getClass(), "propListHead", null);
        setIntField(term827, term827.getClass(), "sourcePosition", 0);
        setField(term827, term827.getClass(), "jsType", null);
        setField(term827, term827.getClass(), "parent", null);
        setField(term822, term822.getClass(), "first", term827);
        setIntField(term830, term830.getClass(), "type", 0);
        setField(term830, term830.getClass(), "next", null);
        setField(term830, term830.getClass(), "first", null);
        setField(term830, term830.getClass(), "last", null);
        setField(term830, term830.getClass(), "propListHead", null);
        setIntField(term830, term830.getClass(), "sourcePosition", 0);
        setField(term830, term830.getClass(), "jsType", null);
        setField(term830, term830.getClass(), "parent", null);
        setField(term822, term822.getClass(), "last", term830);
        setField(term822, term822.getClass(), "propListHead", null);
        setIntField(term822, term822.getClass(), "sourcePosition", 0);
        setField(term822, term822.getClass(), "jsType", null);
        setField(term822, term822.getClass(), "parent", null);
        setField(term820, term820.getClass(), "next", term822);
        setIntField(term834, term834.getClass(), "type", 0);
        setField(term834, term834.getClass(), "next", null);
        setField(term834, term834.getClass(), "first", null);
        setField(term834, term834.getClass(), "last", null);
        setField(term834, term834.getClass(), "propListHead", null);
        setIntField(term834, term834.getClass(), "sourcePosition", 0);
        setField(term834, term834.getClass(), "jsType", null);
        setField(term834, term834.getClass(), "parent", null);
        setField(term820, term820.getClass(), "first", term834);
        setIntField(term837, term837.getClass(), "type", 0);
        setField(term837, term837.getClass(), "next", null);
        setField(term837, term837.getClass(), "first", null);
        setField(term837, term837.getClass(), "last", null);
        setField(term837, term837.getClass(), "propListHead", null);
        setIntField(term837, term837.getClass(), "sourcePosition", 0);
        setField(term837, term837.getClass(), "jsType", null);
        setField(term837, term837.getClass(), "parent", null);
        setField(term820, term820.getClass(), "last", term837);
        setField(term820, term820.getClass(), "propListHead", null);
        setIntField(term820, term820.getClass(), "sourcePosition", 0);
        setField(term820, term820.getClass(), "jsType", null);
        setField(term820, term820.getClass(), "parent", null);
        term9598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9598, term9598.getClass(), "type", -2005784375);
        setIntField(term9599, term9599.getClass(), "type", -1332748804);
        setIntField(term9600, term9600.getClass(), "type", 0);
        setField(term9600, term9600.getClass(), "next", null);
        setField(term9600, term9600.getClass(), "first", null);
        setField(term9600, term9600.getClass(), "last", null);
        setField(term9600, term9600.getClass(), "propListHead", null);
        setIntField(term9600, term9600.getClass(), "sourcePosition", 0);
        setField(term9600, term9600.getClass(), "jsType", null);
        setField(term9600, term9600.getClass(), "parent", null);
        setField(term9599, term9599.getClass(), "next", term9600);
        setIntField(term9601, term9601.getClass(), "type", 0);
        setField(term9601, term9601.getClass(), "next", null);
        setField(term9601, term9601.getClass(), "first", null);
        setField(term9601, term9601.getClass(), "last", null);
        setField(term9601, term9601.getClass(), "propListHead", null);
        setIntField(term9601, term9601.getClass(), "sourcePosition", 0);
        setField(term9601, term9601.getClass(), "jsType", null);
        setField(term9601, term9601.getClass(), "parent", null);
        setField(term9599, term9599.getClass(), "first", term9601);
        setIntField(term9602, term9602.getClass(), "type", 0);
        setField(term9602, term9602.getClass(), "next", null);
        setField(term9602, term9602.getClass(), "first", null);
        setField(term9602, term9602.getClass(), "last", null);
        setField(term9602, term9602.getClass(), "propListHead", null);
        setIntField(term9602, term9602.getClass(), "sourcePosition", 0);
        setField(term9602, term9602.getClass(), "jsType", null);
        setField(term9602, term9602.getClass(), "parent", null);
        setField(term9599, term9599.getClass(), "last", term9602);
        setField(term9599, term9599.getClass(), "propListHead", null);
        setIntField(term9599, term9599.getClass(), "sourcePosition", 0);
        setField(term9599, term9599.getClass(), "jsType", null);
        setField(term9599, term9599.getClass(), "parent", null);
        setField(term9598, term9598.getClass(), "next", term9599);
        setIntField(term9603, term9603.getClass(), "type", 0);
        setField(term9603, term9603.getClass(), "next", null);
        setField(term9603, term9603.getClass(), "first", null);
        setField(term9603, term9603.getClass(), "last", null);
        setField(term9603, term9603.getClass(), "propListHead", null);
        setIntField(term9603, term9603.getClass(), "sourcePosition", 0);
        setField(term9603, term9603.getClass(), "jsType", null);
        setField(term9603, term9603.getClass(), "parent", null);
        setField(term9598, term9598.getClass(), "first", term9603);
        setIntField(term9604, term9604.getClass(), "type", 0);
        setField(term9604, term9604.getClass(), "next", null);
        setField(term9604, term9604.getClass(), "first", null);
        setField(term9604, term9604.getClass(), "last", null);
        setField(term9604, term9604.getClass(), "propListHead", null);
        setIntField(term9604, term9604.getClass(), "sourcePosition", 0);
        setField(term9604, term9604.getClass(), "jsType", null);
        setField(term9604, term9604.getClass(), "parent", null);
        setField(term9598, term9598.getClass(), "last", term9604);
        setField(term9598, term9598.getClass(), "propListHead", null);
        setIntField(term9598, term9598.getClass(), "sourcePosition", 0);
        setField(term9598, term9598.getClass(), "jsType", null);
        setField(term9598, term9598.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term820;
        Object retValue = callMethod(klass, "isUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term820, term9598));
        assertTrue(recursiveEquals(retValue, false));
    }

};


