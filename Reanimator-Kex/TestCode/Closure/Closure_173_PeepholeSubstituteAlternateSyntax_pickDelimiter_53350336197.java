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

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94259;
     Object term95059;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94259 = (Object[]) newArray("java.lang.String", 64);
        setElement(term94259, 0, "");
        setElement(term94259, 1, "");
        setElement(term94259, 2, "}");
        setElement(term94259, 3, "");
        setElement(term94259, 4, "");
        setElement(term94259, 5, "");
        setElement(term94259, 6, "");
        setElement(term94259, 7, ",");
        setElement(term94259, 8, ",");
        setElement(term94259, 9, ",");
        setElement(term94259, 10, ",");
        setElement(term94259, 11, ",");
        setElement(term94259, 12, ",");
        setElement(term94259, 13, ",");
        setElement(term94259, 14, ",");
        setElement(term94259, 15, ",");
        setElement(term94259, 16, ",");
        setElement(term94259, 17, ",");
        setElement(term94259, 18, ",");
        setElement(term94259, 19, ",");
        setElement(term94259, 20, ",");
        setElement(term94259, 21, ",");
        setElement(term94259, 22, ",");
        setElement(term94259, 23, ",");
        setElement(term94259, 24, ",");
        setElement(term94259, 25, ",");
        setElement(term94259, 26, ",");
        setElement(term94259, 27, ",");
        setElement(term94259, 28, ",");
        setElement(term94259, 29, ",");
        setElement(term94259, 30, ",");
        setElement(term94259, 31, ",");
        setElement(term94259, 32, ",");
        setElement(term94259, 33, ",");
        setElement(term94259, 34, ",");
        setElement(term94259, 35, ",");
        setElement(term94259, 36, ",");
        setElement(term94259, 37, ",");
        setElement(term94259, 38, ",");
        setElement(term94259, 39, ",");
        setElement(term94259, 40, ",");
        setElement(term94259, 41, ",");
        setElement(term94259, 42, ",");
        setElement(term94259, 43, ",");
        setElement(term94259, 44, ",");
        setElement(term94259, 45, ",");
        setElement(term94259, 46, ",");
        setElement(term94259, 47, ",");
        setElement(term94259, 48, ",");
        setElement(term94259, 49, ",");
        setElement(term94259, 50, ",");
        setElement(term94259, 51, ",");
        setElement(term94259, 52, ",");
        setElement(term94259, 53, ",");
        setElement(term94259, 54, ",");
        setElement(term94259, 55, ",");
        setElement(term94259, 56, ",");
        setElement(term94259, 57, ",");
        setElement(term94259, 58, ",");
        setElement(term94259, 59, ",");
        setElement(term94259, 60, ",");
        setElement(term94259, 61, ",");
        setElement(term94259, 62, ",");
        setElement(term94259, 63, ",");
        term95059 = (Object[]) newArray("java.lang.String", 64);
        setElement(term95059, 0, "");
        setElement(term95059, 1, "");
        setElement(term95059, 2, "}");
        setElement(term95059, 3, "");
        setElement(term95059, 4, "");
        setElement(term95059, 5, "");
        setElement(term95059, 6, "");
        setElement(term95059, 7, ",");
        setElement(term95059, 8, ",");
        setElement(term95059, 9, ",");
        setElement(term95059, 10, ",");
        setElement(term95059, 11, ",");
        setElement(term95059, 12, ",");
        setElement(term95059, 13, ",");
        setElement(term95059, 14, ",");
        setElement(term95059, 15, ",");
        setElement(term95059, 16, ",");
        setElement(term95059, 17, ",");
        setElement(term95059, 18, ",");
        setElement(term95059, 19, ",");
        setElement(term95059, 20, ",");
        setElement(term95059, 21, ",");
        setElement(term95059, 22, ",");
        setElement(term95059, 23, ",");
        setElement(term95059, 24, ",");
        setElement(term95059, 25, ",");
        setElement(term95059, 26, ",");
        setElement(term95059, 27, ",");
        setElement(term95059, 28, ",");
        setElement(term95059, 29, ",");
        setElement(term95059, 30, ",");
        setElement(term95059, 31, ",");
        setElement(term95059, 32, ",");
        setElement(term95059, 33, ",");
        setElement(term95059, 34, ",");
        setElement(term95059, 35, ",");
        setElement(term95059, 36, ",");
        setElement(term95059, 37, ",");
        setElement(term95059, 38, ",");
        setElement(term95059, 39, ",");
        setElement(term95059, 40, ",");
        setElement(term95059, 41, ",");
        setElement(term95059, 42, ",");
        setElement(term95059, 43, ",");
        setElement(term95059, 44, ",");
        setElement(term95059, 45, ",");
        setElement(term95059, 46, ",");
        setElement(term95059, 47, ",");
        setElement(term95059, 48, ",");
        setElement(term95059, 49, ",");
        setElement(term95059, 50, ",");
        setElement(term95059, 51, ",");
        setElement(term95059, 52, ",");
        setElement(term95059, 53, ",");
        setElement(term95059, 54, ",");
        setElement(term95059, 55, ",");
        setElement(term95059, 56, ",");
        setElement(term95059, 57, ",");
        setElement(term95059, 58, ",");
        setElement(term95059, 59, ",");
        setElement(term95059, 60, ",");
        setElement(term95059, 61, ",");
        setElement(term95059, 62, ",");
        setElement(term95059, 63, ",");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term94259;
        Object retValue = callMethod(klass, "pickDelimiter", argTypes, null, args);
        assertTrue(recursiveEquals(term94259, term95059));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


