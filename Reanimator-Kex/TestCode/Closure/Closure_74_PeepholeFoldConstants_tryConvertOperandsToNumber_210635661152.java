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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26649;
     Object term26719;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26719, term26719.getClass(), "first", term26719);
        setField(term26719, term26719.getClass(), "next", term26719);
        setIntField(term26719, term26719.getClass(), "type", 93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26719;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term26649, args);
    }

};


