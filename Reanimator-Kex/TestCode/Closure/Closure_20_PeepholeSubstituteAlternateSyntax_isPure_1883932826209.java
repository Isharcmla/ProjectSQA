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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46664;
     Object term46734;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term46734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46734, term46734.getClass(), "type", 95);
        setIntField(term46804, term46804.getClass(), "type", 2);
        setIntField(term46874, term46874.getClass(), "type", 1);
        setField(term46874, term46874.getClass(), "first", null);
        setField(term46874, term46874.getClass(), "next", null);
        setField(term46804, term46804.getClass(), "first", term46874);
        setIntField(term46944, term46944.getClass(), "type", 0);
        setField(term46944, term46944.getClass(), "first", null);
        setField(term46944, term46944.getClass(), "next", null);
        setField(term46804, term46804.getClass(), "next", term46944);
        setField(term46734, term46734.getClass(), "first", term46804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46734;
        callMethod(klass, "isPure", argTypes, term46664, args);
    }

};


