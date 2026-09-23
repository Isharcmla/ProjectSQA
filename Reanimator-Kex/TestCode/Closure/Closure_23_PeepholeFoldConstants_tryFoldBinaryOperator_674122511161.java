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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27102;
     Object term27172;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term27102, term27102.getClass(), "late", false);
        term27172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27172, term27172.getClass(), "first", term27172);
        setField(term27172, term27172.getClass(), "next", term27172);
        setIntField(term27172, term27172.getClass(), "type", 95);
        setField(term27172, term27172.getClass(), "last", term27172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27172;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term27102, args);
    }

};


