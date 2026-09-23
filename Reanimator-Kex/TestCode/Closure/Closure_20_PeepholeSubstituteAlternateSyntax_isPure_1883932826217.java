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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49951;
     Object term50021;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term50021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50021, term50021.getClass(), "type", 79);
        setIntField(term50091, term50091.getClass(), "type", 2);
        setIntField(term50161, term50161.getClass(), "type", 1);
        setField(term50161, term50161.getClass(), "first", null);
        setField(term50161, term50161.getClass(), "next", null);
        setField(term50091, term50091.getClass(), "first", term50161);
        setIntField(term50231, term50231.getClass(), "type", 0);
        setField(term50231, term50231.getClass(), "first", null);
        setField(term50231, term50231.getClass(), "next", null);
        setField(term50091, term50091.getClass(), "next", term50231);
        setField(term50021, term50021.getClass(), "first", term50091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50021;
        callMethod(klass, "isPure", argTypes, term49951, args);
    }

};


