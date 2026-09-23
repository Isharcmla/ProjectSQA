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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7867;
     Object term7937;
     Object term8225;
     Object term8226;
     Object term8220;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term7937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7937, term7937.getClass(), "first", null);
        term8225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term8225, term8225.getClass(), "currentTraversal", null);
        term8226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8226, term8226.getClass(), "type", 0);
        setField(term8226, term8226.getClass(), "next", null);
        setField(term8226, term8226.getClass(), "first", null);
        setField(term8226, term8226.getClass(), "last", null);
        setField(term8226, term8226.getClass(), "propListHead", null);
        setIntField(term8226, term8226.getClass(), "sourcePosition", 0);
        setField(term8226, term8226.getClass(), "jsType", null);
        setField(term8226, term8226.getClass(), "parent", null);
        term8220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8220, term8220.getClass(), "type", 0);
        setField(term8220, term8220.getClass(), "next", null);
        setField(term8220, term8220.getClass(), "first", null);
        setField(term8220, term8220.getClass(), "last", null);
        setField(term8220, term8220.getClass(), "propListHead", null);
        setIntField(term8220, term8220.getClass(), "sourcePosition", 0);
        setField(term8220, term8220.getClass(), "jsType", null);
        setField(term8220, term8220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7937;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term7867, args);
        assertTrue(recursiveEquals(term7867, term8225));
        assertTrue(recursiveEquals(term7937, term8226));
        assertTrue(recursiveEquals(retValue, term8220));
    }

};


