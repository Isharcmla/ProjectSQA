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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71502;
     Object term71594;
     Object term72212;
     Object term72213;
     Object term72183;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71502 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term71594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term71686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term71778 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term71686, term71686.getClass(), "next", term71778);
        setIntField(term71686, term71686.getClass(), "type", 39);
        setField(term71594, term71594.getClass(), "first", term71686);
        setIntField(term71594, term71594.getClass(), "type", 22);
        term72212 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term72212, term72212.getClass(), "currentTraversal", null);
        term72213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72214 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term72213, term72213.getClass(), "str", null);
        setIntField(term72213, term72213.getClass(), "type", 22);
        setField(term72213, term72213.getClass(), "next", null);
        setField(term72214, term72214.getClass(), "str", null);
        setIntField(term72214, term72214.getClass(), "type", 39);
        setField(term72215, term72215.getClass(), "str", null);
        setIntField(term72215, term72215.getClass(), "type", 0);
        setField(term72215, term72215.getClass(), "next", null);
        setField(term72215, term72215.getClass(), "first", null);
        setField(term72215, term72215.getClass(), "last", null);
        setField(term72215, term72215.getClass(), "propListHead", null);
        setIntField(term72215, term72215.getClass(), "sourcePosition", 0);
        setField(term72215, term72215.getClass(), "jsType", null);
        setField(term72215, term72215.getClass(), "parent", null);
        setField(term72214, term72214.getClass(), "next", term72215);
        setField(term72214, term72214.getClass(), "first", null);
        setField(term72214, term72214.getClass(), "last", null);
        setField(term72214, term72214.getClass(), "propListHead", null);
        setIntField(term72214, term72214.getClass(), "sourcePosition", 0);
        setField(term72214, term72214.getClass(), "jsType", null);
        setField(term72214, term72214.getClass(), "parent", null);
        setField(term72213, term72213.getClass(), "first", term72214);
        setField(term72213, term72213.getClass(), "last", null);
        setField(term72213, term72213.getClass(), "propListHead", null);
        setIntField(term72213, term72213.getClass(), "sourcePosition", 0);
        setField(term72213, term72213.getClass(), "jsType", null);
        setField(term72213, term72213.getClass(), "parent", null);
        term72183 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term72187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term72183, term72183.getClass(), "str", null);
        setIntField(term72183, term72183.getClass(), "type", 22);
        setField(term72183, term72183.getClass(), "next", null);
        setField(term72185, term72185.getClass(), "str", null);
        setIntField(term72185, term72185.getClass(), "type", 39);
        setField(term72187, term72187.getClass(), "str", null);
        setIntField(term72187, term72187.getClass(), "type", 0);
        setField(term72187, term72187.getClass(), "next", null);
        setField(term72187, term72187.getClass(), "first", null);
        setField(term72187, term72187.getClass(), "last", null);
        setField(term72187, term72187.getClass(), "propListHead", null);
        setIntField(term72187, term72187.getClass(), "sourcePosition", 0);
        setField(term72187, term72187.getClass(), "jsType", null);
        setField(term72187, term72187.getClass(), "parent", null);
        setField(term72185, term72185.getClass(), "next", term72187);
        setField(term72185, term72185.getClass(), "first", null);
        setField(term72185, term72185.getClass(), "last", null);
        setField(term72185, term72185.getClass(), "propListHead", null);
        setIntField(term72185, term72185.getClass(), "sourcePosition", 0);
        setField(term72185, term72185.getClass(), "jsType", null);
        setField(term72185, term72185.getClass(), "parent", null);
        setField(term72183, term72183.getClass(), "first", term72185);
        setField(term72183, term72183.getClass(), "last", null);
        setField(term72183, term72183.getClass(), "propListHead", null);
        setIntField(term72183, term72183.getClass(), "sourcePosition", 0);
        setField(term72183, term72183.getClass(), "jsType", null);
        setField(term72183, term72183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term71594;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term71502, args);
        assertTrue(recursiveEquals(term71502, term72212));
        assertTrue(recursiveEquals(term71594, term72213));
        assertTrue(recursiveEquals(retValue, term72183));
    }

};


