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

public class PeepholeFoldConstants_tryReduceVoid_942546715140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21686;
     Object term21836;

    public PeepholeFoldConstants_tryReduceVoid_942546715140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term21766 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21686, term21686.getClass(), "compiler", term21766);
        term21836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21906, term21906.getClass(), "type", 89);
        setField(term21836, term21836.getClass(), "first", term21906);
        setIntField(term21836, term21836.getClass(), "type", 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21836;
        callMethod(klass, "tryReduceVoid", argTypes, term21686, args);
    }

};


