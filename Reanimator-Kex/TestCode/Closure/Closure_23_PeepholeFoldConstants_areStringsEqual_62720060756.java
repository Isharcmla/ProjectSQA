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
import java.lang.String;
import java.lang.Object;

public class PeepholeFoldConstants_areStringsEqual_62720060756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1206;
     Object term5064;
     Object enum0;

    public PeepholeFoldConstants_areStringsEqual_62720060756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1206 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1206, term1206.getClass(), "late", true);
        setField(term1206, term1206.getClass(), "compiler", null);
        term5064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term5064, term5064.getClass(), "late", true);
        setField(term5064, term5064.getClass(), "compiler", null);
        Class<? extends Object> term5202 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term5201 = ((Class) term5202).getDeclaredField((String) "FALSE");
        ((Field) term5201).setAccessible(true);
        enum0 = ((Field) term5201).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "areStringsEqual", argTypes, term1206, args);
        assertTrue(recursiveEquals(term1206, term5064));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


