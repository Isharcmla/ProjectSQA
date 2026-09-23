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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97531;
     Object term97601;
     Object term97704;
     Object term97705;
     Object term97682;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97531 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term97601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97601, term97601.getClass(), "first", term97601);
        setField(term97601, term97601.getClass(), "next", term97601);
        setIntField(term97601, term97601.getClass(), "type", 15);
        term97704 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term97704, term97704.getClass(), "currentTraversal", null);
        term97705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97705, term97705.getClass(), "type", 15);
        setField(term97705, term97705.getClass(), "next", term97705);
        setField(term97705, term97705.getClass(), "first", term97705);
        setField(term97705, term97705.getClass(), "last", null);
        setField(term97705, term97705.getClass(), "propListHead", null);
        setIntField(term97705, term97705.getClass(), "sourcePosition", 0);
        setField(term97705, term97705.getClass(), "jsType", null);
        setField(term97705, term97705.getClass(), "parent", null);
        term97682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97682, term97682.getClass(), "type", 15);
        setField(term97682, term97682.getClass(), "next", term97682);
        setField(term97682, term97682.getClass(), "first", term97682);
        setField(term97682, term97682.getClass(), "last", null);
        setField(term97682, term97682.getClass(), "propListHead", null);
        setIntField(term97682, term97682.getClass(), "sourcePosition", 0);
        setField(term97682, term97682.getClass(), "jsType", null);
        setField(term97682, term97682.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term97601;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term97531, args);
        assertTrue(recursiveEquals(term97531, term97704));
        assertTrue(recursiveEquals(term97601, term97705));
        assertTrue(recursiveEquals(retValue, term97682));
    }

};


