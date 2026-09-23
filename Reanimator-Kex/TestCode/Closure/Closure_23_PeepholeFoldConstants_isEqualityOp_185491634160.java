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
import java.lang.Integer;

public class PeepholeFoldConstants_isEqualityOp_185491634160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1370;
     Object term1372;
     Object term5753;

    public PeepholeFoldConstants_isEqualityOp_185491634160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1370 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1370, term1370.getClass(), "late", false);
        setField(term1370, term1370.getClass(), "compiler", null);
        term1372 = new Integer(1289741214);
        term5753 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term5753, term5753.getClass(), "late", false);
        setField(term5753, term5753.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1372;
        Object retValue = callMethod(klass, "isEqualityOp", argTypes, term1370, args);
        assertTrue(recursiveEquals(term1370, term5753));
        assertTrue(recursiveEquals(term1372, 1289741214));
        assertTrue(recursiveEquals(retValue, false));
    }

};


