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

public class PeepholeFoldConstants_tryReduceVoid_942546715160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28087;
     Object term28247;

    public PeepholeFoldConstants_tryReduceVoid_942546715160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28087 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term28177 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term28177, term28177.getClass(), "compiler", null);
        setField(term28087, term28087.getClass(), "currentTraversal", term28177);
        term28247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28317, term28317.getClass(), "type", 101);
        setField(term28247, term28247.getClass(), "first", term28317);
        setIntField(term28247, term28247.getClass(), "type", 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28247;
        callMethod(klass, "tryReduceVoid", argTypes, term28087, args);
    }

};


