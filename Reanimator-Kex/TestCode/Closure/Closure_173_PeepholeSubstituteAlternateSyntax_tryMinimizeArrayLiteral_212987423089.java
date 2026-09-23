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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93129;
     Object term93199;
     Object term93214;
     Object term93215;
     Object term93200;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93129 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term93129, term93129.getClass(), "late", true);
        term93199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93199, term93199.getClass(), "first", null);
        term93214 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term93214, term93214.getClass(), "late", true);
        setField(term93214, term93214.getClass(), "compiler", null);
        term93215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93215, term93215.getClass(), "type", 0);
        setField(term93215, term93215.getClass(), "next", null);
        setField(term93215, term93215.getClass(), "first", null);
        setField(term93215, term93215.getClass(), "last", null);
        setField(term93215, term93215.getClass(), "propListHead", null);
        setIntField(term93215, term93215.getClass(), "sourcePosition", 0);
        setField(term93215, term93215.getClass(), "jsType", null);
        setField(term93215, term93215.getClass(), "parent", null);
        term93200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93200, term93200.getClass(), "type", 0);
        setField(term93200, term93200.getClass(), "next", null);
        setField(term93200, term93200.getClass(), "first", null);
        setField(term93200, term93200.getClass(), "last", null);
        setField(term93200, term93200.getClass(), "propListHead", null);
        setIntField(term93200, term93200.getClass(), "sourcePosition", 0);
        setField(term93200, term93200.getClass(), "jsType", null);
        setField(term93200, term93200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93199;
        Object retValue = callMethod(klass, "tryMinimizeArrayLiteral", argTypes, term93129, args);
        assertTrue(recursiveEquals(term93129, term93214));
        assertTrue(recursiveEquals(term93199, term93215));
        assertTrue(recursiveEquals(retValue, term93200));
    }

};


