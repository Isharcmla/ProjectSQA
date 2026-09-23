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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48295;
     Object term48365;
     Object term48396;
     Object term48397;
     Object term48369;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48295 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48365, term48365.getClass(), "first", term48365);
        setField(term48365, term48365.getClass(), "next", term48365);
        setIntField(term48365, term48365.getClass(), "type", 86);
        term48396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term48396, term48396.getClass(), "currentTraversal", null);
        term48397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48397, term48397.getClass(), "type", 86);
        setField(term48397, term48397.getClass(), "next", term48397);
        setField(term48397, term48397.getClass(), "first", term48397);
        setField(term48397, term48397.getClass(), "last", null);
        setField(term48397, term48397.getClass(), "propListHead", null);
        setIntField(term48397, term48397.getClass(), "sourcePosition", 0);
        setField(term48397, term48397.getClass(), "jsType", null);
        setField(term48397, term48397.getClass(), "parent", null);
        term48369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48369, term48369.getClass(), "type", 86);
        setField(term48369, term48369.getClass(), "next", term48369);
        setField(term48369, term48369.getClass(), "first", term48369);
        setField(term48369, term48369.getClass(), "last", null);
        setField(term48369, term48369.getClass(), "propListHead", null);
        setIntField(term48369, term48369.getClass(), "sourcePosition", 0);
        setField(term48369, term48369.getClass(), "jsType", null);
        setField(term48369, term48369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48365;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term48295, args);
        assertTrue(recursiveEquals(term48295, term48396));
        assertTrue(recursiveEquals(term48365, term48397));
        assertTrue(recursiveEquals(retValue, term48369));
    }

};


