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

public class NodeUtil_newQualifiedNameNode_128645923270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3427;

    public NodeUtil_newQualifiedNameNode_128645923270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3427, term3427.getClass(), "type", -1042470635);
        setIntField(term3429, term3429.getClass(), "type", -524352937);
        setIntField(term3431, term3431.getClass(), "type", 1472218987);
        setIntField(term3433, term3433.getClass(), "type", 805176809);
        setIntField(term3435, term3435.getClass(), "type", -82632953);
        setField(term3435, term3435.getClass(), "next", null);
        setField(term3435, term3435.getClass(), "first", null);
        setField(term3435, term3435.getClass(), "last", null);
        setField(term3435, term3435.getClass(), "propListHead", null);
        setIntField(term3435, term3435.getClass(), "sourcePosition", 0);
        setField(term3435, term3435.getClass(), "jsType", null);
        setField(term3435, term3435.getClass(), "parent", null);
        setField(term3433, term3433.getClass(), "next", term3435);
        setIntField(term3438, term3438.getClass(), "type", -1473876284);
        setField(term3438, term3438.getClass(), "next", null);
        setField(term3438, term3438.getClass(), "first", null);
        setField(term3438, term3438.getClass(), "last", term3435);
        setField(term3438, term3438.getClass(), "propListHead", null);
        setIntField(term3438, term3438.getClass(), "sourcePosition", 0);
        setField(term3438, term3438.getClass(), "jsType", null);
        setField(term3438, term3438.getClass(), "parent", null);
        setField(term3433, term3433.getClass(), "first", term3438);
        setField(term3433, term3433.getClass(), "last", term3431);
        setField(term3433, term3433.getClass(), "propListHead", null);
        setIntField(term3433, term3433.getClass(), "sourcePosition", 0);
        setField(term3433, term3433.getClass(), "jsType", null);
        setField(term3433, term3433.getClass(), "parent", null);
        setField(term3431, term3431.getClass(), "next", term3433);
        setField(term3431, term3431.getClass(), "first", term3435);
        setIntField(term3442, term3442.getClass(), "type", -499699841);
        setIntField(term3444, term3444.getClass(), "type", 360972386);
        setField(term3444, term3444.getClass(), "next", null);
        setField(term3444, term3444.getClass(), "first", term3438);
        setField(term3444, term3444.getClass(), "last", term3433);
        setField(term3444, term3444.getClass(), "propListHead", null);
        setIntField(term3444, term3444.getClass(), "sourcePosition", 0);
        setField(term3444, term3444.getClass(), "jsType", null);
        setField(term3444, term3444.getClass(), "parent", null);
        setField(term3442, term3442.getClass(), "next", term3444);
        setField(term3442, term3442.getClass(), "first", term3429);
        setField(term3442, term3442.getClass(), "last", term3429);
        setField(term3442, term3442.getClass(), "propListHead", null);
        setIntField(term3442, term3442.getClass(), "sourcePosition", 0);
        setField(term3442, term3442.getClass(), "jsType", null);
        setField(term3442, term3442.getClass(), "parent", null);
        setField(term3431, term3431.getClass(), "last", term3442);
        setField(term3431, term3431.getClass(), "propListHead", null);
        setIntField(term3431, term3431.getClass(), "sourcePosition", 0);
        setField(term3431, term3431.getClass(), "jsType", null);
        setField(term3431, term3431.getClass(), "parent", null);
        setField(term3429, term3429.getClass(), "next", term3431);
        setIntField(term3449, term3449.getClass(), "type", -2063884849);
        setField(term3449, term3449.getClass(), "next", term3442);
        setField(term3449, term3449.getClass(), "first", term3444);
        setField(term3449, term3449.getClass(), "last", term3427);
        setField(term3449, term3449.getClass(), "propListHead", null);
        setIntField(term3449, term3449.getClass(), "sourcePosition", 0);
        setField(term3449, term3449.getClass(), "jsType", null);
        setField(term3449, term3449.getClass(), "parent", null);
        setField(term3429, term3429.getClass(), "first", term3449);
        setField(term3429, term3429.getClass(), "last", term3449);
        setField(term3429, term3429.getClass(), "propListHead", null);
        setIntField(term3429, term3429.getClass(), "sourcePosition", 0);
        setField(term3429, term3429.getClass(), "jsType", null);
        setField(term3429, term3429.getClass(), "parent", null);
        setField(term3427, term3427.getClass(), "next", term3429);
        setField(term3427, term3427.getClass(), "first", term3433);
        setField(term3427, term3427.getClass(), "last", term3435);
        setField(term3427, term3427.getClass(), "propListHead", null);
        setIntField(term3427, term3427.getClass(), "sourcePosition", 0);
        setField(term3427, term3427.getClass(), "jsType", null);
        setField(term3427, term3427.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "nGKItKLYNC";
        args[2] = term3427;
        args[3] = "UiUYnPrcCi";
        try {
            callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


