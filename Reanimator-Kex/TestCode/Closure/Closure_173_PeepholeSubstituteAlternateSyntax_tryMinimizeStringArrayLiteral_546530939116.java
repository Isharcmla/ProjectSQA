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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128749;
     Object term128819;
     Object term192236;
     Object term192237;
     Object term192224;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128749 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term128749, term128749.getClass(), "late", true);
        term128819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128959, term128959.getClass(), "next", null);
        setField(term128889, term128889.getClass(), "next", term128959);
        setField(term128819, term128819.getClass(), "first", term128889);
        term192236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term192236, term192236.getClass(), "late", true);
        setField(term192236, term192236.getClass(), "compiler", null);
        term192237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192237, term192237.getClass(), "type", 0);
        setField(term192237, term192237.getClass(), "next", null);
        setIntField(term192238, term192238.getClass(), "type", 0);
        setIntField(term192239, term192239.getClass(), "type", 0);
        setField(term192239, term192239.getClass(), "next", null);
        setField(term192239, term192239.getClass(), "first", null);
        setField(term192239, term192239.getClass(), "last", null);
        setField(term192239, term192239.getClass(), "propListHead", null);
        setIntField(term192239, term192239.getClass(), "sourcePosition", 0);
        setField(term192239, term192239.getClass(), "jsType", null);
        setField(term192239, term192239.getClass(), "parent", null);
        setField(term192238, term192238.getClass(), "next", term192239);
        setField(term192238, term192238.getClass(), "first", null);
        setField(term192238, term192238.getClass(), "last", null);
        setField(term192238, term192238.getClass(), "propListHead", null);
        setIntField(term192238, term192238.getClass(), "sourcePosition", 0);
        setField(term192238, term192238.getClass(), "jsType", null);
        setField(term192238, term192238.getClass(), "parent", null);
        setField(term192237, term192237.getClass(), "first", term192238);
        setField(term192237, term192237.getClass(), "last", null);
        setField(term192237, term192237.getClass(), "propListHead", null);
        setIntField(term192237, term192237.getClass(), "sourcePosition", 0);
        setField(term192237, term192237.getClass(), "jsType", null);
        setField(term192237, term192237.getClass(), "parent", null);
        term192224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192224, term192224.getClass(), "type", 0);
        setField(term192224, term192224.getClass(), "next", null);
        setIntField(term192226, term192226.getClass(), "type", 0);
        setIntField(term192228, term192228.getClass(), "type", 0);
        setField(term192228, term192228.getClass(), "next", null);
        setField(term192228, term192228.getClass(), "first", null);
        setField(term192228, term192228.getClass(), "last", null);
        setField(term192228, term192228.getClass(), "propListHead", null);
        setIntField(term192228, term192228.getClass(), "sourcePosition", 0);
        setField(term192228, term192228.getClass(), "jsType", null);
        setField(term192228, term192228.getClass(), "parent", null);
        setField(term192226, term192226.getClass(), "next", term192228);
        setField(term192226, term192226.getClass(), "first", null);
        setField(term192226, term192226.getClass(), "last", null);
        setField(term192226, term192226.getClass(), "propListHead", null);
        setIntField(term192226, term192226.getClass(), "sourcePosition", 0);
        setField(term192226, term192226.getClass(), "jsType", null);
        setField(term192226, term192226.getClass(), "parent", null);
        setField(term192224, term192224.getClass(), "first", term192226);
        setField(term192224, term192224.getClass(), "last", null);
        setField(term192224, term192224.getClass(), "propListHead", null);
        setIntField(term192224, term192224.getClass(), "sourcePosition", 0);
        setField(term192224, term192224.getClass(), "jsType", null);
        setField(term192224, term192224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128819;
        Object retValue = callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term128749, args);
        assertTrue(recursiveEquals(term128749, term192236));
        assertTrue(recursiveEquals(term128819, term192237));
        assertTrue(recursiveEquals(retValue, term192224));
    }

};


