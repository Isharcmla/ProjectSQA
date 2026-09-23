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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4460144;
     Object term4460236;
     Object term4461507;
     Object term4461508;
     Object term4461203;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4460144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4460236 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4460328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4460420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4460512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4460642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4460328, term4460328.getClass(), "type", 35);
        setIntField(term4460512, term4460512.getClass(), "type", 40);
        setField(term4460512, term4460512.getClass(), "str", "charCodeAt");
        setField(term4460420, term4460420.getClass(), "next", term4460512);
        setIntField(term4460420, term4460420.getClass(), "type", 40);
        setField(term4460328, term4460328.getClass(), "first", term4460420);
        setIntField(term4460642, term4460642.getClass(), "type", 44);
        setField(term4460328, term4460328.getClass(), "next", term4460642);
        setField(term4460236, term4460236.getClass(), "first", term4460328);
        setIntField(term4460236, term4460236.getClass(), "type", 37);
        term4461507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4461507, term4461507.getClass(), "currentTraversal", null);
        term4461508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4461511 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4461508, term4461508.getClass(), "str", null);
        setIntField(term4461508, term4461508.getClass(), "type", 37);
        setField(term4461508, term4461508.getClass(), "next", null);
        setField(term4461509, term4461509.getClass(), "str", null);
        setIntField(term4461509, term4461509.getClass(), "type", 35);
        setDoubleField(term4461510, term4461510.getClass(), "number", 0.0);
        setIntField(term4461510, term4461510.getClass(), "type", 44);
        setField(term4461510, term4461510.getClass(), "next", null);
        setField(term4461510, term4461510.getClass(), "first", null);
        setField(term4461510, term4461510.getClass(), "last", null);
        setField(term4461510, term4461510.getClass(), "propListHead", null);
        setIntField(term4461510, term4461510.getClass(), "sourcePosition", 0);
        setField(term4461510, term4461510.getClass(), "jsType", null);
        setField(term4461510, term4461510.getClass(), "parent", null);
        setField(term4461509, term4461509.getClass(), "next", term4461510);
        setField(term4461511, term4461511.getClass(), "str", null);
        setIntField(term4461511, term4461511.getClass(), "type", 40);
        setField(term4461512, term4461512.getClass(), "str", "");
        setIntField(term4461512, term4461512.getClass(), "type", 40);
        setField(term4461512, term4461512.getClass(), "next", null);
        setField(term4461512, term4461512.getClass(), "first", null);
        setField(term4461512, term4461512.getClass(), "last", null);
        setField(term4461512, term4461512.getClass(), "propListHead", null);
        setIntField(term4461512, term4461512.getClass(), "sourcePosition", 0);
        setField(term4461512, term4461512.getClass(), "jsType", null);
        setField(term4461512, term4461512.getClass(), "parent", null);
        setField(term4461511, term4461511.getClass(), "next", term4461512);
        setField(term4461511, term4461511.getClass(), "first", null);
        setField(term4461511, term4461511.getClass(), "last", null);
        setField(term4461511, term4461511.getClass(), "propListHead", null);
        setIntField(term4461511, term4461511.getClass(), "sourcePosition", 0);
        setField(term4461511, term4461511.getClass(), "jsType", null);
        setField(term4461511, term4461511.getClass(), "parent", null);
        setField(term4461509, term4461509.getClass(), "first", term4461511);
        setField(term4461509, term4461509.getClass(), "last", null);
        setField(term4461509, term4461509.getClass(), "propListHead", null);
        setIntField(term4461509, term4461509.getClass(), "sourcePosition", 0);
        setField(term4461509, term4461509.getClass(), "jsType", null);
        setField(term4461509, term4461509.getClass(), "parent", null);
        setField(term4461508, term4461508.getClass(), "first", term4461509);
        setField(term4461508, term4461508.getClass(), "last", null);
        setField(term4461508, term4461508.getClass(), "propListHead", null);
        setIntField(term4461508, term4461508.getClass(), "sourcePosition", 0);
        setField(term4461508, term4461508.getClass(), "jsType", null);
        setField(term4461508, term4461508.getClass(), "parent", null);
        term4461203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461207 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4461211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4461213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4461203, term4461203.getClass(), "str", null);
        setIntField(term4461203, term4461203.getClass(), "type", 37);
        setField(term4461203, term4461203.getClass(), "next", null);
        setField(term4461205, term4461205.getClass(), "str", null);
        setIntField(term4461205, term4461205.getClass(), "type", 35);
        setDoubleField(term4461207, term4461207.getClass(), "number", 0.0);
        setIntField(term4461207, term4461207.getClass(), "type", 44);
        setField(term4461207, term4461207.getClass(), "next", null);
        setField(term4461207, term4461207.getClass(), "first", null);
        setField(term4461207, term4461207.getClass(), "last", null);
        setField(term4461207, term4461207.getClass(), "propListHead", null);
        setIntField(term4461207, term4461207.getClass(), "sourcePosition", 0);
        setField(term4461207, term4461207.getClass(), "jsType", null);
        setField(term4461207, term4461207.getClass(), "parent", null);
        setField(term4461205, term4461205.getClass(), "next", term4461207);
        setField(term4461211, term4461211.getClass(), "str", null);
        setIntField(term4461211, term4461211.getClass(), "type", 40);
        setField(term4461213, term4461213.getClass(), "str", "");
        setIntField(term4461213, term4461213.getClass(), "type", 40);
        setField(term4461213, term4461213.getClass(), "next", null);
        setField(term4461213, term4461213.getClass(), "first", null);
        setField(term4461213, term4461213.getClass(), "last", null);
        setField(term4461213, term4461213.getClass(), "propListHead", null);
        setIntField(term4461213, term4461213.getClass(), "sourcePosition", 0);
        setField(term4461213, term4461213.getClass(), "jsType", null);
        setField(term4461213, term4461213.getClass(), "parent", null);
        setField(term4461211, term4461211.getClass(), "next", term4461213);
        setField(term4461211, term4461211.getClass(), "first", null);
        setField(term4461211, term4461211.getClass(), "last", null);
        setField(term4461211, term4461211.getClass(), "propListHead", null);
        setIntField(term4461211, term4461211.getClass(), "sourcePosition", 0);
        setField(term4461211, term4461211.getClass(), "jsType", null);
        setField(term4461211, term4461211.getClass(), "parent", null);
        setField(term4461205, term4461205.getClass(), "first", term4461211);
        setField(term4461205, term4461205.getClass(), "last", null);
        setField(term4461205, term4461205.getClass(), "propListHead", null);
        setIntField(term4461205, term4461205.getClass(), "sourcePosition", 0);
        setField(term4461205, term4461205.getClass(), "jsType", null);
        setField(term4461205, term4461205.getClass(), "parent", null);
        setField(term4461203, term4461203.getClass(), "first", term4461205);
        setField(term4461203, term4461203.getClass(), "last", null);
        setField(term4461203, term4461203.getClass(), "propListHead", null);
        setIntField(term4461203, term4461203.getClass(), "sourcePosition", 0);
        setField(term4461203, term4461203.getClass(), "jsType", null);
        setField(term4461203, term4461203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4460236;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4460144, args);
        assertTrue(recursiveEquals(term4460144, term4461507));
        assertTrue(recursiveEquals(term4460236, term4461508));
        assertTrue(recursiveEquals(retValue, term4461203));
    }

};


