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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127618;
     Object term127710;
     Object term133895;
     Object term133896;
     Object term133852;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127618 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term127710, term127710.getClass(), "first", term127710);
        setField(term127710, term127710.getClass(), "next", term127802);
        setIntField(term127710, term127710.getClass(), "type", 14);
        term133895 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133895, term133895.getClass(), "currentTraversal", null);
        term133896 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133896, term133896.getClass(), "number", 0.0);
        setIntField(term133896, term133896.getClass(), "type", 14);
        setDoubleField(term133897, term133897.getClass(), "number", 0.0);
        setIntField(term133897, term133897.getClass(), "type", 0);
        setField(term133897, term133897.getClass(), "next", null);
        setField(term133897, term133897.getClass(), "first", null);
        setField(term133897, term133897.getClass(), "last", null);
        setField(term133897, term133897.getClass(), "propListHead", null);
        setIntField(term133897, term133897.getClass(), "sourcePosition", 0);
        setField(term133897, term133897.getClass(), "jsType", null);
        setField(term133897, term133897.getClass(), "parent", null);
        setField(term133896, term133896.getClass(), "next", term133897);
        setField(term133896, term133896.getClass(), "first", term133896);
        setField(term133896, term133896.getClass(), "last", null);
        setField(term133896, term133896.getClass(), "propListHead", null);
        setIntField(term133896, term133896.getClass(), "sourcePosition", 0);
        setField(term133896, term133896.getClass(), "jsType", null);
        setField(term133896, term133896.getClass(), "parent", null);
        term133852 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133852, term133852.getClass(), "number", 0.0);
        setIntField(term133852, term133852.getClass(), "type", 14);
        setDoubleField(term133855, term133855.getClass(), "number", 0.0);
        setIntField(term133855, term133855.getClass(), "type", 0);
        setField(term133855, term133855.getClass(), "next", null);
        setField(term133855, term133855.getClass(), "first", null);
        setField(term133855, term133855.getClass(), "last", null);
        setField(term133855, term133855.getClass(), "propListHead", null);
        setIntField(term133855, term133855.getClass(), "sourcePosition", 0);
        setField(term133855, term133855.getClass(), "jsType", null);
        setField(term133855, term133855.getClass(), "parent", null);
        setField(term133852, term133852.getClass(), "next", term133855);
        setField(term133852, term133852.getClass(), "first", term133852);
        setField(term133852, term133852.getClass(), "last", null);
        setField(term133852, term133852.getClass(), "propListHead", null);
        setIntField(term133852, term133852.getClass(), "sourcePosition", 0);
        setField(term133852, term133852.getClass(), "jsType", null);
        setField(term133852, term133852.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127710;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term127618, args);
        assertTrue(recursiveEquals(term127618, term133895));
        assertTrue(recursiveEquals(term127710, term133896));
        assertTrue(recursiveEquals(retValue, term133852));
    }

};


