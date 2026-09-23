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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4190062;
     Object term4190154;
     Object term4193076;
     Object term4193077;
     Object term4192719;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4190062 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4190154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4190246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4190338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4190430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4190598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4190690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4190246, term4190246.getClass(), "type", 35);
        setIntField(term4190430, term4190430.getClass(), "type", 40);
        setField(term4190430, term4190430.getClass(), "str", "substring");
        setField(term4190338, term4190338.getClass(), "next", term4190430);
        setIntField(term4190338, term4190338.getClass(), "type", 40);
        setField(term4190338, term4190338.getClass(), "str", "\u0004r");
        setField(term4190246, term4190246.getClass(), "first", term4190338);
        setIntField(term4190598, term4190598.getClass(), "type", 39);
        setDoubleField(term4190598, term4190598.getClass(), "number", 4.5847580257173002E18);
        setField(term4190598, term4190598.getClass(), "next", null);
        setField(term4190246, term4190246.getClass(), "next", term4190598);
        setField(term4190154, term4190154.getClass(), "first", term4190246);
        setIntField(term4190154, term4190154.getClass(), "type", 37);
        setField(term4190154, term4190154.getClass(), "parent", term4190690);
        term4193076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4193076, term4193076.getClass(), "currentTraversal", null);
        term4193077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193078 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4193080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193085 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term4193077, term4193077.getClass(), "str", null);
        setIntField(term4193077, term4193077.getClass(), "type", 37);
        setField(term4193077, term4193077.getClass(), "next", null);
        setField(term4193078, term4193078.getClass(), "str", null);
        setIntField(term4193078, term4193078.getClass(), "type", 35);
        setDoubleField(term4193079, term4193079.getClass(), "number", 4.5847580257173002E18);
        setIntField(term4193079, term4193079.getClass(), "type", 39);
        setField(term4193079, term4193079.getClass(), "next", null);
        setField(term4193079, term4193079.getClass(), "first", null);
        setField(term4193079, term4193079.getClass(), "last", null);
        setField(term4193079, term4193079.getClass(), "propListHead", null);
        setIntField(term4193079, term4193079.getClass(), "sourcePosition", 0);
        setField(term4193079, term4193079.getClass(), "jsType", null);
        setField(term4193079, term4193079.getClass(), "parent", null);
        setField(term4193078, term4193078.getClass(), "next", term4193079);
        setField(term4193080, term4193080.getClass(), "str", "\u0004r");
        setIntField(term4193080, term4193080.getClass(), "type", 40);
        setField(term4193083, term4193083.getClass(), "str", "");
        setIntField(term4193083, term4193083.getClass(), "type", 40);
        setField(term4193083, term4193083.getClass(), "next", null);
        setField(term4193083, term4193083.getClass(), "first", null);
        setField(term4193083, term4193083.getClass(), "last", null);
        setField(term4193083, term4193083.getClass(), "propListHead", null);
        setIntField(term4193083, term4193083.getClass(), "sourcePosition", 0);
        setField(term4193083, term4193083.getClass(), "jsType", null);
        setField(term4193083, term4193083.getClass(), "parent", null);
        setField(term4193080, term4193080.getClass(), "next", term4193083);
        setField(term4193080, term4193080.getClass(), "first", null);
        setField(term4193080, term4193080.getClass(), "last", null);
        setField(term4193080, term4193080.getClass(), "propListHead", null);
        setIntField(term4193080, term4193080.getClass(), "sourcePosition", 0);
        setField(term4193080, term4193080.getClass(), "jsType", null);
        setField(term4193080, term4193080.getClass(), "parent", null);
        setField(term4193078, term4193078.getClass(), "first", term4193080);
        setField(term4193078, term4193078.getClass(), "last", null);
        setField(term4193078, term4193078.getClass(), "propListHead", null);
        setIntField(term4193078, term4193078.getClass(), "sourcePosition", 0);
        setField(term4193078, term4193078.getClass(), "jsType", null);
        setField(term4193078, term4193078.getClass(), "parent", null);
        setField(term4193077, term4193077.getClass(), "first", term4193078);
        setField(term4193077, term4193077.getClass(), "last", null);
        setField(term4193077, term4193077.getClass(), "propListHead", null);
        setIntField(term4193077, term4193077.getClass(), "sourcePosition", 0);
        setField(term4193077, term4193077.getClass(), "jsType", null);
        setDoubleField(term4193085, term4193085.getClass(), "number", 0.0);
        setIntField(term4193085, term4193085.getClass(), "type", 0);
        setField(term4193085, term4193085.getClass(), "next", null);
        setField(term4193085, term4193085.getClass(), "first", null);
        setField(term4193085, term4193085.getClass(), "last", null);
        setField(term4193085, term4193085.getClass(), "propListHead", null);
        setIntField(term4193085, term4193085.getClass(), "sourcePosition", 0);
        setField(term4193085, term4193085.getClass(), "jsType", null);
        setField(term4193085, term4193085.getClass(), "parent", null);
        setField(term4193077, term4193077.getClass(), "parent", term4193085);
        term4192719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4192727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192733 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192740 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term4192719, term4192719.getClass(), "str", null);
        setIntField(term4192719, term4192719.getClass(), "type", 37);
        setField(term4192719, term4192719.getClass(), "next", null);
        setField(term4192721, term4192721.getClass(), "str", null);
        setIntField(term4192721, term4192721.getClass(), "type", 35);
        setDoubleField(term4192723, term4192723.getClass(), "number", 4.5847580257173002E18);
        setIntField(term4192723, term4192723.getClass(), "type", 39);
        setField(term4192723, term4192723.getClass(), "next", null);
        setField(term4192723, term4192723.getClass(), "first", null);
        setField(term4192723, term4192723.getClass(), "last", null);
        setField(term4192723, term4192723.getClass(), "propListHead", null);
        setIntField(term4192723, term4192723.getClass(), "sourcePosition", 0);
        setField(term4192723, term4192723.getClass(), "jsType", null);
        setField(term4192723, term4192723.getClass(), "parent", null);
        setField(term4192721, term4192721.getClass(), "next", term4192723);
        setField(term4192727, term4192727.getClass(), "str", "\u0004r");
        setIntField(term4192727, term4192727.getClass(), "type", 40);
        setField(term4192733, term4192733.getClass(), "str", "");
        setIntField(term4192733, term4192733.getClass(), "type", 40);
        setField(term4192733, term4192733.getClass(), "next", null);
        setField(term4192733, term4192733.getClass(), "first", null);
        setField(term4192733, term4192733.getClass(), "last", null);
        setField(term4192733, term4192733.getClass(), "propListHead", null);
        setIntField(term4192733, term4192733.getClass(), "sourcePosition", 0);
        setField(term4192733, term4192733.getClass(), "jsType", null);
        setField(term4192733, term4192733.getClass(), "parent", null);
        setField(term4192727, term4192727.getClass(), "next", term4192733);
        setField(term4192727, term4192727.getClass(), "first", null);
        setField(term4192727, term4192727.getClass(), "last", null);
        setField(term4192727, term4192727.getClass(), "propListHead", null);
        setIntField(term4192727, term4192727.getClass(), "sourcePosition", 0);
        setField(term4192727, term4192727.getClass(), "jsType", null);
        setField(term4192727, term4192727.getClass(), "parent", null);
        setField(term4192721, term4192721.getClass(), "first", term4192727);
        setField(term4192721, term4192721.getClass(), "last", null);
        setField(term4192721, term4192721.getClass(), "propListHead", null);
        setIntField(term4192721, term4192721.getClass(), "sourcePosition", 0);
        setField(term4192721, term4192721.getClass(), "jsType", null);
        setField(term4192721, term4192721.getClass(), "parent", null);
        setField(term4192719, term4192719.getClass(), "first", term4192721);
        setField(term4192719, term4192719.getClass(), "last", null);
        setField(term4192719, term4192719.getClass(), "propListHead", null);
        setIntField(term4192719, term4192719.getClass(), "sourcePosition", 0);
        setField(term4192719, term4192719.getClass(), "jsType", null);
        setDoubleField(term4192740, term4192740.getClass(), "number", 0.0);
        setIntField(term4192740, term4192740.getClass(), "type", 0);
        setField(term4192740, term4192740.getClass(), "next", null);
        setField(term4192740, term4192740.getClass(), "first", null);
        setField(term4192740, term4192740.getClass(), "last", null);
        setField(term4192740, term4192740.getClass(), "propListHead", null);
        setIntField(term4192740, term4192740.getClass(), "sourcePosition", 0);
        setField(term4192740, term4192740.getClass(), "jsType", null);
        setField(term4192740, term4192740.getClass(), "parent", null);
        setField(term4192719, term4192719.getClass(), "parent", term4192740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4190154;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4190062, args);
        assertTrue(recursiveEquals(term4190062, term4193076));
        assertTrue(recursiveEquals(term4190154, term4193077));
        assertTrue(recursiveEquals(retValue, term4192719));
    }

};


