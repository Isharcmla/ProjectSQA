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

public class ScopedAliases_hotSwapScript_88341709291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188382;
     Object term188474;
     Object term189565;
     Object term189566;

    public ScopedAliases_hotSwapScript_88341709291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188382 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term188382, term188382.getClass(), "compiler", null);
        term188474 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term188614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term188706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term188474, term188474.getClass(), "type", 0);
        setField(term188474, term188474.getClass(), "parent", null);
        setField(term188614, term188614.getClass(), "next", null);
        setIntField(term188614, term188614.getClass(), "type", 37);
        setField(term188706, term188706.getClass(), "next", null);
        setIntField(term188706, term188706.getClass(), "type", 0);
        setField(term188706, term188706.getClass(), "first", null);
        setField(term188614, term188614.getClass(), "first", term188706);
        setField(term188544, term188544.getClass(), "next", term188614);
        setIntField(term188544, term188544.getClass(), "type", 0);
        setField(term188776, term188776.getClass(), "next", null);
        setIntField(term188776, term188776.getClass(), "type", 0);
        setField(term188776, term188776.getClass(), "first", null);
        setField(term188544, term188544.getClass(), "first", term188776);
        setField(term188474, term188474.getClass(), "first", term188544);
        term189565 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term189565, term189565.getClass(), "compiler", null);
        setField(term189565, term189565.getClass(), "preprocessorSymbolTable", null);
        setField(term189565, term189565.getClass(), "transformationHandler", null);
        term189566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term189566, term189566.getClass(), "number", 0.0);
        setIntField(term189566, term189566.getClass(), "type", 0);
        setField(term189566, term189566.getClass(), "next", null);
        setIntField(term189567, term189567.getClass(), "type", 0);
        setIntField(term189568, term189568.getClass(), "type", 37);
        setField(term189568, term189568.getClass(), "next", null);
        setDoubleField(term189569, term189569.getClass(), "number", 0.0);
        setIntField(term189569, term189569.getClass(), "type", 0);
        setField(term189569, term189569.getClass(), "next", null);
        setField(term189569, term189569.getClass(), "first", null);
        setField(term189569, term189569.getClass(), "last", null);
        setField(term189569, term189569.getClass(), "propListHead", null);
        setIntField(term189569, term189569.getClass(), "sourcePosition", 0);
        setField(term189569, term189569.getClass(), "jsType", null);
        setField(term189569, term189569.getClass(), "parent", null);
        setField(term189568, term189568.getClass(), "first", term189569);
        setField(term189568, term189568.getClass(), "last", null);
        setField(term189568, term189568.getClass(), "propListHead", null);
        setIntField(term189568, term189568.getClass(), "sourcePosition", 0);
        setField(term189568, term189568.getClass(), "jsType", null);
        setField(term189568, term189568.getClass(), "parent", null);
        setField(term189567, term189567.getClass(), "next", term189568);
        setIntField(term189570, term189570.getClass(), "type", 0);
        setField(term189570, term189570.getClass(), "next", null);
        setField(term189570, term189570.getClass(), "first", null);
        setField(term189570, term189570.getClass(), "last", null);
        setField(term189570, term189570.getClass(), "propListHead", null);
        setIntField(term189570, term189570.getClass(), "sourcePosition", 0);
        setField(term189570, term189570.getClass(), "jsType", null);
        setField(term189570, term189570.getClass(), "parent", null);
        setField(term189567, term189567.getClass(), "first", term189570);
        setField(term189567, term189567.getClass(), "last", null);
        setField(term189567, term189567.getClass(), "propListHead", null);
        setIntField(term189567, term189567.getClass(), "sourcePosition", 0);
        setField(term189567, term189567.getClass(), "jsType", null);
        setField(term189567, term189567.getClass(), "parent", null);
        setField(term189566, term189566.getClass(), "first", term189567);
        setField(term189566, term189566.getClass(), "last", null);
        setField(term189566, term189566.getClass(), "propListHead", null);
        setIntField(term189566, term189566.getClass(), "sourcePosition", 0);
        setField(term189566, term189566.getClass(), "jsType", null);
        setField(term189566, term189566.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term188474;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term188382, args);
        assertTrue(recursiveEquals(term188382, term189565));
        assertTrue(recursiveEquals(term188474, term189566));
    }

};


