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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24548;
     Object term24618;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24548 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24758, term24758.getClass(), "next", term24758);
        setIntField(term24758, term24758.getClass(), "type", 101);
        setField(term24688, term24688.getClass(), "next", term24758);
        setIntField(term24688, term24688.getClass(), "type", 39);
        setField(term24618, term24618.getClass(), "first", term24688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24618;
        try {
            callMethod(klass, "tryConvertOperandsToNumber", argTypes, term24548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


