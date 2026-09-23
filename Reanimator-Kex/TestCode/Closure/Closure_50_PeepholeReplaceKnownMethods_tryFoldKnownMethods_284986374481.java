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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3469943;
     Object term3470035;
     Object term3471789;
     Object term3471790;
     Object term3471505;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3469943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3470035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3470441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3470127, term3470127.getClass(), "type", 35);
        setIntField(term3470311, term3470311.getClass(), "type", 40);
        setField(term3470311, term3470311.getClass(), "str", "substring");
        setField(term3470219, term3470219.getClass(), "next", term3470311);
        setIntField(term3470219, term3470219.getClass(), "type", 40);
        setField(term3470127, term3470127.getClass(), "first", term3470219);
        setIntField(term3470441, term3470441.getClass(), "type", 44);
        setField(term3470127, term3470127.getClass(), "next", term3470441);
        setField(term3470035, term3470035.getClass(), "first", term3470127);
        setIntField(term3470035, term3470035.getClass(), "type", 37);
        term3471789 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3471789, term3471789.getClass(), "currentTraversal", null);
        term3471790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471791 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471793 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3471790, term3471790.getClass(), "str", null);
        setIntField(term3471790, term3471790.getClass(), "type", 37);
        setField(term3471790, term3471790.getClass(), "next", null);
        setField(term3471791, term3471791.getClass(), "str", null);
        setIntField(term3471791, term3471791.getClass(), "type", 35);
        setField(term3471792, term3471792.getClass(), "str", null);
        setIntField(term3471792, term3471792.getClass(), "type", 44);
        setField(term3471792, term3471792.getClass(), "next", null);
        setField(term3471792, term3471792.getClass(), "first", null);
        setField(term3471792, term3471792.getClass(), "last", null);
        setField(term3471792, term3471792.getClass(), "propListHead", null);
        setIntField(term3471792, term3471792.getClass(), "sourcePosition", 0);
        setField(term3471792, term3471792.getClass(), "jsType", null);
        setField(term3471792, term3471792.getClass(), "parent", null);
        setField(term3471791, term3471791.getClass(), "next", term3471792);
        setField(term3471793, term3471793.getClass(), "str", null);
        setIntField(term3471793, term3471793.getClass(), "type", 40);
        setField(term3471794, term3471794.getClass(), "str", "");
        setIntField(term3471794, term3471794.getClass(), "type", 40);
        setField(term3471794, term3471794.getClass(), "next", null);
        setField(term3471794, term3471794.getClass(), "first", null);
        setField(term3471794, term3471794.getClass(), "last", null);
        setField(term3471794, term3471794.getClass(), "propListHead", null);
        setIntField(term3471794, term3471794.getClass(), "sourcePosition", 0);
        setField(term3471794, term3471794.getClass(), "jsType", null);
        setField(term3471794, term3471794.getClass(), "parent", null);
        setField(term3471793, term3471793.getClass(), "next", term3471794);
        setField(term3471793, term3471793.getClass(), "first", null);
        setField(term3471793, term3471793.getClass(), "last", null);
        setField(term3471793, term3471793.getClass(), "propListHead", null);
        setIntField(term3471793, term3471793.getClass(), "sourcePosition", 0);
        setField(term3471793, term3471793.getClass(), "jsType", null);
        setField(term3471793, term3471793.getClass(), "parent", null);
        setField(term3471791, term3471791.getClass(), "first", term3471793);
        setField(term3471791, term3471791.getClass(), "last", null);
        setField(term3471791, term3471791.getClass(), "propListHead", null);
        setIntField(term3471791, term3471791.getClass(), "sourcePosition", 0);
        setField(term3471791, term3471791.getClass(), "jsType", null);
        setField(term3471791, term3471791.getClass(), "parent", null);
        setField(term3471790, term3471790.getClass(), "first", term3471791);
        setField(term3471790, term3471790.getClass(), "last", null);
        setField(term3471790, term3471790.getClass(), "propListHead", null);
        setIntField(term3471790, term3471790.getClass(), "sourcePosition", 0);
        setField(term3471790, term3471790.getClass(), "jsType", null);
        setField(term3471790, term3471790.getClass(), "parent", null);
        term3471505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471507 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471509 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3471514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3471505, term3471505.getClass(), "str", null);
        setIntField(term3471505, term3471505.getClass(), "type", 37);
        setField(term3471505, term3471505.getClass(), "next", null);
        setField(term3471507, term3471507.getClass(), "str", null);
        setIntField(term3471507, term3471507.getClass(), "type", 35);
        setField(term3471509, term3471509.getClass(), "str", null);
        setIntField(term3471509, term3471509.getClass(), "type", 44);
        setField(term3471509, term3471509.getClass(), "next", null);
        setField(term3471509, term3471509.getClass(), "first", null);
        setField(term3471509, term3471509.getClass(), "last", null);
        setField(term3471509, term3471509.getClass(), "propListHead", null);
        setIntField(term3471509, term3471509.getClass(), "sourcePosition", 0);
        setField(term3471509, term3471509.getClass(), "jsType", null);
        setField(term3471509, term3471509.getClass(), "parent", null);
        setField(term3471507, term3471507.getClass(), "next", term3471509);
        setField(term3471512, term3471512.getClass(), "str", null);
        setIntField(term3471512, term3471512.getClass(), "type", 40);
        setField(term3471514, term3471514.getClass(), "str", "");
        setIntField(term3471514, term3471514.getClass(), "type", 40);
        setField(term3471514, term3471514.getClass(), "next", null);
        setField(term3471514, term3471514.getClass(), "first", null);
        setField(term3471514, term3471514.getClass(), "last", null);
        setField(term3471514, term3471514.getClass(), "propListHead", null);
        setIntField(term3471514, term3471514.getClass(), "sourcePosition", 0);
        setField(term3471514, term3471514.getClass(), "jsType", null);
        setField(term3471514, term3471514.getClass(), "parent", null);
        setField(term3471512, term3471512.getClass(), "next", term3471514);
        setField(term3471512, term3471512.getClass(), "first", null);
        setField(term3471512, term3471512.getClass(), "last", null);
        setField(term3471512, term3471512.getClass(), "propListHead", null);
        setIntField(term3471512, term3471512.getClass(), "sourcePosition", 0);
        setField(term3471512, term3471512.getClass(), "jsType", null);
        setField(term3471512, term3471512.getClass(), "parent", null);
        setField(term3471507, term3471507.getClass(), "first", term3471512);
        setField(term3471507, term3471507.getClass(), "last", null);
        setField(term3471507, term3471507.getClass(), "propListHead", null);
        setIntField(term3471507, term3471507.getClass(), "sourcePosition", 0);
        setField(term3471507, term3471507.getClass(), "jsType", null);
        setField(term3471507, term3471507.getClass(), "parent", null);
        setField(term3471505, term3471505.getClass(), "first", term3471507);
        setField(term3471505, term3471505.getClass(), "last", null);
        setField(term3471505, term3471505.getClass(), "propListHead", null);
        setIntField(term3471505, term3471505.getClass(), "sourcePosition", 0);
        setField(term3471505, term3471505.getClass(), "jsType", null);
        setField(term3471505, term3471505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3470035;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3469943, args);
        assertTrue(recursiveEquals(term3469943, term3471789));
        assertTrue(recursiveEquals(term3470035, term3471790));
        assertTrue(recursiveEquals(retValue, term3471505));
    }

};


