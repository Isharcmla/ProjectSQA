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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17100;
     Object term17170;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17100 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term17170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17170, term17170.getClass(), "first", term17170);
        setField(term17170, term17170.getClass(), "next", term17240);
        setIntField(term17170, term17170.getClass(), "type", 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17170;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term17100, args);
    }

};


