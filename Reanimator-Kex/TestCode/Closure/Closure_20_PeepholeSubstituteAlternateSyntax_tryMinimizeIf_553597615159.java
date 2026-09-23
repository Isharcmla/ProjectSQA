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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeIf_553597615159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28745;
     Object term28815;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeIf_553597615159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28745 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term28815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28885, term28885.getClass(), "next", term28885);
        setField(term28815, term28815.getClass(), "parent", term28885);
        setIntField(term28955, term28955.getClass(), "type", 24);
        setField(term28955, term28955.getClass(), "next", term28885);
        setField(term28815, term28815.getClass(), "first", term28955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28815;
        callMethod(klass, "tryMinimizeIf", argTypes, term28745, args);
    }

};


