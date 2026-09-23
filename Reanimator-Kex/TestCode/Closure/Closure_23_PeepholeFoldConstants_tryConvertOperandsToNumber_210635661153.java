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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25005;
     Object term25075;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25005 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25075, term25075.getClass(), "first", term25075);
        setField(term25075, term25075.getClass(), "next", term25145);
        setIntField(term25075, term25075.getClass(), "type", 100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25075;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term25005, args);
    }

};


