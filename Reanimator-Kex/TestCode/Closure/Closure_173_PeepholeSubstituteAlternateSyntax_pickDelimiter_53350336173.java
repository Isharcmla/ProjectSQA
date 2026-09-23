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

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9524;
     Object term37408;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9524 = (Object[]) newArray("java.lang.String", 8);
        setElement(term9524, 0, "");
        setElement(term9524, 1, "");
        setElement(term9524, 2, "");
        setElement(term9524, 3, "");
        setElement(term9524, 4, "}");
        setElement(term9524, 5, "}");
        setElement(term9524, 6, "}");
        setElement(term9524, 7, "}");
        term37408 = (Object[]) newArray("java.lang.String", 8);
        setElement(term37408, 0, "");
        setElement(term37408, 1, "");
        setElement(term37408, 2, "");
        setElement(term37408, 3, "");
        setElement(term37408, 4, "}");
        setElement(term37408, 5, "}");
        setElement(term37408, 6, "}");
        setElement(term37408, 7, "}");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9524;
        Object retValue = callMethod(klass, "pickDelimiter", argTypes, null, args);
        assertTrue(recursiveEquals(term9524, term37408));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


