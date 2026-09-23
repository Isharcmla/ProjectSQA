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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123434;
     Object term123526;
     Object term123746;
     Object term123747;
     Object term123717;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123434 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term123526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123618 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term123618, term123618.getClass(), "next", term123710);
        setIntField(term123618, term123618.getClass(), "type", 39);
        setField(term123526, term123526.getClass(), "first", term123618);
        setIntField(term123526, term123526.getClass(), "type", 23);
        term123746 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term123746, term123746.getClass(), "currentTraversal", null);
        term123747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term123747, term123747.getClass(), "str", null);
        setIntField(term123747, term123747.getClass(), "type", 23);
        setField(term123747, term123747.getClass(), "next", null);
        setField(term123748, term123748.getClass(), "str", null);
        setIntField(term123748, term123748.getClass(), "type", 39);
        setField(term123749, term123749.getClass(), "str", null);
        setIntField(term123749, term123749.getClass(), "type", 0);
        setField(term123749, term123749.getClass(), "next", null);
        setField(term123749, term123749.getClass(), "first", null);
        setField(term123749, term123749.getClass(), "last", null);
        setField(term123749, term123749.getClass(), "propListHead", null);
        setIntField(term123749, term123749.getClass(), "sourcePosition", 0);
        setField(term123749, term123749.getClass(), "jsType", null);
        setField(term123749, term123749.getClass(), "parent", null);
        setField(term123748, term123748.getClass(), "next", term123749);
        setField(term123748, term123748.getClass(), "first", null);
        setField(term123748, term123748.getClass(), "last", null);
        setField(term123748, term123748.getClass(), "propListHead", null);
        setIntField(term123748, term123748.getClass(), "sourcePosition", 0);
        setField(term123748, term123748.getClass(), "jsType", null);
        setField(term123748, term123748.getClass(), "parent", null);
        setField(term123747, term123747.getClass(), "first", term123748);
        setField(term123747, term123747.getClass(), "last", null);
        setField(term123747, term123747.getClass(), "propListHead", null);
        setIntField(term123747, term123747.getClass(), "sourcePosition", 0);
        setField(term123747, term123747.getClass(), "jsType", null);
        setField(term123747, term123747.getClass(), "parent", null);
        term123717 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term123717, term123717.getClass(), "str", null);
        setIntField(term123717, term123717.getClass(), "type", 23);
        setField(term123717, term123717.getClass(), "next", null);
        setField(term123719, term123719.getClass(), "str", null);
        setIntField(term123719, term123719.getClass(), "type", 39);
        setField(term123721, term123721.getClass(), "str", null);
        setIntField(term123721, term123721.getClass(), "type", 0);
        setField(term123721, term123721.getClass(), "next", null);
        setField(term123721, term123721.getClass(), "first", null);
        setField(term123721, term123721.getClass(), "last", null);
        setField(term123721, term123721.getClass(), "propListHead", null);
        setIntField(term123721, term123721.getClass(), "sourcePosition", 0);
        setField(term123721, term123721.getClass(), "jsType", null);
        setField(term123721, term123721.getClass(), "parent", null);
        setField(term123719, term123719.getClass(), "next", term123721);
        setField(term123719, term123719.getClass(), "first", null);
        setField(term123719, term123719.getClass(), "last", null);
        setField(term123719, term123719.getClass(), "propListHead", null);
        setIntField(term123719, term123719.getClass(), "sourcePosition", 0);
        setField(term123719, term123719.getClass(), "jsType", null);
        setField(term123719, term123719.getClass(), "parent", null);
        setField(term123717, term123717.getClass(), "first", term123719);
        setField(term123717, term123717.getClass(), "last", null);
        setField(term123717, term123717.getClass(), "propListHead", null);
        setIntField(term123717, term123717.getClass(), "sourcePosition", 0);
        setField(term123717, term123717.getClass(), "jsType", null);
        setField(term123717, term123717.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term123526;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term123434, args);
        assertTrue(recursiveEquals(term123434, term123746));
        assertTrue(recursiveEquals(term123526, term123747));
        assertTrue(recursiveEquals(retValue, term123717));
    }

};


