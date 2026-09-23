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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44272;
     Object term44342;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term44342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44482, term44482.getClass(), "next", term44552);
        setIntField(term44482, term44482.getClass(), "type", 39);
        setField(term44412, term44412.getClass(), "next", term44482);
        setIntField(term44412, term44412.getClass(), "type", 39);
        setField(term44342, term44342.getClass(), "first", term44412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44342;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term44272, args);
    }

};


