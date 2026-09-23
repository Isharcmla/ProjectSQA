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

public class PeepholeSubstituteAlternateSyntax_reduceTrueFalse_212126710124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209206;
     Object term209276;

    public PeepholeSubstituteAlternateSyntax_reduceTrueFalse_212126710124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term209206, term209206.getClass(), "late", true);
        term209276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term209276, term209276.getClass(), "type", 0);
        setField(term209276, term209276.getClass(), "propListHead", null);
        setIntField(term209276, term209276.getClass(), "sourcePosition", 1073741823);
        setField(term209276, term209276.getClass(), "parent", term209276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209276;
        callMethod(klass, "reduceTrueFalse", argTypes, term209206, args);
    }

};


