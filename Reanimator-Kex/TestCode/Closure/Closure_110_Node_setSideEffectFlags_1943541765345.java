package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Node_setSideEffectFlags_1943541765345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5597;
     Object term5624;

    public Node_setSideEffectFlags_1943541765345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5597, term5597.getClass(), "type", 472580433);
        setIntField(term5599, term5599.getClass(), "type", 1189049164);
        setIntField(term5601, term5601.getClass(), "type", -673413879);
        setIntField(term5603, term5603.getClass(), "type", 1609778442);
        setIntField(term5605, term5605.getClass(), "type", 524850421);
        setField(term5605, term5605.getClass(), "next", null);
        setField(term5605, term5605.getClass(), "first", null);
        setField(term5605, term5605.getClass(), "last", null);
        setField(term5605, term5605.getClass(), "propListHead", null);
        setIntField(term5605, term5605.getClass(), "sourcePosition", 0);
        setField(term5605, term5605.getClass(), "jsType", null);
        setField(term5605, term5605.getClass(), "parent", null);
        setField(term5603, term5603.getClass(), "next", term5605);
        setIntField(term5608, term5608.getClass(), "type", -1833121756);
        setField(term5608, term5608.getClass(), "next", null);
        setField(term5608, term5608.getClass(), "first", null);
        setField(term5608, term5608.getClass(), "last", term5605);
        setField(term5608, term5608.getClass(), "propListHead", null);
        setIntField(term5608, term5608.getClass(), "sourcePosition", 0);
        setField(term5608, term5608.getClass(), "jsType", null);
        setField(term5608, term5608.getClass(), "parent", null);
        setField(term5603, term5603.getClass(), "first", term5608);
        setField(term5603, term5603.getClass(), "last", term5601);
        setField(term5603, term5603.getClass(), "propListHead", null);
        setIntField(term5603, term5603.getClass(), "sourcePosition", 0);
        setField(term5603, term5603.getClass(), "jsType", null);
        setField(term5603, term5603.getClass(), "parent", null);
        setField(term5601, term5601.getClass(), "next", term5603);
        setField(term5601, term5601.getClass(), "first", term5605);
        setIntField(term5612, term5612.getClass(), "type", -1056969264);
        setIntField(term5614, term5614.getClass(), "type", -709130701);
        setField(term5614, term5614.getClass(), "next", null);
        setField(term5614, term5614.getClass(), "first", term5608);
        setField(term5614, term5614.getClass(), "last", term5603);
        setField(term5614, term5614.getClass(), "propListHead", null);
        setIntField(term5614, term5614.getClass(), "sourcePosition", 0);
        setField(term5614, term5614.getClass(), "jsType", null);
        setField(term5614, term5614.getClass(), "parent", null);
        setField(term5612, term5612.getClass(), "next", term5614);
        setField(term5612, term5612.getClass(), "first", term5599);
        setField(term5612, term5612.getClass(), "last", term5599);
        setField(term5612, term5612.getClass(), "propListHead", null);
        setIntField(term5612, term5612.getClass(), "sourcePosition", 0);
        setField(term5612, term5612.getClass(), "jsType", null);
        setField(term5612, term5612.getClass(), "parent", null);
        setField(term5601, term5601.getClass(), "last", term5612);
        setField(term5601, term5601.getClass(), "propListHead", null);
        setIntField(term5601, term5601.getClass(), "sourcePosition", 0);
        setField(term5601, term5601.getClass(), "jsType", null);
        setField(term5601, term5601.getClass(), "parent", null);
        setField(term5599, term5599.getClass(), "next", term5601);
        setIntField(term5619, term5619.getClass(), "type", 86144663);
        setField(term5619, term5619.getClass(), "next", term5612);
        setField(term5619, term5619.getClass(), "first", term5614);
        setField(term5619, term5619.getClass(), "last", term5597);
        setField(term5619, term5619.getClass(), "propListHead", null);
        setIntField(term5619, term5619.getClass(), "sourcePosition", 0);
        setField(term5619, term5619.getClass(), "jsType", null);
        setField(term5619, term5619.getClass(), "parent", null);
        setField(term5599, term5599.getClass(), "first", term5619);
        setField(term5599, term5599.getClass(), "last", term5619);
        setField(term5599, term5599.getClass(), "propListHead", null);
        setIntField(term5599, term5599.getClass(), "sourcePosition", 0);
        setField(term5599, term5599.getClass(), "jsType", null);
        setField(term5599, term5599.getClass(), "parent", null);
        setField(term5597, term5597.getClass(), "next", term5599);
        setField(term5597, term5597.getClass(), "first", term5603);
        setField(term5597, term5597.getClass(), "last", term5605);
        setField(term5597, term5597.getClass(), "propListHead", null);
        setIntField(term5597, term5597.getClass(), "sourcePosition", 0);
        setField(term5597, term5597.getClass(), "jsType", null);
        setField(term5597, term5597.getClass(), "parent", null);
        term5624 = new Integer(-1480903995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5624;
        try {
            callMethod(klass, "setSideEffectFlags", argTypes, term5597, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


