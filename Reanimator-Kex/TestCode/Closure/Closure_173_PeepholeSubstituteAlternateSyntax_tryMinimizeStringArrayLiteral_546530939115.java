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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128516;
     Object term128586;
     Object term192217;
     Object term192218;
     Object term192211;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128516 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term128516, term128516.getClass(), "late", true);
        term128586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128586, term128586.getClass(), "first", null);
        term192217 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term192217, term192217.getClass(), "late", true);
        setField(term192217, term192217.getClass(), "compiler", null);
        term192218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192218, term192218.getClass(), "type", 0);
        setField(term192218, term192218.getClass(), "next", null);
        setField(term192218, term192218.getClass(), "first", null);
        setField(term192218, term192218.getClass(), "last", null);
        setField(term192218, term192218.getClass(), "propListHead", null);
        setIntField(term192218, term192218.getClass(), "sourcePosition", 0);
        setField(term192218, term192218.getClass(), "jsType", null);
        setField(term192218, term192218.getClass(), "parent", null);
        term192211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192211, term192211.getClass(), "type", 0);
        setField(term192211, term192211.getClass(), "next", null);
        setField(term192211, term192211.getClass(), "first", null);
        setField(term192211, term192211.getClass(), "last", null);
        setField(term192211, term192211.getClass(), "propListHead", null);
        setIntField(term192211, term192211.getClass(), "sourcePosition", 0);
        setField(term192211, term192211.getClass(), "jsType", null);
        setField(term192211, term192211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128586;
        Object retValue = callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term128516, args);
        assertTrue(recursiveEquals(term128516, term192217));
        assertTrue(recursiveEquals(term128586, term192218));
        assertTrue(recursiveEquals(retValue, term192211));
    }

};


