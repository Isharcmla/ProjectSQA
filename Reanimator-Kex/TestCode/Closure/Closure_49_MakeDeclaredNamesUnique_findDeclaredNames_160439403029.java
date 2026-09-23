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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3336;
     Object term3406;
     Object term3581;
     Object term23169;
     Object term23170;
     Object term23171;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3336 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term3406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term3581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3406, term3406.getClass(), "type", 0);
        setIntField(term3476, term3476.getClass(), "type", 0);
        setField(term3476, term3476.getClass(), "first", null);
        setIntField(term3581, term3581.getClass(), "type", 0);
        setField(term3476, term3476.getClass(), "next", term3581);
        setField(term3406, term3406.getClass(), "first", term3476);
        term23169 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term23169, term23169.getClass(), "nameStack", null);
        setField(term23169, term23169.getClass(), "rootRenamer", null);
        term23170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23170, term23170.getClass(), "type", 0);
        setField(term23170, term23170.getClass(), "next", null);
        setField(term23170, term23170.getClass(), "first", null);
        setField(term23170, term23170.getClass(), "last", null);
        setField(term23170, term23170.getClass(), "propListHead", null);
        setIntField(term23170, term23170.getClass(), "sourcePosition", 0);
        setField(term23170, term23170.getClass(), "jsType", null);
        setField(term23170, term23170.getClass(), "parent", null);
        term23171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23171, term23171.getClass(), "type", 0);
        setField(term23171, term23171.getClass(), "next", null);
        setIntField(term23172, term23172.getClass(), "type", 0);
        setIntField(term23173, term23173.getClass(), "type", 0);
        setField(term23173, term23173.getClass(), "next", null);
        setField(term23173, term23173.getClass(), "first", null);
        setField(term23173, term23173.getClass(), "last", null);
        setField(term23173, term23173.getClass(), "propListHead", null);
        setIntField(term23173, term23173.getClass(), "sourcePosition", 0);
        setField(term23173, term23173.getClass(), "jsType", null);
        setField(term23173, term23173.getClass(), "parent", null);
        setField(term23172, term23172.getClass(), "next", term23173);
        setField(term23172, term23172.getClass(), "first", null);
        setField(term23172, term23172.getClass(), "last", null);
        setField(term23172, term23172.getClass(), "propListHead", null);
        setIntField(term23172, term23172.getClass(), "sourcePosition", 0);
        setField(term23172, term23172.getClass(), "jsType", null);
        setField(term23172, term23172.getClass(), "parent", null);
        setField(term23171, term23171.getClass(), "first", term23172);
        setField(term23171, term23171.getClass(), "last", null);
        setField(term23171, term23171.getClass(), "propListHead", null);
        setIntField(term23171, term23171.getClass(), "sourcePosition", 0);
        setField(term23171, term23171.getClass(), "jsType", null);
        setField(term23171, term23171.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term3406;
        args[1] = term3581;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term3336, args);
        assertTrue(recursiveEquals(term3336, term23169));
        assertTrue(recursiveEquals(term3406, term23170));
        assertTrue(recursiveEquals(term3581, term23171));
    }

};


