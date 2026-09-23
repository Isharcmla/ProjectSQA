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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37456;
     Object term38926;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37456 = (Object[]) newArray("java.lang.String", 34);
        setElement(term37456, 0, "");
        setElement(term37456, 1, "");
        setElement(term37456, 2, "");
        setElement(term37456, 3, " ");
        setElement(term37456, 4, " ");
        setElement(term37456, 5, " ");
        setElement(term37456, 6, " ");
        setElement(term37456, 7, " ");
        setElement(term37456, 8, " ");
        setElement(term37456, 9, " ");
        setElement(term37456, 10, " ");
        setElement(term37456, 11, " ");
        setElement(term37456, 12, " ");
        setElement(term37456, 13, " ");
        setElement(term37456, 14, " ");
        setElement(term37456, 15, " ");
        setElement(term37456, 16, " ");
        setElement(term37456, 17, " ");
        setElement(term37456, 18, " ");
        setElement(term37456, 19, " ");
        setElement(term37456, 20, " ");
        setElement(term37456, 21, " ");
        setElement(term37456, 22, " ");
        setElement(term37456, 23, " ");
        setElement(term37456, 24, " ");
        setElement(term37456, 25, " ");
        setElement(term37456, 26, " ");
        setElement(term37456, 27, " ");
        setElement(term37456, 28, " ");
        setElement(term37456, 29, " ");
        setElement(term37456, 30, " ");
        setElement(term37456, 31, " ");
        setElement(term37456, 32, " ");
        setElement(term37456, 33, " ");
        term38926 = (Object[]) newArray("java.lang.String", 34);
        setElement(term38926, 0, "");
        setElement(term38926, 1, "");
        setElement(term38926, 2, "");
        setElement(term38926, 3, " ");
        setElement(term38926, 4, " ");
        setElement(term38926, 5, " ");
        setElement(term38926, 6, " ");
        setElement(term38926, 7, " ");
        setElement(term38926, 8, " ");
        setElement(term38926, 9, " ");
        setElement(term38926, 10, " ");
        setElement(term38926, 11, " ");
        setElement(term38926, 12, " ");
        setElement(term38926, 13, " ");
        setElement(term38926, 14, " ");
        setElement(term38926, 15, " ");
        setElement(term38926, 16, " ");
        setElement(term38926, 17, " ");
        setElement(term38926, 18, " ");
        setElement(term38926, 19, " ");
        setElement(term38926, 20, " ");
        setElement(term38926, 21, " ");
        setElement(term38926, 22, " ");
        setElement(term38926, 23, " ");
        setElement(term38926, 24, " ");
        setElement(term38926, 25, " ");
        setElement(term38926, 26, " ");
        setElement(term38926, 27, " ");
        setElement(term38926, 28, " ");
        setElement(term38926, 29, " ");
        setElement(term38926, 30, " ");
        setElement(term38926, 31, " ");
        setElement(term38926, 32, " ");
        setElement(term38926, 33, " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37456;
        Object retValue = callMethod(klass, "pickDelimiter", argTypes, null, args);
        assertTrue(recursiveEquals(term37456, term38926));
        assertTrue(recursiveEquals(retValue, ";"));
    }

};


