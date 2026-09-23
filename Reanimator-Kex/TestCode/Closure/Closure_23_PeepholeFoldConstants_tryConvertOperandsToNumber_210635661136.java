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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20844;
     Object term20914;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20844 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20914, term20914.getClass(), "first", term20914);
        setField(term20914, term20914.getClass(), "next", term20984);
        setIntField(term20914, term20914.getClass(), "type", 85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20914;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term20844, args);
    }

};


