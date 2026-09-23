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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3650878;
     Object term3650970;
     Object term3652483;
     Object term3652484;
     Object term3652116;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3650878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3650970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3651062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3651154 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3651246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3651414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3651506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3651062, term3651062.getClass(), "type", 35);
        setIntField(term3651246, term3651246.getClass(), "type", 40);
        setField(term3651246, term3651246.getClass(), "str", "substring");
        setField(term3651154, term3651154.getClass(), "next", term3651246);
        setIntField(term3651154, term3651154.getClass(), "type", 40);
        setField(term3651154, term3651154.getClass(), "str", "");
        setField(term3651062, term3651062.getClass(), "first", term3651154);
        setIntField(term3651414, term3651414.getClass(), "type", 39);
        setDoubleField(term3651414, term3651414.getClass(), "number", 9.2189102272636436E18);
        setIntField(term3651506, term3651506.getClass(), "type", 39);
        setDoubleField(term3651506, term3651506.getClass(), "number", -4.4754517474434657E18);
        setField(term3651506, term3651506.getClass(), "next", null);
        setField(term3651414, term3651414.getClass(), "next", term3651506);
        setField(term3651062, term3651062.getClass(), "next", term3651414);
        setField(term3650970, term3650970.getClass(), "first", term3651062);
        setIntField(term3650970, term3650970.getClass(), "type", 37);
        term3652483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3652483, term3652483.getClass(), "currentTraversal", null);
        term3652484 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652485 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652486 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3652487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3652488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3652484, term3652484.getClass(), "str", null);
        setIntField(term3652484, term3652484.getClass(), "type", 37);
        setField(term3652484, term3652484.getClass(), "next", null);
        setField(term3652485, term3652485.getClass(), "str", null);
        setIntField(term3652485, term3652485.getClass(), "type", 35);
        setDoubleField(term3652486, term3652486.getClass(), "number", 9.2189102272636436E18);
        setIntField(term3652486, term3652486.getClass(), "type", 39);
        setDoubleField(term3652487, term3652487.getClass(), "number", -4.4754517474434657E18);
        setIntField(term3652487, term3652487.getClass(), "type", 39);
        setField(term3652487, term3652487.getClass(), "next", null);
        setField(term3652487, term3652487.getClass(), "first", null);
        setField(term3652487, term3652487.getClass(), "last", null);
        setField(term3652487, term3652487.getClass(), "propListHead", null);
        setIntField(term3652487, term3652487.getClass(), "sourcePosition", 0);
        setField(term3652487, term3652487.getClass(), "jsType", null);
        setField(term3652487, term3652487.getClass(), "parent", null);
        setField(term3652486, term3652486.getClass(), "next", term3652487);
        setField(term3652486, term3652486.getClass(), "first", null);
        setField(term3652486, term3652486.getClass(), "last", null);
        setField(term3652486, term3652486.getClass(), "propListHead", null);
        setIntField(term3652486, term3652486.getClass(), "sourcePosition", 0);
        setField(term3652486, term3652486.getClass(), "jsType", null);
        setField(term3652486, term3652486.getClass(), "parent", null);
        setField(term3652485, term3652485.getClass(), "next", term3652486);
        setField(term3652488, term3652488.getClass(), "str", "");
        setIntField(term3652488, term3652488.getClass(), "type", 40);
        setField(term3652491, term3652491.getClass(), "str", "");
        setIntField(term3652491, term3652491.getClass(), "type", 40);
        setField(term3652491, term3652491.getClass(), "next", null);
        setField(term3652491, term3652491.getClass(), "first", null);
        setField(term3652491, term3652491.getClass(), "last", null);
        setField(term3652491, term3652491.getClass(), "propListHead", null);
        setIntField(term3652491, term3652491.getClass(), "sourcePosition", 0);
        setField(term3652491, term3652491.getClass(), "jsType", null);
        setField(term3652491, term3652491.getClass(), "parent", null);
        setField(term3652488, term3652488.getClass(), "next", term3652491);
        setField(term3652488, term3652488.getClass(), "first", null);
        setField(term3652488, term3652488.getClass(), "last", null);
        setField(term3652488, term3652488.getClass(), "propListHead", null);
        setIntField(term3652488, term3652488.getClass(), "sourcePosition", 0);
        setField(term3652488, term3652488.getClass(), "jsType", null);
        setField(term3652488, term3652488.getClass(), "parent", null);
        setField(term3652485, term3652485.getClass(), "first", term3652488);
        setField(term3652485, term3652485.getClass(), "last", null);
        setField(term3652485, term3652485.getClass(), "propListHead", null);
        setIntField(term3652485, term3652485.getClass(), "sourcePosition", 0);
        setField(term3652485, term3652485.getClass(), "jsType", null);
        setField(term3652485, term3652485.getClass(), "parent", null);
        setField(term3652484, term3652484.getClass(), "first", term3652485);
        setField(term3652484, term3652484.getClass(), "last", null);
        setField(term3652484, term3652484.getClass(), "propListHead", null);
        setIntField(term3652484, term3652484.getClass(), "sourcePosition", 0);
        setField(term3652484, term3652484.getClass(), "jsType", null);
        setField(term3652484, term3652484.getClass(), "parent", null);
        term3652116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3652123 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3652128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3652132 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3652116, term3652116.getClass(), "str", null);
        setIntField(term3652116, term3652116.getClass(), "type", 37);
        setField(term3652116, term3652116.getClass(), "next", null);
        setField(term3652118, term3652118.getClass(), "str", null);
        setIntField(term3652118, term3652118.getClass(), "type", 35);
        setDoubleField(term3652120, term3652120.getClass(), "number", 9.2189102272636436E18);
        setIntField(term3652120, term3652120.getClass(), "type", 39);
        setDoubleField(term3652123, term3652123.getClass(), "number", -4.4754517474434657E18);
        setIntField(term3652123, term3652123.getClass(), "type", 39);
        setField(term3652123, term3652123.getClass(), "next", null);
        setField(term3652123, term3652123.getClass(), "first", null);
        setField(term3652123, term3652123.getClass(), "last", null);
        setField(term3652123, term3652123.getClass(), "propListHead", null);
        setIntField(term3652123, term3652123.getClass(), "sourcePosition", 0);
        setField(term3652123, term3652123.getClass(), "jsType", null);
        setField(term3652123, term3652123.getClass(), "parent", null);
        setField(term3652120, term3652120.getClass(), "next", term3652123);
        setField(term3652120, term3652120.getClass(), "first", null);
        setField(term3652120, term3652120.getClass(), "last", null);
        setField(term3652120, term3652120.getClass(), "propListHead", null);
        setIntField(term3652120, term3652120.getClass(), "sourcePosition", 0);
        setField(term3652120, term3652120.getClass(), "jsType", null);
        setField(term3652120, term3652120.getClass(), "parent", null);
        setField(term3652118, term3652118.getClass(), "next", term3652120);
        setField(term3652128, term3652128.getClass(), "str", "");
        setIntField(term3652128, term3652128.getClass(), "type", 40);
        setField(term3652132, term3652132.getClass(), "str", "");
        setIntField(term3652132, term3652132.getClass(), "type", 40);
        setField(term3652132, term3652132.getClass(), "next", null);
        setField(term3652132, term3652132.getClass(), "first", null);
        setField(term3652132, term3652132.getClass(), "last", null);
        setField(term3652132, term3652132.getClass(), "propListHead", null);
        setIntField(term3652132, term3652132.getClass(), "sourcePosition", 0);
        setField(term3652132, term3652132.getClass(), "jsType", null);
        setField(term3652132, term3652132.getClass(), "parent", null);
        setField(term3652128, term3652128.getClass(), "next", term3652132);
        setField(term3652128, term3652128.getClass(), "first", null);
        setField(term3652128, term3652128.getClass(), "last", null);
        setField(term3652128, term3652128.getClass(), "propListHead", null);
        setIntField(term3652128, term3652128.getClass(), "sourcePosition", 0);
        setField(term3652128, term3652128.getClass(), "jsType", null);
        setField(term3652128, term3652128.getClass(), "parent", null);
        setField(term3652118, term3652118.getClass(), "first", term3652128);
        setField(term3652118, term3652118.getClass(), "last", null);
        setField(term3652118, term3652118.getClass(), "propListHead", null);
        setIntField(term3652118, term3652118.getClass(), "sourcePosition", 0);
        setField(term3652118, term3652118.getClass(), "jsType", null);
        setField(term3652118, term3652118.getClass(), "parent", null);
        setField(term3652116, term3652116.getClass(), "first", term3652118);
        setField(term3652116, term3652116.getClass(), "last", null);
        setField(term3652116, term3652116.getClass(), "propListHead", null);
        setIntField(term3652116, term3652116.getClass(), "sourcePosition", 0);
        setField(term3652116, term3652116.getClass(), "jsType", null);
        setField(term3652116, term3652116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3650970;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3650878, args);
        assertTrue(recursiveEquals(term3650878, term3652483));
        assertTrue(recursiveEquals(term3650970, term3652484));
        assertTrue(recursiveEquals(retValue, term3652116));
    }

};


