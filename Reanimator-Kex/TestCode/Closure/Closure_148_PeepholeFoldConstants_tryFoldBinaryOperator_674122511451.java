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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92531;
     Object term92623;
     Object term93218;
     Object term93219;
     Object term93186;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term92623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92715, term92715.getClass(), "next", term92807);
        setIntField(term92715, term92715.getClass(), "type", 39);
        setField(term92623, term92623.getClass(), "first", term92715);
        setIntField(term92623, term92623.getClass(), "type", 22);
        term93218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93218, term93218.getClass(), "currentTraversal", null);
        term93219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93221 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term93219, term93219.getClass(), "str", null);
        setIntField(term93219, term93219.getClass(), "type", 22);
        setField(term93219, term93219.getClass(), "next", null);
        setField(term93220, term93220.getClass(), "str", null);
        setIntField(term93220, term93220.getClass(), "type", 39);
        setDoubleField(term93221, term93221.getClass(), "number", 0.0);
        setIntField(term93221, term93221.getClass(), "type", 0);
        setField(term93221, term93221.getClass(), "next", null);
        setField(term93221, term93221.getClass(), "first", null);
        setField(term93221, term93221.getClass(), "last", null);
        setField(term93221, term93221.getClass(), "propListHead", null);
        setIntField(term93221, term93221.getClass(), "sourcePosition", 0);
        setField(term93221, term93221.getClass(), "jsType", null);
        setField(term93221, term93221.getClass(), "parent", null);
        setField(term93220, term93220.getClass(), "next", term93221);
        setField(term93220, term93220.getClass(), "first", null);
        setField(term93220, term93220.getClass(), "last", null);
        setField(term93220, term93220.getClass(), "propListHead", null);
        setIntField(term93220, term93220.getClass(), "sourcePosition", 0);
        setField(term93220, term93220.getClass(), "jsType", null);
        setField(term93220, term93220.getClass(), "parent", null);
        setField(term93219, term93219.getClass(), "first", term93220);
        setField(term93219, term93219.getClass(), "last", null);
        setField(term93219, term93219.getClass(), "propListHead", null);
        setIntField(term93219, term93219.getClass(), "sourcePosition", 0);
        setField(term93219, term93219.getClass(), "jsType", null);
        setField(term93219, term93219.getClass(), "parent", null);
        term93186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term93190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term93186, term93186.getClass(), "str", null);
        setIntField(term93186, term93186.getClass(), "type", 22);
        setField(term93186, term93186.getClass(), "next", null);
        setField(term93188, term93188.getClass(), "str", null);
        setIntField(term93188, term93188.getClass(), "type", 39);
        setDoubleField(term93190, term93190.getClass(), "number", 0.0);
        setIntField(term93190, term93190.getClass(), "type", 0);
        setField(term93190, term93190.getClass(), "next", null);
        setField(term93190, term93190.getClass(), "first", null);
        setField(term93190, term93190.getClass(), "last", null);
        setField(term93190, term93190.getClass(), "propListHead", null);
        setIntField(term93190, term93190.getClass(), "sourcePosition", 0);
        setField(term93190, term93190.getClass(), "jsType", null);
        setField(term93190, term93190.getClass(), "parent", null);
        setField(term93188, term93188.getClass(), "next", term93190);
        setField(term93188, term93188.getClass(), "first", null);
        setField(term93188, term93188.getClass(), "last", null);
        setField(term93188, term93188.getClass(), "propListHead", null);
        setIntField(term93188, term93188.getClass(), "sourcePosition", 0);
        setField(term93188, term93188.getClass(), "jsType", null);
        setField(term93188, term93188.getClass(), "parent", null);
        setField(term93186, term93186.getClass(), "first", term93188);
        setField(term93186, term93186.getClass(), "last", null);
        setField(term93186, term93186.getClass(), "propListHead", null);
        setIntField(term93186, term93186.getClass(), "sourcePosition", 0);
        setField(term93186, term93186.getClass(), "jsType", null);
        setField(term93186, term93186.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92623;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term92531, args);
        assertTrue(recursiveEquals(term92531, term93218));
        assertTrue(recursiveEquals(term92623, term93219));
        assertTrue(recursiveEquals(retValue, term93186));
    }

};


