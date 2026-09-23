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

public class PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;
     Object term4041;

    public PeepholeSubstituteAlternateSyntax_pickDelimiter_53350336135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434 = (Object[]) newArray("java.lang.String", 5);
        setElement(term434, 0, "PAEBtnZtTD");
        setElement(term434, 1, "sjlJAEtRrb");
        setElement(term434, 2, "MuLcgQHgqz");
        setElement(term434, 3, "xxtlPwDYFs");
        setElement(term434, 4, "jJCZpVmanW");
        term4041 = (Object[]) newArray("java.lang.String", 5);
        setElement(term4041, 0, "PAEBtnZtTD");
        setElement(term4041, 1, "sjlJAEtRrb");
        setElement(term4041, 2, "MuLcgQHgqz");
        setElement(term4041, 3, "xxtlPwDYFs");
        setElement(term4041, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term434;
        Object retValue = callMethod(klass, "pickDelimiter", argTypes, null, args);
        assertTrue(recursiveEquals(term434, term4041));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


