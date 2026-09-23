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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23709;
     Object term23779;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23779, term23779.getClass(), "first", term23779);
        setField(term23779, term23779.getClass(), "next", term23779);
        setIntField(term23779, term23779.getClass(), "type", 21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23779;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term23709, args);
    }

};


