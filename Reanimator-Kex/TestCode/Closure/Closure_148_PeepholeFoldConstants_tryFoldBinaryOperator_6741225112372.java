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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658296;
     Object term658388;
     Object term659068;
     Object term659069;
     Object term659032;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term658388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term658480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term658572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term658480, term658480.getClass(), "next", term658572);
        setIntField(term658480, term658480.getClass(), "type", 39);
        setField(term658388, term658388.getClass(), "first", term658480);
        setIntField(term658388, term658388.getClass(), "type", 23);
        term659068 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term659068, term659068.getClass(), "currentTraversal", null);
        term659069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term659069, term659069.getClass(), "number", 0.0);
        setIntField(term659069, term659069.getClass(), "type", 23);
        setField(term659069, term659069.getClass(), "next", null);
        setDoubleField(term659070, term659070.getClass(), "number", 0.0);
        setIntField(term659070, term659070.getClass(), "type", 39);
        setDoubleField(term659071, term659071.getClass(), "number", 0.0);
        setIntField(term659071, term659071.getClass(), "type", 0);
        setField(term659071, term659071.getClass(), "next", null);
        setField(term659071, term659071.getClass(), "first", null);
        setField(term659071, term659071.getClass(), "last", null);
        setField(term659071, term659071.getClass(), "propListHead", null);
        setIntField(term659071, term659071.getClass(), "sourcePosition", 0);
        setField(term659071, term659071.getClass(), "jsType", null);
        setField(term659071, term659071.getClass(), "parent", null);
        setField(term659070, term659070.getClass(), "next", term659071);
        setField(term659070, term659070.getClass(), "first", null);
        setField(term659070, term659070.getClass(), "last", null);
        setField(term659070, term659070.getClass(), "propListHead", null);
        setIntField(term659070, term659070.getClass(), "sourcePosition", 0);
        setField(term659070, term659070.getClass(), "jsType", null);
        setField(term659070, term659070.getClass(), "parent", null);
        setField(term659069, term659069.getClass(), "first", term659070);
        setField(term659069, term659069.getClass(), "last", null);
        setField(term659069, term659069.getClass(), "propListHead", null);
        setIntField(term659069, term659069.getClass(), "sourcePosition", 0);
        setField(term659069, term659069.getClass(), "jsType", null);
        setField(term659069, term659069.getClass(), "parent", null);
        term659032 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term659032, term659032.getClass(), "number", 0.0);
        setIntField(term659032, term659032.getClass(), "type", 23);
        setField(term659032, term659032.getClass(), "next", null);
        setDoubleField(term659035, term659035.getClass(), "number", 0.0);
        setIntField(term659035, term659035.getClass(), "type", 39);
        setDoubleField(term659038, term659038.getClass(), "number", 0.0);
        setIntField(term659038, term659038.getClass(), "type", 0);
        setField(term659038, term659038.getClass(), "next", null);
        setField(term659038, term659038.getClass(), "first", null);
        setField(term659038, term659038.getClass(), "last", null);
        setField(term659038, term659038.getClass(), "propListHead", null);
        setIntField(term659038, term659038.getClass(), "sourcePosition", 0);
        setField(term659038, term659038.getClass(), "jsType", null);
        setField(term659038, term659038.getClass(), "parent", null);
        setField(term659035, term659035.getClass(), "next", term659038);
        setField(term659035, term659035.getClass(), "first", null);
        setField(term659035, term659035.getClass(), "last", null);
        setField(term659035, term659035.getClass(), "propListHead", null);
        setIntField(term659035, term659035.getClass(), "sourcePosition", 0);
        setField(term659035, term659035.getClass(), "jsType", null);
        setField(term659035, term659035.getClass(), "parent", null);
        setField(term659032, term659032.getClass(), "first", term659035);
        setField(term659032, term659032.getClass(), "last", null);
        setField(term659032, term659032.getClass(), "propListHead", null);
        setIntField(term659032, term659032.getClass(), "sourcePosition", 0);
        setField(term659032, term659032.getClass(), "jsType", null);
        setField(term659032, term659032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term658388;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term658296, args);
        assertTrue(recursiveEquals(term658296, term659068));
        assertTrue(recursiveEquals(term658388, term659069));
        assertTrue(recursiveEquals(retValue, term659032));
    }

};


