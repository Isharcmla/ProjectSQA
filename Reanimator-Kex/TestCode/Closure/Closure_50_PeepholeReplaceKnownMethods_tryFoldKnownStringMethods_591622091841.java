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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3706499;
     Object term3706591;
     Object term3707868;
     Object term3707869;
     Object term3707767;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3706499 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3706591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3706683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3706775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3706867 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3706975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3706591, term3706591.getClass(), "type", 37);
        setIntField(term3706683, term3706683.getClass(), "type", 35);
        setIntField(term3706867, term3706867.getClass(), "type", 40);
        setField(term3706867, term3706867.getClass(), "str", "");
        setField(term3706775, term3706775.getClass(), "next", term3706867);
        setIntField(term3706775, term3706775.getClass(), "type", 40);
        setField(term3706683, term3706683.getClass(), "first", term3706775);
        setIntField(term3706975, term3706975.getClass(), "type", 44);
        setField(term3706683, term3706683.getClass(), "next", term3706975);
        setField(term3706591, term3706591.getClass(), "first", term3706683);
        term3707868 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3707868, term3707868.getClass(), "currentTraversal", null);
        term3707869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3707870 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3707872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3707869, term3707869.getClass(), "number", 0.0);
        setIntField(term3707869, term3707869.getClass(), "type", 37);
        setField(term3707869, term3707869.getClass(), "next", null);
        setField(term3707870, term3707870.getClass(), "str", null);
        setIntField(term3707870, term3707870.getClass(), "type", 35);
        setIntField(term3707871, term3707871.getClass(), "type", 44);
        setField(term3707871, term3707871.getClass(), "next", null);
        setField(term3707871, term3707871.getClass(), "first", null);
        setField(term3707871, term3707871.getClass(), "last", null);
        setField(term3707871, term3707871.getClass(), "propListHead", null);
        setIntField(term3707871, term3707871.getClass(), "sourcePosition", 0);
        setField(term3707871, term3707871.getClass(), "jsType", null);
        setField(term3707871, term3707871.getClass(), "parent", null);
        setField(term3707870, term3707870.getClass(), "next", term3707871);
        setField(term3707872, term3707872.getClass(), "str", null);
        setIntField(term3707872, term3707872.getClass(), "type", 40);
        setField(term3707873, term3707873.getClass(), "str", "");
        setIntField(term3707873, term3707873.getClass(), "type", 40);
        setField(term3707873, term3707873.getClass(), "next", null);
        setField(term3707873, term3707873.getClass(), "first", null);
        setField(term3707873, term3707873.getClass(), "last", null);
        setField(term3707873, term3707873.getClass(), "propListHead", null);
        setIntField(term3707873, term3707873.getClass(), "sourcePosition", 0);
        setField(term3707873, term3707873.getClass(), "jsType", null);
        setField(term3707873, term3707873.getClass(), "parent", null);
        setField(term3707872, term3707872.getClass(), "next", term3707873);
        setField(term3707872, term3707872.getClass(), "first", null);
        setField(term3707872, term3707872.getClass(), "last", null);
        setField(term3707872, term3707872.getClass(), "propListHead", null);
        setIntField(term3707872, term3707872.getClass(), "sourcePosition", 0);
        setField(term3707872, term3707872.getClass(), "jsType", null);
        setField(term3707872, term3707872.getClass(), "parent", null);
        setField(term3707870, term3707870.getClass(), "first", term3707872);
        setField(term3707870, term3707870.getClass(), "last", null);
        setField(term3707870, term3707870.getClass(), "propListHead", null);
        setIntField(term3707870, term3707870.getClass(), "sourcePosition", 0);
        setField(term3707870, term3707870.getClass(), "jsType", null);
        setField(term3707870, term3707870.getClass(), "parent", null);
        setField(term3707869, term3707869.getClass(), "first", term3707870);
        setField(term3707869, term3707869.getClass(), "last", null);
        setField(term3707869, term3707869.getClass(), "propListHead", null);
        setIntField(term3707869, term3707869.getClass(), "sourcePosition", 0);
        setField(term3707869, term3707869.getClass(), "jsType", null);
        setField(term3707869, term3707869.getClass(), "parent", null);
        term3707767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3707770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3707775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707777 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3707767, term3707767.getClass(), "number", 0.0);
        setIntField(term3707767, term3707767.getClass(), "type", 37);
        setField(term3707767, term3707767.getClass(), "next", null);
        setField(term3707770, term3707770.getClass(), "str", null);
        setIntField(term3707770, term3707770.getClass(), "type", 35);
        setIntField(term3707772, term3707772.getClass(), "type", 44);
        setField(term3707772, term3707772.getClass(), "next", null);
        setField(term3707772, term3707772.getClass(), "first", null);
        setField(term3707772, term3707772.getClass(), "last", null);
        setField(term3707772, term3707772.getClass(), "propListHead", null);
        setIntField(term3707772, term3707772.getClass(), "sourcePosition", 0);
        setField(term3707772, term3707772.getClass(), "jsType", null);
        setField(term3707772, term3707772.getClass(), "parent", null);
        setField(term3707770, term3707770.getClass(), "next", term3707772);
        setField(term3707775, term3707775.getClass(), "str", null);
        setIntField(term3707775, term3707775.getClass(), "type", 40);
        setField(term3707777, term3707777.getClass(), "str", "");
        setIntField(term3707777, term3707777.getClass(), "type", 40);
        setField(term3707777, term3707777.getClass(), "next", null);
        setField(term3707777, term3707777.getClass(), "first", null);
        setField(term3707777, term3707777.getClass(), "last", null);
        setField(term3707777, term3707777.getClass(), "propListHead", null);
        setIntField(term3707777, term3707777.getClass(), "sourcePosition", 0);
        setField(term3707777, term3707777.getClass(), "jsType", null);
        setField(term3707777, term3707777.getClass(), "parent", null);
        setField(term3707775, term3707775.getClass(), "next", term3707777);
        setField(term3707775, term3707775.getClass(), "first", null);
        setField(term3707775, term3707775.getClass(), "last", null);
        setField(term3707775, term3707775.getClass(), "propListHead", null);
        setIntField(term3707775, term3707775.getClass(), "sourcePosition", 0);
        setField(term3707775, term3707775.getClass(), "jsType", null);
        setField(term3707775, term3707775.getClass(), "parent", null);
        setField(term3707770, term3707770.getClass(), "first", term3707775);
        setField(term3707770, term3707770.getClass(), "last", null);
        setField(term3707770, term3707770.getClass(), "propListHead", null);
        setIntField(term3707770, term3707770.getClass(), "sourcePosition", 0);
        setField(term3707770, term3707770.getClass(), "jsType", null);
        setField(term3707770, term3707770.getClass(), "parent", null);
        setField(term3707767, term3707767.getClass(), "first", term3707770);
        setField(term3707767, term3707767.getClass(), "last", null);
        setField(term3707767, term3707767.getClass(), "propListHead", null);
        setIntField(term3707767, term3707767.getClass(), "sourcePosition", 0);
        setField(term3707767, term3707767.getClass(), "jsType", null);
        setField(term3707767, term3707767.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3706591;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3706499, args);
        assertTrue(recursiveEquals(term3706499, term3707868));
        assertTrue(recursiveEquals(term3706591, term3707869));
        assertTrue(recursiveEquals(retValue, term3707767));
    }

};


