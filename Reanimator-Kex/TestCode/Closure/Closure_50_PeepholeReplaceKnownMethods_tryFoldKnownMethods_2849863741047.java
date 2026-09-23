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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4465612;
     Object term4465704;
     Object term4469012;
     Object term4469013;
     Object term4468745;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4465612 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4465704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4465796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4465888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4465980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4466110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4465796, term4465796.getClass(), "type", 35);
        setIntField(term4465980, term4465980.getClass(), "type", 40);
        setField(term4465980, term4465980.getClass(), "str", "charAt");
        setField(term4465888, term4465888.getClass(), "next", term4465980);
        setIntField(term4465888, term4465888.getClass(), "type", 40);
        setField(term4465796, term4465796.getClass(), "first", term4465888);
        setIntField(term4466110, term4466110.getClass(), "type", 43);
        setField(term4465796, term4465796.getClass(), "next", term4466110);
        setField(term4465704, term4465704.getClass(), "first", term4465796);
        setIntField(term4465704, term4465704.getClass(), "type", 37);
        term4469012 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4469012, term4469012.getClass(), "currentTraversal", null);
        term4469013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4469014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4469015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4469016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4469017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4469013, term4469013.getClass(), "str", null);
        setIntField(term4469013, term4469013.getClass(), "type", 37);
        setField(term4469013, term4469013.getClass(), "next", null);
        setField(term4469014, term4469014.getClass(), "str", null);
        setIntField(term4469014, term4469014.getClass(), "type", 35);
        setDoubleField(term4469015, term4469015.getClass(), "number", 0.0);
        setIntField(term4469015, term4469015.getClass(), "type", 43);
        setField(term4469015, term4469015.getClass(), "next", null);
        setField(term4469015, term4469015.getClass(), "first", null);
        setField(term4469015, term4469015.getClass(), "last", null);
        setField(term4469015, term4469015.getClass(), "propListHead", null);
        setIntField(term4469015, term4469015.getClass(), "sourcePosition", 0);
        setField(term4469015, term4469015.getClass(), "jsType", null);
        setField(term4469015, term4469015.getClass(), "parent", null);
        setField(term4469014, term4469014.getClass(), "next", term4469015);
        setField(term4469016, term4469016.getClass(), "str", null);
        setIntField(term4469016, term4469016.getClass(), "type", 40);
        setField(term4469017, term4469017.getClass(), "str", "");
        setIntField(term4469017, term4469017.getClass(), "type", 40);
        setField(term4469017, term4469017.getClass(), "next", null);
        setField(term4469017, term4469017.getClass(), "first", null);
        setField(term4469017, term4469017.getClass(), "last", null);
        setField(term4469017, term4469017.getClass(), "propListHead", null);
        setIntField(term4469017, term4469017.getClass(), "sourcePosition", 0);
        setField(term4469017, term4469017.getClass(), "jsType", null);
        setField(term4469017, term4469017.getClass(), "parent", null);
        setField(term4469016, term4469016.getClass(), "next", term4469017);
        setField(term4469016, term4469016.getClass(), "first", null);
        setField(term4469016, term4469016.getClass(), "last", null);
        setField(term4469016, term4469016.getClass(), "propListHead", null);
        setIntField(term4469016, term4469016.getClass(), "sourcePosition", 0);
        setField(term4469016, term4469016.getClass(), "jsType", null);
        setField(term4469016, term4469016.getClass(), "parent", null);
        setField(term4469014, term4469014.getClass(), "first", term4469016);
        setField(term4469014, term4469014.getClass(), "last", null);
        setField(term4469014, term4469014.getClass(), "propListHead", null);
        setIntField(term4469014, term4469014.getClass(), "sourcePosition", 0);
        setField(term4469014, term4469014.getClass(), "jsType", null);
        setField(term4469014, term4469014.getClass(), "parent", null);
        setField(term4469013, term4469013.getClass(), "first", term4469014);
        setField(term4469013, term4469013.getClass(), "last", null);
        setField(term4469013, term4469013.getClass(), "propListHead", null);
        setIntField(term4469013, term4469013.getClass(), "sourcePosition", 0);
        setField(term4469013, term4469013.getClass(), "jsType", null);
        setField(term4469013, term4469013.getClass(), "parent", null);
        term4468745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4468753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4468745, term4468745.getClass(), "str", null);
        setIntField(term4468745, term4468745.getClass(), "type", 37);
        setField(term4468745, term4468745.getClass(), "next", null);
        setField(term4468747, term4468747.getClass(), "str", null);
        setIntField(term4468747, term4468747.getClass(), "type", 35);
        setDoubleField(term4468749, term4468749.getClass(), "number", 0.0);
        setIntField(term4468749, term4468749.getClass(), "type", 43);
        setField(term4468749, term4468749.getClass(), "next", null);
        setField(term4468749, term4468749.getClass(), "first", null);
        setField(term4468749, term4468749.getClass(), "last", null);
        setField(term4468749, term4468749.getClass(), "propListHead", null);
        setIntField(term4468749, term4468749.getClass(), "sourcePosition", 0);
        setField(term4468749, term4468749.getClass(), "jsType", null);
        setField(term4468749, term4468749.getClass(), "parent", null);
        setField(term4468747, term4468747.getClass(), "next", term4468749);
        setField(term4468753, term4468753.getClass(), "str", null);
        setIntField(term4468753, term4468753.getClass(), "type", 40);
        setField(term4468755, term4468755.getClass(), "str", "");
        setIntField(term4468755, term4468755.getClass(), "type", 40);
        setField(term4468755, term4468755.getClass(), "next", null);
        setField(term4468755, term4468755.getClass(), "first", null);
        setField(term4468755, term4468755.getClass(), "last", null);
        setField(term4468755, term4468755.getClass(), "propListHead", null);
        setIntField(term4468755, term4468755.getClass(), "sourcePosition", 0);
        setField(term4468755, term4468755.getClass(), "jsType", null);
        setField(term4468755, term4468755.getClass(), "parent", null);
        setField(term4468753, term4468753.getClass(), "next", term4468755);
        setField(term4468753, term4468753.getClass(), "first", null);
        setField(term4468753, term4468753.getClass(), "last", null);
        setField(term4468753, term4468753.getClass(), "propListHead", null);
        setIntField(term4468753, term4468753.getClass(), "sourcePosition", 0);
        setField(term4468753, term4468753.getClass(), "jsType", null);
        setField(term4468753, term4468753.getClass(), "parent", null);
        setField(term4468747, term4468747.getClass(), "first", term4468753);
        setField(term4468747, term4468747.getClass(), "last", null);
        setField(term4468747, term4468747.getClass(), "propListHead", null);
        setIntField(term4468747, term4468747.getClass(), "sourcePosition", 0);
        setField(term4468747, term4468747.getClass(), "jsType", null);
        setField(term4468747, term4468747.getClass(), "parent", null);
        setField(term4468745, term4468745.getClass(), "first", term4468747);
        setField(term4468745, term4468745.getClass(), "last", null);
        setField(term4468745, term4468745.getClass(), "propListHead", null);
        setIntField(term4468745, term4468745.getClass(), "sourcePosition", 0);
        setField(term4468745, term4468745.getClass(), "jsType", null);
        setField(term4468745, term4468745.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4465704;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4465612, args);
        assertTrue(recursiveEquals(term4465612, term4469012));
        assertTrue(recursiveEquals(term4465704, term4469013));
        assertTrue(recursiveEquals(retValue, term4468745));
    }

};


