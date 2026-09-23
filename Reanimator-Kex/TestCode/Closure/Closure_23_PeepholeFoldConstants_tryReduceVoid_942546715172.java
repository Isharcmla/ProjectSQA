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

public class PeepholeFoldConstants_tryReduceVoid_942546715172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29651;
     Object term29801;

    public PeepholeFoldConstants_tryReduceVoid_942546715172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term29731 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29651, term29651.getClass(), "compiler", term29731);
        term29801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29871, term29871.getClass(), "type", 91);
        setField(term29801, term29801.getClass(), "first", term29871);
        setIntField(term29801, term29801.getClass(), "type", 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29801;
        callMethod(klass, "tryReduceVoid", argTypes, term29651, args);
    }

};


