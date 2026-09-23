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

public class NodeUtil_mayHaveSideEffects_109682951173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;
     Object term7449;

    public NodeUtil_mayHaveSideEffects_109682951173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term507, term507.getClass(), "type", -1945706126);
        setIntField(term509, term509.getClass(), "type", 1102721075);
        setIntField(term511, term511.getClass(), "type", 0);
        setField(term511, term511.getClass(), "next", null);
        setField(term511, term511.getClass(), "first", null);
        setField(term511, term511.getClass(), "last", null);
        setField(term511, term511.getClass(), "propListHead", null);
        setIntField(term511, term511.getClass(), "sourcePosition", 0);
        setField(term511, term511.getClass(), "jsType", null);
        setField(term511, term511.getClass(), "parent", null);
        setField(term509, term509.getClass(), "next", term511);
        setIntField(term514, term514.getClass(), "type", 0);
        setField(term514, term514.getClass(), "next", null);
        setField(term514, term514.getClass(), "first", null);
        setField(term514, term514.getClass(), "last", null);
        setField(term514, term514.getClass(), "propListHead", null);
        setIntField(term514, term514.getClass(), "sourcePosition", 0);
        setField(term514, term514.getClass(), "jsType", null);
        setField(term514, term514.getClass(), "parent", null);
        setField(term509, term509.getClass(), "first", term514);
        setIntField(term517, term517.getClass(), "type", 0);
        setField(term517, term517.getClass(), "next", null);
        setField(term517, term517.getClass(), "first", null);
        setField(term517, term517.getClass(), "last", null);
        setField(term517, term517.getClass(), "propListHead", null);
        setIntField(term517, term517.getClass(), "sourcePosition", 0);
        setField(term517, term517.getClass(), "jsType", null);
        setField(term517, term517.getClass(), "parent", null);
        setField(term509, term509.getClass(), "last", term517);
        setField(term520, term520.getClass(), "next", null);
        setIntField(term520, term520.getClass(), "type", 0);
        setIntField(term520, term520.getClass(), "intValue", 0);
        setField(term520, term520.getClass(), "objectValue", null);
        setField(term509, term509.getClass(), "propListHead", term520);
        setIntField(term509, term509.getClass(), "sourcePosition", -1870495012);
        setField(term509, term509.getClass(), "jsType", null);
        setField(term509, term509.getClass(), "parent", null);
        setField(term507, term507.getClass(), "next", term509);
        setIntField(term524, term524.getClass(), "type", 0);
        setField(term524, term524.getClass(), "next", null);
        setField(term524, term524.getClass(), "first", null);
        setField(term524, term524.getClass(), "last", null);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term507, term507.getClass(), "first", term524);
        setIntField(term527, term527.getClass(), "type", 0);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", null);
        setField(term527, term527.getClass(), "last", null);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term507, term507.getClass(), "last", term527);
        setField(term530, term530.getClass(), "next", null);
        setIntField(term530, term530.getClass(), "type", 0);
        setIntField(term530, term530.getClass(), "intValue", 0);
        setField(term530, term530.getClass(), "objectValue", null);
        setField(term507, term507.getClass(), "propListHead", term530);
        setIntField(term507, term507.getClass(), "sourcePosition", -1310015129);
        setField(term507, term507.getClass(), "jsType", null);
        setField(term507, term507.getClass(), "parent", null);
        term7449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7454 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7457 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7449, term7449.getClass(), "type", -1945706126);
        setIntField(term7450, term7450.getClass(), "type", 1102721075);
        setIntField(term7451, term7451.getClass(), "type", 0);
        setField(term7451, term7451.getClass(), "next", null);
        setField(term7451, term7451.getClass(), "first", null);
        setField(term7451, term7451.getClass(), "last", null);
        setField(term7451, term7451.getClass(), "propListHead", null);
        setIntField(term7451, term7451.getClass(), "sourcePosition", 0);
        setField(term7451, term7451.getClass(), "jsType", null);
        setField(term7451, term7451.getClass(), "parent", null);
        setField(term7450, term7450.getClass(), "next", term7451);
        setIntField(term7452, term7452.getClass(), "type", 0);
        setField(term7452, term7452.getClass(), "next", null);
        setField(term7452, term7452.getClass(), "first", null);
        setField(term7452, term7452.getClass(), "last", null);
        setField(term7452, term7452.getClass(), "propListHead", null);
        setIntField(term7452, term7452.getClass(), "sourcePosition", 0);
        setField(term7452, term7452.getClass(), "jsType", null);
        setField(term7452, term7452.getClass(), "parent", null);
        setField(term7450, term7450.getClass(), "first", term7452);
        setIntField(term7453, term7453.getClass(), "type", 0);
        setField(term7453, term7453.getClass(), "next", null);
        setField(term7453, term7453.getClass(), "first", null);
        setField(term7453, term7453.getClass(), "last", null);
        setField(term7453, term7453.getClass(), "propListHead", null);
        setIntField(term7453, term7453.getClass(), "sourcePosition", 0);
        setField(term7453, term7453.getClass(), "jsType", null);
        setField(term7453, term7453.getClass(), "parent", null);
        setField(term7450, term7450.getClass(), "last", term7453);
        setField(term7454, term7454.getClass(), "next", null);
        setIntField(term7454, term7454.getClass(), "type", 0);
        setIntField(term7454, term7454.getClass(), "intValue", 0);
        setField(term7454, term7454.getClass(), "objectValue", null);
        setField(term7450, term7450.getClass(), "propListHead", term7454);
        setIntField(term7450, term7450.getClass(), "sourcePosition", -1870495012);
        setField(term7450, term7450.getClass(), "jsType", null);
        setField(term7450, term7450.getClass(), "parent", null);
        setField(term7449, term7449.getClass(), "next", term7450);
        setIntField(term7455, term7455.getClass(), "type", 0);
        setField(term7455, term7455.getClass(), "next", null);
        setField(term7455, term7455.getClass(), "first", null);
        setField(term7455, term7455.getClass(), "last", null);
        setField(term7455, term7455.getClass(), "propListHead", null);
        setIntField(term7455, term7455.getClass(), "sourcePosition", 0);
        setField(term7455, term7455.getClass(), "jsType", null);
        setField(term7455, term7455.getClass(), "parent", null);
        setField(term7449, term7449.getClass(), "first", term7455);
        setIntField(term7456, term7456.getClass(), "type", 0);
        setField(term7456, term7456.getClass(), "next", null);
        setField(term7456, term7456.getClass(), "first", null);
        setField(term7456, term7456.getClass(), "last", null);
        setField(term7456, term7456.getClass(), "propListHead", null);
        setIntField(term7456, term7456.getClass(), "sourcePosition", 0);
        setField(term7456, term7456.getClass(), "jsType", null);
        setField(term7456, term7456.getClass(), "parent", null);
        setField(term7449, term7449.getClass(), "last", term7456);
        setField(term7457, term7457.getClass(), "next", null);
        setIntField(term7457, term7457.getClass(), "type", 0);
        setIntField(term7457, term7457.getClass(), "intValue", 0);
        setField(term7457, term7457.getClass(), "objectValue", null);
        setField(term7449, term7449.getClass(), "propListHead", term7457);
        setIntField(term7449, term7449.getClass(), "sourcePosition", -1310015129);
        setField(term7449, term7449.getClass(), "jsType", null);
        setField(term7449, term7449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term507;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term507, term7449));
    }

};


