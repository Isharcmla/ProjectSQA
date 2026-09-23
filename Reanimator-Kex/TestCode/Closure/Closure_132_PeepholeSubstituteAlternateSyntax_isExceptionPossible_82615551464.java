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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_isExceptionPossible_82615551464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;
     Object term510;

    public PeepholeSubstituteAlternateSyntax_isExceptionPossible_82615551464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term507, term507.getClass(), "late", true);
        setIntField(term507, term507.getClass(), "STRING_SPLIT_OVERHEAD", -507387516);
        setField(term507, term507.getClass(), "compiler", null);
        term510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term510, term510.getClass(), "type", -1970452551);
        setIntField(term512, term512.getClass(), "type", -1896376975);
        setIntField(term514, term514.getClass(), "type", 729658803);
        setIntField(term516, term516.getClass(), "type", 114754804);
        setIntField(term518, term518.getClass(), "type", 1687361082);
        setField(term518, term518.getClass(), "next", null);
        setField(term518, term518.getClass(), "first", null);
        setField(term518, term518.getClass(), "last", null);
        setField(term518, term518.getClass(), "propListHead", null);
        setIntField(term518, term518.getClass(), "sourcePosition", 0);
        setField(term518, term518.getClass(), "jsType", null);
        setField(term518, term518.getClass(), "parent", null);
        setField(term516, term516.getClass(), "next", term518);
        setIntField(term521, term521.getClass(), "type", 584893196);
        setField(term521, term521.getClass(), "next", null);
        setField(term521, term521.getClass(), "first", null);
        setField(term521, term521.getClass(), "last", term518);
        setField(term521, term521.getClass(), "propListHead", null);
        setIntField(term521, term521.getClass(), "sourcePosition", 0);
        setField(term521, term521.getClass(), "jsType", null);
        setField(term521, term521.getClass(), "parent", null);
        setField(term516, term516.getClass(), "first", term521);
        setField(term516, term516.getClass(), "last", term514);
        setField(term516, term516.getClass(), "propListHead", null);
        setIntField(term516, term516.getClass(), "sourcePosition", 0);
        setField(term516, term516.getClass(), "jsType", null);
        setField(term516, term516.getClass(), "parent", null);
        setField(term514, term514.getClass(), "next", term516);
        setField(term514, term514.getClass(), "first", term518);
        setIntField(term525, term525.getClass(), "type", -1899301124);
        setIntField(term527, term527.getClass(), "type", -1882480155);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", term521);
        setField(term527, term527.getClass(), "last", term516);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term525, term525.getClass(), "next", term527);
        setField(term525, term525.getClass(), "first", term512);
        setField(term525, term525.getClass(), "last", term512);
        setField(term525, term525.getClass(), "propListHead", null);
        setIntField(term525, term525.getClass(), "sourcePosition", 0);
        setField(term525, term525.getClass(), "jsType", null);
        setField(term525, term525.getClass(), "parent", null);
        setField(term514, term514.getClass(), "last", term525);
        setField(term514, term514.getClass(), "propListHead", null);
        setIntField(term514, term514.getClass(), "sourcePosition", 0);
        setField(term514, term514.getClass(), "jsType", null);
        setField(term514, term514.getClass(), "parent", null);
        setField(term512, term512.getClass(), "next", term514);
        setIntField(term532, term532.getClass(), "type", -1410220680);
        setField(term532, term532.getClass(), "next", term525);
        setField(term532, term532.getClass(), "first", term527);
        setField(term532, term532.getClass(), "last", term510);
        setField(term532, term532.getClass(), "propListHead", null);
        setIntField(term532, term532.getClass(), "sourcePosition", 0);
        setField(term532, term532.getClass(), "jsType", null);
        setField(term532, term532.getClass(), "parent", null);
        setField(term512, term512.getClass(), "first", term532);
        setField(term512, term512.getClass(), "last", term532);
        setField(term512, term512.getClass(), "propListHead", null);
        setIntField(term512, term512.getClass(), "sourcePosition", 0);
        setField(term512, term512.getClass(), "jsType", null);
        setField(term512, term512.getClass(), "parent", null);
        setField(term510, term510.getClass(), "next", term512);
        setField(term510, term510.getClass(), "first", term516);
        setField(term510, term510.getClass(), "last", term518);
        setField(term510, term510.getClass(), "propListHead", null);
        setIntField(term510, term510.getClass(), "sourcePosition", 0);
        setField(term510, term510.getClass(), "jsType", null);
        setField(term510, term510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term510;
        try {
            callMethod(klass, "isExceptionPossible", argTypes, term507, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


