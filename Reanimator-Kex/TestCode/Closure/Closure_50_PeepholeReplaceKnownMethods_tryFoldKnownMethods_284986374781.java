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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3663988;
     Object term3664080;
     Object term3665719;
     Object term3665720;
     Object term3665454;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3663988 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3664080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3664172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3664264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3664356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3664486 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3664172, term3664172.getClass(), "type", 35);
        setIntField(term3664356, term3664356.getClass(), "type", 40);
        setField(term3664356, term3664356.getClass(), "str", "substr");
        setField(term3664264, term3664264.getClass(), "next", term3664356);
        setIntField(term3664264, term3664264.getClass(), "type", 40);
        setField(term3664172, term3664172.getClass(), "first", term3664264);
        setIntField(term3664486, term3664486.getClass(), "type", 41);
        setField(term3664172, term3664172.getClass(), "next", term3664486);
        setField(term3664080, term3664080.getClass(), "first", term3664172);
        setIntField(term3664080, term3664080.getClass(), "type", 37);
        term3665719 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3665719, term3665719.getClass(), "currentTraversal", null);
        term3665720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665722 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3665723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3665720, term3665720.getClass(), "str", null);
        setIntField(term3665720, term3665720.getClass(), "type", 37);
        setField(term3665720, term3665720.getClass(), "next", null);
        setField(term3665721, term3665721.getClass(), "str", null);
        setIntField(term3665721, term3665721.getClass(), "type", 35);
        setDoubleField(term3665722, term3665722.getClass(), "number", 0.0);
        setIntField(term3665722, term3665722.getClass(), "type", 41);
        setField(term3665722, term3665722.getClass(), "next", null);
        setField(term3665722, term3665722.getClass(), "first", null);
        setField(term3665722, term3665722.getClass(), "last", null);
        setField(term3665722, term3665722.getClass(), "propListHead", null);
        setIntField(term3665722, term3665722.getClass(), "sourcePosition", 0);
        setField(term3665722, term3665722.getClass(), "jsType", null);
        setField(term3665722, term3665722.getClass(), "parent", null);
        setField(term3665721, term3665721.getClass(), "next", term3665722);
        setField(term3665723, term3665723.getClass(), "str", null);
        setIntField(term3665723, term3665723.getClass(), "type", 40);
        setField(term3665724, term3665724.getClass(), "str", "");
        setIntField(term3665724, term3665724.getClass(), "type", 40);
        setField(term3665724, term3665724.getClass(), "next", null);
        setField(term3665724, term3665724.getClass(), "first", null);
        setField(term3665724, term3665724.getClass(), "last", null);
        setField(term3665724, term3665724.getClass(), "propListHead", null);
        setIntField(term3665724, term3665724.getClass(), "sourcePosition", 0);
        setField(term3665724, term3665724.getClass(), "jsType", null);
        setField(term3665724, term3665724.getClass(), "parent", null);
        setField(term3665723, term3665723.getClass(), "next", term3665724);
        setField(term3665723, term3665723.getClass(), "first", null);
        setField(term3665723, term3665723.getClass(), "last", null);
        setField(term3665723, term3665723.getClass(), "propListHead", null);
        setIntField(term3665723, term3665723.getClass(), "sourcePosition", 0);
        setField(term3665723, term3665723.getClass(), "jsType", null);
        setField(term3665723, term3665723.getClass(), "parent", null);
        setField(term3665721, term3665721.getClass(), "first", term3665723);
        setField(term3665721, term3665721.getClass(), "last", null);
        setField(term3665721, term3665721.getClass(), "propListHead", null);
        setIntField(term3665721, term3665721.getClass(), "sourcePosition", 0);
        setField(term3665721, term3665721.getClass(), "jsType", null);
        setField(term3665721, term3665721.getClass(), "parent", null);
        setField(term3665720, term3665720.getClass(), "first", term3665721);
        setField(term3665720, term3665720.getClass(), "last", null);
        setField(term3665720, term3665720.getClass(), "propListHead", null);
        setIntField(term3665720, term3665720.getClass(), "sourcePosition", 0);
        setField(term3665720, term3665720.getClass(), "jsType", null);
        setField(term3665720, term3665720.getClass(), "parent", null);
        term3665454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3665462 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3665464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3665454, term3665454.getClass(), "str", null);
        setIntField(term3665454, term3665454.getClass(), "type", 37);
        setField(term3665454, term3665454.getClass(), "next", null);
        setField(term3665456, term3665456.getClass(), "str", null);
        setIntField(term3665456, term3665456.getClass(), "type", 35);
        setDoubleField(term3665458, term3665458.getClass(), "number", 0.0);
        setIntField(term3665458, term3665458.getClass(), "type", 41);
        setField(term3665458, term3665458.getClass(), "next", null);
        setField(term3665458, term3665458.getClass(), "first", null);
        setField(term3665458, term3665458.getClass(), "last", null);
        setField(term3665458, term3665458.getClass(), "propListHead", null);
        setIntField(term3665458, term3665458.getClass(), "sourcePosition", 0);
        setField(term3665458, term3665458.getClass(), "jsType", null);
        setField(term3665458, term3665458.getClass(), "parent", null);
        setField(term3665456, term3665456.getClass(), "next", term3665458);
        setField(term3665462, term3665462.getClass(), "str", null);
        setIntField(term3665462, term3665462.getClass(), "type", 40);
        setField(term3665464, term3665464.getClass(), "str", "");
        setIntField(term3665464, term3665464.getClass(), "type", 40);
        setField(term3665464, term3665464.getClass(), "next", null);
        setField(term3665464, term3665464.getClass(), "first", null);
        setField(term3665464, term3665464.getClass(), "last", null);
        setField(term3665464, term3665464.getClass(), "propListHead", null);
        setIntField(term3665464, term3665464.getClass(), "sourcePosition", 0);
        setField(term3665464, term3665464.getClass(), "jsType", null);
        setField(term3665464, term3665464.getClass(), "parent", null);
        setField(term3665462, term3665462.getClass(), "next", term3665464);
        setField(term3665462, term3665462.getClass(), "first", null);
        setField(term3665462, term3665462.getClass(), "last", null);
        setField(term3665462, term3665462.getClass(), "propListHead", null);
        setIntField(term3665462, term3665462.getClass(), "sourcePosition", 0);
        setField(term3665462, term3665462.getClass(), "jsType", null);
        setField(term3665462, term3665462.getClass(), "parent", null);
        setField(term3665456, term3665456.getClass(), "first", term3665462);
        setField(term3665456, term3665456.getClass(), "last", null);
        setField(term3665456, term3665456.getClass(), "propListHead", null);
        setIntField(term3665456, term3665456.getClass(), "sourcePosition", 0);
        setField(term3665456, term3665456.getClass(), "jsType", null);
        setField(term3665456, term3665456.getClass(), "parent", null);
        setField(term3665454, term3665454.getClass(), "first", term3665456);
        setField(term3665454, term3665454.getClass(), "last", null);
        setField(term3665454, term3665454.getClass(), "propListHead", null);
        setIntField(term3665454, term3665454.getClass(), "sourcePosition", 0);
        setField(term3665454, term3665454.getClass(), "jsType", null);
        setField(term3665454, term3665454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3664080;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3663988, args);
        assertTrue(recursiveEquals(term3663988, term3665719));
        assertTrue(recursiveEquals(term3664080, term3665720));
        assertTrue(recursiveEquals(retValue, term3665454));
    }

};


