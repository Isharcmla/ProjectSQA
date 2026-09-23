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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4732;
     Object term4824;
     Object term5008;
     Object term6053;
     Object term6054;
     Object term6055;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4732 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term4824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4824, term4824.getClass(), "type", -2147483638);
        setField(term4824, term4824.getClass(), "first", term4916);
        term5008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5008, term5008.getClass(), "type", 2147483637);
        term6053 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term6053, term6053.getClass(), "nameStack", null);
        setField(term6053, term6053.getClass(), "rootRenamer", null);
        term6054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6054, term6054.getClass(), "number", 0.0);
        setIntField(term6054, term6054.getClass(), "type", 2147483637);
        setField(term6054, term6054.getClass(), "next", null);
        setField(term6054, term6054.getClass(), "first", null);
        setField(term6054, term6054.getClass(), "last", null);
        setField(term6054, term6054.getClass(), "propListHead", null);
        setIntField(term6054, term6054.getClass(), "sourcePosition", 0);
        setField(term6054, term6054.getClass(), "jsType", null);
        setField(term6054, term6054.getClass(), "parent", null);
        term6055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term6056 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6055, term6055.getClass(), "number", 0.0);
        setIntField(term6055, term6055.getClass(), "type", -2147483638);
        setField(term6055, term6055.getClass(), "next", null);
        setDoubleField(term6056, term6056.getClass(), "number", 0.0);
        setIntField(term6056, term6056.getClass(), "type", 0);
        setField(term6056, term6056.getClass(), "next", null);
        setField(term6056, term6056.getClass(), "first", null);
        setField(term6056, term6056.getClass(), "last", null);
        setField(term6056, term6056.getClass(), "propListHead", null);
        setIntField(term6056, term6056.getClass(), "sourcePosition", 0);
        setField(term6056, term6056.getClass(), "jsType", null);
        setField(term6056, term6056.getClass(), "parent", null);
        setField(term6055, term6055.getClass(), "first", term6056);
        setField(term6055, term6055.getClass(), "last", null);
        setField(term6055, term6055.getClass(), "propListHead", null);
        setIntField(term6055, term6055.getClass(), "sourcePosition", 0);
        setField(term6055, term6055.getClass(), "jsType", null);
        setField(term6055, term6055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term4824;
        args[1] = term5008;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term4732, args);
        assertTrue(recursiveEquals(term4732, term6053));
        assertTrue(recursiveEquals(term4824, term6054));
        assertTrue(recursiveEquals(term5008, term6055));
    }

};


