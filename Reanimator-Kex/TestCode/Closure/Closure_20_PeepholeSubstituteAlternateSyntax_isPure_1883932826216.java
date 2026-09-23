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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49492;
     Object term49562;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term49562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49562, term49562.getClass(), "type", 59);
        setIntField(term49632, term49632.getClass(), "type", 2);
        setIntField(term49702, term49702.getClass(), "type", 1);
        setField(term49702, term49702.getClass(), "first", null);
        setField(term49702, term49702.getClass(), "next", null);
        setField(term49632, term49632.getClass(), "first", term49702);
        setIntField(term49772, term49772.getClass(), "type", 0);
        setField(term49772, term49772.getClass(), "first", null);
        setField(term49772, term49772.getClass(), "next", null);
        setField(term49632, term49632.getClass(), "next", term49772);
        setField(term49562, term49562.getClass(), "first", term49632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49562;
        callMethod(klass, "isPure", argTypes, term49492, args);
    }

};


