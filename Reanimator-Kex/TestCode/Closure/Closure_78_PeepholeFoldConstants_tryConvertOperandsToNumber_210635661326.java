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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50699;
     Object term50769;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50699 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term50769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50769, term50769.getClass(), "first", term50769);
        setField(term50769, term50769.getClass(), "next", term50839);
        setIntField(term50769, term50769.getClass(), "type", 85);
        setField(term50769, term50769.getClass(), "last", term50769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50769;
        try {
            callMethod(klass, "tryConvertOperandsToNumber", argTypes, term50699, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


