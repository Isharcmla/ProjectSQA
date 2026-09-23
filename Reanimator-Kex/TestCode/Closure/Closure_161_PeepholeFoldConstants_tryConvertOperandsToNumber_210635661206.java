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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31648;
     Object term31718;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31718, term31718.getClass(), "first", term31718);
        setField(term31718, term31718.getClass(), "next", term31718);
        setIntField(term31718, term31718.getClass(), "type", 93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31718;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term31648, args);
    }

};


