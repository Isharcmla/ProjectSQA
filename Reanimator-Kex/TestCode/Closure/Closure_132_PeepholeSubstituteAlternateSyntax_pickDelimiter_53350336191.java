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

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;
     Object term1355;
     Object term9916;
     Object term9917;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1352 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term1352, term1352.getClass(), "late", true);
        setIntField(term1352, term1352.getClass(), "STRING_SPLIT_OVERHEAD", 1351900243);
        setField(term1352, term1352.getClass(), "compiler", null);
        term1355 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1355, 0, "PAEBtnZtTD");
        setElement(term1355, 1, "sjlJAEtRrb");
        setElement(term1355, 2, "MuLcgQHgqz");
        setElement(term1355, 3, "xxtlPwDYFs");
        setElement(term1355, 4, "jJCZpVmanW");
        term9916 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term9916, term9916.getClass(), "late", true);
        setIntField(term9916, term9916.getClass(), "STRING_SPLIT_OVERHEAD", 1351900243);
        setField(term9916, term9916.getClass(), "compiler", null);
        term9917 = (Object[]) newArray("java.lang.String", 5);
        setElement(term9917, 0, "PAEBtnZtTD");
        setElement(term9917, 1, "sjlJAEtRrb");
        setElement(term9917, 2, "MuLcgQHgqz");
        setElement(term9917, 3, "xxtlPwDYFs");
        setElement(term9917, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1355;
        Object retValue = callMethod(klass, "pickDelimiter", argTypes, term1352, args);
        assertTrue(recursiveEquals(term1352, term9916));
        assertTrue(recursiveEquals(term1355, term9917));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


