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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7568;
     Object term7660;
     Object term8120;
     Object term31520;
     Object term31521;
     Object term31526;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7568 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term7660 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term7752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term7936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term8028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term8028, term8028.getClass(), "next", null);
        setField(term8028, term8028.getClass(), "first", null);
        setField(term7936, term7936.getClass(), "next", term8028);
        setField(term7844, term7844.getClass(), "next", term7936);
        setField(term7752, term7752.getClass(), "next", term7844);
        setField(term7660, term7660.getClass(), "next", term7752);
        term8120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term8190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8120, term8120.getClass(), "parent", term8190);
        term31520 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term31520, term31520.getClass(), "late", false);
        setField(term31520, term31520.getClass(), "compiler", null);
        term31521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31524 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term31521, term31521.getClass(), "number", 0.0);
        setIntField(term31521, term31521.getClass(), "type", 0);
        setField(term31522, term31522.getClass(), "str", null);
        setIntField(term31522, term31522.getClass(), "type", 0);
        setField(term31523, term31523.getClass(), "str", null);
        setIntField(term31523, term31523.getClass(), "type", 0);
        setDoubleField(term31524, term31524.getClass(), "number", 0.0);
        setIntField(term31524, term31524.getClass(), "type", 0);
        setDoubleField(term31525, term31525.getClass(), "number", 0.0);
        setIntField(term31525, term31525.getClass(), "type", 0);
        setField(term31525, term31525.getClass(), "next", null);
        setField(term31525, term31525.getClass(), "first", null);
        setField(term31525, term31525.getClass(), "last", null);
        setField(term31525, term31525.getClass(), "propListHead", null);
        setIntField(term31525, term31525.getClass(), "sourcePosition", 0);
        setField(term31525, term31525.getClass(), "jsType", null);
        setField(term31525, term31525.getClass(), "parent", null);
        setField(term31524, term31524.getClass(), "next", term31525);
        setField(term31524, term31524.getClass(), "first", null);
        setField(term31524, term31524.getClass(), "last", null);
        setField(term31524, term31524.getClass(), "propListHead", null);
        setIntField(term31524, term31524.getClass(), "sourcePosition", 0);
        setField(term31524, term31524.getClass(), "jsType", null);
        setField(term31524, term31524.getClass(), "parent", null);
        setField(term31523, term31523.getClass(), "next", term31524);
        setField(term31523, term31523.getClass(), "first", null);
        setField(term31523, term31523.getClass(), "last", null);
        setField(term31523, term31523.getClass(), "propListHead", null);
        setIntField(term31523, term31523.getClass(), "sourcePosition", 0);
        setField(term31523, term31523.getClass(), "jsType", null);
        setField(term31523, term31523.getClass(), "parent", null);
        setField(term31522, term31522.getClass(), "next", term31523);
        setField(term31522, term31522.getClass(), "first", null);
        setField(term31522, term31522.getClass(), "last", null);
        setField(term31522, term31522.getClass(), "propListHead", null);
        setIntField(term31522, term31522.getClass(), "sourcePosition", 0);
        setField(term31522, term31522.getClass(), "jsType", null);
        setField(term31522, term31522.getClass(), "parent", null);
        setField(term31521, term31521.getClass(), "next", term31522);
        setField(term31521, term31521.getClass(), "first", null);
        setField(term31521, term31521.getClass(), "last", null);
        setField(term31521, term31521.getClass(), "propListHead", null);
        setIntField(term31521, term31521.getClass(), "sourcePosition", 0);
        setField(term31521, term31521.getClass(), "jsType", null);
        setField(term31521, term31521.getClass(), "parent", null);
        term31526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31527 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term31531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31526, term31526.getClass(), "str", null);
        setIntField(term31526, term31526.getClass(), "type", 0);
        setDoubleField(term31527, term31527.getClass(), "number", 0.0);
        setIntField(term31527, term31527.getClass(), "type", 0);
        setField(term31528, term31528.getClass(), "str", null);
        setIntField(term31528, term31528.getClass(), "type", 0);
        setField(term31529, term31529.getClass(), "str", null);
        setIntField(term31529, term31529.getClass(), "type", 0);
        setDoubleField(term31530, term31530.getClass(), "number", 0.0);
        setIntField(term31530, term31530.getClass(), "type", 0);
        setField(term31530, term31530.getClass(), "next", null);
        setField(term31530, term31530.getClass(), "first", null);
        setField(term31530, term31530.getClass(), "last", null);
        setField(term31530, term31530.getClass(), "propListHead", null);
        setIntField(term31530, term31530.getClass(), "sourcePosition", 0);
        setField(term31530, term31530.getClass(), "jsType", null);
        setField(term31530, term31530.getClass(), "parent", null);
        setField(term31529, term31529.getClass(), "next", term31530);
        setField(term31529, term31529.getClass(), "first", null);
        setField(term31529, term31529.getClass(), "last", null);
        setField(term31529, term31529.getClass(), "propListHead", null);
        setIntField(term31529, term31529.getClass(), "sourcePosition", 0);
        setField(term31529, term31529.getClass(), "jsType", null);
        setIntField(term31531, term31531.getClass(), "type", 0);
        setField(term31531, term31531.getClass(), "next", null);
        setField(term31531, term31531.getClass(), "first", null);
        setField(term31531, term31531.getClass(), "last", null);
        setField(term31531, term31531.getClass(), "propListHead", null);
        setIntField(term31531, term31531.getClass(), "sourcePosition", 0);
        setField(term31531, term31531.getClass(), "jsType", null);
        setField(term31531, term31531.getClass(), "parent", null);
        setField(term31529, term31529.getClass(), "parent", term31531);
        setField(term31528, term31528.getClass(), "next", term31529);
        setField(term31528, term31528.getClass(), "first", null);
        setField(term31528, term31528.getClass(), "last", null);
        setField(term31528, term31528.getClass(), "propListHead", null);
        setIntField(term31528, term31528.getClass(), "sourcePosition", 0);
        setField(term31528, term31528.getClass(), "jsType", null);
        setField(term31528, term31528.getClass(), "parent", term31531);
        setField(term31527, term31527.getClass(), "next", term31528);
        setField(term31527, term31527.getClass(), "first", null);
        setField(term31527, term31527.getClass(), "last", null);
        setField(term31527, term31527.getClass(), "propListHead", null);
        setIntField(term31527, term31527.getClass(), "sourcePosition", 0);
        setField(term31527, term31527.getClass(), "jsType", null);
        setField(term31527, term31527.getClass(), "parent", term31531);
        setField(term31526, term31526.getClass(), "next", term31527);
        setField(term31526, term31526.getClass(), "first", null);
        setField(term31526, term31526.getClass(), "last", null);
        setField(term31526, term31526.getClass(), "propListHead", null);
        setIntField(term31526, term31526.getClass(), "sourcePosition", 0);
        setField(term31526, term31526.getClass(), "jsType", null);
        setField(term31526, term31526.getClass(), "parent", term31531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term7660;
        args[1] = term8120;
        callMethod(klass, "addParameterAfter", argTypes, term7568, args);
        assertTrue(recursiveEquals(term7568, term31520));
        assertTrue(recursiveEquals(term7660, term31521));
        assertTrue(recursiveEquals(term8120, term31526));
    }

};


