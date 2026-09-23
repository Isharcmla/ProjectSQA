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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43749;
     Object term43819;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43749 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term43819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43819, term43819.getClass(), "type", 142);
        setIntField(term43889, term43889.getClass(), "type", 2);
        setIntField(term43959, term43959.getClass(), "type", 1);
        setField(term43959, term43959.getClass(), "first", null);
        setField(term43959, term43959.getClass(), "next", null);
        setField(term43889, term43889.getClass(), "first", term43959);
        setIntField(term44029, term44029.getClass(), "type", 0);
        setField(term44029, term44029.getClass(), "first", null);
        setField(term44029, term44029.getClass(), "next", null);
        setField(term43889, term43889.getClass(), "next", term44029);
        setField(term43819, term43819.getClass(), "first", term43889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43819;
        callMethod(klass, "isPure", argTypes, term43749, args);
    }

};


