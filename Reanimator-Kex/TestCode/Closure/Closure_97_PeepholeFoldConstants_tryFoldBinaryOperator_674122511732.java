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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187429;
     Object term187521;
     Object term187746;
     Object term187747;
     Object term187712;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187429 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term187521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term187613, term187613.getClass(), "next", term187705);
        setField(term187521, term187521.getClass(), "first", term187613);
        setIntField(term187521, term187521.getClass(), "type", 46);
        term187746 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term187746, term187746.getClass(), "currentTraversal", null);
        term187747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term187747, term187747.getClass(), "str", null);
        setIntField(term187747, term187747.getClass(), "type", 46);
        setField(term187747, term187747.getClass(), "next", null);
        setField(term187748, term187748.getClass(), "str", null);
        setIntField(term187748, term187748.getClass(), "type", 0);
        setField(term187749, term187749.getClass(), "str", null);
        setIntField(term187749, term187749.getClass(), "type", 0);
        setField(term187749, term187749.getClass(), "next", null);
        setField(term187749, term187749.getClass(), "first", null);
        setField(term187749, term187749.getClass(), "last", null);
        setField(term187749, term187749.getClass(), "propListHead", null);
        setIntField(term187749, term187749.getClass(), "sourcePosition", 0);
        setField(term187749, term187749.getClass(), "jsType", null);
        setField(term187749, term187749.getClass(), "parent", null);
        setField(term187748, term187748.getClass(), "next", term187749);
        setField(term187748, term187748.getClass(), "first", null);
        setField(term187748, term187748.getClass(), "last", null);
        setField(term187748, term187748.getClass(), "propListHead", null);
        setIntField(term187748, term187748.getClass(), "sourcePosition", 0);
        setField(term187748, term187748.getClass(), "jsType", null);
        setField(term187748, term187748.getClass(), "parent", null);
        setField(term187747, term187747.getClass(), "first", term187748);
        setField(term187747, term187747.getClass(), "last", null);
        setField(term187747, term187747.getClass(), "propListHead", null);
        setIntField(term187747, term187747.getClass(), "sourcePosition", 0);
        setField(term187747, term187747.getClass(), "jsType", null);
        setField(term187747, term187747.getClass(), "parent", null);
        term187712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term187716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term187712, term187712.getClass(), "str", null);
        setIntField(term187712, term187712.getClass(), "type", 46);
        setField(term187712, term187712.getClass(), "next", null);
        setField(term187714, term187714.getClass(), "str", null);
        setIntField(term187714, term187714.getClass(), "type", 0);
        setField(term187716, term187716.getClass(), "str", null);
        setIntField(term187716, term187716.getClass(), "type", 0);
        setField(term187716, term187716.getClass(), "next", null);
        setField(term187716, term187716.getClass(), "first", null);
        setField(term187716, term187716.getClass(), "last", null);
        setField(term187716, term187716.getClass(), "propListHead", null);
        setIntField(term187716, term187716.getClass(), "sourcePosition", 0);
        setField(term187716, term187716.getClass(), "jsType", null);
        setField(term187716, term187716.getClass(), "parent", null);
        setField(term187714, term187714.getClass(), "next", term187716);
        setField(term187714, term187714.getClass(), "first", null);
        setField(term187714, term187714.getClass(), "last", null);
        setField(term187714, term187714.getClass(), "propListHead", null);
        setIntField(term187714, term187714.getClass(), "sourcePosition", 0);
        setField(term187714, term187714.getClass(), "jsType", null);
        setField(term187714, term187714.getClass(), "parent", null);
        setField(term187712, term187712.getClass(), "first", term187714);
        setField(term187712, term187712.getClass(), "last", null);
        setField(term187712, term187712.getClass(), "propListHead", null);
        setIntField(term187712, term187712.getClass(), "sourcePosition", 0);
        setField(term187712, term187712.getClass(), "jsType", null);
        setField(term187712, term187712.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term187521;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term187429, args);
        assertTrue(recursiveEquals(term187429, term187746));
        assertTrue(recursiveEquals(term187521, term187747));
        assertTrue(recursiveEquals(retValue, term187712));
    }

};


