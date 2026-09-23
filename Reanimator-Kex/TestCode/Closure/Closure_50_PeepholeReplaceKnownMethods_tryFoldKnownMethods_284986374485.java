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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3472416;
     Object term3472508;
     Object term3473766;
     Object term3473767;
     Object term3473568;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3472416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3472508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472600 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3472914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3472600, term3472600.getClass(), "type", 35);
        setIntField(term3472784, term3472784.getClass(), "type", 40);
        setField(term3472784, term3472784.getClass(), "str", "");
        setField(term3472692, term3472692.getClass(), "next", term3472784);
        setIntField(term3472692, term3472692.getClass(), "type", 40);
        setField(term3472600, term3472600.getClass(), "first", term3472692);
        setIntField(term3472914, term3472914.getClass(), "type", 39);
        setField(term3472600, term3472600.getClass(), "next", term3472914);
        setField(term3472508, term3472508.getClass(), "first", term3472600);
        setIntField(term3472508, term3472508.getClass(), "type", 37);
        term3473766 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3473766, term3473766.getClass(), "currentTraversal", null);
        term3473767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3473770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3473767, term3473767.getClass(), "str", null);
        setIntField(term3473767, term3473767.getClass(), "type", 37);
        setField(term3473767, term3473767.getClass(), "next", null);
        setField(term3473768, term3473768.getClass(), "str", null);
        setIntField(term3473768, term3473768.getClass(), "type", 35);
        setDoubleField(term3473769, term3473769.getClass(), "number", 0.0);
        setIntField(term3473769, term3473769.getClass(), "type", 39);
        setField(term3473769, term3473769.getClass(), "next", null);
        setField(term3473769, term3473769.getClass(), "first", null);
        setField(term3473769, term3473769.getClass(), "last", null);
        setField(term3473769, term3473769.getClass(), "propListHead", null);
        setIntField(term3473769, term3473769.getClass(), "sourcePosition", 0);
        setField(term3473769, term3473769.getClass(), "jsType", null);
        setField(term3473769, term3473769.getClass(), "parent", null);
        setField(term3473768, term3473768.getClass(), "next", term3473769);
        setField(term3473770, term3473770.getClass(), "str", null);
        setIntField(term3473770, term3473770.getClass(), "type", 40);
        setField(term3473771, term3473771.getClass(), "str", "");
        setIntField(term3473771, term3473771.getClass(), "type", 40);
        setField(term3473771, term3473771.getClass(), "next", null);
        setField(term3473771, term3473771.getClass(), "first", null);
        setField(term3473771, term3473771.getClass(), "last", null);
        setField(term3473771, term3473771.getClass(), "propListHead", null);
        setIntField(term3473771, term3473771.getClass(), "sourcePosition", 0);
        setField(term3473771, term3473771.getClass(), "jsType", null);
        setField(term3473771, term3473771.getClass(), "parent", null);
        setField(term3473770, term3473770.getClass(), "next", term3473771);
        setField(term3473770, term3473770.getClass(), "first", null);
        setField(term3473770, term3473770.getClass(), "last", null);
        setField(term3473770, term3473770.getClass(), "propListHead", null);
        setIntField(term3473770, term3473770.getClass(), "sourcePosition", 0);
        setField(term3473770, term3473770.getClass(), "jsType", null);
        setField(term3473770, term3473770.getClass(), "parent", null);
        setField(term3473768, term3473768.getClass(), "first", term3473770);
        setField(term3473768, term3473768.getClass(), "last", null);
        setField(term3473768, term3473768.getClass(), "propListHead", null);
        setIntField(term3473768, term3473768.getClass(), "sourcePosition", 0);
        setField(term3473768, term3473768.getClass(), "jsType", null);
        setField(term3473768, term3473768.getClass(), "parent", null);
        setField(term3473767, term3473767.getClass(), "first", term3473768);
        setField(term3473767, term3473767.getClass(), "last", null);
        setField(term3473767, term3473767.getClass(), "propListHead", null);
        setIntField(term3473767, term3473767.getClass(), "sourcePosition", 0);
        setField(term3473767, term3473767.getClass(), "jsType", null);
        setField(term3473767, term3473767.getClass(), "parent", null);
        term3473568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473570 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3473576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3473578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3473568, term3473568.getClass(), "str", null);
        setIntField(term3473568, term3473568.getClass(), "type", 37);
        setField(term3473568, term3473568.getClass(), "next", null);
        setField(term3473570, term3473570.getClass(), "str", null);
        setIntField(term3473570, term3473570.getClass(), "type", 35);
        setDoubleField(term3473572, term3473572.getClass(), "number", 0.0);
        setIntField(term3473572, term3473572.getClass(), "type", 39);
        setField(term3473572, term3473572.getClass(), "next", null);
        setField(term3473572, term3473572.getClass(), "first", null);
        setField(term3473572, term3473572.getClass(), "last", null);
        setField(term3473572, term3473572.getClass(), "propListHead", null);
        setIntField(term3473572, term3473572.getClass(), "sourcePosition", 0);
        setField(term3473572, term3473572.getClass(), "jsType", null);
        setField(term3473572, term3473572.getClass(), "parent", null);
        setField(term3473570, term3473570.getClass(), "next", term3473572);
        setField(term3473576, term3473576.getClass(), "str", null);
        setIntField(term3473576, term3473576.getClass(), "type", 40);
        setField(term3473578, term3473578.getClass(), "str", "");
        setIntField(term3473578, term3473578.getClass(), "type", 40);
        setField(term3473578, term3473578.getClass(), "next", null);
        setField(term3473578, term3473578.getClass(), "first", null);
        setField(term3473578, term3473578.getClass(), "last", null);
        setField(term3473578, term3473578.getClass(), "propListHead", null);
        setIntField(term3473578, term3473578.getClass(), "sourcePosition", 0);
        setField(term3473578, term3473578.getClass(), "jsType", null);
        setField(term3473578, term3473578.getClass(), "parent", null);
        setField(term3473576, term3473576.getClass(), "next", term3473578);
        setField(term3473576, term3473576.getClass(), "first", null);
        setField(term3473576, term3473576.getClass(), "last", null);
        setField(term3473576, term3473576.getClass(), "propListHead", null);
        setIntField(term3473576, term3473576.getClass(), "sourcePosition", 0);
        setField(term3473576, term3473576.getClass(), "jsType", null);
        setField(term3473576, term3473576.getClass(), "parent", null);
        setField(term3473570, term3473570.getClass(), "first", term3473576);
        setField(term3473570, term3473570.getClass(), "last", null);
        setField(term3473570, term3473570.getClass(), "propListHead", null);
        setIntField(term3473570, term3473570.getClass(), "sourcePosition", 0);
        setField(term3473570, term3473570.getClass(), "jsType", null);
        setField(term3473570, term3473570.getClass(), "parent", null);
        setField(term3473568, term3473568.getClass(), "first", term3473570);
        setField(term3473568, term3473568.getClass(), "last", null);
        setField(term3473568, term3473568.getClass(), "propListHead", null);
        setIntField(term3473568, term3473568.getClass(), "sourcePosition", 0);
        setField(term3473568, term3473568.getClass(), "jsType", null);
        setField(term3473568, term3473568.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3472508;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3472416, args);
        assertTrue(recursiveEquals(term3472416, term3473766));
        assertTrue(recursiveEquals(term3472508, term3473767));
        assertTrue(recursiveEquals(retValue, term3473568));
    }

};


