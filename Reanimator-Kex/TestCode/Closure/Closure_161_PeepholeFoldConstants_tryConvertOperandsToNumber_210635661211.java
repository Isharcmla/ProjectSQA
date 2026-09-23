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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32651;
     Object term32721;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term32721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32721, term32721.getClass(), "first", term32721);
        setField(term32721, term32721.getClass(), "next", term32791);
        setIntField(term32721, term32721.getClass(), "type", 85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32721;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term32651, args);
    }

};


