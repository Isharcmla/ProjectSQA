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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128793;
     Object term128863;
     Object term129260;
     Object term129261;
     Object term129238;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term128863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term128863, term128863.getClass(), "first", term128863);
        setField(term128863, term128863.getClass(), "next", term128863);
        setIntField(term128863, term128863.getClass(), "type", 45);
        term129260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term129260, term129260.getClass(), "currentTraversal", null);
        term129261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129261, term129261.getClass(), "type", 45);
        setField(term129261, term129261.getClass(), "next", term129261);
        setField(term129261, term129261.getClass(), "first", term129261);
        setField(term129261, term129261.getClass(), "last", null);
        setField(term129261, term129261.getClass(), "propListHead", null);
        setIntField(term129261, term129261.getClass(), "sourcePosition", 0);
        setField(term129261, term129261.getClass(), "jsType", null);
        setField(term129261, term129261.getClass(), "parent", null);
        term129238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129238, term129238.getClass(), "type", 45);
        setField(term129238, term129238.getClass(), "next", term129238);
        setField(term129238, term129238.getClass(), "first", term129238);
        setField(term129238, term129238.getClass(), "last", null);
        setField(term129238, term129238.getClass(), "propListHead", null);
        setIntField(term129238, term129238.getClass(), "sourcePosition", 0);
        setField(term129238, term129238.getClass(), "jsType", null);
        setField(term129238, term129238.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term128863;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term128793, args);
        assertTrue(recursiveEquals(term128793, term129260));
        assertTrue(recursiveEquals(term128863, term129261));
        assertTrue(recursiveEquals(retValue, term129238));
    }

};


