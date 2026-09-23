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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28668;
     Object term28738;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28878, term28878.getClass(), "next", term28948);
        setIntField(term28878, term28878.getClass(), "type", 101);
        setField(term28808, term28808.getClass(), "next", term28878);
        setIntField(term28808, term28808.getClass(), "type", 4);
        setField(term28738, term28738.getClass(), "first", term28808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28738;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term28668, args);
    }

};


