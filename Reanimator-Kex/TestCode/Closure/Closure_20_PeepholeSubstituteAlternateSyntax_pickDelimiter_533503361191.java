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

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_533503361191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39766;
     Object term39535;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_533503361191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39766 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term39535 = (Object[]) newArray("java.lang.String", 36);
        setElement(term39535, 0, "");
        setElement(term39535, 1, "");
        setElement(term39535, 2, "");
        setElement(term39535, 3, "");
        setElement(term39535, 4, "");
        setElement(term39535, 5, ";");
        setElement(term39535, 6, ";");
        setElement(term39535, 7, ";");
        setElement(term39535, 8, ";");
        setElement(term39535, 9, ";");
        setElement(term39535, 10, ";");
        setElement(term39535, 11, ";");
        setElement(term39535, 12, ";");
        setElement(term39535, 13, ";");
        setElement(term39535, 14, ";");
        setElement(term39535, 15, ";");
        setElement(term39535, 16, ";");
        setElement(term39535, 17, ";");
        setElement(term39535, 18, ";");
        setElement(term39535, 19, ";");
        setElement(term39535, 20, ";");
        setElement(term39535, 21, ";");
        setElement(term39535, 22, ";");
        setElement(term39535, 23, ";");
        setElement(term39535, 24, ";");
        setElement(term39535, 25, ";");
        setElement(term39535, 26, ";");
        setElement(term39535, 27, ";");
        setElement(term39535, 28, ";");
        setElement(term39535, 29, ";");
        setElement(term39535, 30, ";");
        setElement(term39535, 31, ";");
        setElement(term39535, 32, ";");
        setElement(term39535, 33, ";");
        setElement(term39535, 34, ";");
        setElement(term39535, 35, ";");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39535;
        callMethod(klass, "pickDelimiter", argTypes, term39766, args);
    }

};


