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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57818;
     Object term57888;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term57888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57888, term57888.getClass(), "type", 34);
        setIntField(term57958, term57958.getClass(), "type", 2);
        setIntField(term58028, term58028.getClass(), "type", 1);
        setField(term58028, term58028.getClass(), "first", null);
        setField(term58028, term58028.getClass(), "next", null);
        setField(term57958, term57958.getClass(), "first", term58028);
        setIntField(term58098, term58098.getClass(), "type", 0);
        setField(term58098, term58098.getClass(), "first", null);
        setField(term58098, term58098.getClass(), "next", null);
        setField(term57958, term57958.getClass(), "next", term58098);
        setField(term57888, term57888.getClass(), "first", term57958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57888;
        callMethod(klass, "isPure", argTypes, term57818, args);
    }

};


