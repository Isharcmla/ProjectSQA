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

public class PeepholeFoldConstants_tryReduceVoid_942546715143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22420;
     Object term22570;

    public PeepholeFoldConstants_tryReduceVoid_942546715143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term22500 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22420, term22420.getClass(), "compiler", term22500);
        term22570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22640, term22640.getClass(), "type", 84);
        setField(term22570, term22570.getClass(), "first", term22640);
        setIntField(term22570, term22570.getClass(), "type", 84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22570;
        callMethod(klass, "tryReduceVoid", argTypes, term22420, args);
    }

};


