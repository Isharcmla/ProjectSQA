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

public class PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23559;
     Object term23629;

    public PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term23629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23629, term23629.getClass(), "parent", term23699);
        setField(term23839, term23839.getClass(), "next", term23909);
        setField(term23769, term23769.getClass(), "next", term23839);
        setField(term23629, term23629.getClass(), "first", term23769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23629;
        callMethod(klass, "tryFoldRegularExpressionConstructor", argTypes, term23559, args);
    }

};


