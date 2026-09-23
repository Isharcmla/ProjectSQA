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
     Object term7743;

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
        term7743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7748 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7751 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7743, term7743.getClass(), "type", -1945706126);
        setIntField(term7744, term7744.getClass(), "type", 1102721075);
        setIntField(term7745, term7745.getClass(), "type", 0);
        setField(term7745, term7745.getClass(), "next", null);
        setField(term7745, term7745.getClass(), "first", null);
        setField(term7745, term7745.getClass(), "last", null);
        setField(term7745, term7745.getClass(), "propListHead", null);
        setIntField(term7745, term7745.getClass(), "sourcePosition", 0);
        setField(term7745, term7745.getClass(), "jsType", null);
        setField(term7745, term7745.getClass(), "parent", null);
        setField(term7744, term7744.getClass(), "next", term7745);
        setIntField(term7746, term7746.getClass(), "type", 0);
        setField(term7746, term7746.getClass(), "next", null);
        setField(term7746, term7746.getClass(), "first", null);
        setField(term7746, term7746.getClass(), "last", null);
        setField(term7746, term7746.getClass(), "propListHead", null);
        setIntField(term7746, term7746.getClass(), "sourcePosition", 0);
        setField(term7746, term7746.getClass(), "jsType", null);
        setField(term7746, term7746.getClass(), "parent", null);
        setField(term7744, term7744.getClass(), "first", term7746);
        setIntField(term7747, term7747.getClass(), "type", 0);
        setField(term7747, term7747.getClass(), "next", null);
        setField(term7747, term7747.getClass(), "first", null);
        setField(term7747, term7747.getClass(), "last", null);
        setField(term7747, term7747.getClass(), "propListHead", null);
        setIntField(term7747, term7747.getClass(), "sourcePosition", 0);
        setField(term7747, term7747.getClass(), "jsType", null);
        setField(term7747, term7747.getClass(), "parent", null);
        setField(term7744, term7744.getClass(), "last", term7747);
        setField(term7748, term7748.getClass(), "next", null);
        setIntField(term7748, term7748.getClass(), "type", 0);
        setIntField(term7748, term7748.getClass(), "intValue", 0);
        setField(term7748, term7748.getClass(), "objectValue", null);
        setField(term7744, term7744.getClass(), "propListHead", term7748);
        setIntField(term7744, term7744.getClass(), "sourcePosition", -1870495012);
        setField(term7744, term7744.getClass(), "jsType", null);
        setField(term7744, term7744.getClass(), "parent", null);
        setField(term7743, term7743.getClass(), "next", term7744);
        setIntField(term7749, term7749.getClass(), "type", 0);
        setField(term7749, term7749.getClass(), "next", null);
        setField(term7749, term7749.getClass(), "first", null);
        setField(term7749, term7749.getClass(), "last", null);
        setField(term7749, term7749.getClass(), "propListHead", null);
        setIntField(term7749, term7749.getClass(), "sourcePosition", 0);
        setField(term7749, term7749.getClass(), "jsType", null);
        setField(term7749, term7749.getClass(), "parent", null);
        setField(term7743, term7743.getClass(), "first", term7749);
        setIntField(term7750, term7750.getClass(), "type", 0);
        setField(term7750, term7750.getClass(), "next", null);
        setField(term7750, term7750.getClass(), "first", null);
        setField(term7750, term7750.getClass(), "last", null);
        setField(term7750, term7750.getClass(), "propListHead", null);
        setIntField(term7750, term7750.getClass(), "sourcePosition", 0);
        setField(term7750, term7750.getClass(), "jsType", null);
        setField(term7750, term7750.getClass(), "parent", null);
        setField(term7743, term7743.getClass(), "last", term7750);
        setField(term7751, term7751.getClass(), "next", null);
        setIntField(term7751, term7751.getClass(), "type", 0);
        setIntField(term7751, term7751.getClass(), "intValue", 0);
        setField(term7751, term7751.getClass(), "objectValue", null);
        setField(term7743, term7743.getClass(), "propListHead", term7751);
        setIntField(term7743, term7743.getClass(), "sourcePosition", -1310015129);
        setField(term7743, term7743.getClass(), "jsType", null);
        setField(term7743, term7743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term507;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term507, term7743));
    }

};


