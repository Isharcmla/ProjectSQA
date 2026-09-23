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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5728;
     Object term5820;
     Object term6004;
     Object term6464;
     Object term6465;
     Object term6466;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5728 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term5820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5912 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term5820, term5820.getClass(), "type", -2147483638);
        setField(term5820, term5820.getClass(), "first", term5912);
        term6004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term6004, term6004.getClass(), "type", 2147483637);
        term6464 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term6464, term6464.getClass(), "nameStack", null);
        setField(term6464, term6464.getClass(), "rootRenamer", null);
        term6465 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term6465, term6465.getClass(), "str", null);
        setIntField(term6465, term6465.getClass(), "type", 2147483637);
        setField(term6465, term6465.getClass(), "next", null);
        setField(term6465, term6465.getClass(), "first", null);
        setField(term6465, term6465.getClass(), "last", null);
        setField(term6465, term6465.getClass(), "propListHead", null);
        setIntField(term6465, term6465.getClass(), "sourcePosition", 0);
        setField(term6465, term6465.getClass(), "jsType", null);
        setField(term6465, term6465.getClass(), "parent", null);
        term6466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term6467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term6466, term6466.getClass(), "str", null);
        setIntField(term6466, term6466.getClass(), "type", -2147483638);
        setField(term6466, term6466.getClass(), "next", null);
        setField(term6467, term6467.getClass(), "str", null);
        setIntField(term6467, term6467.getClass(), "type", 0);
        setField(term6467, term6467.getClass(), "next", null);
        setField(term6467, term6467.getClass(), "first", null);
        setField(term6467, term6467.getClass(), "last", null);
        setField(term6467, term6467.getClass(), "propListHead", null);
        setIntField(term6467, term6467.getClass(), "sourcePosition", 0);
        setField(term6467, term6467.getClass(), "jsType", null);
        setField(term6467, term6467.getClass(), "parent", null);
        setField(term6466, term6466.getClass(), "first", term6467);
        setField(term6466, term6466.getClass(), "last", null);
        setField(term6466, term6466.getClass(), "propListHead", null);
        setIntField(term6466, term6466.getClass(), "sourcePosition", 0);
        setField(term6466, term6466.getClass(), "jsType", null);
        setField(term6466, term6466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term5820;
        args[1] = term6004;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term5728, args);
        assertTrue(recursiveEquals(term5728, term6464));
        assertTrue(recursiveEquals(term5820, term6465));
        assertTrue(recursiveEquals(term6004, term6466));
    }

};


