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

public class FoldConstants_process_1962761263434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129536;
     Object term129606;

    public FoldConstants_process_1962761263434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129536 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term129536, term129536.getClass(), "compiler", null);
        term129606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129606, term129606.getClass(), "type", 125);
        setField(term129676, term129676.getClass(), "next", null);
        setIntField(term129676, term129676.getClass(), "type", 114);
        setField(term129676, term129676.getClass(), "first", null);
        setField(term129606, term129606.getClass(), "first", term129676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129606;
        callMethod(klass, "process", argTypes, term129536, args);
    }

};


