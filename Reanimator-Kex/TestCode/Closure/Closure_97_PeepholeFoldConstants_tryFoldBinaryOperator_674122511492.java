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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127001;
     Object term127093;
     Object term133813;
     Object term133814;
     Object term133779;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127001 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term127277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term127185, term127185.getClass(), "next", term127277);
        setField(term127093, term127093.getClass(), "first", term127185);
        setIntField(term127093, term127093.getClass(), "type", 52);
        term133813 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133813, term133813.getClass(), "currentTraversal", null);
        term133814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term133814, term133814.getClass(), "str", null);
        setIntField(term133814, term133814.getClass(), "type", 52);
        setField(term133814, term133814.getClass(), "next", null);
        setField(term133815, term133815.getClass(), "str", null);
        setIntField(term133815, term133815.getClass(), "type", 0);
        setField(term133816, term133816.getClass(), "str", null);
        setIntField(term133816, term133816.getClass(), "type", 0);
        setField(term133816, term133816.getClass(), "next", null);
        setField(term133816, term133816.getClass(), "first", null);
        setField(term133816, term133816.getClass(), "last", null);
        setField(term133816, term133816.getClass(), "propListHead", null);
        setIntField(term133816, term133816.getClass(), "sourcePosition", 0);
        setField(term133816, term133816.getClass(), "jsType", null);
        setField(term133816, term133816.getClass(), "parent", null);
        setField(term133815, term133815.getClass(), "next", term133816);
        setField(term133815, term133815.getClass(), "first", null);
        setField(term133815, term133815.getClass(), "last", null);
        setField(term133815, term133815.getClass(), "propListHead", null);
        setIntField(term133815, term133815.getClass(), "sourcePosition", 0);
        setField(term133815, term133815.getClass(), "jsType", null);
        setField(term133815, term133815.getClass(), "parent", null);
        setField(term133814, term133814.getClass(), "first", term133815);
        setField(term133814, term133814.getClass(), "last", null);
        setField(term133814, term133814.getClass(), "propListHead", null);
        setIntField(term133814, term133814.getClass(), "sourcePosition", 0);
        setField(term133814, term133814.getClass(), "jsType", null);
        setField(term133814, term133814.getClass(), "parent", null);
        term133779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term133779, term133779.getClass(), "str", null);
        setIntField(term133779, term133779.getClass(), "type", 52);
        setField(term133779, term133779.getClass(), "next", null);
        setField(term133781, term133781.getClass(), "str", null);
        setIntField(term133781, term133781.getClass(), "type", 0);
        setField(term133783, term133783.getClass(), "str", null);
        setIntField(term133783, term133783.getClass(), "type", 0);
        setField(term133783, term133783.getClass(), "next", null);
        setField(term133783, term133783.getClass(), "first", null);
        setField(term133783, term133783.getClass(), "last", null);
        setField(term133783, term133783.getClass(), "propListHead", null);
        setIntField(term133783, term133783.getClass(), "sourcePosition", 0);
        setField(term133783, term133783.getClass(), "jsType", null);
        setField(term133783, term133783.getClass(), "parent", null);
        setField(term133781, term133781.getClass(), "next", term133783);
        setField(term133781, term133781.getClass(), "first", null);
        setField(term133781, term133781.getClass(), "last", null);
        setField(term133781, term133781.getClass(), "propListHead", null);
        setIntField(term133781, term133781.getClass(), "sourcePosition", 0);
        setField(term133781, term133781.getClass(), "jsType", null);
        setField(term133781, term133781.getClass(), "parent", null);
        setField(term133779, term133779.getClass(), "first", term133781);
        setField(term133779, term133779.getClass(), "last", null);
        setField(term133779, term133779.getClass(), "propListHead", null);
        setIntField(term133779, term133779.getClass(), "sourcePosition", 0);
        setField(term133779, term133779.getClass(), "jsType", null);
        setField(term133779, term133779.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127093;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term127001, args);
        assertTrue(recursiveEquals(term127001, term133813));
        assertTrue(recursiveEquals(term127093, term133814));
        assertTrue(recursiveEquals(retValue, term133779));
    }

};


