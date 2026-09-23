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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881884;
     Object term881954;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term881884 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term881954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term882094, term882094.getClass(), "next", term882164);
        setIntField(term882094, term882094.getClass(), "type", 39);
        setField(term882024, term882024.getClass(), "next", term882094);
        setIntField(term882024, term882024.getClass(), "type", 39);
        setField(term881954, term881954.getClass(), "first", term882024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term881954;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term881884, args);
    }

};


