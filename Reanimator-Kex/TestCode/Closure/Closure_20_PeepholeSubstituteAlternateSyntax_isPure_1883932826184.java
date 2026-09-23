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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37472;
     Object term37542;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term37542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37542, term37542.getClass(), "type", 121);
        setIntField(term37612, term37612.getClass(), "type", 2);
        setIntField(term37682, term37682.getClass(), "type", 1);
        setField(term37682, term37682.getClass(), "first", null);
        setField(term37682, term37682.getClass(), "next", null);
        setField(term37612, term37612.getClass(), "first", term37682);
        setIntField(term37752, term37752.getClass(), "type", 0);
        setField(term37752, term37752.getClass(), "first", null);
        setField(term37752, term37752.getClass(), "next", null);
        setField(term37612, term37612.getClass(), "next", term37752);
        setField(term37542, term37542.getClass(), "first", term37612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37542;
        callMethod(klass, "isPure", argTypes, term37472, args);
    }

};


